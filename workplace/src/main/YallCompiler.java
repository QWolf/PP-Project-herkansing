package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ast.ASTCompiler;
import ast.ErrorListener;
import grammar.YallParser;

public class YallCompiler {
	
	private final static ParseTreeWalker walker = new ParseTreeWalker();
	private final static ASTCompiler listener = new ASTCompiler();
	private final static ErrorListener errorListener = new ErrorListener();
	
	
	private Lexer lexer;
	
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
			ParseTree tree = parser.program();
			if(errorListener.getErrors().size() != 0) {
				System.err.println("Errors: "+ errorListener.getErrors().size());
				for(String error : errorListener.getErrors()){
					System.err.println(error);
				}
			} else {
				walker.walk(listener,  tree);
				System.out.println("AST has been made!");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
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
