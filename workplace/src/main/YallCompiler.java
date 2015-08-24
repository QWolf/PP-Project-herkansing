package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import checker.YallChecker;
import generator.Generator;
import generator.sprockellModel.Program;
import grammar.ErrorListener;
import grammar.YallParser;

public class YallCompiler {
	
	private final YallChecker checker = new YallChecker();
	private final ErrorListener errorListener = new ErrorListener();
	private final boolean printLabilizedCode = false;
	private final boolean printFullCode = false;
	
	
	private Lexer lexer;
	
	/**
	 * Compiles the file
	 */
	public void compile(String file) {
		CharStream chars = null;
		try {
			FileReader filereader = new FileReader(file);
			chars = new ANTLRInputStream(filereader);
			lexer = new grammar.YallLexer(chars);
			lexer.removeErrorListeners();
			lexer.addErrorListener(errorListener);
			TokenStream tokens = new CommonTokenStream(lexer);
			YallParser parser = new YallParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(errorListener);
			System.out.println("Started parsing");
			ParseTree tree = parser.program();
			System.out.println("Finished parsing");
			if(errorListener.hasErrors()) {
				System.err.println(String.format("%d errors found in parse phase: ", errorListener.getErrors().size()));
				for(String error : errorListener.getErrors()){
					System.err.println(error);
				}
			} else {
				System.out.println("Parsing succesfull");
				walk(tree);

			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Walks the tree, checks types and initialization
	 */
	public void walk(ParseTree tree){
		System.out.println("Starting typechecking");
		checker.visit(tree);
		System.out.println("Typechecking complete");
		List<String> errors = checker.getErrors();
		if(errors.size() != 0){
			System.err.println(String.format("%d errors found in Typecheck phase: ", errors.size()));
			for(String error : errors){
				System.err.println(error);
			}
		} else {
			System.out.println("Typechecking successful");
			
			generate(tree);
		}
	}
	
	public void generate(ParseTree tree){
		System.out.println("Starting generating");
		Generator generator = new Generator(checker, tree);
		generator.visit(tree);
		Program prog = generator.getProgram();
		if(printLabilizedCode){
			System.out.println(prog.getFullLabilizedProgram());
		}
		
		if(printFullCode){
			System.out.println(prog.getFullProgramCode());
		}
		
		prog.generateHaskellProgram();
		
		if(!generator.getErrors().isEmpty()){
			for(String s : generator.getErrors()){
				System.err.println(s);
				} 
			} else {
				System.out.println("Generating successful");
			}
	}
	
	public static List<String> getFiles(String dir){
		File folder = new File(dir);
		File[] thisFolder = folder.listFiles();
		List <String> allFiles = new ArrayList<String>();
		
		for(File f : thisFolder){
			if(f.isFile()){
				allFiles.add(dir + "/" + f.getName());
			} else if(f.isDirectory()){
				List<String> dirFiles = getFiles(dir + "/" + f.getName());
				allFiles.addAll(dirFiles);
				
			}
		}
		return allFiles;
	}
	
	//src/testfiles/fullGrammar.yall
	public static void main(String[] args){
		if (args.length != 1){			
			System.out.println("Usage: filename");
			
		} else if(args[0].equals("CompileAll")){
			
			//TODO Java output acts weirdly, but does work
			
			List<String> paths = getFiles("src/testfiles");

			for(String path : paths){
				System.out.println("Compiling "+ path);
				YallCompiler yc = new YallCompiler();
				yc.compile(path);
				System.out.println();
			}
			
			
		} else {
			System.out.println("Compiling "+ args[0]);
			YallCompiler yc = new YallCompiler();
			yc.compile(args[0]);
			
		}
	}
}
