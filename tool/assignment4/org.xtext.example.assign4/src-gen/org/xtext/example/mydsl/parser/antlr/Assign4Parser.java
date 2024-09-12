/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalAssign4Parser;
import org.xtext.example.mydsl.services.Assign4GrammarAccess;

public class Assign4Parser extends AbstractAntlrParser {

	@Inject
	private Assign4GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAssign4Parser createParser(XtextTokenStream stream) {
		return new InternalAssign4Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public Assign4GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Assign4GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
