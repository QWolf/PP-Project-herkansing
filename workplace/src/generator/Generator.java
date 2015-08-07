package generator;

import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import grammar.YallBaseVisitor;

public class Generator extends YallBaseVisitor<Code>

	private ParseTreeProperty<Label> labels;
}
