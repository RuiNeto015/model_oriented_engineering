package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.Assign3GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssign3Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CUSTOM'", "'STARS'", "'ONLYGRADE'", "'ANNOTATED'", "'SIMPLE'", "'RICHTEXT'", "'Model'", "'{'", "'subject'", "'}'", "'Subject'", "'userFeedback'", "','", "'feature'", "'Feature'", "'Review'", "'gradeType'", "'reviewType'", "'Comment'", "'commentType'", "'moderationProcess'", "'ModerationProcess'", "'startStep'", "'step'", "'End'", "'Automatic'", "'nextApprove'", "'nextReject'", "'method'", "'Manual'", "'reply'", "'moderation'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAssign3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAssign3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAssign3Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalAssign3.g"; }


    	private Assign3GrammarAccess grammarAccess;

    	public void setGrammarAccess(Assign3GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalAssign3.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAssign3.g:54:1: ( ruleModel EOF )
            // InternalAssign3.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAssign3.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAssign3.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAssign3.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalAssign3.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAssign3.g:69:3: ( rule__Model__Group__0 )
            // InternalAssign3.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUserFeedback"
    // InternalAssign3.g:78:1: entryRuleUserFeedback : ruleUserFeedback EOF ;
    public final void entryRuleUserFeedback() throws RecognitionException {
        try {
            // InternalAssign3.g:79:1: ( ruleUserFeedback EOF )
            // InternalAssign3.g:80:1: ruleUserFeedback EOF
            {
             before(grammarAccess.getUserFeedbackRule()); 
            pushFollow(FOLLOW_1);
            ruleUserFeedback();

            state._fsp--;

             after(grammarAccess.getUserFeedbackRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserFeedback"


    // $ANTLR start "ruleUserFeedback"
    // InternalAssign3.g:87:1: ruleUserFeedback : ( ( rule__UserFeedback__Alternatives ) ) ;
    public final void ruleUserFeedback() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:91:2: ( ( ( rule__UserFeedback__Alternatives ) ) )
            // InternalAssign3.g:92:2: ( ( rule__UserFeedback__Alternatives ) )
            {
            // InternalAssign3.g:92:2: ( ( rule__UserFeedback__Alternatives ) )
            // InternalAssign3.g:93:3: ( rule__UserFeedback__Alternatives )
            {
             before(grammarAccess.getUserFeedbackAccess().getAlternatives()); 
            // InternalAssign3.g:94:3: ( rule__UserFeedback__Alternatives )
            // InternalAssign3.g:94:4: rule__UserFeedback__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UserFeedback__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUserFeedbackAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserFeedback"


    // $ANTLR start "entryRuleStep"
    // InternalAssign3.g:103:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalAssign3.g:104:1: ( ruleStep EOF )
            // InternalAssign3.g:105:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalAssign3.g:112:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:116:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalAssign3.g:117:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalAssign3.g:117:2: ( ( rule__Step__Alternatives ) )
            // InternalAssign3.g:118:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalAssign3.g:119:3: ( rule__Step__Alternatives )
            // InternalAssign3.g:119:4: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleSubject"
    // InternalAssign3.g:128:1: entryRuleSubject : ruleSubject EOF ;
    public final void entryRuleSubject() throws RecognitionException {
        try {
            // InternalAssign3.g:129:1: ( ruleSubject EOF )
            // InternalAssign3.g:130:1: ruleSubject EOF
            {
             before(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_1);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getSubjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalAssign3.g:137:1: ruleSubject : ( ( rule__Subject__Group__0 ) ) ;
    public final void ruleSubject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:141:2: ( ( ( rule__Subject__Group__0 ) ) )
            // InternalAssign3.g:142:2: ( ( rule__Subject__Group__0 ) )
            {
            // InternalAssign3.g:142:2: ( ( rule__Subject__Group__0 ) )
            // InternalAssign3.g:143:3: ( rule__Subject__Group__0 )
            {
             before(grammarAccess.getSubjectAccess().getGroup()); 
            // InternalAssign3.g:144:3: ( rule__Subject__Group__0 )
            // InternalAssign3.g:144:4: rule__Subject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRuleEString"
    // InternalAssign3.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAssign3.g:154:1: ( ruleEString EOF )
            // InternalAssign3.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAssign3.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAssign3.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAssign3.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalAssign3.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAssign3.g:169:3: ( rule__EString__Alternatives )
            // InternalAssign3.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFeature"
    // InternalAssign3.g:178:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalAssign3.g:179:1: ( ruleFeature EOF )
            // InternalAssign3.g:180:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalAssign3.g:187:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:191:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalAssign3.g:192:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalAssign3.g:192:2: ( ( rule__Feature__Group__0 ) )
            // InternalAssign3.g:193:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalAssign3.g:194:3: ( rule__Feature__Group__0 )
            // InternalAssign3.g:194:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleReview"
    // InternalAssign3.g:203:1: entryRuleReview : ruleReview EOF ;
    public final void entryRuleReview() throws RecognitionException {
        try {
            // InternalAssign3.g:204:1: ( ruleReview EOF )
            // InternalAssign3.g:205:1: ruleReview EOF
            {
             before(grammarAccess.getReviewRule()); 
            pushFollow(FOLLOW_1);
            ruleReview();

            state._fsp--;

             after(grammarAccess.getReviewRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReview"


    // $ANTLR start "ruleReview"
    // InternalAssign3.g:212:1: ruleReview : ( ( rule__Review__Group__0 ) ) ;
    public final void ruleReview() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:216:2: ( ( ( rule__Review__Group__0 ) ) )
            // InternalAssign3.g:217:2: ( ( rule__Review__Group__0 ) )
            {
            // InternalAssign3.g:217:2: ( ( rule__Review__Group__0 ) )
            // InternalAssign3.g:218:3: ( rule__Review__Group__0 )
            {
             before(grammarAccess.getReviewAccess().getGroup()); 
            // InternalAssign3.g:219:3: ( rule__Review__Group__0 )
            // InternalAssign3.g:219:4: rule__Review__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Review__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReview"


    // $ANTLR start "entryRuleComment"
    // InternalAssign3.g:228:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalAssign3.g:229:1: ( ruleComment EOF )
            // InternalAssign3.g:230:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalAssign3.g:237:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:241:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalAssign3.g:242:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalAssign3.g:242:2: ( ( rule__Comment__Group__0 ) )
            // InternalAssign3.g:243:3: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalAssign3.g:244:3: ( rule__Comment__Group__0 )
            // InternalAssign3.g:244:4: rule__Comment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleModerationProcess"
    // InternalAssign3.g:253:1: entryRuleModerationProcess : ruleModerationProcess EOF ;
    public final void entryRuleModerationProcess() throws RecognitionException {
        try {
            // InternalAssign3.g:254:1: ( ruleModerationProcess EOF )
            // InternalAssign3.g:255:1: ruleModerationProcess EOF
            {
             before(grammarAccess.getModerationProcessRule()); 
            pushFollow(FOLLOW_1);
            ruleModerationProcess();

            state._fsp--;

             after(grammarAccess.getModerationProcessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModerationProcess"


    // $ANTLR start "ruleModerationProcess"
    // InternalAssign3.g:262:1: ruleModerationProcess : ( ( rule__ModerationProcess__Group__0 ) ) ;
    public final void ruleModerationProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:266:2: ( ( ( rule__ModerationProcess__Group__0 ) ) )
            // InternalAssign3.g:267:2: ( ( rule__ModerationProcess__Group__0 ) )
            {
            // InternalAssign3.g:267:2: ( ( rule__ModerationProcess__Group__0 ) )
            // InternalAssign3.g:268:3: ( rule__ModerationProcess__Group__0 )
            {
             before(grammarAccess.getModerationProcessAccess().getGroup()); 
            // InternalAssign3.g:269:3: ( rule__ModerationProcess__Group__0 )
            // InternalAssign3.g:269:4: rule__ModerationProcess__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModerationProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModerationProcess"


    // $ANTLR start "entryRuleEnd"
    // InternalAssign3.g:278:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalAssign3.g:279:1: ( ruleEnd EOF )
            // InternalAssign3.g:280:1: ruleEnd EOF
            {
             before(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            ruleEnd();

            state._fsp--;

             after(grammarAccess.getEndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalAssign3.g:287:1: ruleEnd : ( ( rule__End__Group__0 ) ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:291:2: ( ( ( rule__End__Group__0 ) ) )
            // InternalAssign3.g:292:2: ( ( rule__End__Group__0 ) )
            {
            // InternalAssign3.g:292:2: ( ( rule__End__Group__0 ) )
            // InternalAssign3.g:293:3: ( rule__End__Group__0 )
            {
             before(grammarAccess.getEndAccess().getGroup()); 
            // InternalAssign3.g:294:3: ( rule__End__Group__0 )
            // InternalAssign3.g:294:4: rule__End__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__End__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleAutomatic"
    // InternalAssign3.g:303:1: entryRuleAutomatic : ruleAutomatic EOF ;
    public final void entryRuleAutomatic() throws RecognitionException {
        try {
            // InternalAssign3.g:304:1: ( ruleAutomatic EOF )
            // InternalAssign3.g:305:1: ruleAutomatic EOF
            {
             before(grammarAccess.getAutomaticRule()); 
            pushFollow(FOLLOW_1);
            ruleAutomatic();

            state._fsp--;

             after(grammarAccess.getAutomaticRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutomatic"


    // $ANTLR start "ruleAutomatic"
    // InternalAssign3.g:312:1: ruleAutomatic : ( ( rule__Automatic__Group__0 ) ) ;
    public final void ruleAutomatic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:316:2: ( ( ( rule__Automatic__Group__0 ) ) )
            // InternalAssign3.g:317:2: ( ( rule__Automatic__Group__0 ) )
            {
            // InternalAssign3.g:317:2: ( ( rule__Automatic__Group__0 ) )
            // InternalAssign3.g:318:3: ( rule__Automatic__Group__0 )
            {
             before(grammarAccess.getAutomaticAccess().getGroup()); 
            // InternalAssign3.g:319:3: ( rule__Automatic__Group__0 )
            // InternalAssign3.g:319:4: rule__Automatic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutomatic"


    // $ANTLR start "entryRuleManual"
    // InternalAssign3.g:328:1: entryRuleManual : ruleManual EOF ;
    public final void entryRuleManual() throws RecognitionException {
        try {
            // InternalAssign3.g:329:1: ( ruleManual EOF )
            // InternalAssign3.g:330:1: ruleManual EOF
            {
             before(grammarAccess.getManualRule()); 
            pushFollow(FOLLOW_1);
            ruleManual();

            state._fsp--;

             after(grammarAccess.getManualRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManual"


    // $ANTLR start "ruleManual"
    // InternalAssign3.g:337:1: ruleManual : ( ( rule__Manual__Group__0 ) ) ;
    public final void ruleManual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:341:2: ( ( ( rule__Manual__Group__0 ) ) )
            // InternalAssign3.g:342:2: ( ( rule__Manual__Group__0 ) )
            {
            // InternalAssign3.g:342:2: ( ( rule__Manual__Group__0 ) )
            // InternalAssign3.g:343:3: ( rule__Manual__Group__0 )
            {
             before(grammarAccess.getManualAccess().getGroup()); 
            // InternalAssign3.g:344:3: ( rule__Manual__Group__0 )
            // InternalAssign3.g:344:4: rule__Manual__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Manual__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getManualAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManual"


    // $ANTLR start "ruleGradeType"
    // InternalAssign3.g:353:1: ruleGradeType : ( ( rule__GradeType__Alternatives ) ) ;
    public final void ruleGradeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:357:1: ( ( ( rule__GradeType__Alternatives ) ) )
            // InternalAssign3.g:358:2: ( ( rule__GradeType__Alternatives ) )
            {
            // InternalAssign3.g:358:2: ( ( rule__GradeType__Alternatives ) )
            // InternalAssign3.g:359:3: ( rule__GradeType__Alternatives )
            {
             before(grammarAccess.getGradeTypeAccess().getAlternatives()); 
            // InternalAssign3.g:360:3: ( rule__GradeType__Alternatives )
            // InternalAssign3.g:360:4: rule__GradeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GradeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGradeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGradeType"


    // $ANTLR start "ruleReviewType"
    // InternalAssign3.g:369:1: ruleReviewType : ( ( rule__ReviewType__Alternatives ) ) ;
    public final void ruleReviewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:373:1: ( ( ( rule__ReviewType__Alternatives ) ) )
            // InternalAssign3.g:374:2: ( ( rule__ReviewType__Alternatives ) )
            {
            // InternalAssign3.g:374:2: ( ( rule__ReviewType__Alternatives ) )
            // InternalAssign3.g:375:3: ( rule__ReviewType__Alternatives )
            {
             before(grammarAccess.getReviewTypeAccess().getAlternatives()); 
            // InternalAssign3.g:376:3: ( rule__ReviewType__Alternatives )
            // InternalAssign3.g:376:4: rule__ReviewType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReviewType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReviewTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReviewType"


    // $ANTLR start "ruleCommentType"
    // InternalAssign3.g:385:1: ruleCommentType : ( ( rule__CommentType__Alternatives ) ) ;
    public final void ruleCommentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:389:1: ( ( ( rule__CommentType__Alternatives ) ) )
            // InternalAssign3.g:390:2: ( ( rule__CommentType__Alternatives ) )
            {
            // InternalAssign3.g:390:2: ( ( rule__CommentType__Alternatives ) )
            // InternalAssign3.g:391:3: ( rule__CommentType__Alternatives )
            {
             before(grammarAccess.getCommentTypeAccess().getAlternatives()); 
            // InternalAssign3.g:392:3: ( rule__CommentType__Alternatives )
            // InternalAssign3.g:392:4: rule__CommentType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CommentType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommentTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentType"


    // $ANTLR start "rule__UserFeedback__Alternatives"
    // InternalAssign3.g:400:1: rule__UserFeedback__Alternatives : ( ( ruleReview ) | ( ruleComment ) );
    public final void rule__UserFeedback__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:404:1: ( ( ruleReview ) | ( ruleComment ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAssign3.g:405:2: ( ruleReview )
                    {
                    // InternalAssign3.g:405:2: ( ruleReview )
                    // InternalAssign3.g:406:3: ruleReview
                    {
                     before(grammarAccess.getUserFeedbackAccess().getReviewParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReview();

                    state._fsp--;

                     after(grammarAccess.getUserFeedbackAccess().getReviewParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign3.g:411:2: ( ruleComment )
                    {
                    // InternalAssign3.g:411:2: ( ruleComment )
                    // InternalAssign3.g:412:3: ruleComment
                    {
                     before(grammarAccess.getUserFeedbackAccess().getCommentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getUserFeedbackAccess().getCommentParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserFeedback__Alternatives"


    // $ANTLR start "rule__Step__Alternatives"
    // InternalAssign3.g:421:1: rule__Step__Alternatives : ( ( ruleEnd ) | ( ruleAutomatic ) | ( ruleManual ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:425:1: ( ( ruleEnd ) | ( ruleAutomatic ) | ( ruleManual ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt2=1;
                }
                break;
            case 36:
                {
                alt2=2;
                }
                break;
            case 40:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAssign3.g:426:2: ( ruleEnd )
                    {
                    // InternalAssign3.g:426:2: ( ruleEnd )
                    // InternalAssign3.g:427:3: ruleEnd
                    {
                     before(grammarAccess.getStepAccess().getEndParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEnd();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getEndParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign3.g:432:2: ( ruleAutomatic )
                    {
                    // InternalAssign3.g:432:2: ( ruleAutomatic )
                    // InternalAssign3.g:433:3: ruleAutomatic
                    {
                     before(grammarAccess.getStepAccess().getAutomaticParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAutomatic();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getAutomaticParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAssign3.g:438:2: ( ruleManual )
                    {
                    // InternalAssign3.g:438:2: ( ruleManual )
                    // InternalAssign3.g:439:3: ruleManual
                    {
                     before(grammarAccess.getStepAccess().getManualParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleManual();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getManualParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAssign3.g:448:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:452:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAssign3.g:453:2: ( RULE_STRING )
                    {
                    // InternalAssign3.g:453:2: ( RULE_STRING )
                    // InternalAssign3.g:454:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign3.g:459:2: ( RULE_ID )
                    {
                    // InternalAssign3.g:459:2: ( RULE_ID )
                    // InternalAssign3.g:460:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__GradeType__Alternatives"
    // InternalAssign3.g:469:1: rule__GradeType__Alternatives : ( ( ( 'CUSTOM' ) ) | ( ( 'STARS' ) ) );
    public final void rule__GradeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:473:1: ( ( ( 'CUSTOM' ) ) | ( ( 'STARS' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAssign3.g:474:2: ( ( 'CUSTOM' ) )
                    {
                    // InternalAssign3.g:474:2: ( ( 'CUSTOM' ) )
                    // InternalAssign3.g:475:3: ( 'CUSTOM' )
                    {
                     before(grammarAccess.getGradeTypeAccess().getCUSTOMEnumLiteralDeclaration_0()); 
                    // InternalAssign3.g:476:3: ( 'CUSTOM' )
                    // InternalAssign3.g:476:4: 'CUSTOM'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradeTypeAccess().getCUSTOMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign3.g:480:2: ( ( 'STARS' ) )
                    {
                    // InternalAssign3.g:480:2: ( ( 'STARS' ) )
                    // InternalAssign3.g:481:3: ( 'STARS' )
                    {
                     before(grammarAccess.getGradeTypeAccess().getSTARSEnumLiteralDeclaration_1()); 
                    // InternalAssign3.g:482:3: ( 'STARS' )
                    // InternalAssign3.g:482:4: 'STARS'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradeTypeAccess().getSTARSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GradeType__Alternatives"


    // $ANTLR start "rule__ReviewType__Alternatives"
    // InternalAssign3.g:490:1: rule__ReviewType__Alternatives : ( ( ( 'ONLYGRADE' ) ) | ( ( 'ANNOTATED' ) ) );
    public final void rule__ReviewType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:494:1: ( ( ( 'ONLYGRADE' ) ) | ( ( 'ANNOTATED' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAssign3.g:495:2: ( ( 'ONLYGRADE' ) )
                    {
                    // InternalAssign3.g:495:2: ( ( 'ONLYGRADE' ) )
                    // InternalAssign3.g:496:3: ( 'ONLYGRADE' )
                    {
                     before(grammarAccess.getReviewTypeAccess().getONLYGRADEEnumLiteralDeclaration_0()); 
                    // InternalAssign3.g:497:3: ( 'ONLYGRADE' )
                    // InternalAssign3.g:497:4: 'ONLYGRADE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getReviewTypeAccess().getONLYGRADEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign3.g:501:2: ( ( 'ANNOTATED' ) )
                    {
                    // InternalAssign3.g:501:2: ( ( 'ANNOTATED' ) )
                    // InternalAssign3.g:502:3: ( 'ANNOTATED' )
                    {
                     before(grammarAccess.getReviewTypeAccess().getANNOTATEDEnumLiteralDeclaration_1()); 
                    // InternalAssign3.g:503:3: ( 'ANNOTATED' )
                    // InternalAssign3.g:503:4: 'ANNOTATED'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getReviewTypeAccess().getANNOTATEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReviewType__Alternatives"


    // $ANTLR start "rule__CommentType__Alternatives"
    // InternalAssign3.g:511:1: rule__CommentType__Alternatives : ( ( ( 'SIMPLE' ) ) | ( ( 'RICHTEXT' ) ) );
    public final void rule__CommentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:515:1: ( ( ( 'SIMPLE' ) ) | ( ( 'RICHTEXT' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAssign3.g:516:2: ( ( 'SIMPLE' ) )
                    {
                    // InternalAssign3.g:516:2: ( ( 'SIMPLE' ) )
                    // InternalAssign3.g:517:3: ( 'SIMPLE' )
                    {
                     before(grammarAccess.getCommentTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 
                    // InternalAssign3.g:518:3: ( 'SIMPLE' )
                    // InternalAssign3.g:518:4: 'SIMPLE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommentTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign3.g:522:2: ( ( 'RICHTEXT' ) )
                    {
                    // InternalAssign3.g:522:2: ( ( 'RICHTEXT' ) )
                    // InternalAssign3.g:523:3: ( 'RICHTEXT' )
                    {
                     before(grammarAccess.getCommentTypeAccess().getRICHTEXTEnumLiteralDeclaration_1()); 
                    // InternalAssign3.g:524:3: ( 'RICHTEXT' )
                    // InternalAssign3.g:524:4: 'RICHTEXT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommentTypeAccess().getRICHTEXTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAssign3.g:532:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:536:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAssign3.g:537:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAssign3.g:544:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:548:1: ( ( 'Model' ) )
            // InternalAssign3.g:549:1: ( 'Model' )
            {
            // InternalAssign3.g:549:1: ( 'Model' )
            // InternalAssign3.g:550:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAssign3.g:559:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:563:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAssign3.g:564:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAssign3.g:571:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:575:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalAssign3.g:576:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalAssign3.g:576:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalAssign3.g:577:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalAssign3.g:578:2: ( rule__Model__NameAssignment_1 )
            // InternalAssign3.g:578:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalAssign3.g:586:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:590:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAssign3.g:591:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalAssign3.g:598:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:602:1: ( ( '{' ) )
            // InternalAssign3.g:603:1: ( '{' )
            {
            // InternalAssign3.g:603:1: ( '{' )
            // InternalAssign3.g:604:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalAssign3.g:613:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:617:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalAssign3.g:618:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalAssign3.g:625:1: rule__Model__Group__3__Impl : ( 'subject' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:629:1: ( ( 'subject' ) )
            // InternalAssign3.g:630:1: ( 'subject' )
            {
            // InternalAssign3.g:630:1: ( 'subject' )
            // InternalAssign3.g:631:2: 'subject'
            {
             before(grammarAccess.getModelAccess().getSubjectKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSubjectKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalAssign3.g:640:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:644:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalAssign3.g:645:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalAssign3.g:652:1: rule__Model__Group__4__Impl : ( ( rule__Model__SubjectAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:656:1: ( ( ( rule__Model__SubjectAssignment_4 ) ) )
            // InternalAssign3.g:657:1: ( ( rule__Model__SubjectAssignment_4 ) )
            {
            // InternalAssign3.g:657:1: ( ( rule__Model__SubjectAssignment_4 ) )
            // InternalAssign3.g:658:2: ( rule__Model__SubjectAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getSubjectAssignment_4()); 
            // InternalAssign3.g:659:2: ( rule__Model__SubjectAssignment_4 )
            // InternalAssign3.g:659:3: rule__Model__SubjectAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__SubjectAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSubjectAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalAssign3.g:667:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:671:1: ( rule__Model__Group__5__Impl )
            // InternalAssign3.g:672:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalAssign3.g:678:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:682:1: ( ( '}' ) )
            // InternalAssign3.g:683:1: ( '}' )
            {
            // InternalAssign3.g:683:1: ( '}' )
            // InternalAssign3.g:684:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Subject__Group__0"
    // InternalAssign3.g:694:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:698:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // InternalAssign3.g:699:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Subject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__0"


    // $ANTLR start "rule__Subject__Group__0__Impl"
    // InternalAssign3.g:706:1: rule__Subject__Group__0__Impl : ( 'Subject' ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:710:1: ( ( 'Subject' ) )
            // InternalAssign3.g:711:1: ( 'Subject' )
            {
            // InternalAssign3.g:711:1: ( 'Subject' )
            // InternalAssign3.g:712:2: 'Subject'
            {
             before(grammarAccess.getSubjectAccess().getSubjectKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getSubjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__0__Impl"


    // $ANTLR start "rule__Subject__Group__1"
    // InternalAssign3.g:721:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl rule__Subject__Group__2 ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:725:1: ( rule__Subject__Group__1__Impl rule__Subject__Group__2 )
            // InternalAssign3.g:726:2: rule__Subject__Group__1__Impl rule__Subject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Subject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__1"


    // $ANTLR start "rule__Subject__Group__1__Impl"
    // InternalAssign3.g:733:1: rule__Subject__Group__1__Impl : ( ( rule__Subject__NameAssignment_1 ) ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:737:1: ( ( ( rule__Subject__NameAssignment_1 ) ) )
            // InternalAssign3.g:738:1: ( ( rule__Subject__NameAssignment_1 ) )
            {
            // InternalAssign3.g:738:1: ( ( rule__Subject__NameAssignment_1 ) )
            // InternalAssign3.g:739:2: ( rule__Subject__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_1()); 
            // InternalAssign3.g:740:2: ( rule__Subject__NameAssignment_1 )
            // InternalAssign3.g:740:3: rule__Subject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__1__Impl"


    // $ANTLR start "rule__Subject__Group__2"
    // InternalAssign3.g:748:1: rule__Subject__Group__2 : rule__Subject__Group__2__Impl rule__Subject__Group__3 ;
    public final void rule__Subject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:752:1: ( rule__Subject__Group__2__Impl rule__Subject__Group__3 )
            // InternalAssign3.g:753:2: rule__Subject__Group__2__Impl rule__Subject__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Subject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__2"


    // $ANTLR start "rule__Subject__Group__2__Impl"
    // InternalAssign3.g:760:1: rule__Subject__Group__2__Impl : ( '{' ) ;
    public final void rule__Subject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:764:1: ( ( '{' ) )
            // InternalAssign3.g:765:1: ( '{' )
            {
            // InternalAssign3.g:765:1: ( '{' )
            // InternalAssign3.g:766:2: '{'
            {
             before(grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__2__Impl"


    // $ANTLR start "rule__Subject__Group__3"
    // InternalAssign3.g:775:1: rule__Subject__Group__3 : rule__Subject__Group__3__Impl rule__Subject__Group__4 ;
    public final void rule__Subject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:779:1: ( rule__Subject__Group__3__Impl rule__Subject__Group__4 )
            // InternalAssign3.g:780:2: rule__Subject__Group__3__Impl rule__Subject__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Subject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__3"


    // $ANTLR start "rule__Subject__Group__3__Impl"
    // InternalAssign3.g:787:1: rule__Subject__Group__3__Impl : ( 'userFeedback' ) ;
    public final void rule__Subject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:791:1: ( ( 'userFeedback' ) )
            // InternalAssign3.g:792:1: ( 'userFeedback' )
            {
            // InternalAssign3.g:792:1: ( 'userFeedback' )
            // InternalAssign3.g:793:2: 'userFeedback'
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getUserFeedbackKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__3__Impl"


    // $ANTLR start "rule__Subject__Group__4"
    // InternalAssign3.g:802:1: rule__Subject__Group__4 : rule__Subject__Group__4__Impl rule__Subject__Group__5 ;
    public final void rule__Subject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:806:1: ( rule__Subject__Group__4__Impl rule__Subject__Group__5 )
            // InternalAssign3.g:807:2: rule__Subject__Group__4__Impl rule__Subject__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Subject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__4"


    // $ANTLR start "rule__Subject__Group__4__Impl"
    // InternalAssign3.g:814:1: rule__Subject__Group__4__Impl : ( '{' ) ;
    public final void rule__Subject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:818:1: ( ( '{' ) )
            // InternalAssign3.g:819:1: ( '{' )
            {
            // InternalAssign3.g:819:1: ( '{' )
            // InternalAssign3.g:820:2: '{'
            {
             before(grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__4__Impl"


    // $ANTLR start "rule__Subject__Group__5"
    // InternalAssign3.g:829:1: rule__Subject__Group__5 : rule__Subject__Group__5__Impl rule__Subject__Group__6 ;
    public final void rule__Subject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:833:1: ( rule__Subject__Group__5__Impl rule__Subject__Group__6 )
            // InternalAssign3.g:834:2: rule__Subject__Group__5__Impl rule__Subject__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Subject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__5"


    // $ANTLR start "rule__Subject__Group__5__Impl"
    // InternalAssign3.g:841:1: rule__Subject__Group__5__Impl : ( ( rule__Subject__UserFeedbackAssignment_5 ) ) ;
    public final void rule__Subject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:845:1: ( ( ( rule__Subject__UserFeedbackAssignment_5 ) ) )
            // InternalAssign3.g:846:1: ( ( rule__Subject__UserFeedbackAssignment_5 ) )
            {
            // InternalAssign3.g:846:1: ( ( rule__Subject__UserFeedbackAssignment_5 ) )
            // InternalAssign3.g:847:2: ( rule__Subject__UserFeedbackAssignment_5 )
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_5()); 
            // InternalAssign3.g:848:2: ( rule__Subject__UserFeedbackAssignment_5 )
            // InternalAssign3.g:848:3: rule__Subject__UserFeedbackAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Subject__UserFeedbackAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__5__Impl"


    // $ANTLR start "rule__Subject__Group__6"
    // InternalAssign3.g:856:1: rule__Subject__Group__6 : rule__Subject__Group__6__Impl rule__Subject__Group__7 ;
    public final void rule__Subject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:860:1: ( rule__Subject__Group__6__Impl rule__Subject__Group__7 )
            // InternalAssign3.g:861:2: rule__Subject__Group__6__Impl rule__Subject__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Subject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__6"


    // $ANTLR start "rule__Subject__Group__6__Impl"
    // InternalAssign3.g:868:1: rule__Subject__Group__6__Impl : ( ( rule__Subject__Group_6__0 )* ) ;
    public final void rule__Subject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:872:1: ( ( ( rule__Subject__Group_6__0 )* ) )
            // InternalAssign3.g:873:1: ( ( rule__Subject__Group_6__0 )* )
            {
            // InternalAssign3.g:873:1: ( ( rule__Subject__Group_6__0 )* )
            // InternalAssign3.g:874:2: ( rule__Subject__Group_6__0 )*
            {
             before(grammarAccess.getSubjectAccess().getGroup_6()); 
            // InternalAssign3.g:875:2: ( rule__Subject__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAssign3.g:875:3: rule__Subject__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Subject__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSubjectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__6__Impl"


    // $ANTLR start "rule__Subject__Group__7"
    // InternalAssign3.g:883:1: rule__Subject__Group__7 : rule__Subject__Group__7__Impl rule__Subject__Group__8 ;
    public final void rule__Subject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:887:1: ( rule__Subject__Group__7__Impl rule__Subject__Group__8 )
            // InternalAssign3.g:888:2: rule__Subject__Group__7__Impl rule__Subject__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__Subject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__7"


    // $ANTLR start "rule__Subject__Group__7__Impl"
    // InternalAssign3.g:895:1: rule__Subject__Group__7__Impl : ( '}' ) ;
    public final void rule__Subject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:899:1: ( ( '}' ) )
            // InternalAssign3.g:900:1: ( '}' )
            {
            // InternalAssign3.g:900:1: ( '}' )
            // InternalAssign3.g:901:2: '}'
            {
             before(grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__7__Impl"


    // $ANTLR start "rule__Subject__Group__8"
    // InternalAssign3.g:910:1: rule__Subject__Group__8 : rule__Subject__Group__8__Impl rule__Subject__Group__9 ;
    public final void rule__Subject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:914:1: ( rule__Subject__Group__8__Impl rule__Subject__Group__9 )
            // InternalAssign3.g:915:2: rule__Subject__Group__8__Impl rule__Subject__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Subject__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__8"


    // $ANTLR start "rule__Subject__Group__8__Impl"
    // InternalAssign3.g:922:1: rule__Subject__Group__8__Impl : ( ( rule__Subject__Group_8__0 )? ) ;
    public final void rule__Subject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:926:1: ( ( ( rule__Subject__Group_8__0 )? ) )
            // InternalAssign3.g:927:1: ( ( rule__Subject__Group_8__0 )? )
            {
            // InternalAssign3.g:927:1: ( ( rule__Subject__Group_8__0 )? )
            // InternalAssign3.g:928:2: ( rule__Subject__Group_8__0 )?
            {
             before(grammarAccess.getSubjectAccess().getGroup_8()); 
            // InternalAssign3.g:929:2: ( rule__Subject__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAssign3.g:929:3: rule__Subject__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subject__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubjectAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__8__Impl"


    // $ANTLR start "rule__Subject__Group__9"
    // InternalAssign3.g:937:1: rule__Subject__Group__9 : rule__Subject__Group__9__Impl ;
    public final void rule__Subject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:941:1: ( rule__Subject__Group__9__Impl )
            // InternalAssign3.g:942:2: rule__Subject__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__9"


    // $ANTLR start "rule__Subject__Group__9__Impl"
    // InternalAssign3.g:948:1: rule__Subject__Group__9__Impl : ( '}' ) ;
    public final void rule__Subject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:952:1: ( ( '}' ) )
            // InternalAssign3.g:953:1: ( '}' )
            {
            // InternalAssign3.g:953:1: ( '}' )
            // InternalAssign3.g:954:2: '}'
            {
             before(grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_9()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group__9__Impl"


    // $ANTLR start "rule__Subject__Group_6__0"
    // InternalAssign3.g:964:1: rule__Subject__Group_6__0 : rule__Subject__Group_6__0__Impl rule__Subject__Group_6__1 ;
    public final void rule__Subject__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:968:1: ( rule__Subject__Group_6__0__Impl rule__Subject__Group_6__1 )
            // InternalAssign3.g:969:2: rule__Subject__Group_6__0__Impl rule__Subject__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Subject__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_6__0"


    // $ANTLR start "rule__Subject__Group_6__0__Impl"
    // InternalAssign3.g:976:1: rule__Subject__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Subject__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:980:1: ( ( ',' ) )
            // InternalAssign3.g:981:1: ( ',' )
            {
            // InternalAssign3.g:981:1: ( ',' )
            // InternalAssign3.g:982:2: ','
            {
             before(grammarAccess.getSubjectAccess().getCommaKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_6__0__Impl"


    // $ANTLR start "rule__Subject__Group_6__1"
    // InternalAssign3.g:991:1: rule__Subject__Group_6__1 : rule__Subject__Group_6__1__Impl ;
    public final void rule__Subject__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:995:1: ( rule__Subject__Group_6__1__Impl )
            // InternalAssign3.g:996:2: rule__Subject__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_6__1"


    // $ANTLR start "rule__Subject__Group_6__1__Impl"
    // InternalAssign3.g:1002:1: rule__Subject__Group_6__1__Impl : ( ( rule__Subject__UserFeedbackAssignment_6_1 ) ) ;
    public final void rule__Subject__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1006:1: ( ( ( rule__Subject__UserFeedbackAssignment_6_1 ) ) )
            // InternalAssign3.g:1007:1: ( ( rule__Subject__UserFeedbackAssignment_6_1 ) )
            {
            // InternalAssign3.g:1007:1: ( ( rule__Subject__UserFeedbackAssignment_6_1 ) )
            // InternalAssign3.g:1008:2: ( rule__Subject__UserFeedbackAssignment_6_1 )
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_6_1()); 
            // InternalAssign3.g:1009:2: ( rule__Subject__UserFeedbackAssignment_6_1 )
            // InternalAssign3.g:1009:3: rule__Subject__UserFeedbackAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__UserFeedbackAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_6__1__Impl"


    // $ANTLR start "rule__Subject__Group_8__0"
    // InternalAssign3.g:1018:1: rule__Subject__Group_8__0 : rule__Subject__Group_8__0__Impl rule__Subject__Group_8__1 ;
    public final void rule__Subject__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1022:1: ( rule__Subject__Group_8__0__Impl rule__Subject__Group_8__1 )
            // InternalAssign3.g:1023:2: rule__Subject__Group_8__0__Impl rule__Subject__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Subject__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__0"


    // $ANTLR start "rule__Subject__Group_8__0__Impl"
    // InternalAssign3.g:1030:1: rule__Subject__Group_8__0__Impl : ( 'feature' ) ;
    public final void rule__Subject__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1034:1: ( ( 'feature' ) )
            // InternalAssign3.g:1035:1: ( 'feature' )
            {
            // InternalAssign3.g:1035:1: ( 'feature' )
            // InternalAssign3.g:1036:2: 'feature'
            {
             before(grammarAccess.getSubjectAccess().getFeatureKeyword_8_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getFeatureKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__0__Impl"


    // $ANTLR start "rule__Subject__Group_8__1"
    // InternalAssign3.g:1045:1: rule__Subject__Group_8__1 : rule__Subject__Group_8__1__Impl rule__Subject__Group_8__2 ;
    public final void rule__Subject__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1049:1: ( rule__Subject__Group_8__1__Impl rule__Subject__Group_8__2 )
            // InternalAssign3.g:1050:2: rule__Subject__Group_8__1__Impl rule__Subject__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__Subject__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__1"


    // $ANTLR start "rule__Subject__Group_8__1__Impl"
    // InternalAssign3.g:1057:1: rule__Subject__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Subject__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1061:1: ( ( '{' ) )
            // InternalAssign3.g:1062:1: ( '{' )
            {
            // InternalAssign3.g:1062:1: ( '{' )
            // InternalAssign3.g:1063:2: '{'
            {
             before(grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__1__Impl"


    // $ANTLR start "rule__Subject__Group_8__2"
    // InternalAssign3.g:1072:1: rule__Subject__Group_8__2 : rule__Subject__Group_8__2__Impl rule__Subject__Group_8__3 ;
    public final void rule__Subject__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1076:1: ( rule__Subject__Group_8__2__Impl rule__Subject__Group_8__3 )
            // InternalAssign3.g:1077:2: rule__Subject__Group_8__2__Impl rule__Subject__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__Subject__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__2"


    // $ANTLR start "rule__Subject__Group_8__2__Impl"
    // InternalAssign3.g:1084:1: rule__Subject__Group_8__2__Impl : ( ( rule__Subject__FeatureAssignment_8_2 ) ) ;
    public final void rule__Subject__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1088:1: ( ( ( rule__Subject__FeatureAssignment_8_2 ) ) )
            // InternalAssign3.g:1089:1: ( ( rule__Subject__FeatureAssignment_8_2 ) )
            {
            // InternalAssign3.g:1089:1: ( ( rule__Subject__FeatureAssignment_8_2 ) )
            // InternalAssign3.g:1090:2: ( rule__Subject__FeatureAssignment_8_2 )
            {
             before(grammarAccess.getSubjectAccess().getFeatureAssignment_8_2()); 
            // InternalAssign3.g:1091:2: ( rule__Subject__FeatureAssignment_8_2 )
            // InternalAssign3.g:1091:3: rule__Subject__FeatureAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Subject__FeatureAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getFeatureAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__2__Impl"


    // $ANTLR start "rule__Subject__Group_8__3"
    // InternalAssign3.g:1099:1: rule__Subject__Group_8__3 : rule__Subject__Group_8__3__Impl rule__Subject__Group_8__4 ;
    public final void rule__Subject__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1103:1: ( rule__Subject__Group_8__3__Impl rule__Subject__Group_8__4 )
            // InternalAssign3.g:1104:2: rule__Subject__Group_8__3__Impl rule__Subject__Group_8__4
            {
            pushFollow(FOLLOW_10);
            rule__Subject__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__3"


    // $ANTLR start "rule__Subject__Group_8__3__Impl"
    // InternalAssign3.g:1111:1: rule__Subject__Group_8__3__Impl : ( ( rule__Subject__Group_8_3__0 )* ) ;
    public final void rule__Subject__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1115:1: ( ( ( rule__Subject__Group_8_3__0 )* ) )
            // InternalAssign3.g:1116:1: ( ( rule__Subject__Group_8_3__0 )* )
            {
            // InternalAssign3.g:1116:1: ( ( rule__Subject__Group_8_3__0 )* )
            // InternalAssign3.g:1117:2: ( rule__Subject__Group_8_3__0 )*
            {
             before(grammarAccess.getSubjectAccess().getGroup_8_3()); 
            // InternalAssign3.g:1118:2: ( rule__Subject__Group_8_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAssign3.g:1118:3: rule__Subject__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Subject__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSubjectAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__3__Impl"


    // $ANTLR start "rule__Subject__Group_8__4"
    // InternalAssign3.g:1126:1: rule__Subject__Group_8__4 : rule__Subject__Group_8__4__Impl ;
    public final void rule__Subject__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1130:1: ( rule__Subject__Group_8__4__Impl )
            // InternalAssign3.g:1131:2: rule__Subject__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__4"


    // $ANTLR start "rule__Subject__Group_8__4__Impl"
    // InternalAssign3.g:1137:1: rule__Subject__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Subject__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1141:1: ( ( '}' ) )
            // InternalAssign3.g:1142:1: ( '}' )
            {
            // InternalAssign3.g:1142:1: ( '}' )
            // InternalAssign3.g:1143:2: '}'
            {
             before(grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8__4__Impl"


    // $ANTLR start "rule__Subject__Group_8_3__0"
    // InternalAssign3.g:1153:1: rule__Subject__Group_8_3__0 : rule__Subject__Group_8_3__0__Impl rule__Subject__Group_8_3__1 ;
    public final void rule__Subject__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1157:1: ( rule__Subject__Group_8_3__0__Impl rule__Subject__Group_8_3__1 )
            // InternalAssign3.g:1158:2: rule__Subject__Group_8_3__0__Impl rule__Subject__Group_8_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Subject__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8_3__0"


    // $ANTLR start "rule__Subject__Group_8_3__0__Impl"
    // InternalAssign3.g:1165:1: rule__Subject__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Subject__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1169:1: ( ( ',' ) )
            // InternalAssign3.g:1170:1: ( ',' )
            {
            // InternalAssign3.g:1170:1: ( ',' )
            // InternalAssign3.g:1171:2: ','
            {
             before(grammarAccess.getSubjectAccess().getCommaKeyword_8_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8_3__0__Impl"


    // $ANTLR start "rule__Subject__Group_8_3__1"
    // InternalAssign3.g:1180:1: rule__Subject__Group_8_3__1 : rule__Subject__Group_8_3__1__Impl ;
    public final void rule__Subject__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1184:1: ( rule__Subject__Group_8_3__1__Impl )
            // InternalAssign3.g:1185:2: rule__Subject__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8_3__1"


    // $ANTLR start "rule__Subject__Group_8_3__1__Impl"
    // InternalAssign3.g:1191:1: rule__Subject__Group_8_3__1__Impl : ( ( rule__Subject__FeatureAssignment_8_3_1 ) ) ;
    public final void rule__Subject__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1195:1: ( ( ( rule__Subject__FeatureAssignment_8_3_1 ) ) )
            // InternalAssign3.g:1196:1: ( ( rule__Subject__FeatureAssignment_8_3_1 ) )
            {
            // InternalAssign3.g:1196:1: ( ( rule__Subject__FeatureAssignment_8_3_1 ) )
            // InternalAssign3.g:1197:2: ( rule__Subject__FeatureAssignment_8_3_1 )
            {
             before(grammarAccess.getSubjectAccess().getFeatureAssignment_8_3_1()); 
            // InternalAssign3.g:1198:2: ( rule__Subject__FeatureAssignment_8_3_1 )
            // InternalAssign3.g:1198:3: rule__Subject__FeatureAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__FeatureAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getFeatureAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__Group_8_3__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalAssign3.g:1207:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1211:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalAssign3.g:1212:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalAssign3.g:1219:1: rule__Feature__Group__0__Impl : ( () ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1223:1: ( ( () ) )
            // InternalAssign3.g:1224:1: ( () )
            {
            // InternalAssign3.g:1224:1: ( () )
            // InternalAssign3.g:1225:2: ()
            {
             before(grammarAccess.getFeatureAccess().getFeatureAction_0()); 
            // InternalAssign3.g:1226:2: ()
            // InternalAssign3.g:1226:3: 
            {
            }

             after(grammarAccess.getFeatureAccess().getFeatureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalAssign3.g:1234:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1238:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalAssign3.g:1239:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalAssign3.g:1246:1: rule__Feature__Group__1__Impl : ( 'Feature' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1250:1: ( ( 'Feature' ) )
            // InternalAssign3.g:1251:1: ( 'Feature' )
            {
            // InternalAssign3.g:1251:1: ( 'Feature' )
            // InternalAssign3.g:1252:2: 'Feature'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalAssign3.g:1261:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1265:1: ( rule__Feature__Group__2__Impl )
            // InternalAssign3.g:1266:2: rule__Feature__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalAssign3.g:1272:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1276:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalAssign3.g:1277:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalAssign3.g:1277:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalAssign3.g:1278:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalAssign3.g:1279:2: ( rule__Feature__NameAssignment_2 )
            // InternalAssign3.g:1279:3: rule__Feature__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Review__Group__0"
    // InternalAssign3.g:1288:1: rule__Review__Group__0 : rule__Review__Group__0__Impl rule__Review__Group__1 ;
    public final void rule__Review__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1292:1: ( rule__Review__Group__0__Impl rule__Review__Group__1 )
            // InternalAssign3.g:1293:2: rule__Review__Group__0__Impl rule__Review__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Review__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__0"


    // $ANTLR start "rule__Review__Group__0__Impl"
    // InternalAssign3.g:1300:1: rule__Review__Group__0__Impl : ( () ) ;
    public final void rule__Review__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1304:1: ( ( () ) )
            // InternalAssign3.g:1305:1: ( () )
            {
            // InternalAssign3.g:1305:1: ( () )
            // InternalAssign3.g:1306:2: ()
            {
             before(grammarAccess.getReviewAccess().getReviewAction_0()); 
            // InternalAssign3.g:1307:2: ()
            // InternalAssign3.g:1307:3: 
            {
            }

             after(grammarAccess.getReviewAccess().getReviewAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__0__Impl"


    // $ANTLR start "rule__Review__Group__1"
    // InternalAssign3.g:1315:1: rule__Review__Group__1 : rule__Review__Group__1__Impl rule__Review__Group__2 ;
    public final void rule__Review__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1319:1: ( rule__Review__Group__1__Impl rule__Review__Group__2 )
            // InternalAssign3.g:1320:2: rule__Review__Group__1__Impl rule__Review__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Review__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__1"


    // $ANTLR start "rule__Review__Group__1__Impl"
    // InternalAssign3.g:1327:1: rule__Review__Group__1__Impl : ( 'Review' ) ;
    public final void rule__Review__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1331:1: ( ( 'Review' ) )
            // InternalAssign3.g:1332:1: ( 'Review' )
            {
            // InternalAssign3.g:1332:1: ( 'Review' )
            // InternalAssign3.g:1333:2: 'Review'
            {
             before(grammarAccess.getReviewAccess().getReviewKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getReviewKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__1__Impl"


    // $ANTLR start "rule__Review__Group__2"
    // InternalAssign3.g:1342:1: rule__Review__Group__2 : rule__Review__Group__2__Impl rule__Review__Group__3 ;
    public final void rule__Review__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1346:1: ( rule__Review__Group__2__Impl rule__Review__Group__3 )
            // InternalAssign3.g:1347:2: rule__Review__Group__2__Impl rule__Review__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Review__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__2"


    // $ANTLR start "rule__Review__Group__2__Impl"
    // InternalAssign3.g:1354:1: rule__Review__Group__2__Impl : ( ( rule__Review__NameAssignment_2 ) ) ;
    public final void rule__Review__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1358:1: ( ( ( rule__Review__NameAssignment_2 ) ) )
            // InternalAssign3.g:1359:1: ( ( rule__Review__NameAssignment_2 ) )
            {
            // InternalAssign3.g:1359:1: ( ( rule__Review__NameAssignment_2 ) )
            // InternalAssign3.g:1360:2: ( rule__Review__NameAssignment_2 )
            {
             before(grammarAccess.getReviewAccess().getNameAssignment_2()); 
            // InternalAssign3.g:1361:2: ( rule__Review__NameAssignment_2 )
            // InternalAssign3.g:1361:3: rule__Review__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Review__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__2__Impl"


    // $ANTLR start "rule__Review__Group__3"
    // InternalAssign3.g:1369:1: rule__Review__Group__3 : rule__Review__Group__3__Impl rule__Review__Group__4 ;
    public final void rule__Review__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1373:1: ( rule__Review__Group__3__Impl rule__Review__Group__4 )
            // InternalAssign3.g:1374:2: rule__Review__Group__3__Impl rule__Review__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Review__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__3"


    // $ANTLR start "rule__Review__Group__3__Impl"
    // InternalAssign3.g:1381:1: rule__Review__Group__3__Impl : ( '{' ) ;
    public final void rule__Review__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1385:1: ( ( '{' ) )
            // InternalAssign3.g:1386:1: ( '{' )
            {
            // InternalAssign3.g:1386:1: ( '{' )
            // InternalAssign3.g:1387:2: '{'
            {
             before(grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__3__Impl"


    // $ANTLR start "rule__Review__Group__4"
    // InternalAssign3.g:1396:1: rule__Review__Group__4 : rule__Review__Group__4__Impl rule__Review__Group__5 ;
    public final void rule__Review__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1400:1: ( rule__Review__Group__4__Impl rule__Review__Group__5 )
            // InternalAssign3.g:1401:2: rule__Review__Group__4__Impl rule__Review__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Review__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__4"


    // $ANTLR start "rule__Review__Group__4__Impl"
    // InternalAssign3.g:1408:1: rule__Review__Group__4__Impl : ( ( rule__Review__Group_4__0 )? ) ;
    public final void rule__Review__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1412:1: ( ( ( rule__Review__Group_4__0 )? ) )
            // InternalAssign3.g:1413:1: ( ( rule__Review__Group_4__0 )? )
            {
            // InternalAssign3.g:1413:1: ( ( rule__Review__Group_4__0 )? )
            // InternalAssign3.g:1414:2: ( rule__Review__Group_4__0 )?
            {
             before(grammarAccess.getReviewAccess().getGroup_4()); 
            // InternalAssign3.g:1415:2: ( rule__Review__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAssign3.g:1415:3: rule__Review__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Review__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReviewAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__4__Impl"


    // $ANTLR start "rule__Review__Group__5"
    // InternalAssign3.g:1423:1: rule__Review__Group__5 : rule__Review__Group__5__Impl rule__Review__Group__6 ;
    public final void rule__Review__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1427:1: ( rule__Review__Group__5__Impl rule__Review__Group__6 )
            // InternalAssign3.g:1428:2: rule__Review__Group__5__Impl rule__Review__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Review__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__5"


    // $ANTLR start "rule__Review__Group__5__Impl"
    // InternalAssign3.g:1435:1: rule__Review__Group__5__Impl : ( ( rule__Review__Group_5__0 )? ) ;
    public final void rule__Review__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1439:1: ( ( ( rule__Review__Group_5__0 )? ) )
            // InternalAssign3.g:1440:1: ( ( rule__Review__Group_5__0 )? )
            {
            // InternalAssign3.g:1440:1: ( ( rule__Review__Group_5__0 )? )
            // InternalAssign3.g:1441:2: ( rule__Review__Group_5__0 )?
            {
             before(grammarAccess.getReviewAccess().getGroup_5()); 
            // InternalAssign3.g:1442:2: ( rule__Review__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAssign3.g:1442:3: rule__Review__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Review__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReviewAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__5__Impl"


    // $ANTLR start "rule__Review__Group__6"
    // InternalAssign3.g:1450:1: rule__Review__Group__6 : rule__Review__Group__6__Impl ;
    public final void rule__Review__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1454:1: ( rule__Review__Group__6__Impl )
            // InternalAssign3.g:1455:2: rule__Review__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Review__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__6"


    // $ANTLR start "rule__Review__Group__6__Impl"
    // InternalAssign3.g:1461:1: rule__Review__Group__6__Impl : ( '}' ) ;
    public final void rule__Review__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1465:1: ( ( '}' ) )
            // InternalAssign3.g:1466:1: ( '}' )
            {
            // InternalAssign3.g:1466:1: ( '}' )
            // InternalAssign3.g:1467:2: '}'
            {
             before(grammarAccess.getReviewAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group__6__Impl"


    // $ANTLR start "rule__Review__Group_4__0"
    // InternalAssign3.g:1477:1: rule__Review__Group_4__0 : rule__Review__Group_4__0__Impl rule__Review__Group_4__1 ;
    public final void rule__Review__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1481:1: ( rule__Review__Group_4__0__Impl rule__Review__Group_4__1 )
            // InternalAssign3.g:1482:2: rule__Review__Group_4__0__Impl rule__Review__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Review__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group_4__0"


    // $ANTLR start "rule__Review__Group_4__0__Impl"
    // InternalAssign3.g:1489:1: rule__Review__Group_4__0__Impl : ( 'gradeType' ) ;
    public final void rule__Review__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1493:1: ( ( 'gradeType' ) )
            // InternalAssign3.g:1494:1: ( 'gradeType' )
            {
            // InternalAssign3.g:1494:1: ( 'gradeType' )
            // InternalAssign3.g:1495:2: 'gradeType'
            {
             before(grammarAccess.getReviewAccess().getGradeTypeKeyword_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getGradeTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group_4__0__Impl"


    // $ANTLR start "rule__Review__Group_4__1"
    // InternalAssign3.g:1504:1: rule__Review__Group_4__1 : rule__Review__Group_4__1__Impl ;
    public final void rule__Review__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1508:1: ( rule__Review__Group_4__1__Impl )
            // InternalAssign3.g:1509:2: rule__Review__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Review__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group_4__1"


    // $ANTLR start "rule__Review__Group_4__1__Impl"
    // InternalAssign3.g:1515:1: rule__Review__Group_4__1__Impl : ( ( rule__Review__GradeTypeAssignment_4_1 ) ) ;
    public final void rule__Review__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1519:1: ( ( ( rule__Review__GradeTypeAssignment_4_1 ) ) )
            // InternalAssign3.g:1520:1: ( ( rule__Review__GradeTypeAssignment_4_1 ) )
            {
            // InternalAssign3.g:1520:1: ( ( rule__Review__GradeTypeAssignment_4_1 ) )
            // InternalAssign3.g:1521:2: ( rule__Review__GradeTypeAssignment_4_1 )
            {
             before(grammarAccess.getReviewAccess().getGradeTypeAssignment_4_1()); 
            // InternalAssign3.g:1522:2: ( rule__Review__GradeTypeAssignment_4_1 )
            // InternalAssign3.g:1522:3: rule__Review__GradeTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Review__GradeTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getGradeTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group_4__1__Impl"


    // $ANTLR start "rule__Review__Group_5__0"
    // InternalAssign3.g:1531:1: rule__Review__Group_5__0 : rule__Review__Group_5__0__Impl rule__Review__Group_5__1 ;
    public final void rule__Review__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1535:1: ( rule__Review__Group_5__0__Impl rule__Review__Group_5__1 )
            // InternalAssign3.g:1536:2: rule__Review__Group_5__0__Impl rule__Review__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Review__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Review__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group_5__0"


    // $ANTLR start "rule__Review__Group_5__0__Impl"
    // InternalAssign3.g:1543:1: rule__Review__Group_5__0__Impl : ( 'reviewType' ) ;
    public final void rule__Review__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1547:1: ( ( 'reviewType' ) )
            // InternalAssign3.g:1548:1: ( 'reviewType' )
            {
            // InternalAssign3.g:1548:1: ( 'reviewType' )
            // InternalAssign3.g:1549:2: 'reviewType'
            {
             before(grammarAccess.getReviewAccess().getReviewTypeKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReviewAccess().getReviewTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group_5__0__Impl"


    // $ANTLR start "rule__Review__Group_5__1"
    // InternalAssign3.g:1558:1: rule__Review__Group_5__1 : rule__Review__Group_5__1__Impl ;
    public final void rule__Review__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1562:1: ( rule__Review__Group_5__1__Impl )
            // InternalAssign3.g:1563:2: rule__Review__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Review__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group_5__1"


    // $ANTLR start "rule__Review__Group_5__1__Impl"
    // InternalAssign3.g:1569:1: rule__Review__Group_5__1__Impl : ( ( rule__Review__ReviewTypeAssignment_5_1 ) ) ;
    public final void rule__Review__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1573:1: ( ( ( rule__Review__ReviewTypeAssignment_5_1 ) ) )
            // InternalAssign3.g:1574:1: ( ( rule__Review__ReviewTypeAssignment_5_1 ) )
            {
            // InternalAssign3.g:1574:1: ( ( rule__Review__ReviewTypeAssignment_5_1 ) )
            // InternalAssign3.g:1575:2: ( rule__Review__ReviewTypeAssignment_5_1 )
            {
             before(grammarAccess.getReviewAccess().getReviewTypeAssignment_5_1()); 
            // InternalAssign3.g:1576:2: ( rule__Review__ReviewTypeAssignment_5_1 )
            // InternalAssign3.g:1576:3: rule__Review__ReviewTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Review__ReviewTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReviewAccess().getReviewTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__Group_5__1__Impl"


    // $ANTLR start "rule__Comment__Group__0"
    // InternalAssign3.g:1585:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1589:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalAssign3.g:1590:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Comment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0"


    // $ANTLR start "rule__Comment__Group__0__Impl"
    // InternalAssign3.g:1597:1: rule__Comment__Group__0__Impl : ( ( rule__Comment__ReplyAssignment_0 ) ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1601:1: ( ( ( rule__Comment__ReplyAssignment_0 ) ) )
            // InternalAssign3.g:1602:1: ( ( rule__Comment__ReplyAssignment_0 ) )
            {
            // InternalAssign3.g:1602:1: ( ( rule__Comment__ReplyAssignment_0 ) )
            // InternalAssign3.g:1603:2: ( rule__Comment__ReplyAssignment_0 )
            {
             before(grammarAccess.getCommentAccess().getReplyAssignment_0()); 
            // InternalAssign3.g:1604:2: ( rule__Comment__ReplyAssignment_0 )
            // InternalAssign3.g:1604:3: rule__Comment__ReplyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Comment__ReplyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getReplyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__0__Impl"


    // $ANTLR start "rule__Comment__Group__1"
    // InternalAssign3.g:1612:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl rule__Comment__Group__2 ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1616:1: ( rule__Comment__Group__1__Impl rule__Comment__Group__2 )
            // InternalAssign3.g:1617:2: rule__Comment__Group__1__Impl rule__Comment__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Comment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1"


    // $ANTLR start "rule__Comment__Group__1__Impl"
    // InternalAssign3.g:1624:1: rule__Comment__Group__1__Impl : ( ( rule__Comment__ModerationAssignment_1 ) ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1628:1: ( ( ( rule__Comment__ModerationAssignment_1 ) ) )
            // InternalAssign3.g:1629:1: ( ( rule__Comment__ModerationAssignment_1 ) )
            {
            // InternalAssign3.g:1629:1: ( ( rule__Comment__ModerationAssignment_1 ) )
            // InternalAssign3.g:1630:2: ( rule__Comment__ModerationAssignment_1 )
            {
             before(grammarAccess.getCommentAccess().getModerationAssignment_1()); 
            // InternalAssign3.g:1631:2: ( rule__Comment__ModerationAssignment_1 )
            // InternalAssign3.g:1631:3: rule__Comment__ModerationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__ModerationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getModerationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__1__Impl"


    // $ANTLR start "rule__Comment__Group__2"
    // InternalAssign3.g:1639:1: rule__Comment__Group__2 : rule__Comment__Group__2__Impl rule__Comment__Group__3 ;
    public final void rule__Comment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1643:1: ( rule__Comment__Group__2__Impl rule__Comment__Group__3 )
            // InternalAssign3.g:1644:2: rule__Comment__Group__2__Impl rule__Comment__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Comment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__2"


    // $ANTLR start "rule__Comment__Group__2__Impl"
    // InternalAssign3.g:1651:1: rule__Comment__Group__2__Impl : ( 'Comment' ) ;
    public final void rule__Comment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1655:1: ( ( 'Comment' ) )
            // InternalAssign3.g:1656:1: ( 'Comment' )
            {
            // InternalAssign3.g:1656:1: ( 'Comment' )
            // InternalAssign3.g:1657:2: 'Comment'
            {
             before(grammarAccess.getCommentAccess().getCommentKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getCommentKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__2__Impl"


    // $ANTLR start "rule__Comment__Group__3"
    // InternalAssign3.g:1666:1: rule__Comment__Group__3 : rule__Comment__Group__3__Impl rule__Comment__Group__4 ;
    public final void rule__Comment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1670:1: ( rule__Comment__Group__3__Impl rule__Comment__Group__4 )
            // InternalAssign3.g:1671:2: rule__Comment__Group__3__Impl rule__Comment__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Comment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__3"


    // $ANTLR start "rule__Comment__Group__3__Impl"
    // InternalAssign3.g:1678:1: rule__Comment__Group__3__Impl : ( ( rule__Comment__NameAssignment_3 ) ) ;
    public final void rule__Comment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1682:1: ( ( ( rule__Comment__NameAssignment_3 ) ) )
            // InternalAssign3.g:1683:1: ( ( rule__Comment__NameAssignment_3 ) )
            {
            // InternalAssign3.g:1683:1: ( ( rule__Comment__NameAssignment_3 ) )
            // InternalAssign3.g:1684:2: ( rule__Comment__NameAssignment_3 )
            {
             before(grammarAccess.getCommentAccess().getNameAssignment_3()); 
            // InternalAssign3.g:1685:2: ( rule__Comment__NameAssignment_3 )
            // InternalAssign3.g:1685:3: rule__Comment__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Comment__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__3__Impl"


    // $ANTLR start "rule__Comment__Group__4"
    // InternalAssign3.g:1693:1: rule__Comment__Group__4 : rule__Comment__Group__4__Impl rule__Comment__Group__5 ;
    public final void rule__Comment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1697:1: ( rule__Comment__Group__4__Impl rule__Comment__Group__5 )
            // InternalAssign3.g:1698:2: rule__Comment__Group__4__Impl rule__Comment__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Comment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__4"


    // $ANTLR start "rule__Comment__Group__4__Impl"
    // InternalAssign3.g:1705:1: rule__Comment__Group__4__Impl : ( '{' ) ;
    public final void rule__Comment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1709:1: ( ( '{' ) )
            // InternalAssign3.g:1710:1: ( '{' )
            {
            // InternalAssign3.g:1710:1: ( '{' )
            // InternalAssign3.g:1711:2: '{'
            {
             before(grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__4__Impl"


    // $ANTLR start "rule__Comment__Group__5"
    // InternalAssign3.g:1720:1: rule__Comment__Group__5 : rule__Comment__Group__5__Impl rule__Comment__Group__6 ;
    public final void rule__Comment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1724:1: ( rule__Comment__Group__5__Impl rule__Comment__Group__6 )
            // InternalAssign3.g:1725:2: rule__Comment__Group__5__Impl rule__Comment__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Comment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__5"


    // $ANTLR start "rule__Comment__Group__5__Impl"
    // InternalAssign3.g:1732:1: rule__Comment__Group__5__Impl : ( ( rule__Comment__Group_5__0 )? ) ;
    public final void rule__Comment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1736:1: ( ( ( rule__Comment__Group_5__0 )? ) )
            // InternalAssign3.g:1737:1: ( ( rule__Comment__Group_5__0 )? )
            {
            // InternalAssign3.g:1737:1: ( ( rule__Comment__Group_5__0 )? )
            // InternalAssign3.g:1738:2: ( rule__Comment__Group_5__0 )?
            {
             before(grammarAccess.getCommentAccess().getGroup_5()); 
            // InternalAssign3.g:1739:2: ( rule__Comment__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAssign3.g:1739:3: rule__Comment__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comment__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommentAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__5__Impl"


    // $ANTLR start "rule__Comment__Group__6"
    // InternalAssign3.g:1747:1: rule__Comment__Group__6 : rule__Comment__Group__6__Impl rule__Comment__Group__7 ;
    public final void rule__Comment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1751:1: ( rule__Comment__Group__6__Impl rule__Comment__Group__7 )
            // InternalAssign3.g:1752:2: rule__Comment__Group__6__Impl rule__Comment__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__Comment__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__6"


    // $ANTLR start "rule__Comment__Group__6__Impl"
    // InternalAssign3.g:1759:1: rule__Comment__Group__6__Impl : ( ( rule__Comment__Group_6__0 )? ) ;
    public final void rule__Comment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1763:1: ( ( ( rule__Comment__Group_6__0 )? ) )
            // InternalAssign3.g:1764:1: ( ( rule__Comment__Group_6__0 )? )
            {
            // InternalAssign3.g:1764:1: ( ( rule__Comment__Group_6__0 )? )
            // InternalAssign3.g:1765:2: ( rule__Comment__Group_6__0 )?
            {
             before(grammarAccess.getCommentAccess().getGroup_6()); 
            // InternalAssign3.g:1766:2: ( rule__Comment__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAssign3.g:1766:3: rule__Comment__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comment__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__6__Impl"


    // $ANTLR start "rule__Comment__Group__7"
    // InternalAssign3.g:1774:1: rule__Comment__Group__7 : rule__Comment__Group__7__Impl ;
    public final void rule__Comment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1778:1: ( rule__Comment__Group__7__Impl )
            // InternalAssign3.g:1779:2: rule__Comment__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__7"


    // $ANTLR start "rule__Comment__Group__7__Impl"
    // InternalAssign3.g:1785:1: rule__Comment__Group__7__Impl : ( '}' ) ;
    public final void rule__Comment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1789:1: ( ( '}' ) )
            // InternalAssign3.g:1790:1: ( '}' )
            {
            // InternalAssign3.g:1790:1: ( '}' )
            // InternalAssign3.g:1791:2: '}'
            {
             before(grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group__7__Impl"


    // $ANTLR start "rule__Comment__Group_5__0"
    // InternalAssign3.g:1801:1: rule__Comment__Group_5__0 : rule__Comment__Group_5__0__Impl rule__Comment__Group_5__1 ;
    public final void rule__Comment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1805:1: ( rule__Comment__Group_5__0__Impl rule__Comment__Group_5__1 )
            // InternalAssign3.g:1806:2: rule__Comment__Group_5__0__Impl rule__Comment__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__Comment__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_5__0"


    // $ANTLR start "rule__Comment__Group_5__0__Impl"
    // InternalAssign3.g:1813:1: rule__Comment__Group_5__0__Impl : ( 'commentType' ) ;
    public final void rule__Comment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1817:1: ( ( 'commentType' ) )
            // InternalAssign3.g:1818:1: ( 'commentType' )
            {
            // InternalAssign3.g:1818:1: ( 'commentType' )
            // InternalAssign3.g:1819:2: 'commentType'
            {
             before(grammarAccess.getCommentAccess().getCommentTypeKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getCommentTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_5__0__Impl"


    // $ANTLR start "rule__Comment__Group_5__1"
    // InternalAssign3.g:1828:1: rule__Comment__Group_5__1 : rule__Comment__Group_5__1__Impl ;
    public final void rule__Comment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1832:1: ( rule__Comment__Group_5__1__Impl )
            // InternalAssign3.g:1833:2: rule__Comment__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_5__1"


    // $ANTLR start "rule__Comment__Group_5__1__Impl"
    // InternalAssign3.g:1839:1: rule__Comment__Group_5__1__Impl : ( ( rule__Comment__CommentTypeAssignment_5_1 ) ) ;
    public final void rule__Comment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1843:1: ( ( ( rule__Comment__CommentTypeAssignment_5_1 ) ) )
            // InternalAssign3.g:1844:1: ( ( rule__Comment__CommentTypeAssignment_5_1 ) )
            {
            // InternalAssign3.g:1844:1: ( ( rule__Comment__CommentTypeAssignment_5_1 ) )
            // InternalAssign3.g:1845:2: ( rule__Comment__CommentTypeAssignment_5_1 )
            {
             before(grammarAccess.getCommentAccess().getCommentTypeAssignment_5_1()); 
            // InternalAssign3.g:1846:2: ( rule__Comment__CommentTypeAssignment_5_1 )
            // InternalAssign3.g:1846:3: rule__Comment__CommentTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__CommentTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getCommentTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_5__1__Impl"


    // $ANTLR start "rule__Comment__Group_6__0"
    // InternalAssign3.g:1855:1: rule__Comment__Group_6__0 : rule__Comment__Group_6__0__Impl rule__Comment__Group_6__1 ;
    public final void rule__Comment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1859:1: ( rule__Comment__Group_6__0__Impl rule__Comment__Group_6__1 )
            // InternalAssign3.g:1860:2: rule__Comment__Group_6__0__Impl rule__Comment__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__Comment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_6__0"


    // $ANTLR start "rule__Comment__Group_6__0__Impl"
    // InternalAssign3.g:1867:1: rule__Comment__Group_6__0__Impl : ( 'moderationProcess' ) ;
    public final void rule__Comment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1871:1: ( ( 'moderationProcess' ) )
            // InternalAssign3.g:1872:1: ( 'moderationProcess' )
            {
            // InternalAssign3.g:1872:1: ( 'moderationProcess' )
            // InternalAssign3.g:1873:2: 'moderationProcess'
            {
             before(grammarAccess.getCommentAccess().getModerationProcessKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getModerationProcessKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_6__0__Impl"


    // $ANTLR start "rule__Comment__Group_6__1"
    // InternalAssign3.g:1882:1: rule__Comment__Group_6__1 : rule__Comment__Group_6__1__Impl ;
    public final void rule__Comment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1886:1: ( rule__Comment__Group_6__1__Impl )
            // InternalAssign3.g:1887:2: rule__Comment__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_6__1"


    // $ANTLR start "rule__Comment__Group_6__1__Impl"
    // InternalAssign3.g:1893:1: rule__Comment__Group_6__1__Impl : ( ( rule__Comment__ModerationProcessAssignment_6_1 ) ) ;
    public final void rule__Comment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1897:1: ( ( ( rule__Comment__ModerationProcessAssignment_6_1 ) ) )
            // InternalAssign3.g:1898:1: ( ( rule__Comment__ModerationProcessAssignment_6_1 ) )
            {
            // InternalAssign3.g:1898:1: ( ( rule__Comment__ModerationProcessAssignment_6_1 ) )
            // InternalAssign3.g:1899:2: ( rule__Comment__ModerationProcessAssignment_6_1 )
            {
             before(grammarAccess.getCommentAccess().getModerationProcessAssignment_6_1()); 
            // InternalAssign3.g:1900:2: ( rule__Comment__ModerationProcessAssignment_6_1 )
            // InternalAssign3.g:1900:3: rule__Comment__ModerationProcessAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Comment__ModerationProcessAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getModerationProcessAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__Group_6__1__Impl"


    // $ANTLR start "rule__ModerationProcess__Group__0"
    // InternalAssign3.g:1909:1: rule__ModerationProcess__Group__0 : rule__ModerationProcess__Group__0__Impl rule__ModerationProcess__Group__1 ;
    public final void rule__ModerationProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1913:1: ( rule__ModerationProcess__Group__0__Impl rule__ModerationProcess__Group__1 )
            // InternalAssign3.g:1914:2: rule__ModerationProcess__Group__0__Impl rule__ModerationProcess__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ModerationProcess__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__0"


    // $ANTLR start "rule__ModerationProcess__Group__0__Impl"
    // InternalAssign3.g:1921:1: rule__ModerationProcess__Group__0__Impl : ( 'ModerationProcess' ) ;
    public final void rule__ModerationProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1925:1: ( ( 'ModerationProcess' ) )
            // InternalAssign3.g:1926:1: ( 'ModerationProcess' )
            {
            // InternalAssign3.g:1926:1: ( 'ModerationProcess' )
            // InternalAssign3.g:1927:2: 'ModerationProcess'
            {
             before(grammarAccess.getModerationProcessAccess().getModerationProcessKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getModerationProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__0__Impl"


    // $ANTLR start "rule__ModerationProcess__Group__1"
    // InternalAssign3.g:1936:1: rule__ModerationProcess__Group__1 : rule__ModerationProcess__Group__1__Impl rule__ModerationProcess__Group__2 ;
    public final void rule__ModerationProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1940:1: ( rule__ModerationProcess__Group__1__Impl rule__ModerationProcess__Group__2 )
            // InternalAssign3.g:1941:2: rule__ModerationProcess__Group__1__Impl rule__ModerationProcess__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ModerationProcess__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__1"


    // $ANTLR start "rule__ModerationProcess__Group__1__Impl"
    // InternalAssign3.g:1948:1: rule__ModerationProcess__Group__1__Impl : ( ( rule__ModerationProcess__NameAssignment_1 ) ) ;
    public final void rule__ModerationProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1952:1: ( ( ( rule__ModerationProcess__NameAssignment_1 ) ) )
            // InternalAssign3.g:1953:1: ( ( rule__ModerationProcess__NameAssignment_1 ) )
            {
            // InternalAssign3.g:1953:1: ( ( rule__ModerationProcess__NameAssignment_1 ) )
            // InternalAssign3.g:1954:2: ( rule__ModerationProcess__NameAssignment_1 )
            {
             before(grammarAccess.getModerationProcessAccess().getNameAssignment_1()); 
            // InternalAssign3.g:1955:2: ( rule__ModerationProcess__NameAssignment_1 )
            // InternalAssign3.g:1955:3: rule__ModerationProcess__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModerationProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__1__Impl"


    // $ANTLR start "rule__ModerationProcess__Group__2"
    // InternalAssign3.g:1963:1: rule__ModerationProcess__Group__2 : rule__ModerationProcess__Group__2__Impl rule__ModerationProcess__Group__3 ;
    public final void rule__ModerationProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1967:1: ( rule__ModerationProcess__Group__2__Impl rule__ModerationProcess__Group__3 )
            // InternalAssign3.g:1968:2: rule__ModerationProcess__Group__2__Impl rule__ModerationProcess__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ModerationProcess__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__2"


    // $ANTLR start "rule__ModerationProcess__Group__2__Impl"
    // InternalAssign3.g:1975:1: rule__ModerationProcess__Group__2__Impl : ( '{' ) ;
    public final void rule__ModerationProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1979:1: ( ( '{' ) )
            // InternalAssign3.g:1980:1: ( '{' )
            {
            // InternalAssign3.g:1980:1: ( '{' )
            // InternalAssign3.g:1981:2: '{'
            {
             before(grammarAccess.getModerationProcessAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__2__Impl"


    // $ANTLR start "rule__ModerationProcess__Group__3"
    // InternalAssign3.g:1990:1: rule__ModerationProcess__Group__3 : rule__ModerationProcess__Group__3__Impl rule__ModerationProcess__Group__4 ;
    public final void rule__ModerationProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:1994:1: ( rule__ModerationProcess__Group__3__Impl rule__ModerationProcess__Group__4 )
            // InternalAssign3.g:1995:2: rule__ModerationProcess__Group__3__Impl rule__ModerationProcess__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ModerationProcess__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__3"


    // $ANTLR start "rule__ModerationProcess__Group__3__Impl"
    // InternalAssign3.g:2002:1: rule__ModerationProcess__Group__3__Impl : ( 'startStep' ) ;
    public final void rule__ModerationProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2006:1: ( ( 'startStep' ) )
            // InternalAssign3.g:2007:1: ( 'startStep' )
            {
            // InternalAssign3.g:2007:1: ( 'startStep' )
            // InternalAssign3.g:2008:2: 'startStep'
            {
             before(grammarAccess.getModerationProcessAccess().getStartStepKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getStartStepKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__3__Impl"


    // $ANTLR start "rule__ModerationProcess__Group__4"
    // InternalAssign3.g:2017:1: rule__ModerationProcess__Group__4 : rule__ModerationProcess__Group__4__Impl rule__ModerationProcess__Group__5 ;
    public final void rule__ModerationProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2021:1: ( rule__ModerationProcess__Group__4__Impl rule__ModerationProcess__Group__5 )
            // InternalAssign3.g:2022:2: rule__ModerationProcess__Group__4__Impl rule__ModerationProcess__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ModerationProcess__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__4"


    // $ANTLR start "rule__ModerationProcess__Group__4__Impl"
    // InternalAssign3.g:2029:1: rule__ModerationProcess__Group__4__Impl : ( ( rule__ModerationProcess__StartStepAssignment_4 ) ) ;
    public final void rule__ModerationProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2033:1: ( ( ( rule__ModerationProcess__StartStepAssignment_4 ) ) )
            // InternalAssign3.g:2034:1: ( ( rule__ModerationProcess__StartStepAssignment_4 ) )
            {
            // InternalAssign3.g:2034:1: ( ( rule__ModerationProcess__StartStepAssignment_4 ) )
            // InternalAssign3.g:2035:2: ( rule__ModerationProcess__StartStepAssignment_4 )
            {
             before(grammarAccess.getModerationProcessAccess().getStartStepAssignment_4()); 
            // InternalAssign3.g:2036:2: ( rule__ModerationProcess__StartStepAssignment_4 )
            // InternalAssign3.g:2036:3: rule__ModerationProcess__StartStepAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__StartStepAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModerationProcessAccess().getStartStepAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__4__Impl"


    // $ANTLR start "rule__ModerationProcess__Group__5"
    // InternalAssign3.g:2044:1: rule__ModerationProcess__Group__5 : rule__ModerationProcess__Group__5__Impl rule__ModerationProcess__Group__6 ;
    public final void rule__ModerationProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2048:1: ( rule__ModerationProcess__Group__5__Impl rule__ModerationProcess__Group__6 )
            // InternalAssign3.g:2049:2: rule__ModerationProcess__Group__5__Impl rule__ModerationProcess__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ModerationProcess__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__5"


    // $ANTLR start "rule__ModerationProcess__Group__5__Impl"
    // InternalAssign3.g:2056:1: rule__ModerationProcess__Group__5__Impl : ( ( rule__ModerationProcess__Group_5__0 )? ) ;
    public final void rule__ModerationProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2060:1: ( ( ( rule__ModerationProcess__Group_5__0 )? ) )
            // InternalAssign3.g:2061:1: ( ( rule__ModerationProcess__Group_5__0 )? )
            {
            // InternalAssign3.g:2061:1: ( ( rule__ModerationProcess__Group_5__0 )? )
            // InternalAssign3.g:2062:2: ( rule__ModerationProcess__Group_5__0 )?
            {
             before(grammarAccess.getModerationProcessAccess().getGroup_5()); 
            // InternalAssign3.g:2063:2: ( rule__ModerationProcess__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAssign3.g:2063:3: rule__ModerationProcess__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModerationProcess__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModerationProcessAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__5__Impl"


    // $ANTLR start "rule__ModerationProcess__Group__6"
    // InternalAssign3.g:2071:1: rule__ModerationProcess__Group__6 : rule__ModerationProcess__Group__6__Impl ;
    public final void rule__ModerationProcess__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2075:1: ( rule__ModerationProcess__Group__6__Impl )
            // InternalAssign3.g:2076:2: rule__ModerationProcess__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__6"


    // $ANTLR start "rule__ModerationProcess__Group__6__Impl"
    // InternalAssign3.g:2082:1: rule__ModerationProcess__Group__6__Impl : ( '}' ) ;
    public final void rule__ModerationProcess__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2086:1: ( ( '}' ) )
            // InternalAssign3.g:2087:1: ( '}' )
            {
            // InternalAssign3.g:2087:1: ( '}' )
            // InternalAssign3.g:2088:2: '}'
            {
             before(grammarAccess.getModerationProcessAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group__6__Impl"


    // $ANTLR start "rule__ModerationProcess__Group_5__0"
    // InternalAssign3.g:2098:1: rule__ModerationProcess__Group_5__0 : rule__ModerationProcess__Group_5__0__Impl rule__ModerationProcess__Group_5__1 ;
    public final void rule__ModerationProcess__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2102:1: ( rule__ModerationProcess__Group_5__0__Impl rule__ModerationProcess__Group_5__1 )
            // InternalAssign3.g:2103:2: rule__ModerationProcess__Group_5__0__Impl rule__ModerationProcess__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__ModerationProcess__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__0"


    // $ANTLR start "rule__ModerationProcess__Group_5__0__Impl"
    // InternalAssign3.g:2110:1: rule__ModerationProcess__Group_5__0__Impl : ( 'step' ) ;
    public final void rule__ModerationProcess__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2114:1: ( ( 'step' ) )
            // InternalAssign3.g:2115:1: ( 'step' )
            {
            // InternalAssign3.g:2115:1: ( 'step' )
            // InternalAssign3.g:2116:2: 'step'
            {
             before(grammarAccess.getModerationProcessAccess().getStepKeyword_5_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getStepKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__0__Impl"


    // $ANTLR start "rule__ModerationProcess__Group_5__1"
    // InternalAssign3.g:2125:1: rule__ModerationProcess__Group_5__1 : rule__ModerationProcess__Group_5__1__Impl rule__ModerationProcess__Group_5__2 ;
    public final void rule__ModerationProcess__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2129:1: ( rule__ModerationProcess__Group_5__1__Impl rule__ModerationProcess__Group_5__2 )
            // InternalAssign3.g:2130:2: rule__ModerationProcess__Group_5__1__Impl rule__ModerationProcess__Group_5__2
            {
            pushFollow(FOLLOW_25);
            rule__ModerationProcess__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__1"


    // $ANTLR start "rule__ModerationProcess__Group_5__1__Impl"
    // InternalAssign3.g:2137:1: rule__ModerationProcess__Group_5__1__Impl : ( '{' ) ;
    public final void rule__ModerationProcess__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2141:1: ( ( '{' ) )
            // InternalAssign3.g:2142:1: ( '{' )
            {
            // InternalAssign3.g:2142:1: ( '{' )
            // InternalAssign3.g:2143:2: '{'
            {
             before(grammarAccess.getModerationProcessAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__1__Impl"


    // $ANTLR start "rule__ModerationProcess__Group_5__2"
    // InternalAssign3.g:2152:1: rule__ModerationProcess__Group_5__2 : rule__ModerationProcess__Group_5__2__Impl rule__ModerationProcess__Group_5__3 ;
    public final void rule__ModerationProcess__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2156:1: ( rule__ModerationProcess__Group_5__2__Impl rule__ModerationProcess__Group_5__3 )
            // InternalAssign3.g:2157:2: rule__ModerationProcess__Group_5__2__Impl rule__ModerationProcess__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__ModerationProcess__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__2"


    // $ANTLR start "rule__ModerationProcess__Group_5__2__Impl"
    // InternalAssign3.g:2164:1: rule__ModerationProcess__Group_5__2__Impl : ( ( rule__ModerationProcess__StepAssignment_5_2 ) ) ;
    public final void rule__ModerationProcess__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2168:1: ( ( ( rule__ModerationProcess__StepAssignment_5_2 ) ) )
            // InternalAssign3.g:2169:1: ( ( rule__ModerationProcess__StepAssignment_5_2 ) )
            {
            // InternalAssign3.g:2169:1: ( ( rule__ModerationProcess__StepAssignment_5_2 ) )
            // InternalAssign3.g:2170:2: ( rule__ModerationProcess__StepAssignment_5_2 )
            {
             before(grammarAccess.getModerationProcessAccess().getStepAssignment_5_2()); 
            // InternalAssign3.g:2171:2: ( rule__ModerationProcess__StepAssignment_5_2 )
            // InternalAssign3.g:2171:3: rule__ModerationProcess__StepAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__StepAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getModerationProcessAccess().getStepAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__2__Impl"


    // $ANTLR start "rule__ModerationProcess__Group_5__3"
    // InternalAssign3.g:2179:1: rule__ModerationProcess__Group_5__3 : rule__ModerationProcess__Group_5__3__Impl rule__ModerationProcess__Group_5__4 ;
    public final void rule__ModerationProcess__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2183:1: ( rule__ModerationProcess__Group_5__3__Impl rule__ModerationProcess__Group_5__4 )
            // InternalAssign3.g:2184:2: rule__ModerationProcess__Group_5__3__Impl rule__ModerationProcess__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__ModerationProcess__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__3"


    // $ANTLR start "rule__ModerationProcess__Group_5__3__Impl"
    // InternalAssign3.g:2191:1: rule__ModerationProcess__Group_5__3__Impl : ( ( rule__ModerationProcess__Group_5_3__0 )* ) ;
    public final void rule__ModerationProcess__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2195:1: ( ( ( rule__ModerationProcess__Group_5_3__0 )* ) )
            // InternalAssign3.g:2196:1: ( ( rule__ModerationProcess__Group_5_3__0 )* )
            {
            // InternalAssign3.g:2196:1: ( ( rule__ModerationProcess__Group_5_3__0 )* )
            // InternalAssign3.g:2197:2: ( rule__ModerationProcess__Group_5_3__0 )*
            {
             before(grammarAccess.getModerationProcessAccess().getGroup_5_3()); 
            // InternalAssign3.g:2198:2: ( rule__ModerationProcess__Group_5_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAssign3.g:2198:3: rule__ModerationProcess__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ModerationProcess__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModerationProcessAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__3__Impl"


    // $ANTLR start "rule__ModerationProcess__Group_5__4"
    // InternalAssign3.g:2206:1: rule__ModerationProcess__Group_5__4 : rule__ModerationProcess__Group_5__4__Impl ;
    public final void rule__ModerationProcess__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2210:1: ( rule__ModerationProcess__Group_5__4__Impl )
            // InternalAssign3.g:2211:2: rule__ModerationProcess__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__4"


    // $ANTLR start "rule__ModerationProcess__Group_5__4__Impl"
    // InternalAssign3.g:2217:1: rule__ModerationProcess__Group_5__4__Impl : ( '}' ) ;
    public final void rule__ModerationProcess__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2221:1: ( ( '}' ) )
            // InternalAssign3.g:2222:1: ( '}' )
            {
            // InternalAssign3.g:2222:1: ( '}' )
            // InternalAssign3.g:2223:2: '}'
            {
             before(grammarAccess.getModerationProcessAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5__4__Impl"


    // $ANTLR start "rule__ModerationProcess__Group_5_3__0"
    // InternalAssign3.g:2233:1: rule__ModerationProcess__Group_5_3__0 : rule__ModerationProcess__Group_5_3__0__Impl rule__ModerationProcess__Group_5_3__1 ;
    public final void rule__ModerationProcess__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2237:1: ( rule__ModerationProcess__Group_5_3__0__Impl rule__ModerationProcess__Group_5_3__1 )
            // InternalAssign3.g:2238:2: rule__ModerationProcess__Group_5_3__0__Impl rule__ModerationProcess__Group_5_3__1
            {
            pushFollow(FOLLOW_25);
            rule__ModerationProcess__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5_3__0"


    // $ANTLR start "rule__ModerationProcess__Group_5_3__0__Impl"
    // InternalAssign3.g:2245:1: rule__ModerationProcess__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__ModerationProcess__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2249:1: ( ( ',' ) )
            // InternalAssign3.g:2250:1: ( ',' )
            {
            // InternalAssign3.g:2250:1: ( ',' )
            // InternalAssign3.g:2251:2: ','
            {
             before(grammarAccess.getModerationProcessAccess().getCommaKeyword_5_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5_3__0__Impl"


    // $ANTLR start "rule__ModerationProcess__Group_5_3__1"
    // InternalAssign3.g:2260:1: rule__ModerationProcess__Group_5_3__1 : rule__ModerationProcess__Group_5_3__1__Impl ;
    public final void rule__ModerationProcess__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2264:1: ( rule__ModerationProcess__Group_5_3__1__Impl )
            // InternalAssign3.g:2265:2: rule__ModerationProcess__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5_3__1"


    // $ANTLR start "rule__ModerationProcess__Group_5_3__1__Impl"
    // InternalAssign3.g:2271:1: rule__ModerationProcess__Group_5_3__1__Impl : ( ( rule__ModerationProcess__StepAssignment_5_3_1 ) ) ;
    public final void rule__ModerationProcess__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2275:1: ( ( ( rule__ModerationProcess__StepAssignment_5_3_1 ) ) )
            // InternalAssign3.g:2276:1: ( ( rule__ModerationProcess__StepAssignment_5_3_1 ) )
            {
            // InternalAssign3.g:2276:1: ( ( rule__ModerationProcess__StepAssignment_5_3_1 ) )
            // InternalAssign3.g:2277:2: ( rule__ModerationProcess__StepAssignment_5_3_1 )
            {
             before(grammarAccess.getModerationProcessAccess().getStepAssignment_5_3_1()); 
            // InternalAssign3.g:2278:2: ( rule__ModerationProcess__StepAssignment_5_3_1 )
            // InternalAssign3.g:2278:3: rule__ModerationProcess__StepAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__StepAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModerationProcessAccess().getStepAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__Group_5_3__1__Impl"


    // $ANTLR start "rule__End__Group__0"
    // InternalAssign3.g:2287:1: rule__End__Group__0 : rule__End__Group__0__Impl rule__End__Group__1 ;
    public final void rule__End__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2291:1: ( rule__End__Group__0__Impl rule__End__Group__1 )
            // InternalAssign3.g:2292:2: rule__End__Group__0__Impl rule__End__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__End__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__0"


    // $ANTLR start "rule__End__Group__0__Impl"
    // InternalAssign3.g:2299:1: rule__End__Group__0__Impl : ( () ) ;
    public final void rule__End__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2303:1: ( ( () ) )
            // InternalAssign3.g:2304:1: ( () )
            {
            // InternalAssign3.g:2304:1: ( () )
            // InternalAssign3.g:2305:2: ()
            {
             before(grammarAccess.getEndAccess().getEndAction_0()); 
            // InternalAssign3.g:2306:2: ()
            // InternalAssign3.g:2306:3: 
            {
            }

             after(grammarAccess.getEndAccess().getEndAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__0__Impl"


    // $ANTLR start "rule__End__Group__1"
    // InternalAssign3.g:2314:1: rule__End__Group__1 : rule__End__Group__1__Impl rule__End__Group__2 ;
    public final void rule__End__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2318:1: ( rule__End__Group__1__Impl rule__End__Group__2 )
            // InternalAssign3.g:2319:2: rule__End__Group__1__Impl rule__End__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__End__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__1"


    // $ANTLR start "rule__End__Group__1__Impl"
    // InternalAssign3.g:2326:1: rule__End__Group__1__Impl : ( 'End' ) ;
    public final void rule__End__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2330:1: ( ( 'End' ) )
            // InternalAssign3.g:2331:1: ( 'End' )
            {
            // InternalAssign3.g:2331:1: ( 'End' )
            // InternalAssign3.g:2332:2: 'End'
            {
             before(grammarAccess.getEndAccess().getEndKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getEndKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__1__Impl"


    // $ANTLR start "rule__End__Group__2"
    // InternalAssign3.g:2341:1: rule__End__Group__2 : rule__End__Group__2__Impl ;
    public final void rule__End__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2345:1: ( rule__End__Group__2__Impl )
            // InternalAssign3.g:2346:2: rule__End__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__End__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__2"


    // $ANTLR start "rule__End__Group__2__Impl"
    // InternalAssign3.g:2352:1: rule__End__Group__2__Impl : ( ( rule__End__NameAssignment_2 ) ) ;
    public final void rule__End__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2356:1: ( ( ( rule__End__NameAssignment_2 ) ) )
            // InternalAssign3.g:2357:1: ( ( rule__End__NameAssignment_2 ) )
            {
            // InternalAssign3.g:2357:1: ( ( rule__End__NameAssignment_2 ) )
            // InternalAssign3.g:2358:2: ( rule__End__NameAssignment_2 )
            {
             before(grammarAccess.getEndAccess().getNameAssignment_2()); 
            // InternalAssign3.g:2359:2: ( rule__End__NameAssignment_2 )
            // InternalAssign3.g:2359:3: rule__End__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__End__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__Group__2__Impl"


    // $ANTLR start "rule__Automatic__Group__0"
    // InternalAssign3.g:2368:1: rule__Automatic__Group__0 : rule__Automatic__Group__0__Impl rule__Automatic__Group__1 ;
    public final void rule__Automatic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2372:1: ( rule__Automatic__Group__0__Impl rule__Automatic__Group__1 )
            // InternalAssign3.g:2373:2: rule__Automatic__Group__0__Impl rule__Automatic__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Automatic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__0"


    // $ANTLR start "rule__Automatic__Group__0__Impl"
    // InternalAssign3.g:2380:1: rule__Automatic__Group__0__Impl : ( 'Automatic' ) ;
    public final void rule__Automatic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2384:1: ( ( 'Automatic' ) )
            // InternalAssign3.g:2385:1: ( 'Automatic' )
            {
            // InternalAssign3.g:2385:1: ( 'Automatic' )
            // InternalAssign3.g:2386:2: 'Automatic'
            {
             before(grammarAccess.getAutomaticAccess().getAutomaticKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getAutomaticKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__0__Impl"


    // $ANTLR start "rule__Automatic__Group__1"
    // InternalAssign3.g:2395:1: rule__Automatic__Group__1 : rule__Automatic__Group__1__Impl rule__Automatic__Group__2 ;
    public final void rule__Automatic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2399:1: ( rule__Automatic__Group__1__Impl rule__Automatic__Group__2 )
            // InternalAssign3.g:2400:2: rule__Automatic__Group__1__Impl rule__Automatic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Automatic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__1"


    // $ANTLR start "rule__Automatic__Group__1__Impl"
    // InternalAssign3.g:2407:1: rule__Automatic__Group__1__Impl : ( ( rule__Automatic__NameAssignment_1 ) ) ;
    public final void rule__Automatic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2411:1: ( ( ( rule__Automatic__NameAssignment_1 ) ) )
            // InternalAssign3.g:2412:1: ( ( rule__Automatic__NameAssignment_1 ) )
            {
            // InternalAssign3.g:2412:1: ( ( rule__Automatic__NameAssignment_1 ) )
            // InternalAssign3.g:2413:2: ( rule__Automatic__NameAssignment_1 )
            {
             before(grammarAccess.getAutomaticAccess().getNameAssignment_1()); 
            // InternalAssign3.g:2414:2: ( rule__Automatic__NameAssignment_1 )
            // InternalAssign3.g:2414:3: rule__Automatic__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__1__Impl"


    // $ANTLR start "rule__Automatic__Group__2"
    // InternalAssign3.g:2422:1: rule__Automatic__Group__2 : rule__Automatic__Group__2__Impl rule__Automatic__Group__3 ;
    public final void rule__Automatic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2426:1: ( rule__Automatic__Group__2__Impl rule__Automatic__Group__3 )
            // InternalAssign3.g:2427:2: rule__Automatic__Group__2__Impl rule__Automatic__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Automatic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__2"


    // $ANTLR start "rule__Automatic__Group__2__Impl"
    // InternalAssign3.g:2434:1: rule__Automatic__Group__2__Impl : ( '{' ) ;
    public final void rule__Automatic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2438:1: ( ( '{' ) )
            // InternalAssign3.g:2439:1: ( '{' )
            {
            // InternalAssign3.g:2439:1: ( '{' )
            // InternalAssign3.g:2440:2: '{'
            {
             before(grammarAccess.getAutomaticAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__2__Impl"


    // $ANTLR start "rule__Automatic__Group__3"
    // InternalAssign3.g:2449:1: rule__Automatic__Group__3 : rule__Automatic__Group__3__Impl rule__Automatic__Group__4 ;
    public final void rule__Automatic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2453:1: ( rule__Automatic__Group__3__Impl rule__Automatic__Group__4 )
            // InternalAssign3.g:2454:2: rule__Automatic__Group__3__Impl rule__Automatic__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Automatic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__3"


    // $ANTLR start "rule__Automatic__Group__3__Impl"
    // InternalAssign3.g:2461:1: rule__Automatic__Group__3__Impl : ( ( rule__Automatic__Group_3__0 )? ) ;
    public final void rule__Automatic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2465:1: ( ( ( rule__Automatic__Group_3__0 )? ) )
            // InternalAssign3.g:2466:1: ( ( rule__Automatic__Group_3__0 )? )
            {
            // InternalAssign3.g:2466:1: ( ( rule__Automatic__Group_3__0 )? )
            // InternalAssign3.g:2467:2: ( rule__Automatic__Group_3__0 )?
            {
             before(grammarAccess.getAutomaticAccess().getGroup_3()); 
            // InternalAssign3.g:2468:2: ( rule__Automatic__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAssign3.g:2468:3: rule__Automatic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automatic__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomaticAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__3__Impl"


    // $ANTLR start "rule__Automatic__Group__4"
    // InternalAssign3.g:2476:1: rule__Automatic__Group__4 : rule__Automatic__Group__4__Impl rule__Automatic__Group__5 ;
    public final void rule__Automatic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2480:1: ( rule__Automatic__Group__4__Impl rule__Automatic__Group__5 )
            // InternalAssign3.g:2481:2: rule__Automatic__Group__4__Impl rule__Automatic__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Automatic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__4"


    // $ANTLR start "rule__Automatic__Group__4__Impl"
    // InternalAssign3.g:2488:1: rule__Automatic__Group__4__Impl : ( 'nextApprove' ) ;
    public final void rule__Automatic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2492:1: ( ( 'nextApprove' ) )
            // InternalAssign3.g:2493:1: ( 'nextApprove' )
            {
            // InternalAssign3.g:2493:1: ( 'nextApprove' )
            // InternalAssign3.g:2494:2: 'nextApprove'
            {
             before(grammarAccess.getAutomaticAccess().getNextApproveKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getNextApproveKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__4__Impl"


    // $ANTLR start "rule__Automatic__Group__5"
    // InternalAssign3.g:2503:1: rule__Automatic__Group__5 : rule__Automatic__Group__5__Impl rule__Automatic__Group__6 ;
    public final void rule__Automatic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2507:1: ( rule__Automatic__Group__5__Impl rule__Automatic__Group__6 )
            // InternalAssign3.g:2508:2: rule__Automatic__Group__5__Impl rule__Automatic__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Automatic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__5"


    // $ANTLR start "rule__Automatic__Group__5__Impl"
    // InternalAssign3.g:2515:1: rule__Automatic__Group__5__Impl : ( ( rule__Automatic__NextApproveAssignment_5 ) ) ;
    public final void rule__Automatic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2519:1: ( ( ( rule__Automatic__NextApproveAssignment_5 ) ) )
            // InternalAssign3.g:2520:1: ( ( rule__Automatic__NextApproveAssignment_5 ) )
            {
            // InternalAssign3.g:2520:1: ( ( rule__Automatic__NextApproveAssignment_5 ) )
            // InternalAssign3.g:2521:2: ( rule__Automatic__NextApproveAssignment_5 )
            {
             before(grammarAccess.getAutomaticAccess().getNextApproveAssignment_5()); 
            // InternalAssign3.g:2522:2: ( rule__Automatic__NextApproveAssignment_5 )
            // InternalAssign3.g:2522:3: rule__Automatic__NextApproveAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__NextApproveAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getNextApproveAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__5__Impl"


    // $ANTLR start "rule__Automatic__Group__6"
    // InternalAssign3.g:2530:1: rule__Automatic__Group__6 : rule__Automatic__Group__6__Impl rule__Automatic__Group__7 ;
    public final void rule__Automatic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2534:1: ( rule__Automatic__Group__6__Impl rule__Automatic__Group__7 )
            // InternalAssign3.g:2535:2: rule__Automatic__Group__6__Impl rule__Automatic__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Automatic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__6"


    // $ANTLR start "rule__Automatic__Group__6__Impl"
    // InternalAssign3.g:2542:1: rule__Automatic__Group__6__Impl : ( 'nextReject' ) ;
    public final void rule__Automatic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2546:1: ( ( 'nextReject' ) )
            // InternalAssign3.g:2547:1: ( 'nextReject' )
            {
            // InternalAssign3.g:2547:1: ( 'nextReject' )
            // InternalAssign3.g:2548:2: 'nextReject'
            {
             before(grammarAccess.getAutomaticAccess().getNextRejectKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getNextRejectKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__6__Impl"


    // $ANTLR start "rule__Automatic__Group__7"
    // InternalAssign3.g:2557:1: rule__Automatic__Group__7 : rule__Automatic__Group__7__Impl rule__Automatic__Group__8 ;
    public final void rule__Automatic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2561:1: ( rule__Automatic__Group__7__Impl rule__Automatic__Group__8 )
            // InternalAssign3.g:2562:2: rule__Automatic__Group__7__Impl rule__Automatic__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Automatic__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__7"


    // $ANTLR start "rule__Automatic__Group__7__Impl"
    // InternalAssign3.g:2569:1: rule__Automatic__Group__7__Impl : ( ( rule__Automatic__NextRejectAssignment_7 ) ) ;
    public final void rule__Automatic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2573:1: ( ( ( rule__Automatic__NextRejectAssignment_7 ) ) )
            // InternalAssign3.g:2574:1: ( ( rule__Automatic__NextRejectAssignment_7 ) )
            {
            // InternalAssign3.g:2574:1: ( ( rule__Automatic__NextRejectAssignment_7 ) )
            // InternalAssign3.g:2575:2: ( rule__Automatic__NextRejectAssignment_7 )
            {
             before(grammarAccess.getAutomaticAccess().getNextRejectAssignment_7()); 
            // InternalAssign3.g:2576:2: ( rule__Automatic__NextRejectAssignment_7 )
            // InternalAssign3.g:2576:3: rule__Automatic__NextRejectAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__NextRejectAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getNextRejectAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__7__Impl"


    // $ANTLR start "rule__Automatic__Group__8"
    // InternalAssign3.g:2584:1: rule__Automatic__Group__8 : rule__Automatic__Group__8__Impl ;
    public final void rule__Automatic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2588:1: ( rule__Automatic__Group__8__Impl )
            // InternalAssign3.g:2589:2: rule__Automatic__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__8"


    // $ANTLR start "rule__Automatic__Group__8__Impl"
    // InternalAssign3.g:2595:1: rule__Automatic__Group__8__Impl : ( '}' ) ;
    public final void rule__Automatic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2599:1: ( ( '}' ) )
            // InternalAssign3.g:2600:1: ( '}' )
            {
            // InternalAssign3.g:2600:1: ( '}' )
            // InternalAssign3.g:2601:2: '}'
            {
             before(grammarAccess.getAutomaticAccess().getRightCurlyBracketKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group__8__Impl"


    // $ANTLR start "rule__Automatic__Group_3__0"
    // InternalAssign3.g:2611:1: rule__Automatic__Group_3__0 : rule__Automatic__Group_3__0__Impl rule__Automatic__Group_3__1 ;
    public final void rule__Automatic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2615:1: ( rule__Automatic__Group_3__0__Impl rule__Automatic__Group_3__1 )
            // InternalAssign3.g:2616:2: rule__Automatic__Group_3__0__Impl rule__Automatic__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Automatic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group_3__0"


    // $ANTLR start "rule__Automatic__Group_3__0__Impl"
    // InternalAssign3.g:2623:1: rule__Automatic__Group_3__0__Impl : ( 'method' ) ;
    public final void rule__Automatic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2627:1: ( ( 'method' ) )
            // InternalAssign3.g:2628:1: ( 'method' )
            {
            // InternalAssign3.g:2628:1: ( 'method' )
            // InternalAssign3.g:2629:2: 'method'
            {
             before(grammarAccess.getAutomaticAccess().getMethodKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getMethodKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group_3__0__Impl"


    // $ANTLR start "rule__Automatic__Group_3__1"
    // InternalAssign3.g:2638:1: rule__Automatic__Group_3__1 : rule__Automatic__Group_3__1__Impl ;
    public final void rule__Automatic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2642:1: ( rule__Automatic__Group_3__1__Impl )
            // InternalAssign3.g:2643:2: rule__Automatic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group_3__1"


    // $ANTLR start "rule__Automatic__Group_3__1__Impl"
    // InternalAssign3.g:2649:1: rule__Automatic__Group_3__1__Impl : ( ( rule__Automatic__MethodAssignment_3_1 ) ) ;
    public final void rule__Automatic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2653:1: ( ( ( rule__Automatic__MethodAssignment_3_1 ) ) )
            // InternalAssign3.g:2654:1: ( ( rule__Automatic__MethodAssignment_3_1 ) )
            {
            // InternalAssign3.g:2654:1: ( ( rule__Automatic__MethodAssignment_3_1 ) )
            // InternalAssign3.g:2655:2: ( rule__Automatic__MethodAssignment_3_1 )
            {
             before(grammarAccess.getAutomaticAccess().getMethodAssignment_3_1()); 
            // InternalAssign3.g:2656:2: ( rule__Automatic__MethodAssignment_3_1 )
            // InternalAssign3.g:2656:3: rule__Automatic__MethodAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__MethodAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getMethodAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__Group_3__1__Impl"


    // $ANTLR start "rule__Manual__Group__0"
    // InternalAssign3.g:2665:1: rule__Manual__Group__0 : rule__Manual__Group__0__Impl rule__Manual__Group__1 ;
    public final void rule__Manual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2669:1: ( rule__Manual__Group__0__Impl rule__Manual__Group__1 )
            // InternalAssign3.g:2670:2: rule__Manual__Group__0__Impl rule__Manual__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Manual__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__0"


    // $ANTLR start "rule__Manual__Group__0__Impl"
    // InternalAssign3.g:2677:1: rule__Manual__Group__0__Impl : ( 'Manual' ) ;
    public final void rule__Manual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2681:1: ( ( 'Manual' ) )
            // InternalAssign3.g:2682:1: ( 'Manual' )
            {
            // InternalAssign3.g:2682:1: ( 'Manual' )
            // InternalAssign3.g:2683:2: 'Manual'
            {
             before(grammarAccess.getManualAccess().getManualKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getManualKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__0__Impl"


    // $ANTLR start "rule__Manual__Group__1"
    // InternalAssign3.g:2692:1: rule__Manual__Group__1 : rule__Manual__Group__1__Impl rule__Manual__Group__2 ;
    public final void rule__Manual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2696:1: ( rule__Manual__Group__1__Impl rule__Manual__Group__2 )
            // InternalAssign3.g:2697:2: rule__Manual__Group__1__Impl rule__Manual__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Manual__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__1"


    // $ANTLR start "rule__Manual__Group__1__Impl"
    // InternalAssign3.g:2704:1: rule__Manual__Group__1__Impl : ( ( rule__Manual__NameAssignment_1 ) ) ;
    public final void rule__Manual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2708:1: ( ( ( rule__Manual__NameAssignment_1 ) ) )
            // InternalAssign3.g:2709:1: ( ( rule__Manual__NameAssignment_1 ) )
            {
            // InternalAssign3.g:2709:1: ( ( rule__Manual__NameAssignment_1 ) )
            // InternalAssign3.g:2710:2: ( rule__Manual__NameAssignment_1 )
            {
             before(grammarAccess.getManualAccess().getNameAssignment_1()); 
            // InternalAssign3.g:2711:2: ( rule__Manual__NameAssignment_1 )
            // InternalAssign3.g:2711:3: rule__Manual__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Manual__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getManualAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__1__Impl"


    // $ANTLR start "rule__Manual__Group__2"
    // InternalAssign3.g:2719:1: rule__Manual__Group__2 : rule__Manual__Group__2__Impl rule__Manual__Group__3 ;
    public final void rule__Manual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2723:1: ( rule__Manual__Group__2__Impl rule__Manual__Group__3 )
            // InternalAssign3.g:2724:2: rule__Manual__Group__2__Impl rule__Manual__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Manual__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__2"


    // $ANTLR start "rule__Manual__Group__2__Impl"
    // InternalAssign3.g:2731:1: rule__Manual__Group__2__Impl : ( '{' ) ;
    public final void rule__Manual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2735:1: ( ( '{' ) )
            // InternalAssign3.g:2736:1: ( '{' )
            {
            // InternalAssign3.g:2736:1: ( '{' )
            // InternalAssign3.g:2737:2: '{'
            {
             before(grammarAccess.getManualAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__2__Impl"


    // $ANTLR start "rule__Manual__Group__3"
    // InternalAssign3.g:2746:1: rule__Manual__Group__3 : rule__Manual__Group__3__Impl rule__Manual__Group__4 ;
    public final void rule__Manual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2750:1: ( rule__Manual__Group__3__Impl rule__Manual__Group__4 )
            // InternalAssign3.g:2751:2: rule__Manual__Group__3__Impl rule__Manual__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Manual__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__3"


    // $ANTLR start "rule__Manual__Group__3__Impl"
    // InternalAssign3.g:2758:1: rule__Manual__Group__3__Impl : ( 'nextApprove' ) ;
    public final void rule__Manual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2762:1: ( ( 'nextApprove' ) )
            // InternalAssign3.g:2763:1: ( 'nextApprove' )
            {
            // InternalAssign3.g:2763:1: ( 'nextApprove' )
            // InternalAssign3.g:2764:2: 'nextApprove'
            {
             before(grammarAccess.getManualAccess().getNextApproveKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getNextApproveKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__3__Impl"


    // $ANTLR start "rule__Manual__Group__4"
    // InternalAssign3.g:2773:1: rule__Manual__Group__4 : rule__Manual__Group__4__Impl rule__Manual__Group__5 ;
    public final void rule__Manual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2777:1: ( rule__Manual__Group__4__Impl rule__Manual__Group__5 )
            // InternalAssign3.g:2778:2: rule__Manual__Group__4__Impl rule__Manual__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Manual__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__4"


    // $ANTLR start "rule__Manual__Group__4__Impl"
    // InternalAssign3.g:2785:1: rule__Manual__Group__4__Impl : ( ( rule__Manual__NextApproveAssignment_4 ) ) ;
    public final void rule__Manual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2789:1: ( ( ( rule__Manual__NextApproveAssignment_4 ) ) )
            // InternalAssign3.g:2790:1: ( ( rule__Manual__NextApproveAssignment_4 ) )
            {
            // InternalAssign3.g:2790:1: ( ( rule__Manual__NextApproveAssignment_4 ) )
            // InternalAssign3.g:2791:2: ( rule__Manual__NextApproveAssignment_4 )
            {
             before(grammarAccess.getManualAccess().getNextApproveAssignment_4()); 
            // InternalAssign3.g:2792:2: ( rule__Manual__NextApproveAssignment_4 )
            // InternalAssign3.g:2792:3: rule__Manual__NextApproveAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Manual__NextApproveAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getManualAccess().getNextApproveAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__4__Impl"


    // $ANTLR start "rule__Manual__Group__5"
    // InternalAssign3.g:2800:1: rule__Manual__Group__5 : rule__Manual__Group__5__Impl rule__Manual__Group__6 ;
    public final void rule__Manual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2804:1: ( rule__Manual__Group__5__Impl rule__Manual__Group__6 )
            // InternalAssign3.g:2805:2: rule__Manual__Group__5__Impl rule__Manual__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Manual__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__5"


    // $ANTLR start "rule__Manual__Group__5__Impl"
    // InternalAssign3.g:2812:1: rule__Manual__Group__5__Impl : ( 'nextReject' ) ;
    public final void rule__Manual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2816:1: ( ( 'nextReject' ) )
            // InternalAssign3.g:2817:1: ( 'nextReject' )
            {
            // InternalAssign3.g:2817:1: ( 'nextReject' )
            // InternalAssign3.g:2818:2: 'nextReject'
            {
             before(grammarAccess.getManualAccess().getNextRejectKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getNextRejectKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__5__Impl"


    // $ANTLR start "rule__Manual__Group__6"
    // InternalAssign3.g:2827:1: rule__Manual__Group__6 : rule__Manual__Group__6__Impl rule__Manual__Group__7 ;
    public final void rule__Manual__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2831:1: ( rule__Manual__Group__6__Impl rule__Manual__Group__7 )
            // InternalAssign3.g:2832:2: rule__Manual__Group__6__Impl rule__Manual__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Manual__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__6"


    // $ANTLR start "rule__Manual__Group__6__Impl"
    // InternalAssign3.g:2839:1: rule__Manual__Group__6__Impl : ( ( rule__Manual__NextRejectAssignment_6 ) ) ;
    public final void rule__Manual__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2843:1: ( ( ( rule__Manual__NextRejectAssignment_6 ) ) )
            // InternalAssign3.g:2844:1: ( ( rule__Manual__NextRejectAssignment_6 ) )
            {
            // InternalAssign3.g:2844:1: ( ( rule__Manual__NextRejectAssignment_6 ) )
            // InternalAssign3.g:2845:2: ( rule__Manual__NextRejectAssignment_6 )
            {
             before(grammarAccess.getManualAccess().getNextRejectAssignment_6()); 
            // InternalAssign3.g:2846:2: ( rule__Manual__NextRejectAssignment_6 )
            // InternalAssign3.g:2846:3: rule__Manual__NextRejectAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Manual__NextRejectAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getManualAccess().getNextRejectAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__6__Impl"


    // $ANTLR start "rule__Manual__Group__7"
    // InternalAssign3.g:2854:1: rule__Manual__Group__7 : rule__Manual__Group__7__Impl ;
    public final void rule__Manual__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2858:1: ( rule__Manual__Group__7__Impl )
            // InternalAssign3.g:2859:2: rule__Manual__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manual__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__7"


    // $ANTLR start "rule__Manual__Group__7__Impl"
    // InternalAssign3.g:2865:1: rule__Manual__Group__7__Impl : ( '}' ) ;
    public final void rule__Manual__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2869:1: ( ( '}' ) )
            // InternalAssign3.g:2870:1: ( '}' )
            {
            // InternalAssign3.g:2870:1: ( '}' )
            // InternalAssign3.g:2871:2: '}'
            {
             before(grammarAccess.getManualAccess().getRightCurlyBracketKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__Group__7__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalAssign3.g:2881:1: rule__Model__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2885:1: ( ( ruleEString ) )
            // InternalAssign3.g:2886:2: ( ruleEString )
            {
            // InternalAssign3.g:2886:2: ( ruleEString )
            // InternalAssign3.g:2887:3: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__SubjectAssignment_4"
    // InternalAssign3.g:2896:1: rule__Model__SubjectAssignment_4 : ( ruleSubject ) ;
    public final void rule__Model__SubjectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2900:1: ( ( ruleSubject ) )
            // InternalAssign3.g:2901:2: ( ruleSubject )
            {
            // InternalAssign3.g:2901:2: ( ruleSubject )
            // InternalAssign3.g:2902:3: ruleSubject
            {
             before(grammarAccess.getModelAccess().getSubjectSubjectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSubjectSubjectParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SubjectAssignment_4"


    // $ANTLR start "rule__Subject__NameAssignment_1"
    // InternalAssign3.g:2911:1: rule__Subject__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Subject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2915:1: ( ( ruleEString ) )
            // InternalAssign3.g:2916:2: ( ruleEString )
            {
            // InternalAssign3.g:2916:2: ( ruleEString )
            // InternalAssign3.g:2917:3: ruleEString
            {
             before(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__NameAssignment_1"


    // $ANTLR start "rule__Subject__UserFeedbackAssignment_5"
    // InternalAssign3.g:2926:1: rule__Subject__UserFeedbackAssignment_5 : ( ruleUserFeedback ) ;
    public final void rule__Subject__UserFeedbackAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2930:1: ( ( ruleUserFeedback ) )
            // InternalAssign3.g:2931:2: ( ruleUserFeedback )
            {
            // InternalAssign3.g:2931:2: ( ruleUserFeedback )
            // InternalAssign3.g:2932:3: ruleUserFeedback
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUserFeedback();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__UserFeedbackAssignment_5"


    // $ANTLR start "rule__Subject__UserFeedbackAssignment_6_1"
    // InternalAssign3.g:2941:1: rule__Subject__UserFeedbackAssignment_6_1 : ( ruleUserFeedback ) ;
    public final void rule__Subject__UserFeedbackAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2945:1: ( ( ruleUserFeedback ) )
            // InternalAssign3.g:2946:2: ( ruleUserFeedback )
            {
            // InternalAssign3.g:2946:2: ( ruleUserFeedback )
            // InternalAssign3.g:2947:3: ruleUserFeedback
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUserFeedback();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__UserFeedbackAssignment_6_1"


    // $ANTLR start "rule__Subject__FeatureAssignment_8_2"
    // InternalAssign3.g:2956:1: rule__Subject__FeatureAssignment_8_2 : ( ruleFeature ) ;
    public final void rule__Subject__FeatureAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2960:1: ( ( ruleFeature ) )
            // InternalAssign3.g:2961:2: ( ruleFeature )
            {
            // InternalAssign3.g:2961:2: ( ruleFeature )
            // InternalAssign3.g:2962:3: ruleFeature
            {
             before(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__FeatureAssignment_8_2"


    // $ANTLR start "rule__Subject__FeatureAssignment_8_3_1"
    // InternalAssign3.g:2971:1: rule__Subject__FeatureAssignment_8_3_1 : ( ruleFeature ) ;
    public final void rule__Subject__FeatureAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2975:1: ( ( ruleFeature ) )
            // InternalAssign3.g:2976:2: ( ruleFeature )
            {
            // InternalAssign3.g:2976:2: ( ruleFeature )
            // InternalAssign3.g:2977:3: ruleFeature
            {
             before(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__FeatureAssignment_8_3_1"


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalAssign3.g:2986:1: rule__Feature__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:2990:1: ( ( ruleEString ) )
            // InternalAssign3.g:2991:2: ( ruleEString )
            {
            // InternalAssign3.g:2991:2: ( ruleEString )
            // InternalAssign3.g:2992:3: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_2"


    // $ANTLR start "rule__Review__NameAssignment_2"
    // InternalAssign3.g:3001:1: rule__Review__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Review__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3005:1: ( ( ruleEString ) )
            // InternalAssign3.g:3006:2: ( ruleEString )
            {
            // InternalAssign3.g:3006:2: ( ruleEString )
            // InternalAssign3.g:3007:3: ruleEString
            {
             before(grammarAccess.getReviewAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReviewAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__NameAssignment_2"


    // $ANTLR start "rule__Review__GradeTypeAssignment_4_1"
    // InternalAssign3.g:3016:1: rule__Review__GradeTypeAssignment_4_1 : ( ruleGradeType ) ;
    public final void rule__Review__GradeTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3020:1: ( ( ruleGradeType ) )
            // InternalAssign3.g:3021:2: ( ruleGradeType )
            {
            // InternalAssign3.g:3021:2: ( ruleGradeType )
            // InternalAssign3.g:3022:3: ruleGradeType
            {
             before(grammarAccess.getReviewAccess().getGradeTypeGradeTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGradeType();

            state._fsp--;

             after(grammarAccess.getReviewAccess().getGradeTypeGradeTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__GradeTypeAssignment_4_1"


    // $ANTLR start "rule__Review__ReviewTypeAssignment_5_1"
    // InternalAssign3.g:3031:1: rule__Review__ReviewTypeAssignment_5_1 : ( ruleReviewType ) ;
    public final void rule__Review__ReviewTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3035:1: ( ( ruleReviewType ) )
            // InternalAssign3.g:3036:2: ( ruleReviewType )
            {
            // InternalAssign3.g:3036:2: ( ruleReviewType )
            // InternalAssign3.g:3037:3: ruleReviewType
            {
             before(grammarAccess.getReviewAccess().getReviewTypeReviewTypeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReviewType();

            state._fsp--;

             after(grammarAccess.getReviewAccess().getReviewTypeReviewTypeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Review__ReviewTypeAssignment_5_1"


    // $ANTLR start "rule__Comment__ReplyAssignment_0"
    // InternalAssign3.g:3046:1: rule__Comment__ReplyAssignment_0 : ( ( 'reply' ) ) ;
    public final void rule__Comment__ReplyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3050:1: ( ( ( 'reply' ) ) )
            // InternalAssign3.g:3051:2: ( ( 'reply' ) )
            {
            // InternalAssign3.g:3051:2: ( ( 'reply' ) )
            // InternalAssign3.g:3052:3: ( 'reply' )
            {
             before(grammarAccess.getCommentAccess().getReplyReplyKeyword_0_0()); 
            // InternalAssign3.g:3053:3: ( 'reply' )
            // InternalAssign3.g:3054:4: 'reply'
            {
             before(grammarAccess.getCommentAccess().getReplyReplyKeyword_0_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getReplyReplyKeyword_0_0()); 

            }

             after(grammarAccess.getCommentAccess().getReplyReplyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__ReplyAssignment_0"


    // $ANTLR start "rule__Comment__ModerationAssignment_1"
    // InternalAssign3.g:3065:1: rule__Comment__ModerationAssignment_1 : ( ( 'moderation' ) ) ;
    public final void rule__Comment__ModerationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3069:1: ( ( ( 'moderation' ) ) )
            // InternalAssign3.g:3070:2: ( ( 'moderation' ) )
            {
            // InternalAssign3.g:3070:2: ( ( 'moderation' ) )
            // InternalAssign3.g:3071:3: ( 'moderation' )
            {
             before(grammarAccess.getCommentAccess().getModerationModerationKeyword_1_0()); 
            // InternalAssign3.g:3072:3: ( 'moderation' )
            // InternalAssign3.g:3073:4: 'moderation'
            {
             before(grammarAccess.getCommentAccess().getModerationModerationKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getModerationModerationKeyword_1_0()); 

            }

             after(grammarAccess.getCommentAccess().getModerationModerationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__ModerationAssignment_1"


    // $ANTLR start "rule__Comment__NameAssignment_3"
    // InternalAssign3.g:3084:1: rule__Comment__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Comment__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3088:1: ( ( ruleEString ) )
            // InternalAssign3.g:3089:2: ( ruleEString )
            {
            // InternalAssign3.g:3089:2: ( ruleEString )
            // InternalAssign3.g:3090:3: ruleEString
            {
             before(grammarAccess.getCommentAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommentAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__NameAssignment_3"


    // $ANTLR start "rule__Comment__CommentTypeAssignment_5_1"
    // InternalAssign3.g:3099:1: rule__Comment__CommentTypeAssignment_5_1 : ( ruleCommentType ) ;
    public final void rule__Comment__CommentTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3103:1: ( ( ruleCommentType ) )
            // InternalAssign3.g:3104:2: ( ruleCommentType )
            {
            // InternalAssign3.g:3104:2: ( ruleCommentType )
            // InternalAssign3.g:3105:3: ruleCommentType
            {
             before(grammarAccess.getCommentAccess().getCommentTypeCommentTypeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getCommentAccess().getCommentTypeCommentTypeEnumRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__CommentTypeAssignment_5_1"


    // $ANTLR start "rule__Comment__ModerationProcessAssignment_6_1"
    // InternalAssign3.g:3114:1: rule__Comment__ModerationProcessAssignment_6_1 : ( ruleModerationProcess ) ;
    public final void rule__Comment__ModerationProcessAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3118:1: ( ( ruleModerationProcess ) )
            // InternalAssign3.g:3119:2: ( ruleModerationProcess )
            {
            // InternalAssign3.g:3119:2: ( ruleModerationProcess )
            // InternalAssign3.g:3120:3: ruleModerationProcess
            {
             before(grammarAccess.getCommentAccess().getModerationProcessModerationProcessParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModerationProcess();

            state._fsp--;

             after(grammarAccess.getCommentAccess().getModerationProcessModerationProcessParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comment__ModerationProcessAssignment_6_1"


    // $ANTLR start "rule__ModerationProcess__NameAssignment_1"
    // InternalAssign3.g:3129:1: rule__ModerationProcess__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ModerationProcess__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3133:1: ( ( ruleEString ) )
            // InternalAssign3.g:3134:2: ( ruleEString )
            {
            // InternalAssign3.g:3134:2: ( ruleEString )
            // InternalAssign3.g:3135:3: ruleEString
            {
             before(grammarAccess.getModerationProcessAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModerationProcessAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__NameAssignment_1"


    // $ANTLR start "rule__ModerationProcess__StartStepAssignment_4"
    // InternalAssign3.g:3144:1: rule__ModerationProcess__StartStepAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ModerationProcess__StartStepAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3148:1: ( ( ( ruleEString ) ) )
            // InternalAssign3.g:3149:2: ( ( ruleEString ) )
            {
            // InternalAssign3.g:3149:2: ( ( ruleEString ) )
            // InternalAssign3.g:3150:3: ( ruleEString )
            {
             before(grammarAccess.getModerationProcessAccess().getStartStepValidationStepCrossReference_4_0()); 
            // InternalAssign3.g:3151:3: ( ruleEString )
            // InternalAssign3.g:3152:4: ruleEString
            {
             before(grammarAccess.getModerationProcessAccess().getStartStepValidationStepEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModerationProcessAccess().getStartStepValidationStepEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getModerationProcessAccess().getStartStepValidationStepCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__StartStepAssignment_4"


    // $ANTLR start "rule__ModerationProcess__StepAssignment_5_2"
    // InternalAssign3.g:3163:1: rule__ModerationProcess__StepAssignment_5_2 : ( ruleStep ) ;
    public final void rule__ModerationProcess__StepAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3167:1: ( ( ruleStep ) )
            // InternalAssign3.g:3168:2: ( ruleStep )
            {
            // InternalAssign3.g:3168:2: ( ruleStep )
            // InternalAssign3.g:3169:3: ruleStep
            {
             before(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__StepAssignment_5_2"


    // $ANTLR start "rule__ModerationProcess__StepAssignment_5_3_1"
    // InternalAssign3.g:3178:1: rule__ModerationProcess__StepAssignment_5_3_1 : ( ruleStep ) ;
    public final void rule__ModerationProcess__StepAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3182:1: ( ( ruleStep ) )
            // InternalAssign3.g:3183:2: ( ruleStep )
            {
            // InternalAssign3.g:3183:2: ( ruleStep )
            // InternalAssign3.g:3184:3: ruleStep
            {
             before(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModerationProcess__StepAssignment_5_3_1"


    // $ANTLR start "rule__End__NameAssignment_2"
    // InternalAssign3.g:3193:1: rule__End__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__End__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3197:1: ( ( ruleEString ) )
            // InternalAssign3.g:3198:2: ( ruleEString )
            {
            // InternalAssign3.g:3198:2: ( ruleEString )
            // InternalAssign3.g:3199:3: ruleEString
            {
             before(grammarAccess.getEndAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__End__NameAssignment_2"


    // $ANTLR start "rule__Automatic__NameAssignment_1"
    // InternalAssign3.g:3208:1: rule__Automatic__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Automatic__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3212:1: ( ( ruleEString ) )
            // InternalAssign3.g:3213:2: ( ruleEString )
            {
            // InternalAssign3.g:3213:2: ( ruleEString )
            // InternalAssign3.g:3214:3: ruleEString
            {
             before(grammarAccess.getAutomaticAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomaticAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__NameAssignment_1"


    // $ANTLR start "rule__Automatic__MethodAssignment_3_1"
    // InternalAssign3.g:3223:1: rule__Automatic__MethodAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Automatic__MethodAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3227:1: ( ( ruleEString ) )
            // InternalAssign3.g:3228:2: ( ruleEString )
            {
            // InternalAssign3.g:3228:2: ( ruleEString )
            // InternalAssign3.g:3229:3: ruleEString
            {
             before(grammarAccess.getAutomaticAccess().getMethodEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomaticAccess().getMethodEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__MethodAssignment_3_1"


    // $ANTLR start "rule__Automatic__NextApproveAssignment_5"
    // InternalAssign3.g:3238:1: rule__Automatic__NextApproveAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Automatic__NextApproveAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3242:1: ( ( ( ruleEString ) ) )
            // InternalAssign3.g:3243:2: ( ( ruleEString ) )
            {
            // InternalAssign3.g:3243:2: ( ( ruleEString ) )
            // InternalAssign3.g:3244:3: ( ruleEString )
            {
             before(grammarAccess.getAutomaticAccess().getNextApproveStepCrossReference_5_0()); 
            // InternalAssign3.g:3245:3: ( ruleEString )
            // InternalAssign3.g:3246:4: ruleEString
            {
             before(grammarAccess.getAutomaticAccess().getNextApproveStepEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomaticAccess().getNextApproveStepEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getAutomaticAccess().getNextApproveStepCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__NextApproveAssignment_5"


    // $ANTLR start "rule__Automatic__NextRejectAssignment_7"
    // InternalAssign3.g:3257:1: rule__Automatic__NextRejectAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Automatic__NextRejectAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3261:1: ( ( ( ruleEString ) ) )
            // InternalAssign3.g:3262:2: ( ( ruleEString ) )
            {
            // InternalAssign3.g:3262:2: ( ( ruleEString ) )
            // InternalAssign3.g:3263:3: ( ruleEString )
            {
             before(grammarAccess.getAutomaticAccess().getNextRejectStepCrossReference_7_0()); 
            // InternalAssign3.g:3264:3: ( ruleEString )
            // InternalAssign3.g:3265:4: ruleEString
            {
             before(grammarAccess.getAutomaticAccess().getNextRejectStepEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomaticAccess().getNextRejectStepEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getAutomaticAccess().getNextRejectStepCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Automatic__NextRejectAssignment_7"


    // $ANTLR start "rule__Manual__NameAssignment_1"
    // InternalAssign3.g:3276:1: rule__Manual__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Manual__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3280:1: ( ( ruleEString ) )
            // InternalAssign3.g:3281:2: ( ruleEString )
            {
            // InternalAssign3.g:3281:2: ( ruleEString )
            // InternalAssign3.g:3282:3: ruleEString
            {
             before(grammarAccess.getManualAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManualAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__NameAssignment_1"


    // $ANTLR start "rule__Manual__NextApproveAssignment_4"
    // InternalAssign3.g:3291:1: rule__Manual__NextApproveAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Manual__NextApproveAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3295:1: ( ( ( ruleEString ) ) )
            // InternalAssign3.g:3296:2: ( ( ruleEString ) )
            {
            // InternalAssign3.g:3296:2: ( ( ruleEString ) )
            // InternalAssign3.g:3297:3: ( ruleEString )
            {
             before(grammarAccess.getManualAccess().getNextApproveStepCrossReference_4_0()); 
            // InternalAssign3.g:3298:3: ( ruleEString )
            // InternalAssign3.g:3299:4: ruleEString
            {
             before(grammarAccess.getManualAccess().getNextApproveStepEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManualAccess().getNextApproveStepEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getManualAccess().getNextApproveStepCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__NextApproveAssignment_4"


    // $ANTLR start "rule__Manual__NextRejectAssignment_6"
    // InternalAssign3.g:3310:1: rule__Manual__NextRejectAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Manual__NextRejectAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign3.g:3314:1: ( ( ( ruleEString ) ) )
            // InternalAssign3.g:3315:2: ( ( ruleEString ) )
            {
            // InternalAssign3.g:3315:2: ( ( ruleEString ) )
            // InternalAssign3.g:3316:3: ( ruleEString )
            {
             before(grammarAccess.getManualAccess().getNextRejectStepCrossReference_6_0()); 
            // InternalAssign3.g:3317:3: ( ruleEString )
            // InternalAssign3.g:3318:4: ruleEString
            {
             before(grammarAccess.getManualAccess().getNextRejectStepEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManualAccess().getNextRejectStepEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getManualAccess().getNextRejectStepCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manual__NextRejectAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000011800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});

}