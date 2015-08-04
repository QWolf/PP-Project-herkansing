package checker;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import grammar.YallBaseListener;
import grammar.YallParser;

public class YallChecker extends YallBaseListener{
	private IDTable idtable;
	private List<String> errors;
	
	public YallChecker(){
		this.idtable = new IDTable(null);
		this.errors = new ArrayList<String>();
	}
	
	@Override 
	public void enterProgram(@NotNull YallParser.ProgramContext ctx) { 
		
	}

	@Override 
	public void exitProgram(@NotNull YallParser.ProgramContext ctx) { 
		
	}

}
