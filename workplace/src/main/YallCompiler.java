package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import checker.Type;
import checker.YallChecker;
import ast.ASTCompiler;
import ast.ErrorListener;
import grammar.YallParser;

public class YallCompiler {
	
//	private final static ParseTreeVisitor<Type> visitor = new ParseTreeVisitor<Type>();
//	private final static ASTCompiler listener = new ASTCompiler();
	private final static YallChecker checker = new YallChecker();
	private final static ErrorListener errorListener = new ErrorListener();
	
	
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
			if(errorListener.getErrors().size() != 0) {
				System.err.println("Errors: "+ errorListener.getErrors().size());
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
			for(String error : errors){
				System.err.println(error);
			}
		} else {
			System.out.println("Typechecking successful");
			
		}
	}
	
	//src/testfiles/fullGrammar.yall
	public static void main(String[] args){
		if (args.length != 1){
			
			System.out.println("Usage: filename");
		} else {
		//example: src/files/tests/checker1.txt
			YallCompiler yc = new YallCompiler();
			yc.compile(args[0]);
		}
	}
}
