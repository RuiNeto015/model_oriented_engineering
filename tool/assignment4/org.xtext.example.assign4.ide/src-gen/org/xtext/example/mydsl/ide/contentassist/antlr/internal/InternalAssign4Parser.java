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
import org.xtext.example.mydsl.services.Assign4GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssign4Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CUSTOM'", "'STARS'", "'ONLYGRADE'", "'ANNOTATED'", "'SIMPLE'", "'RICHTEXT'", "'Model'", "'name:'", "'Subject'", "'has:'", "'User'", "'feedback:'", "'Features:'", "','", "'Review'", "'{'", "'}'", "'gradeType'", "'reviewType'", "'Comment'", "'('", "')'", "'Type:'", "'Moderation'", "'Process'", "'Name:'", "'Steps:'", "'Start'", "'Step:'", "'End'", "'Automatic'", "'Step'", "'If'", "'approved'", "'jump'", "'to:'", "'rejected'", "'Method:'", "'Manual'", "'reply'", "'moderation'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAssign4Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAssign4Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAssign4Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalAssign4.g"; }


    	private Assign4GrammarAccess grammarAccess;

    	public void setGrammarAccess(Assign4GrammarAccess grammarAccess) {
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
    // InternalAssign4.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAssign4.g:54:1: ( ruleModel EOF )
            // InternalAssign4.g:55:1: ruleModel EOF
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
    // InternalAssign4.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAssign4.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAssign4.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalAssign4.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAssign4.g:69:3: ( rule__Model__Group__0 )
            // InternalAssign4.g:69:4: rule__Model__Group__0
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
    // InternalAssign4.g:78:1: entryRuleUserFeedback : ruleUserFeedback EOF ;
    public final void entryRuleUserFeedback() throws RecognitionException {
        try {
            // InternalAssign4.g:79:1: ( ruleUserFeedback EOF )
            // InternalAssign4.g:80:1: ruleUserFeedback EOF
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
    // InternalAssign4.g:87:1: ruleUserFeedback : ( ( rule__UserFeedback__Alternatives ) ) ;
    public final void ruleUserFeedback() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:91:2: ( ( ( rule__UserFeedback__Alternatives ) ) )
            // InternalAssign4.g:92:2: ( ( rule__UserFeedback__Alternatives ) )
            {
            // InternalAssign4.g:92:2: ( ( rule__UserFeedback__Alternatives ) )
            // InternalAssign4.g:93:3: ( rule__UserFeedback__Alternatives )
            {
             before(grammarAccess.getUserFeedbackAccess().getAlternatives()); 
            // InternalAssign4.g:94:3: ( rule__UserFeedback__Alternatives )
            // InternalAssign4.g:94:4: rule__UserFeedback__Alternatives
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
    // InternalAssign4.g:103:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalAssign4.g:104:1: ( ruleStep EOF )
            // InternalAssign4.g:105:1: ruleStep EOF
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
    // InternalAssign4.g:112:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:116:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalAssign4.g:117:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalAssign4.g:117:2: ( ( rule__Step__Alternatives ) )
            // InternalAssign4.g:118:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalAssign4.g:119:3: ( rule__Step__Alternatives )
            // InternalAssign4.g:119:4: rule__Step__Alternatives
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
    // InternalAssign4.g:128:1: entryRuleSubject : ruleSubject EOF ;
    public final void entryRuleSubject() throws RecognitionException {
        try {
            // InternalAssign4.g:129:1: ( ruleSubject EOF )
            // InternalAssign4.g:130:1: ruleSubject EOF
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
    // InternalAssign4.g:137:1: ruleSubject : ( ( rule__Subject__Group__0 ) ) ;
    public final void ruleSubject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:141:2: ( ( ( rule__Subject__Group__0 ) ) )
            // InternalAssign4.g:142:2: ( ( rule__Subject__Group__0 ) )
            {
            // InternalAssign4.g:142:2: ( ( rule__Subject__Group__0 ) )
            // InternalAssign4.g:143:3: ( rule__Subject__Group__0 )
            {
             before(grammarAccess.getSubjectAccess().getGroup()); 
            // InternalAssign4.g:144:3: ( rule__Subject__Group__0 )
            // InternalAssign4.g:144:4: rule__Subject__Group__0
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
    // InternalAssign4.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAssign4.g:154:1: ( ruleEString EOF )
            // InternalAssign4.g:155:1: ruleEString EOF
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
    // InternalAssign4.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAssign4.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAssign4.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalAssign4.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAssign4.g:169:3: ( rule__EString__Alternatives )
            // InternalAssign4.g:169:4: rule__EString__Alternatives
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
    // InternalAssign4.g:178:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalAssign4.g:179:1: ( ruleFeature EOF )
            // InternalAssign4.g:180:1: ruleFeature EOF
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
    // InternalAssign4.g:187:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:191:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalAssign4.g:192:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalAssign4.g:192:2: ( ( rule__Feature__Group__0 ) )
            // InternalAssign4.g:193:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalAssign4.g:194:3: ( rule__Feature__Group__0 )
            // InternalAssign4.g:194:4: rule__Feature__Group__0
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
    // InternalAssign4.g:203:1: entryRuleReview : ruleReview EOF ;
    public final void entryRuleReview() throws RecognitionException {
        try {
            // InternalAssign4.g:204:1: ( ruleReview EOF )
            // InternalAssign4.g:205:1: ruleReview EOF
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
    // InternalAssign4.g:212:1: ruleReview : ( ( rule__Review__Group__0 ) ) ;
    public final void ruleReview() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:216:2: ( ( ( rule__Review__Group__0 ) ) )
            // InternalAssign4.g:217:2: ( ( rule__Review__Group__0 ) )
            {
            // InternalAssign4.g:217:2: ( ( rule__Review__Group__0 ) )
            // InternalAssign4.g:218:3: ( rule__Review__Group__0 )
            {
             before(grammarAccess.getReviewAccess().getGroup()); 
            // InternalAssign4.g:219:3: ( rule__Review__Group__0 )
            // InternalAssign4.g:219:4: rule__Review__Group__0
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
    // InternalAssign4.g:228:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // InternalAssign4.g:229:1: ( ruleComment EOF )
            // InternalAssign4.g:230:1: ruleComment EOF
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
    // InternalAssign4.g:237:1: ruleComment : ( ( rule__Comment__Group__0 ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:241:2: ( ( ( rule__Comment__Group__0 ) ) )
            // InternalAssign4.g:242:2: ( ( rule__Comment__Group__0 ) )
            {
            // InternalAssign4.g:242:2: ( ( rule__Comment__Group__0 ) )
            // InternalAssign4.g:243:3: ( rule__Comment__Group__0 )
            {
             before(grammarAccess.getCommentAccess().getGroup()); 
            // InternalAssign4.g:244:3: ( rule__Comment__Group__0 )
            // InternalAssign4.g:244:4: rule__Comment__Group__0
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
    // InternalAssign4.g:253:1: entryRuleModerationProcess : ruleModerationProcess EOF ;
    public final void entryRuleModerationProcess() throws RecognitionException {
        try {
            // InternalAssign4.g:254:1: ( ruleModerationProcess EOF )
            // InternalAssign4.g:255:1: ruleModerationProcess EOF
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
    // InternalAssign4.g:262:1: ruleModerationProcess : ( ( rule__ModerationProcess__Group__0 ) ) ;
    public final void ruleModerationProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:266:2: ( ( ( rule__ModerationProcess__Group__0 ) ) )
            // InternalAssign4.g:267:2: ( ( rule__ModerationProcess__Group__0 ) )
            {
            // InternalAssign4.g:267:2: ( ( rule__ModerationProcess__Group__0 ) )
            // InternalAssign4.g:268:3: ( rule__ModerationProcess__Group__0 )
            {
             before(grammarAccess.getModerationProcessAccess().getGroup()); 
            // InternalAssign4.g:269:3: ( rule__ModerationProcess__Group__0 )
            // InternalAssign4.g:269:4: rule__ModerationProcess__Group__0
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
    // InternalAssign4.g:278:1: entryRuleEnd : ruleEnd EOF ;
    public final void entryRuleEnd() throws RecognitionException {
        try {
            // InternalAssign4.g:279:1: ( ruleEnd EOF )
            // InternalAssign4.g:280:1: ruleEnd EOF
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
    // InternalAssign4.g:287:1: ruleEnd : ( ( rule__End__Group__0 ) ) ;
    public final void ruleEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:291:2: ( ( ( rule__End__Group__0 ) ) )
            // InternalAssign4.g:292:2: ( ( rule__End__Group__0 ) )
            {
            // InternalAssign4.g:292:2: ( ( rule__End__Group__0 ) )
            // InternalAssign4.g:293:3: ( rule__End__Group__0 )
            {
             before(grammarAccess.getEndAccess().getGroup()); 
            // InternalAssign4.g:294:3: ( rule__End__Group__0 )
            // InternalAssign4.g:294:4: rule__End__Group__0
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
    // InternalAssign4.g:303:1: entryRuleAutomatic : ruleAutomatic EOF ;
    public final void entryRuleAutomatic() throws RecognitionException {
        try {
            // InternalAssign4.g:304:1: ( ruleAutomatic EOF )
            // InternalAssign4.g:305:1: ruleAutomatic EOF
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
    // InternalAssign4.g:312:1: ruleAutomatic : ( ( rule__Automatic__Group__0 ) ) ;
    public final void ruleAutomatic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:316:2: ( ( ( rule__Automatic__Group__0 ) ) )
            // InternalAssign4.g:317:2: ( ( rule__Automatic__Group__0 ) )
            {
            // InternalAssign4.g:317:2: ( ( rule__Automatic__Group__0 ) )
            // InternalAssign4.g:318:3: ( rule__Automatic__Group__0 )
            {
             before(grammarAccess.getAutomaticAccess().getGroup()); 
            // InternalAssign4.g:319:3: ( rule__Automatic__Group__0 )
            // InternalAssign4.g:319:4: rule__Automatic__Group__0
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
    // InternalAssign4.g:328:1: entryRuleManual : ruleManual EOF ;
    public final void entryRuleManual() throws RecognitionException {
        try {
            // InternalAssign4.g:329:1: ( ruleManual EOF )
            // InternalAssign4.g:330:1: ruleManual EOF
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
    // InternalAssign4.g:337:1: ruleManual : ( ( rule__Manual__Group__0 ) ) ;
    public final void ruleManual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:341:2: ( ( ( rule__Manual__Group__0 ) ) )
            // InternalAssign4.g:342:2: ( ( rule__Manual__Group__0 ) )
            {
            // InternalAssign4.g:342:2: ( ( rule__Manual__Group__0 ) )
            // InternalAssign4.g:343:3: ( rule__Manual__Group__0 )
            {
             before(grammarAccess.getManualAccess().getGroup()); 
            // InternalAssign4.g:344:3: ( rule__Manual__Group__0 )
            // InternalAssign4.g:344:4: rule__Manual__Group__0
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
    // InternalAssign4.g:353:1: ruleGradeType : ( ( rule__GradeType__Alternatives ) ) ;
    public final void ruleGradeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:357:1: ( ( ( rule__GradeType__Alternatives ) ) )
            // InternalAssign4.g:358:2: ( ( rule__GradeType__Alternatives ) )
            {
            // InternalAssign4.g:358:2: ( ( rule__GradeType__Alternatives ) )
            // InternalAssign4.g:359:3: ( rule__GradeType__Alternatives )
            {
             before(grammarAccess.getGradeTypeAccess().getAlternatives()); 
            // InternalAssign4.g:360:3: ( rule__GradeType__Alternatives )
            // InternalAssign4.g:360:4: rule__GradeType__Alternatives
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
    // InternalAssign4.g:369:1: ruleReviewType : ( ( rule__ReviewType__Alternatives ) ) ;
    public final void ruleReviewType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:373:1: ( ( ( rule__ReviewType__Alternatives ) ) )
            // InternalAssign4.g:374:2: ( ( rule__ReviewType__Alternatives ) )
            {
            // InternalAssign4.g:374:2: ( ( rule__ReviewType__Alternatives ) )
            // InternalAssign4.g:375:3: ( rule__ReviewType__Alternatives )
            {
             before(grammarAccess.getReviewTypeAccess().getAlternatives()); 
            // InternalAssign4.g:376:3: ( rule__ReviewType__Alternatives )
            // InternalAssign4.g:376:4: rule__ReviewType__Alternatives
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
    // InternalAssign4.g:385:1: ruleCommentType : ( ( rule__CommentType__Alternatives ) ) ;
    public final void ruleCommentType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:389:1: ( ( ( rule__CommentType__Alternatives ) ) )
            // InternalAssign4.g:390:2: ( ( rule__CommentType__Alternatives ) )
            {
            // InternalAssign4.g:390:2: ( ( rule__CommentType__Alternatives ) )
            // InternalAssign4.g:391:3: ( rule__CommentType__Alternatives )
            {
             before(grammarAccess.getCommentTypeAccess().getAlternatives()); 
            // InternalAssign4.g:392:3: ( rule__CommentType__Alternatives )
            // InternalAssign4.g:392:4: rule__CommentType__Alternatives
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
    // InternalAssign4.g:400:1: rule__UserFeedback__Alternatives : ( ( ruleReview ) | ( ruleComment ) );
    public final void rule__UserFeedback__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:404:1: ( ( ruleReview ) | ( ruleComment ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==30) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAssign4.g:405:2: ( ruleReview )
                    {
                    // InternalAssign4.g:405:2: ( ruleReview )
                    // InternalAssign4.g:406:3: ruleReview
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
                    // InternalAssign4.g:411:2: ( ruleComment )
                    {
                    // InternalAssign4.g:411:2: ( ruleComment )
                    // InternalAssign4.g:412:3: ruleComment
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
    // InternalAssign4.g:421:1: rule__Step__Alternatives : ( ( ruleEnd ) | ( ruleAutomatic ) | ( ruleManual ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:425:1: ( ( ruleEnd ) | ( ruleAutomatic ) | ( ruleManual ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt2=1;
                }
                break;
            case 41:
                {
                alt2=2;
                }
                break;
            case 49:
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
                    // InternalAssign4.g:426:2: ( ruleEnd )
                    {
                    // InternalAssign4.g:426:2: ( ruleEnd )
                    // InternalAssign4.g:427:3: ruleEnd
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
                    // InternalAssign4.g:432:2: ( ruleAutomatic )
                    {
                    // InternalAssign4.g:432:2: ( ruleAutomatic )
                    // InternalAssign4.g:433:3: ruleAutomatic
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
                    // InternalAssign4.g:438:2: ( ruleManual )
                    {
                    // InternalAssign4.g:438:2: ( ruleManual )
                    // InternalAssign4.g:439:3: ruleManual
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
    // InternalAssign4.g:448:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:452:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAssign4.g:453:2: ( RULE_STRING )
                    {
                    // InternalAssign4.g:453:2: ( RULE_STRING )
                    // InternalAssign4.g:454:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign4.g:459:2: ( RULE_ID )
                    {
                    // InternalAssign4.g:459:2: ( RULE_ID )
                    // InternalAssign4.g:460:3: RULE_ID
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
    // InternalAssign4.g:469:1: rule__GradeType__Alternatives : ( ( ( 'CUSTOM' ) ) | ( ( 'STARS' ) ) );
    public final void rule__GradeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:473:1: ( ( ( 'CUSTOM' ) ) | ( ( 'STARS' ) ) )
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
                    // InternalAssign4.g:474:2: ( ( 'CUSTOM' ) )
                    {
                    // InternalAssign4.g:474:2: ( ( 'CUSTOM' ) )
                    // InternalAssign4.g:475:3: ( 'CUSTOM' )
                    {
                     before(grammarAccess.getGradeTypeAccess().getCUSTOMEnumLiteralDeclaration_0()); 
                    // InternalAssign4.g:476:3: ( 'CUSTOM' )
                    // InternalAssign4.g:476:4: 'CUSTOM'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getGradeTypeAccess().getCUSTOMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign4.g:480:2: ( ( 'STARS' ) )
                    {
                    // InternalAssign4.g:480:2: ( ( 'STARS' ) )
                    // InternalAssign4.g:481:3: ( 'STARS' )
                    {
                     before(grammarAccess.getGradeTypeAccess().getSTARSEnumLiteralDeclaration_1()); 
                    // InternalAssign4.g:482:3: ( 'STARS' )
                    // InternalAssign4.g:482:4: 'STARS'
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
    // InternalAssign4.g:490:1: rule__ReviewType__Alternatives : ( ( ( 'ONLYGRADE' ) ) | ( ( 'ANNOTATED' ) ) );
    public final void rule__ReviewType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:494:1: ( ( ( 'ONLYGRADE' ) ) | ( ( 'ANNOTATED' ) ) )
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
                    // InternalAssign4.g:495:2: ( ( 'ONLYGRADE' ) )
                    {
                    // InternalAssign4.g:495:2: ( ( 'ONLYGRADE' ) )
                    // InternalAssign4.g:496:3: ( 'ONLYGRADE' )
                    {
                     before(grammarAccess.getReviewTypeAccess().getONLYGRADEEnumLiteralDeclaration_0()); 
                    // InternalAssign4.g:497:3: ( 'ONLYGRADE' )
                    // InternalAssign4.g:497:4: 'ONLYGRADE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getReviewTypeAccess().getONLYGRADEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign4.g:501:2: ( ( 'ANNOTATED' ) )
                    {
                    // InternalAssign4.g:501:2: ( ( 'ANNOTATED' ) )
                    // InternalAssign4.g:502:3: ( 'ANNOTATED' )
                    {
                     before(grammarAccess.getReviewTypeAccess().getANNOTATEDEnumLiteralDeclaration_1()); 
                    // InternalAssign4.g:503:3: ( 'ANNOTATED' )
                    // InternalAssign4.g:503:4: 'ANNOTATED'
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
    // InternalAssign4.g:511:1: rule__CommentType__Alternatives : ( ( ( 'SIMPLE' ) ) | ( ( 'RICHTEXT' ) ) );
    public final void rule__CommentType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:515:1: ( ( ( 'SIMPLE' ) ) | ( ( 'RICHTEXT' ) ) )
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
                    // InternalAssign4.g:516:2: ( ( 'SIMPLE' ) )
                    {
                    // InternalAssign4.g:516:2: ( ( 'SIMPLE' ) )
                    // InternalAssign4.g:517:3: ( 'SIMPLE' )
                    {
                     before(grammarAccess.getCommentTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 
                    // InternalAssign4.g:518:3: ( 'SIMPLE' )
                    // InternalAssign4.g:518:4: 'SIMPLE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getCommentTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign4.g:522:2: ( ( 'RICHTEXT' ) )
                    {
                    // InternalAssign4.g:522:2: ( ( 'RICHTEXT' ) )
                    // InternalAssign4.g:523:3: ( 'RICHTEXT' )
                    {
                     before(grammarAccess.getCommentTypeAccess().getRICHTEXTEnumLiteralDeclaration_1()); 
                    // InternalAssign4.g:524:3: ( 'RICHTEXT' )
                    // InternalAssign4.g:524:4: 'RICHTEXT'
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
    // InternalAssign4.g:532:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:536:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAssign4.g:537:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalAssign4.g:544:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:548:1: ( ( 'Model' ) )
            // InternalAssign4.g:549:1: ( 'Model' )
            {
            // InternalAssign4.g:549:1: ( 'Model' )
            // InternalAssign4.g:550:2: 'Model'
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
    // InternalAssign4.g:559:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:563:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAssign4.g:564:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalAssign4.g:571:1: rule__Model__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:575:1: ( ( 'name:' ) )
            // InternalAssign4.g:576:1: ( 'name:' )
            {
            // InternalAssign4.g:576:1: ( 'name:' )
            // InternalAssign4.g:577:2: 'name:'
            {
             before(grammarAccess.getModelAccess().getNameKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameKeyword_1()); 

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
    // InternalAssign4.g:586:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:590:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAssign4.g:591:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalAssign4.g:598:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:602:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalAssign4.g:603:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalAssign4.g:603:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalAssign4.g:604:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalAssign4.g:605:2: ( rule__Model__NameAssignment_2 )
            // InternalAssign4.g:605:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // InternalAssign4.g:613:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:617:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalAssign4.g:618:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssign4.g:625:1: rule__Model__Group__3__Impl : ( 'Subject' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:629:1: ( ( 'Subject' ) )
            // InternalAssign4.g:630:1: ( 'Subject' )
            {
            // InternalAssign4.g:630:1: ( 'Subject' )
            // InternalAssign4.g:631:2: 'Subject'
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
    // InternalAssign4.g:640:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:644:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalAssign4.g:645:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalAssign4.g:652:1: rule__Model__Group__4__Impl : ( 'name:' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:656:1: ( ( 'name:' ) )
            // InternalAssign4.g:657:1: ( 'name:' )
            {
            // InternalAssign4.g:657:1: ( 'name:' )
            // InternalAssign4.g:658:2: 'name:'
            {
             before(grammarAccess.getModelAccess().getNameKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameKeyword_4()); 

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
    // InternalAssign4.g:667:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:671:1: ( rule__Model__Group__5__Impl )
            // InternalAssign4.g:672:2: rule__Model__Group__5__Impl
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
    // InternalAssign4.g:678:1: rule__Model__Group__5__Impl : ( ( rule__Model__SubjectAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:682:1: ( ( ( rule__Model__SubjectAssignment_5 ) ) )
            // InternalAssign4.g:683:1: ( ( rule__Model__SubjectAssignment_5 ) )
            {
            // InternalAssign4.g:683:1: ( ( rule__Model__SubjectAssignment_5 ) )
            // InternalAssign4.g:684:2: ( rule__Model__SubjectAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getSubjectAssignment_5()); 
            // InternalAssign4.g:685:2: ( rule__Model__SubjectAssignment_5 )
            // InternalAssign4.g:685:3: rule__Model__SubjectAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Model__SubjectAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getSubjectAssignment_5()); 

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
    // InternalAssign4.g:694:1: rule__Subject__Group__0 : rule__Subject__Group__0__Impl rule__Subject__Group__1 ;
    public final void rule__Subject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:698:1: ( rule__Subject__Group__0__Impl rule__Subject__Group__1 )
            // InternalAssign4.g:699:2: rule__Subject__Group__0__Impl rule__Subject__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalAssign4.g:706:1: rule__Subject__Group__0__Impl : ( ( rule__Subject__NameAssignment_0 ) ) ;
    public final void rule__Subject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:710:1: ( ( ( rule__Subject__NameAssignment_0 ) ) )
            // InternalAssign4.g:711:1: ( ( rule__Subject__NameAssignment_0 ) )
            {
            // InternalAssign4.g:711:1: ( ( rule__Subject__NameAssignment_0 ) )
            // InternalAssign4.g:712:2: ( rule__Subject__NameAssignment_0 )
            {
             before(grammarAccess.getSubjectAccess().getNameAssignment_0()); 
            // InternalAssign4.g:713:2: ( rule__Subject__NameAssignment_0 )
            // InternalAssign4.g:713:3: rule__Subject__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Subject__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getNameAssignment_0()); 

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
    // InternalAssign4.g:721:1: rule__Subject__Group__1 : rule__Subject__Group__1__Impl rule__Subject__Group__2 ;
    public final void rule__Subject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:725:1: ( rule__Subject__Group__1__Impl rule__Subject__Group__2 )
            // InternalAssign4.g:726:2: rule__Subject__Group__1__Impl rule__Subject__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalAssign4.g:733:1: rule__Subject__Group__1__Impl : ( 'Subject' ) ;
    public final void rule__Subject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:737:1: ( ( 'Subject' ) )
            // InternalAssign4.g:738:1: ( 'Subject' )
            {
            // InternalAssign4.g:738:1: ( 'Subject' )
            // InternalAssign4.g:739:2: 'Subject'
            {
             before(grammarAccess.getSubjectAccess().getSubjectKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getSubjectKeyword_1()); 

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
    // InternalAssign4.g:748:1: rule__Subject__Group__2 : rule__Subject__Group__2__Impl rule__Subject__Group__3 ;
    public final void rule__Subject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:752:1: ( rule__Subject__Group__2__Impl rule__Subject__Group__3 )
            // InternalAssign4.g:753:2: rule__Subject__Group__2__Impl rule__Subject__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalAssign4.g:760:1: rule__Subject__Group__2__Impl : ( 'has:' ) ;
    public final void rule__Subject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:764:1: ( ( 'has:' ) )
            // InternalAssign4.g:765:1: ( 'has:' )
            {
            // InternalAssign4.g:765:1: ( 'has:' )
            // InternalAssign4.g:766:2: 'has:'
            {
             before(grammarAccess.getSubjectAccess().getHasKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getHasKeyword_2()); 

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
    // InternalAssign4.g:775:1: rule__Subject__Group__3 : rule__Subject__Group__3__Impl rule__Subject__Group__4 ;
    public final void rule__Subject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:779:1: ( rule__Subject__Group__3__Impl rule__Subject__Group__4 )
            // InternalAssign4.g:780:2: rule__Subject__Group__3__Impl rule__Subject__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalAssign4.g:787:1: rule__Subject__Group__3__Impl : ( ( rule__Subject__Group_3__0 )? ) ;
    public final void rule__Subject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:791:1: ( ( ( rule__Subject__Group_3__0 )? ) )
            // InternalAssign4.g:792:1: ( ( rule__Subject__Group_3__0 )? )
            {
            // InternalAssign4.g:792:1: ( ( rule__Subject__Group_3__0 )? )
            // InternalAssign4.g:793:2: ( rule__Subject__Group_3__0 )?
            {
             before(grammarAccess.getSubjectAccess().getGroup_3()); 
            // InternalAssign4.g:794:2: ( rule__Subject__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAssign4.g:794:3: rule__Subject__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subject__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubjectAccess().getGroup_3()); 

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
    // InternalAssign4.g:802:1: rule__Subject__Group__4 : rule__Subject__Group__4__Impl rule__Subject__Group__5 ;
    public final void rule__Subject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:806:1: ( rule__Subject__Group__4__Impl rule__Subject__Group__5 )
            // InternalAssign4.g:807:2: rule__Subject__Group__4__Impl rule__Subject__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalAssign4.g:814:1: rule__Subject__Group__4__Impl : ( 'User' ) ;
    public final void rule__Subject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:818:1: ( ( 'User' ) )
            // InternalAssign4.g:819:1: ( 'User' )
            {
            // InternalAssign4.g:819:1: ( 'User' )
            // InternalAssign4.g:820:2: 'User'
            {
             before(grammarAccess.getSubjectAccess().getUserKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getUserKeyword_4()); 

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
    // InternalAssign4.g:829:1: rule__Subject__Group__5 : rule__Subject__Group__5__Impl rule__Subject__Group__6 ;
    public final void rule__Subject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:833:1: ( rule__Subject__Group__5__Impl rule__Subject__Group__6 )
            // InternalAssign4.g:834:2: rule__Subject__Group__5__Impl rule__Subject__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalAssign4.g:841:1: rule__Subject__Group__5__Impl : ( 'feedback:' ) ;
    public final void rule__Subject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:845:1: ( ( 'feedback:' ) )
            // InternalAssign4.g:846:1: ( 'feedback:' )
            {
            // InternalAssign4.g:846:1: ( 'feedback:' )
            // InternalAssign4.g:847:2: 'feedback:'
            {
             before(grammarAccess.getSubjectAccess().getFeedbackKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getFeedbackKeyword_5()); 

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
    // InternalAssign4.g:856:1: rule__Subject__Group__6 : rule__Subject__Group__6__Impl rule__Subject__Group__7 ;
    public final void rule__Subject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:860:1: ( rule__Subject__Group__6__Impl rule__Subject__Group__7 )
            // InternalAssign4.g:861:2: rule__Subject__Group__6__Impl rule__Subject__Group__7
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
    // InternalAssign4.g:868:1: rule__Subject__Group__6__Impl : ( ( rule__Subject__UserFeedbackAssignment_6 ) ) ;
    public final void rule__Subject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:872:1: ( ( ( rule__Subject__UserFeedbackAssignment_6 ) ) )
            // InternalAssign4.g:873:1: ( ( rule__Subject__UserFeedbackAssignment_6 ) )
            {
            // InternalAssign4.g:873:1: ( ( rule__Subject__UserFeedbackAssignment_6 ) )
            // InternalAssign4.g:874:2: ( rule__Subject__UserFeedbackAssignment_6 )
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_6()); 
            // InternalAssign4.g:875:2: ( rule__Subject__UserFeedbackAssignment_6 )
            // InternalAssign4.g:875:3: rule__Subject__UserFeedbackAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Subject__UserFeedbackAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_6()); 

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
    // InternalAssign4.g:883:1: rule__Subject__Group__7 : rule__Subject__Group__7__Impl ;
    public final void rule__Subject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:887:1: ( rule__Subject__Group__7__Impl )
            // InternalAssign4.g:888:2: rule__Subject__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group__7__Impl();

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
    // InternalAssign4.g:894:1: rule__Subject__Group__7__Impl : ( ( rule__Subject__Group_7__0 )* ) ;
    public final void rule__Subject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:898:1: ( ( ( rule__Subject__Group_7__0 )* ) )
            // InternalAssign4.g:899:1: ( ( rule__Subject__Group_7__0 )* )
            {
            // InternalAssign4.g:899:1: ( ( rule__Subject__Group_7__0 )* )
            // InternalAssign4.g:900:2: ( rule__Subject__Group_7__0 )*
            {
             before(grammarAccess.getSubjectAccess().getGroup_7()); 
            // InternalAssign4.g:901:2: ( rule__Subject__Group_7__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAssign4.g:901:3: rule__Subject__Group_7__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Subject__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSubjectAccess().getGroup_7()); 

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


    // $ANTLR start "rule__Subject__Group_3__0"
    // InternalAssign4.g:910:1: rule__Subject__Group_3__0 : rule__Subject__Group_3__0__Impl rule__Subject__Group_3__1 ;
    public final void rule__Subject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:914:1: ( rule__Subject__Group_3__0__Impl rule__Subject__Group_3__1 )
            // InternalAssign4.g:915:2: rule__Subject__Group_3__0__Impl rule__Subject__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Subject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_3__1();

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
    // $ANTLR end "rule__Subject__Group_3__0"


    // $ANTLR start "rule__Subject__Group_3__0__Impl"
    // InternalAssign4.g:922:1: rule__Subject__Group_3__0__Impl : ( 'Features:' ) ;
    public final void rule__Subject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:926:1: ( ( 'Features:' ) )
            // InternalAssign4.g:927:1: ( 'Features:' )
            {
            // InternalAssign4.g:927:1: ( 'Features:' )
            // InternalAssign4.g:928:2: 'Features:'
            {
             before(grammarAccess.getSubjectAccess().getFeaturesKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getFeaturesKeyword_3_0()); 

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
    // $ANTLR end "rule__Subject__Group_3__0__Impl"


    // $ANTLR start "rule__Subject__Group_3__1"
    // InternalAssign4.g:937:1: rule__Subject__Group_3__1 : rule__Subject__Group_3__1__Impl rule__Subject__Group_3__2 ;
    public final void rule__Subject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:941:1: ( rule__Subject__Group_3__1__Impl rule__Subject__Group_3__2 )
            // InternalAssign4.g:942:2: rule__Subject__Group_3__1__Impl rule__Subject__Group_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Subject__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_3__2();

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
    // $ANTLR end "rule__Subject__Group_3__1"


    // $ANTLR start "rule__Subject__Group_3__1__Impl"
    // InternalAssign4.g:949:1: rule__Subject__Group_3__1__Impl : ( ( rule__Subject__FeatureAssignment_3_1 ) ) ;
    public final void rule__Subject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:953:1: ( ( ( rule__Subject__FeatureAssignment_3_1 ) ) )
            // InternalAssign4.g:954:1: ( ( rule__Subject__FeatureAssignment_3_1 ) )
            {
            // InternalAssign4.g:954:1: ( ( rule__Subject__FeatureAssignment_3_1 ) )
            // InternalAssign4.g:955:2: ( rule__Subject__FeatureAssignment_3_1 )
            {
             before(grammarAccess.getSubjectAccess().getFeatureAssignment_3_1()); 
            // InternalAssign4.g:956:2: ( rule__Subject__FeatureAssignment_3_1 )
            // InternalAssign4.g:956:3: rule__Subject__FeatureAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__FeatureAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getFeatureAssignment_3_1()); 

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
    // $ANTLR end "rule__Subject__Group_3__1__Impl"


    // $ANTLR start "rule__Subject__Group_3__2"
    // InternalAssign4.g:964:1: rule__Subject__Group_3__2 : rule__Subject__Group_3__2__Impl ;
    public final void rule__Subject__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:968:1: ( rule__Subject__Group_3__2__Impl )
            // InternalAssign4.g:969:2: rule__Subject__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group_3__2__Impl();

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
    // $ANTLR end "rule__Subject__Group_3__2"


    // $ANTLR start "rule__Subject__Group_3__2__Impl"
    // InternalAssign4.g:975:1: rule__Subject__Group_3__2__Impl : ( ( rule__Subject__Group_3_2__0 )* ) ;
    public final void rule__Subject__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:979:1: ( ( ( rule__Subject__Group_3_2__0 )* ) )
            // InternalAssign4.g:980:1: ( ( rule__Subject__Group_3_2__0 )* )
            {
            // InternalAssign4.g:980:1: ( ( rule__Subject__Group_3_2__0 )* )
            // InternalAssign4.g:981:2: ( rule__Subject__Group_3_2__0 )*
            {
             before(grammarAccess.getSubjectAccess().getGroup_3_2()); 
            // InternalAssign4.g:982:2: ( rule__Subject__Group_3_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAssign4.g:982:3: rule__Subject__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Subject__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getSubjectAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Subject__Group_3__2__Impl"


    // $ANTLR start "rule__Subject__Group_3_2__0"
    // InternalAssign4.g:991:1: rule__Subject__Group_3_2__0 : rule__Subject__Group_3_2__0__Impl rule__Subject__Group_3_2__1 ;
    public final void rule__Subject__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:995:1: ( rule__Subject__Group_3_2__0__Impl rule__Subject__Group_3_2__1 )
            // InternalAssign4.g:996:2: rule__Subject__Group_3_2__0__Impl rule__Subject__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Subject__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_3_2__1();

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
    // $ANTLR end "rule__Subject__Group_3_2__0"


    // $ANTLR start "rule__Subject__Group_3_2__0__Impl"
    // InternalAssign4.g:1003:1: rule__Subject__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Subject__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1007:1: ( ( ',' ) )
            // InternalAssign4.g:1008:1: ( ',' )
            {
            // InternalAssign4.g:1008:1: ( ',' )
            // InternalAssign4.g:1009:2: ','
            {
             before(grammarAccess.getSubjectAccess().getCommaKeyword_3_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Subject__Group_3_2__0__Impl"


    // $ANTLR start "rule__Subject__Group_3_2__1"
    // InternalAssign4.g:1018:1: rule__Subject__Group_3_2__1 : rule__Subject__Group_3_2__1__Impl ;
    public final void rule__Subject__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1022:1: ( rule__Subject__Group_3_2__1__Impl )
            // InternalAssign4.g:1023:2: rule__Subject__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Subject__Group_3_2__1"


    // $ANTLR start "rule__Subject__Group_3_2__1__Impl"
    // InternalAssign4.g:1029:1: rule__Subject__Group_3_2__1__Impl : ( ( rule__Subject__FeatureAssignment_3_2_1 ) ) ;
    public final void rule__Subject__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1033:1: ( ( ( rule__Subject__FeatureAssignment_3_2_1 ) ) )
            // InternalAssign4.g:1034:1: ( ( rule__Subject__FeatureAssignment_3_2_1 ) )
            {
            // InternalAssign4.g:1034:1: ( ( rule__Subject__FeatureAssignment_3_2_1 ) )
            // InternalAssign4.g:1035:2: ( rule__Subject__FeatureAssignment_3_2_1 )
            {
             before(grammarAccess.getSubjectAccess().getFeatureAssignment_3_2_1()); 
            // InternalAssign4.g:1036:2: ( rule__Subject__FeatureAssignment_3_2_1 )
            // InternalAssign4.g:1036:3: rule__Subject__FeatureAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__FeatureAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getFeatureAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Subject__Group_3_2__1__Impl"


    // $ANTLR start "rule__Subject__Group_7__0"
    // InternalAssign4.g:1045:1: rule__Subject__Group_7__0 : rule__Subject__Group_7__0__Impl rule__Subject__Group_7__1 ;
    public final void rule__Subject__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1049:1: ( rule__Subject__Group_7__0__Impl rule__Subject__Group_7__1 )
            // InternalAssign4.g:1050:2: rule__Subject__Group_7__0__Impl rule__Subject__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__Subject__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subject__Group_7__1();

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
    // $ANTLR end "rule__Subject__Group_7__0"


    // $ANTLR start "rule__Subject__Group_7__0__Impl"
    // InternalAssign4.g:1057:1: rule__Subject__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Subject__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1061:1: ( ( ',' ) )
            // InternalAssign4.g:1062:1: ( ',' )
            {
            // InternalAssign4.g:1062:1: ( ',' )
            // InternalAssign4.g:1063:2: ','
            {
             before(grammarAccess.getSubjectAccess().getCommaKeyword_7_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSubjectAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Subject__Group_7__0__Impl"


    // $ANTLR start "rule__Subject__Group_7__1"
    // InternalAssign4.g:1072:1: rule__Subject__Group_7__1 : rule__Subject__Group_7__1__Impl ;
    public final void rule__Subject__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1076:1: ( rule__Subject__Group_7__1__Impl )
            // InternalAssign4.g:1077:2: rule__Subject__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subject__Group_7__1__Impl();

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
    // $ANTLR end "rule__Subject__Group_7__1"


    // $ANTLR start "rule__Subject__Group_7__1__Impl"
    // InternalAssign4.g:1083:1: rule__Subject__Group_7__1__Impl : ( ( rule__Subject__UserFeedbackAssignment_7_1 ) ) ;
    public final void rule__Subject__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1087:1: ( ( ( rule__Subject__UserFeedbackAssignment_7_1 ) ) )
            // InternalAssign4.g:1088:1: ( ( rule__Subject__UserFeedbackAssignment_7_1 ) )
            {
            // InternalAssign4.g:1088:1: ( ( rule__Subject__UserFeedbackAssignment_7_1 ) )
            // InternalAssign4.g:1089:2: ( rule__Subject__UserFeedbackAssignment_7_1 )
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_7_1()); 
            // InternalAssign4.g:1090:2: ( rule__Subject__UserFeedbackAssignment_7_1 )
            // InternalAssign4.g:1090:3: rule__Subject__UserFeedbackAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Subject__UserFeedbackAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_7_1()); 

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
    // $ANTLR end "rule__Subject__Group_7__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalAssign4.g:1099:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1103:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalAssign4.g:1104:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalAssign4.g:1111:1: rule__Feature__Group__0__Impl : ( () ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1115:1: ( ( () ) )
            // InternalAssign4.g:1116:1: ( () )
            {
            // InternalAssign4.g:1116:1: ( () )
            // InternalAssign4.g:1117:2: ()
            {
             before(grammarAccess.getFeatureAccess().getFeatureAction_0()); 
            // InternalAssign4.g:1118:2: ()
            // InternalAssign4.g:1118:3: 
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
    // InternalAssign4.g:1126:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1130:1: ( rule__Feature__Group__1__Impl )
            // InternalAssign4.g:1131:2: rule__Feature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__1__Impl();

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
    // InternalAssign4.g:1137:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1141:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalAssign4.g:1142:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalAssign4.g:1142:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalAssign4.g:1143:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalAssign4.g:1144:2: ( rule__Feature__NameAssignment_1 )
            // InternalAssign4.g:1144:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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


    // $ANTLR start "rule__Review__Group__0"
    // InternalAssign4.g:1153:1: rule__Review__Group__0 : rule__Review__Group__0__Impl rule__Review__Group__1 ;
    public final void rule__Review__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1157:1: ( rule__Review__Group__0__Impl rule__Review__Group__1 )
            // InternalAssign4.g:1158:2: rule__Review__Group__0__Impl rule__Review__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalAssign4.g:1165:1: rule__Review__Group__0__Impl : ( () ) ;
    public final void rule__Review__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1169:1: ( ( () ) )
            // InternalAssign4.g:1170:1: ( () )
            {
            // InternalAssign4.g:1170:1: ( () )
            // InternalAssign4.g:1171:2: ()
            {
             before(grammarAccess.getReviewAccess().getReviewAction_0()); 
            // InternalAssign4.g:1172:2: ()
            // InternalAssign4.g:1172:3: 
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
    // InternalAssign4.g:1180:1: rule__Review__Group__1 : rule__Review__Group__1__Impl rule__Review__Group__2 ;
    public final void rule__Review__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1184:1: ( rule__Review__Group__1__Impl rule__Review__Group__2 )
            // InternalAssign4.g:1185:2: rule__Review__Group__1__Impl rule__Review__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalAssign4.g:1192:1: rule__Review__Group__1__Impl : ( 'Review' ) ;
    public final void rule__Review__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1196:1: ( ( 'Review' ) )
            // InternalAssign4.g:1197:1: ( 'Review' )
            {
            // InternalAssign4.g:1197:1: ( 'Review' )
            // InternalAssign4.g:1198:2: 'Review'
            {
             before(grammarAccess.getReviewAccess().getReviewKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalAssign4.g:1207:1: rule__Review__Group__2 : rule__Review__Group__2__Impl rule__Review__Group__3 ;
    public final void rule__Review__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1211:1: ( rule__Review__Group__2__Impl rule__Review__Group__3 )
            // InternalAssign4.g:1212:2: rule__Review__Group__2__Impl rule__Review__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalAssign4.g:1219:1: rule__Review__Group__2__Impl : ( ( rule__Review__NameAssignment_2 ) ) ;
    public final void rule__Review__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1223:1: ( ( ( rule__Review__NameAssignment_2 ) ) )
            // InternalAssign4.g:1224:1: ( ( rule__Review__NameAssignment_2 ) )
            {
            // InternalAssign4.g:1224:1: ( ( rule__Review__NameAssignment_2 ) )
            // InternalAssign4.g:1225:2: ( rule__Review__NameAssignment_2 )
            {
             before(grammarAccess.getReviewAccess().getNameAssignment_2()); 
            // InternalAssign4.g:1226:2: ( rule__Review__NameAssignment_2 )
            // InternalAssign4.g:1226:3: rule__Review__NameAssignment_2
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
    // InternalAssign4.g:1234:1: rule__Review__Group__3 : rule__Review__Group__3__Impl rule__Review__Group__4 ;
    public final void rule__Review__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1238:1: ( rule__Review__Group__3__Impl rule__Review__Group__4 )
            // InternalAssign4.g:1239:2: rule__Review__Group__3__Impl rule__Review__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalAssign4.g:1246:1: rule__Review__Group__3__Impl : ( '{' ) ;
    public final void rule__Review__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1250:1: ( ( '{' ) )
            // InternalAssign4.g:1251:1: ( '{' )
            {
            // InternalAssign4.g:1251:1: ( '{' )
            // InternalAssign4.g:1252:2: '{'
            {
             before(grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_2); 
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
    // InternalAssign4.g:1261:1: rule__Review__Group__4 : rule__Review__Group__4__Impl rule__Review__Group__5 ;
    public final void rule__Review__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1265:1: ( rule__Review__Group__4__Impl rule__Review__Group__5 )
            // InternalAssign4.g:1266:2: rule__Review__Group__4__Impl rule__Review__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalAssign4.g:1273:1: rule__Review__Group__4__Impl : ( ( rule__Review__Group_4__0 )? ) ;
    public final void rule__Review__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1277:1: ( ( ( rule__Review__Group_4__0 )? ) )
            // InternalAssign4.g:1278:1: ( ( rule__Review__Group_4__0 )? )
            {
            // InternalAssign4.g:1278:1: ( ( rule__Review__Group_4__0 )? )
            // InternalAssign4.g:1279:2: ( rule__Review__Group_4__0 )?
            {
             before(grammarAccess.getReviewAccess().getGroup_4()); 
            // InternalAssign4.g:1280:2: ( rule__Review__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAssign4.g:1280:3: rule__Review__Group_4__0
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
    // InternalAssign4.g:1288:1: rule__Review__Group__5 : rule__Review__Group__5__Impl rule__Review__Group__6 ;
    public final void rule__Review__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1292:1: ( rule__Review__Group__5__Impl rule__Review__Group__6 )
            // InternalAssign4.g:1293:2: rule__Review__Group__5__Impl rule__Review__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalAssign4.g:1300:1: rule__Review__Group__5__Impl : ( ( rule__Review__Group_5__0 )? ) ;
    public final void rule__Review__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1304:1: ( ( ( rule__Review__Group_5__0 )? ) )
            // InternalAssign4.g:1305:1: ( ( rule__Review__Group_5__0 )? )
            {
            // InternalAssign4.g:1305:1: ( ( rule__Review__Group_5__0 )? )
            // InternalAssign4.g:1306:2: ( rule__Review__Group_5__0 )?
            {
             before(grammarAccess.getReviewAccess().getGroup_5()); 
            // InternalAssign4.g:1307:2: ( rule__Review__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAssign4.g:1307:3: rule__Review__Group_5__0
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
    // InternalAssign4.g:1315:1: rule__Review__Group__6 : rule__Review__Group__6__Impl ;
    public final void rule__Review__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1319:1: ( rule__Review__Group__6__Impl )
            // InternalAssign4.g:1320:2: rule__Review__Group__6__Impl
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
    // InternalAssign4.g:1326:1: rule__Review__Group__6__Impl : ( '}' ) ;
    public final void rule__Review__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1330:1: ( ( '}' ) )
            // InternalAssign4.g:1331:1: ( '}' )
            {
            // InternalAssign4.g:1331:1: ( '}' )
            // InternalAssign4.g:1332:2: '}'
            {
             before(grammarAccess.getReviewAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
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
    // InternalAssign4.g:1342:1: rule__Review__Group_4__0 : rule__Review__Group_4__0__Impl rule__Review__Group_4__1 ;
    public final void rule__Review__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1346:1: ( rule__Review__Group_4__0__Impl rule__Review__Group_4__1 )
            // InternalAssign4.g:1347:2: rule__Review__Group_4__0__Impl rule__Review__Group_4__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAssign4.g:1354:1: rule__Review__Group_4__0__Impl : ( 'gradeType' ) ;
    public final void rule__Review__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1358:1: ( ( 'gradeType' ) )
            // InternalAssign4.g:1359:1: ( 'gradeType' )
            {
            // InternalAssign4.g:1359:1: ( 'gradeType' )
            // InternalAssign4.g:1360:2: 'gradeType'
            {
             before(grammarAccess.getReviewAccess().getGradeTypeKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalAssign4.g:1369:1: rule__Review__Group_4__1 : rule__Review__Group_4__1__Impl ;
    public final void rule__Review__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1373:1: ( rule__Review__Group_4__1__Impl )
            // InternalAssign4.g:1374:2: rule__Review__Group_4__1__Impl
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
    // InternalAssign4.g:1380:1: rule__Review__Group_4__1__Impl : ( ( rule__Review__GradeTypeAssignment_4_1 ) ) ;
    public final void rule__Review__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1384:1: ( ( ( rule__Review__GradeTypeAssignment_4_1 ) ) )
            // InternalAssign4.g:1385:1: ( ( rule__Review__GradeTypeAssignment_4_1 ) )
            {
            // InternalAssign4.g:1385:1: ( ( rule__Review__GradeTypeAssignment_4_1 ) )
            // InternalAssign4.g:1386:2: ( rule__Review__GradeTypeAssignment_4_1 )
            {
             before(grammarAccess.getReviewAccess().getGradeTypeAssignment_4_1()); 
            // InternalAssign4.g:1387:2: ( rule__Review__GradeTypeAssignment_4_1 )
            // InternalAssign4.g:1387:3: rule__Review__GradeTypeAssignment_4_1
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
    // InternalAssign4.g:1396:1: rule__Review__Group_5__0 : rule__Review__Group_5__0__Impl rule__Review__Group_5__1 ;
    public final void rule__Review__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1400:1: ( rule__Review__Group_5__0__Impl rule__Review__Group_5__1 )
            // InternalAssign4.g:1401:2: rule__Review__Group_5__0__Impl rule__Review__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalAssign4.g:1408:1: rule__Review__Group_5__0__Impl : ( 'reviewType' ) ;
    public final void rule__Review__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1412:1: ( ( 'reviewType' ) )
            // InternalAssign4.g:1413:1: ( 'reviewType' )
            {
            // InternalAssign4.g:1413:1: ( 'reviewType' )
            // InternalAssign4.g:1414:2: 'reviewType'
            {
             before(grammarAccess.getReviewAccess().getReviewTypeKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalAssign4.g:1423:1: rule__Review__Group_5__1 : rule__Review__Group_5__1__Impl ;
    public final void rule__Review__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1427:1: ( rule__Review__Group_5__1__Impl )
            // InternalAssign4.g:1428:2: rule__Review__Group_5__1__Impl
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
    // InternalAssign4.g:1434:1: rule__Review__Group_5__1__Impl : ( ( rule__Review__ReviewTypeAssignment_5_1 ) ) ;
    public final void rule__Review__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1438:1: ( ( ( rule__Review__ReviewTypeAssignment_5_1 ) ) )
            // InternalAssign4.g:1439:1: ( ( rule__Review__ReviewTypeAssignment_5_1 ) )
            {
            // InternalAssign4.g:1439:1: ( ( rule__Review__ReviewTypeAssignment_5_1 ) )
            // InternalAssign4.g:1440:2: ( rule__Review__ReviewTypeAssignment_5_1 )
            {
             before(grammarAccess.getReviewAccess().getReviewTypeAssignment_5_1()); 
            // InternalAssign4.g:1441:2: ( rule__Review__ReviewTypeAssignment_5_1 )
            // InternalAssign4.g:1441:3: rule__Review__ReviewTypeAssignment_5_1
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
    // InternalAssign4.g:1450:1: rule__Comment__Group__0 : rule__Comment__Group__0__Impl rule__Comment__Group__1 ;
    public final void rule__Comment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1454:1: ( rule__Comment__Group__0__Impl rule__Comment__Group__1 )
            // InternalAssign4.g:1455:2: rule__Comment__Group__0__Impl rule__Comment__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAssign4.g:1462:1: rule__Comment__Group__0__Impl : ( 'Comment' ) ;
    public final void rule__Comment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1466:1: ( ( 'Comment' ) )
            // InternalAssign4.g:1467:1: ( 'Comment' )
            {
            // InternalAssign4.g:1467:1: ( 'Comment' )
            // InternalAssign4.g:1468:2: 'Comment'
            {
             before(grammarAccess.getCommentAccess().getCommentKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getCommentKeyword_0()); 

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
    // InternalAssign4.g:1477:1: rule__Comment__Group__1 : rule__Comment__Group__1__Impl rule__Comment__Group__2 ;
    public final void rule__Comment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1481:1: ( rule__Comment__Group__1__Impl rule__Comment__Group__2 )
            // InternalAssign4.g:1482:2: rule__Comment__Group__1__Impl rule__Comment__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalAssign4.g:1489:1: rule__Comment__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Comment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1493:1: ( ( 'name:' ) )
            // InternalAssign4.g:1494:1: ( 'name:' )
            {
            // InternalAssign4.g:1494:1: ( 'name:' )
            // InternalAssign4.g:1495:2: 'name:'
            {
             before(grammarAccess.getCommentAccess().getNameKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getNameKeyword_1()); 

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
    // InternalAssign4.g:1504:1: rule__Comment__Group__2 : rule__Comment__Group__2__Impl rule__Comment__Group__3 ;
    public final void rule__Comment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1508:1: ( rule__Comment__Group__2__Impl rule__Comment__Group__3 )
            // InternalAssign4.g:1509:2: rule__Comment__Group__2__Impl rule__Comment__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalAssign4.g:1516:1: rule__Comment__Group__2__Impl : ( ( rule__Comment__NameAssignment_2 ) ) ;
    public final void rule__Comment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1520:1: ( ( ( rule__Comment__NameAssignment_2 ) ) )
            // InternalAssign4.g:1521:1: ( ( rule__Comment__NameAssignment_2 ) )
            {
            // InternalAssign4.g:1521:1: ( ( rule__Comment__NameAssignment_2 ) )
            // InternalAssign4.g:1522:2: ( rule__Comment__NameAssignment_2 )
            {
             before(grammarAccess.getCommentAccess().getNameAssignment_2()); 
            // InternalAssign4.g:1523:2: ( rule__Comment__NameAssignment_2 )
            // InternalAssign4.g:1523:3: rule__Comment__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Comment__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getNameAssignment_2()); 

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
    // InternalAssign4.g:1531:1: rule__Comment__Group__3 : rule__Comment__Group__3__Impl rule__Comment__Group__4 ;
    public final void rule__Comment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1535:1: ( rule__Comment__Group__3__Impl rule__Comment__Group__4 )
            // InternalAssign4.g:1536:2: rule__Comment__Group__3__Impl rule__Comment__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalAssign4.g:1543:1: rule__Comment__Group__3__Impl : ( '(' ) ;
    public final void rule__Comment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1547:1: ( ( '(' ) )
            // InternalAssign4.g:1548:1: ( '(' )
            {
            // InternalAssign4.g:1548:1: ( '(' )
            // InternalAssign4.g:1549:2: '('
            {
             before(grammarAccess.getCommentAccess().getLeftParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getLeftParenthesisKeyword_3()); 

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
    // InternalAssign4.g:1558:1: rule__Comment__Group__4 : rule__Comment__Group__4__Impl rule__Comment__Group__5 ;
    public final void rule__Comment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1562:1: ( rule__Comment__Group__4__Impl rule__Comment__Group__5 )
            // InternalAssign4.g:1563:2: rule__Comment__Group__4__Impl rule__Comment__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalAssign4.g:1570:1: rule__Comment__Group__4__Impl : ( ( rule__Comment__ReplyAssignment_4 ) ) ;
    public final void rule__Comment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1574:1: ( ( ( rule__Comment__ReplyAssignment_4 ) ) )
            // InternalAssign4.g:1575:1: ( ( rule__Comment__ReplyAssignment_4 ) )
            {
            // InternalAssign4.g:1575:1: ( ( rule__Comment__ReplyAssignment_4 ) )
            // InternalAssign4.g:1576:2: ( rule__Comment__ReplyAssignment_4 )
            {
             before(grammarAccess.getCommentAccess().getReplyAssignment_4()); 
            // InternalAssign4.g:1577:2: ( rule__Comment__ReplyAssignment_4 )
            // InternalAssign4.g:1577:3: rule__Comment__ReplyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Comment__ReplyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getReplyAssignment_4()); 

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
    // InternalAssign4.g:1585:1: rule__Comment__Group__5 : rule__Comment__Group__5__Impl rule__Comment__Group__6 ;
    public final void rule__Comment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1589:1: ( rule__Comment__Group__5__Impl rule__Comment__Group__6 )
            // InternalAssign4.g:1590:2: rule__Comment__Group__5__Impl rule__Comment__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalAssign4.g:1597:1: rule__Comment__Group__5__Impl : ( ',' ) ;
    public final void rule__Comment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1601:1: ( ( ',' ) )
            // InternalAssign4.g:1602:1: ( ',' )
            {
            // InternalAssign4.g:1602:1: ( ',' )
            // InternalAssign4.g:1603:2: ','
            {
             before(grammarAccess.getCommentAccess().getCommaKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getCommaKeyword_5()); 

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
    // InternalAssign4.g:1612:1: rule__Comment__Group__6 : rule__Comment__Group__6__Impl rule__Comment__Group__7 ;
    public final void rule__Comment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1616:1: ( rule__Comment__Group__6__Impl rule__Comment__Group__7 )
            // InternalAssign4.g:1617:2: rule__Comment__Group__6__Impl rule__Comment__Group__7
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
    // InternalAssign4.g:1624:1: rule__Comment__Group__6__Impl : ( ( rule__Comment__ModerationAssignment_6 ) ) ;
    public final void rule__Comment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1628:1: ( ( ( rule__Comment__ModerationAssignment_6 ) ) )
            // InternalAssign4.g:1629:1: ( ( rule__Comment__ModerationAssignment_6 ) )
            {
            // InternalAssign4.g:1629:1: ( ( rule__Comment__ModerationAssignment_6 ) )
            // InternalAssign4.g:1630:2: ( rule__Comment__ModerationAssignment_6 )
            {
             before(grammarAccess.getCommentAccess().getModerationAssignment_6()); 
            // InternalAssign4.g:1631:2: ( rule__Comment__ModerationAssignment_6 )
            // InternalAssign4.g:1631:3: rule__Comment__ModerationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Comment__ModerationAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getModerationAssignment_6()); 

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
    // InternalAssign4.g:1639:1: rule__Comment__Group__7 : rule__Comment__Group__7__Impl rule__Comment__Group__8 ;
    public final void rule__Comment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1643:1: ( rule__Comment__Group__7__Impl rule__Comment__Group__8 )
            // InternalAssign4.g:1644:2: rule__Comment__Group__7__Impl rule__Comment__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Comment__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__8();

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
    // InternalAssign4.g:1651:1: rule__Comment__Group__7__Impl : ( ')' ) ;
    public final void rule__Comment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1655:1: ( ( ')' ) )
            // InternalAssign4.g:1656:1: ( ')' )
            {
            // InternalAssign4.g:1656:1: ( ')' )
            // InternalAssign4.g:1657:2: ')'
            {
             before(grammarAccess.getCommentAccess().getRightParenthesisKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getRightParenthesisKeyword_7()); 

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


    // $ANTLR start "rule__Comment__Group__8"
    // InternalAssign4.g:1666:1: rule__Comment__Group__8 : rule__Comment__Group__8__Impl rule__Comment__Group__9 ;
    public final void rule__Comment__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1670:1: ( rule__Comment__Group__8__Impl rule__Comment__Group__9 )
            // InternalAssign4.g:1671:2: rule__Comment__Group__8__Impl rule__Comment__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Comment__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group__9();

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
    // $ANTLR end "rule__Comment__Group__8"


    // $ANTLR start "rule__Comment__Group__8__Impl"
    // InternalAssign4.g:1678:1: rule__Comment__Group__8__Impl : ( ( rule__Comment__Group_8__0 )? ) ;
    public final void rule__Comment__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1682:1: ( ( ( rule__Comment__Group_8__0 )? ) )
            // InternalAssign4.g:1683:1: ( ( rule__Comment__Group_8__0 )? )
            {
            // InternalAssign4.g:1683:1: ( ( rule__Comment__Group_8__0 )? )
            // InternalAssign4.g:1684:2: ( rule__Comment__Group_8__0 )?
            {
             before(grammarAccess.getCommentAccess().getGroup_8()); 
            // InternalAssign4.g:1685:2: ( rule__Comment__Group_8__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAssign4.g:1685:3: rule__Comment__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comment__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommentAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Comment__Group__8__Impl"


    // $ANTLR start "rule__Comment__Group__9"
    // InternalAssign4.g:1693:1: rule__Comment__Group__9 : rule__Comment__Group__9__Impl ;
    public final void rule__Comment__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1697:1: ( rule__Comment__Group__9__Impl )
            // InternalAssign4.g:1698:2: rule__Comment__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group__9__Impl();

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
    // $ANTLR end "rule__Comment__Group__9"


    // $ANTLR start "rule__Comment__Group__9__Impl"
    // InternalAssign4.g:1704:1: rule__Comment__Group__9__Impl : ( ( rule__Comment__Group_9__0 )? ) ;
    public final void rule__Comment__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1708:1: ( ( ( rule__Comment__Group_9__0 )? ) )
            // InternalAssign4.g:1709:1: ( ( rule__Comment__Group_9__0 )? )
            {
            // InternalAssign4.g:1709:1: ( ( rule__Comment__Group_9__0 )? )
            // InternalAssign4.g:1710:2: ( rule__Comment__Group_9__0 )?
            {
             before(grammarAccess.getCommentAccess().getGroup_9()); 
            // InternalAssign4.g:1711:2: ( rule__Comment__Group_9__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAssign4.g:1711:3: rule__Comment__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comment__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommentAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Comment__Group__9__Impl"


    // $ANTLR start "rule__Comment__Group_8__0"
    // InternalAssign4.g:1720:1: rule__Comment__Group_8__0 : rule__Comment__Group_8__0__Impl rule__Comment__Group_8__1 ;
    public final void rule__Comment__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1724:1: ( rule__Comment__Group_8__0__Impl rule__Comment__Group_8__1 )
            // InternalAssign4.g:1725:2: rule__Comment__Group_8__0__Impl rule__Comment__Group_8__1
            {
            pushFollow(FOLLOW_22);
            rule__Comment__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_8__1();

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
    // $ANTLR end "rule__Comment__Group_8__0"


    // $ANTLR start "rule__Comment__Group_8__0__Impl"
    // InternalAssign4.g:1732:1: rule__Comment__Group_8__0__Impl : ( 'Comment' ) ;
    public final void rule__Comment__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1736:1: ( ( 'Comment' ) )
            // InternalAssign4.g:1737:1: ( 'Comment' )
            {
            // InternalAssign4.g:1737:1: ( 'Comment' )
            // InternalAssign4.g:1738:2: 'Comment'
            {
             before(grammarAccess.getCommentAccess().getCommentKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getCommentKeyword_8_0()); 

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
    // $ANTLR end "rule__Comment__Group_8__0__Impl"


    // $ANTLR start "rule__Comment__Group_8__1"
    // InternalAssign4.g:1747:1: rule__Comment__Group_8__1 : rule__Comment__Group_8__1__Impl rule__Comment__Group_8__2 ;
    public final void rule__Comment__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1751:1: ( rule__Comment__Group_8__1__Impl rule__Comment__Group_8__2 )
            // InternalAssign4.g:1752:2: rule__Comment__Group_8__1__Impl rule__Comment__Group_8__2
            {
            pushFollow(FOLLOW_23);
            rule__Comment__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_8__2();

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
    // $ANTLR end "rule__Comment__Group_8__1"


    // $ANTLR start "rule__Comment__Group_8__1__Impl"
    // InternalAssign4.g:1759:1: rule__Comment__Group_8__1__Impl : ( 'Type:' ) ;
    public final void rule__Comment__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1763:1: ( ( 'Type:' ) )
            // InternalAssign4.g:1764:1: ( 'Type:' )
            {
            // InternalAssign4.g:1764:1: ( 'Type:' )
            // InternalAssign4.g:1765:2: 'Type:'
            {
             before(grammarAccess.getCommentAccess().getTypeKeyword_8_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getTypeKeyword_8_1()); 

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
    // $ANTLR end "rule__Comment__Group_8__1__Impl"


    // $ANTLR start "rule__Comment__Group_8__2"
    // InternalAssign4.g:1774:1: rule__Comment__Group_8__2 : rule__Comment__Group_8__2__Impl ;
    public final void rule__Comment__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1778:1: ( rule__Comment__Group_8__2__Impl )
            // InternalAssign4.g:1779:2: rule__Comment__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group_8__2__Impl();

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
    // $ANTLR end "rule__Comment__Group_8__2"


    // $ANTLR start "rule__Comment__Group_8__2__Impl"
    // InternalAssign4.g:1785:1: rule__Comment__Group_8__2__Impl : ( ( rule__Comment__CommentTypeAssignment_8_2 ) ) ;
    public final void rule__Comment__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1789:1: ( ( ( rule__Comment__CommentTypeAssignment_8_2 ) ) )
            // InternalAssign4.g:1790:1: ( ( rule__Comment__CommentTypeAssignment_8_2 ) )
            {
            // InternalAssign4.g:1790:1: ( ( rule__Comment__CommentTypeAssignment_8_2 ) )
            // InternalAssign4.g:1791:2: ( rule__Comment__CommentTypeAssignment_8_2 )
            {
             before(grammarAccess.getCommentAccess().getCommentTypeAssignment_8_2()); 
            // InternalAssign4.g:1792:2: ( rule__Comment__CommentTypeAssignment_8_2 )
            // InternalAssign4.g:1792:3: rule__Comment__CommentTypeAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Comment__CommentTypeAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getCommentTypeAssignment_8_2()); 

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
    // $ANTLR end "rule__Comment__Group_8__2__Impl"


    // $ANTLR start "rule__Comment__Group_9__0"
    // InternalAssign4.g:1801:1: rule__Comment__Group_9__0 : rule__Comment__Group_9__0__Impl rule__Comment__Group_9__1 ;
    public final void rule__Comment__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1805:1: ( rule__Comment__Group_9__0__Impl rule__Comment__Group_9__1 )
            // InternalAssign4.g:1806:2: rule__Comment__Group_9__0__Impl rule__Comment__Group_9__1
            {
            pushFollow(FOLLOW_24);
            rule__Comment__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_9__1();

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
    // $ANTLR end "rule__Comment__Group_9__0"


    // $ANTLR start "rule__Comment__Group_9__0__Impl"
    // InternalAssign4.g:1813:1: rule__Comment__Group_9__0__Impl : ( 'Moderation' ) ;
    public final void rule__Comment__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1817:1: ( ( 'Moderation' ) )
            // InternalAssign4.g:1818:1: ( 'Moderation' )
            {
            // InternalAssign4.g:1818:1: ( 'Moderation' )
            // InternalAssign4.g:1819:2: 'Moderation'
            {
             before(grammarAccess.getCommentAccess().getModerationKeyword_9_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getModerationKeyword_9_0()); 

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
    // $ANTLR end "rule__Comment__Group_9__0__Impl"


    // $ANTLR start "rule__Comment__Group_9__1"
    // InternalAssign4.g:1828:1: rule__Comment__Group_9__1 : rule__Comment__Group_9__1__Impl rule__Comment__Group_9__2 ;
    public final void rule__Comment__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1832:1: ( rule__Comment__Group_9__1__Impl rule__Comment__Group_9__2 )
            // InternalAssign4.g:1833:2: rule__Comment__Group_9__1__Impl rule__Comment__Group_9__2
            {
            pushFollow(FOLLOW_25);
            rule__Comment__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_9__2();

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
    // $ANTLR end "rule__Comment__Group_9__1"


    // $ANTLR start "rule__Comment__Group_9__1__Impl"
    // InternalAssign4.g:1840:1: rule__Comment__Group_9__1__Impl : ( 'Process' ) ;
    public final void rule__Comment__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1844:1: ( ( 'Process' ) )
            // InternalAssign4.g:1845:1: ( 'Process' )
            {
            // InternalAssign4.g:1845:1: ( 'Process' )
            // InternalAssign4.g:1846:2: 'Process'
            {
             before(grammarAccess.getCommentAccess().getProcessKeyword_9_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getProcessKeyword_9_1()); 

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
    // $ANTLR end "rule__Comment__Group_9__1__Impl"


    // $ANTLR start "rule__Comment__Group_9__2"
    // InternalAssign4.g:1855:1: rule__Comment__Group_9__2 : rule__Comment__Group_9__2__Impl rule__Comment__Group_9__3 ;
    public final void rule__Comment__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1859:1: ( rule__Comment__Group_9__2__Impl rule__Comment__Group_9__3 )
            // InternalAssign4.g:1860:2: rule__Comment__Group_9__2__Impl rule__Comment__Group_9__3
            {
            pushFollow(FOLLOW_4);
            rule__Comment__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comment__Group_9__3();

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
    // $ANTLR end "rule__Comment__Group_9__2"


    // $ANTLR start "rule__Comment__Group_9__2__Impl"
    // InternalAssign4.g:1867:1: rule__Comment__Group_9__2__Impl : ( 'Name:' ) ;
    public final void rule__Comment__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1871:1: ( ( 'Name:' ) )
            // InternalAssign4.g:1872:1: ( 'Name:' )
            {
            // InternalAssign4.g:1872:1: ( 'Name:' )
            // InternalAssign4.g:1873:2: 'Name:'
            {
             before(grammarAccess.getCommentAccess().getNameKeyword_9_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getNameKeyword_9_2()); 

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
    // $ANTLR end "rule__Comment__Group_9__2__Impl"


    // $ANTLR start "rule__Comment__Group_9__3"
    // InternalAssign4.g:1882:1: rule__Comment__Group_9__3 : rule__Comment__Group_9__3__Impl ;
    public final void rule__Comment__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1886:1: ( rule__Comment__Group_9__3__Impl )
            // InternalAssign4.g:1887:2: rule__Comment__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comment__Group_9__3__Impl();

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
    // $ANTLR end "rule__Comment__Group_9__3"


    // $ANTLR start "rule__Comment__Group_9__3__Impl"
    // InternalAssign4.g:1893:1: rule__Comment__Group_9__3__Impl : ( ( rule__Comment__ModerationProcessAssignment_9_3 ) ) ;
    public final void rule__Comment__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1897:1: ( ( ( rule__Comment__ModerationProcessAssignment_9_3 ) ) )
            // InternalAssign4.g:1898:1: ( ( rule__Comment__ModerationProcessAssignment_9_3 ) )
            {
            // InternalAssign4.g:1898:1: ( ( rule__Comment__ModerationProcessAssignment_9_3 ) )
            // InternalAssign4.g:1899:2: ( rule__Comment__ModerationProcessAssignment_9_3 )
            {
             before(grammarAccess.getCommentAccess().getModerationProcessAssignment_9_3()); 
            // InternalAssign4.g:1900:2: ( rule__Comment__ModerationProcessAssignment_9_3 )
            // InternalAssign4.g:1900:3: rule__Comment__ModerationProcessAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__Comment__ModerationProcessAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getModerationProcessAssignment_9_3()); 

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
    // $ANTLR end "rule__Comment__Group_9__3__Impl"


    // $ANTLR start "rule__ModerationProcess__Group__0"
    // InternalAssign4.g:1909:1: rule__ModerationProcess__Group__0 : rule__ModerationProcess__Group__0__Impl rule__ModerationProcess__Group__1 ;
    public final void rule__ModerationProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1913:1: ( rule__ModerationProcess__Group__0__Impl rule__ModerationProcess__Group__1 )
            // InternalAssign4.g:1914:2: rule__ModerationProcess__Group__0__Impl rule__ModerationProcess__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAssign4.g:1921:1: rule__ModerationProcess__Group__0__Impl : ( ( rule__ModerationProcess__NameAssignment_0 ) ) ;
    public final void rule__ModerationProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1925:1: ( ( ( rule__ModerationProcess__NameAssignment_0 ) ) )
            // InternalAssign4.g:1926:1: ( ( rule__ModerationProcess__NameAssignment_0 ) )
            {
            // InternalAssign4.g:1926:1: ( ( rule__ModerationProcess__NameAssignment_0 ) )
            // InternalAssign4.g:1927:2: ( rule__ModerationProcess__NameAssignment_0 )
            {
             before(grammarAccess.getModerationProcessAccess().getNameAssignment_0()); 
            // InternalAssign4.g:1928:2: ( rule__ModerationProcess__NameAssignment_0 )
            // InternalAssign4.g:1928:3: rule__ModerationProcess__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModerationProcessAccess().getNameAssignment_0()); 

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
    // InternalAssign4.g:1936:1: rule__ModerationProcess__Group__1 : rule__ModerationProcess__Group__1__Impl rule__ModerationProcess__Group__2 ;
    public final void rule__ModerationProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1940:1: ( rule__ModerationProcess__Group__1__Impl rule__ModerationProcess__Group__2 )
            // InternalAssign4.g:1941:2: rule__ModerationProcess__Group__1__Impl rule__ModerationProcess__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAssign4.g:1948:1: rule__ModerationProcess__Group__1__Impl : ( 'Steps:' ) ;
    public final void rule__ModerationProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1952:1: ( ( 'Steps:' ) )
            // InternalAssign4.g:1953:1: ( 'Steps:' )
            {
            // InternalAssign4.g:1953:1: ( 'Steps:' )
            // InternalAssign4.g:1954:2: 'Steps:'
            {
             before(grammarAccess.getModerationProcessAccess().getStepsKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getStepsKeyword_1()); 

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
    // InternalAssign4.g:1963:1: rule__ModerationProcess__Group__2 : rule__ModerationProcess__Group__2__Impl rule__ModerationProcess__Group__3 ;
    public final void rule__ModerationProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1967:1: ( rule__ModerationProcess__Group__2__Impl rule__ModerationProcess__Group__3 )
            // InternalAssign4.g:1968:2: rule__ModerationProcess__Group__2__Impl rule__ModerationProcess__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalAssign4.g:1975:1: rule__ModerationProcess__Group__2__Impl : ( 'Start' ) ;
    public final void rule__ModerationProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1979:1: ( ( 'Start' ) )
            // InternalAssign4.g:1980:1: ( 'Start' )
            {
            // InternalAssign4.g:1980:1: ( 'Start' )
            // InternalAssign4.g:1981:2: 'Start'
            {
             before(grammarAccess.getModerationProcessAccess().getStartKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getStartKeyword_2()); 

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
    // InternalAssign4.g:1990:1: rule__ModerationProcess__Group__3 : rule__ModerationProcess__Group__3__Impl rule__ModerationProcess__Group__4 ;
    public final void rule__ModerationProcess__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:1994:1: ( rule__ModerationProcess__Group__3__Impl rule__ModerationProcess__Group__4 )
            // InternalAssign4.g:1995:2: rule__ModerationProcess__Group__3__Impl rule__ModerationProcess__Group__4
            {
            pushFollow(FOLLOW_4);
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
    // InternalAssign4.g:2002:1: rule__ModerationProcess__Group__3__Impl : ( 'Step:' ) ;
    public final void rule__ModerationProcess__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2006:1: ( ( 'Step:' ) )
            // InternalAssign4.g:2007:1: ( 'Step:' )
            {
            // InternalAssign4.g:2007:1: ( 'Step:' )
            // InternalAssign4.g:2008:2: 'Step:'
            {
             before(grammarAccess.getModerationProcessAccess().getStepKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getModerationProcessAccess().getStepKeyword_3()); 

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
    // InternalAssign4.g:2017:1: rule__ModerationProcess__Group__4 : rule__ModerationProcess__Group__4__Impl rule__ModerationProcess__Group__5 ;
    public final void rule__ModerationProcess__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2021:1: ( rule__ModerationProcess__Group__4__Impl rule__ModerationProcess__Group__5 )
            // InternalAssign4.g:2022:2: rule__ModerationProcess__Group__4__Impl rule__ModerationProcess__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalAssign4.g:2029:1: rule__ModerationProcess__Group__4__Impl : ( ( rule__ModerationProcess__StartStepAssignment_4 ) ) ;
    public final void rule__ModerationProcess__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2033:1: ( ( ( rule__ModerationProcess__StartStepAssignment_4 ) ) )
            // InternalAssign4.g:2034:1: ( ( rule__ModerationProcess__StartStepAssignment_4 ) )
            {
            // InternalAssign4.g:2034:1: ( ( rule__ModerationProcess__StartStepAssignment_4 ) )
            // InternalAssign4.g:2035:2: ( rule__ModerationProcess__StartStepAssignment_4 )
            {
             before(grammarAccess.getModerationProcessAccess().getStartStepAssignment_4()); 
            // InternalAssign4.g:2036:2: ( rule__ModerationProcess__StartStepAssignment_4 )
            // InternalAssign4.g:2036:3: rule__ModerationProcess__StartStepAssignment_4
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
    // InternalAssign4.g:2044:1: rule__ModerationProcess__Group__5 : rule__ModerationProcess__Group__5__Impl ;
    public final void rule__ModerationProcess__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2048:1: ( rule__ModerationProcess__Group__5__Impl )
            // InternalAssign4.g:2049:2: rule__ModerationProcess__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group__5__Impl();

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
    // InternalAssign4.g:2055:1: rule__ModerationProcess__Group__5__Impl : ( ( rule__ModerationProcess__Group_5__0 )? ) ;
    public final void rule__ModerationProcess__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2059:1: ( ( ( rule__ModerationProcess__Group_5__0 )? ) )
            // InternalAssign4.g:2060:1: ( ( rule__ModerationProcess__Group_5__0 )? )
            {
            // InternalAssign4.g:2060:1: ( ( rule__ModerationProcess__Group_5__0 )? )
            // InternalAssign4.g:2061:2: ( rule__ModerationProcess__Group_5__0 )?
            {
             before(grammarAccess.getModerationProcessAccess().getGroup_5()); 
            // InternalAssign4.g:2062:2: ( rule__ModerationProcess__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=40 && LA14_0<=41)||LA14_0==49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAssign4.g:2062:3: rule__ModerationProcess__Group_5__0
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


    // $ANTLR start "rule__ModerationProcess__Group_5__0"
    // InternalAssign4.g:2071:1: rule__ModerationProcess__Group_5__0 : rule__ModerationProcess__Group_5__0__Impl rule__ModerationProcess__Group_5__1 ;
    public final void rule__ModerationProcess__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2075:1: ( rule__ModerationProcess__Group_5__0__Impl rule__ModerationProcess__Group_5__1 )
            // InternalAssign4.g:2076:2: rule__ModerationProcess__Group_5__0__Impl rule__ModerationProcess__Group_5__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAssign4.g:2083:1: rule__ModerationProcess__Group_5__0__Impl : ( ( rule__ModerationProcess__StepAssignment_5_0 ) ) ;
    public final void rule__ModerationProcess__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2087:1: ( ( ( rule__ModerationProcess__StepAssignment_5_0 ) ) )
            // InternalAssign4.g:2088:1: ( ( rule__ModerationProcess__StepAssignment_5_0 ) )
            {
            // InternalAssign4.g:2088:1: ( ( rule__ModerationProcess__StepAssignment_5_0 ) )
            // InternalAssign4.g:2089:2: ( rule__ModerationProcess__StepAssignment_5_0 )
            {
             before(grammarAccess.getModerationProcessAccess().getStepAssignment_5_0()); 
            // InternalAssign4.g:2090:2: ( rule__ModerationProcess__StepAssignment_5_0 )
            // InternalAssign4.g:2090:3: rule__ModerationProcess__StepAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__StepAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getModerationProcessAccess().getStepAssignment_5_0()); 

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
    // InternalAssign4.g:2098:1: rule__ModerationProcess__Group_5__1 : rule__ModerationProcess__Group_5__1__Impl ;
    public final void rule__ModerationProcess__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2102:1: ( rule__ModerationProcess__Group_5__1__Impl )
            // InternalAssign4.g:2103:2: rule__ModerationProcess__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModerationProcess__Group_5__1__Impl();

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
    // InternalAssign4.g:2109:1: rule__ModerationProcess__Group_5__1__Impl : ( ( rule__ModerationProcess__StepAssignment_5_1 )* ) ;
    public final void rule__ModerationProcess__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2113:1: ( ( ( rule__ModerationProcess__StepAssignment_5_1 )* ) )
            // InternalAssign4.g:2114:1: ( ( rule__ModerationProcess__StepAssignment_5_1 )* )
            {
            // InternalAssign4.g:2114:1: ( ( rule__ModerationProcess__StepAssignment_5_1 )* )
            // InternalAssign4.g:2115:2: ( rule__ModerationProcess__StepAssignment_5_1 )*
            {
             before(grammarAccess.getModerationProcessAccess().getStepAssignment_5_1()); 
            // InternalAssign4.g:2116:2: ( rule__ModerationProcess__StepAssignment_5_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=40 && LA15_0<=41)||LA15_0==49) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAssign4.g:2116:3: rule__ModerationProcess__StepAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ModerationProcess__StepAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModerationProcessAccess().getStepAssignment_5_1()); 

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


    // $ANTLR start "rule__End__Group__0"
    // InternalAssign4.g:2125:1: rule__End__Group__0 : rule__End__Group__0__Impl rule__End__Group__1 ;
    public final void rule__End__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2129:1: ( rule__End__Group__0__Impl rule__End__Group__1 )
            // InternalAssign4.g:2130:2: rule__End__Group__0__Impl rule__End__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAssign4.g:2137:1: rule__End__Group__0__Impl : ( () ) ;
    public final void rule__End__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2141:1: ( ( () ) )
            // InternalAssign4.g:2142:1: ( () )
            {
            // InternalAssign4.g:2142:1: ( () )
            // InternalAssign4.g:2143:2: ()
            {
             before(grammarAccess.getEndAccess().getEndAction_0()); 
            // InternalAssign4.g:2144:2: ()
            // InternalAssign4.g:2144:3: 
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
    // InternalAssign4.g:2152:1: rule__End__Group__1 : rule__End__Group__1__Impl rule__End__Group__2 ;
    public final void rule__End__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2156:1: ( rule__End__Group__1__Impl rule__End__Group__2 )
            // InternalAssign4.g:2157:2: rule__End__Group__1__Impl rule__End__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAssign4.g:2164:1: rule__End__Group__1__Impl : ( 'End' ) ;
    public final void rule__End__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2168:1: ( ( 'End' ) )
            // InternalAssign4.g:2169:1: ( 'End' )
            {
            // InternalAssign4.g:2169:1: ( 'End' )
            // InternalAssign4.g:2170:2: 'End'
            {
             before(grammarAccess.getEndAccess().getEndKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalAssign4.g:2179:1: rule__End__Group__2 : rule__End__Group__2__Impl rule__End__Group__3 ;
    public final void rule__End__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2183:1: ( rule__End__Group__2__Impl rule__End__Group__3 )
            // InternalAssign4.g:2184:2: rule__End__Group__2__Impl rule__End__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__End__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__End__Group__3();

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
    // InternalAssign4.g:2191:1: rule__End__Group__2__Impl : ( 'Step:' ) ;
    public final void rule__End__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2195:1: ( ( 'Step:' ) )
            // InternalAssign4.g:2196:1: ( 'Step:' )
            {
            // InternalAssign4.g:2196:1: ( 'Step:' )
            // InternalAssign4.g:2197:2: 'Step:'
            {
             before(grammarAccess.getEndAccess().getStepKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEndAccess().getStepKeyword_2()); 

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


    // $ANTLR start "rule__End__Group__3"
    // InternalAssign4.g:2206:1: rule__End__Group__3 : rule__End__Group__3__Impl ;
    public final void rule__End__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2210:1: ( rule__End__Group__3__Impl )
            // InternalAssign4.g:2211:2: rule__End__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__End__Group__3__Impl();

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
    // $ANTLR end "rule__End__Group__3"


    // $ANTLR start "rule__End__Group__3__Impl"
    // InternalAssign4.g:2217:1: rule__End__Group__3__Impl : ( ( rule__End__NameAssignment_3 ) ) ;
    public final void rule__End__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2221:1: ( ( ( rule__End__NameAssignment_3 ) ) )
            // InternalAssign4.g:2222:1: ( ( rule__End__NameAssignment_3 ) )
            {
            // InternalAssign4.g:2222:1: ( ( rule__End__NameAssignment_3 ) )
            // InternalAssign4.g:2223:2: ( rule__End__NameAssignment_3 )
            {
             before(grammarAccess.getEndAccess().getNameAssignment_3()); 
            // InternalAssign4.g:2224:2: ( rule__End__NameAssignment_3 )
            // InternalAssign4.g:2224:3: rule__End__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__End__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEndAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__End__Group__3__Impl"


    // $ANTLR start "rule__Automatic__Group__0"
    // InternalAssign4.g:2233:1: rule__Automatic__Group__0 : rule__Automatic__Group__0__Impl rule__Automatic__Group__1 ;
    public final void rule__Automatic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2237:1: ( rule__Automatic__Group__0__Impl rule__Automatic__Group__1 )
            // InternalAssign4.g:2238:2: rule__Automatic__Group__0__Impl rule__Automatic__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAssign4.g:2245:1: rule__Automatic__Group__0__Impl : ( 'Automatic' ) ;
    public final void rule__Automatic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2249:1: ( ( 'Automatic' ) )
            // InternalAssign4.g:2250:1: ( 'Automatic' )
            {
            // InternalAssign4.g:2250:1: ( 'Automatic' )
            // InternalAssign4.g:2251:2: 'Automatic'
            {
             before(grammarAccess.getAutomaticAccess().getAutomaticKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalAssign4.g:2260:1: rule__Automatic__Group__1 : rule__Automatic__Group__1__Impl rule__Automatic__Group__2 ;
    public final void rule__Automatic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2264:1: ( rule__Automatic__Group__1__Impl rule__Automatic__Group__2 )
            // InternalAssign4.g:2265:2: rule__Automatic__Group__1__Impl rule__Automatic__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalAssign4.g:2272:1: rule__Automatic__Group__1__Impl : ( 'Step' ) ;
    public final void rule__Automatic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2276:1: ( ( 'Step' ) )
            // InternalAssign4.g:2277:1: ( 'Step' )
            {
            // InternalAssign4.g:2277:1: ( 'Step' )
            // InternalAssign4.g:2278:2: 'Step'
            {
             before(grammarAccess.getAutomaticAccess().getStepKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getStepKeyword_1()); 

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
    // InternalAssign4.g:2287:1: rule__Automatic__Group__2 : rule__Automatic__Group__2__Impl rule__Automatic__Group__3 ;
    public final void rule__Automatic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2291:1: ( rule__Automatic__Group__2__Impl rule__Automatic__Group__3 )
            // InternalAssign4.g:2292:2: rule__Automatic__Group__2__Impl rule__Automatic__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalAssign4.g:2299:1: rule__Automatic__Group__2__Impl : ( 'Name:' ) ;
    public final void rule__Automatic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2303:1: ( ( 'Name:' ) )
            // InternalAssign4.g:2304:1: ( 'Name:' )
            {
            // InternalAssign4.g:2304:1: ( 'Name:' )
            // InternalAssign4.g:2305:2: 'Name:'
            {
             before(grammarAccess.getAutomaticAccess().getNameKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getNameKeyword_2()); 

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
    // InternalAssign4.g:2314:1: rule__Automatic__Group__3 : rule__Automatic__Group__3__Impl rule__Automatic__Group__4 ;
    public final void rule__Automatic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2318:1: ( rule__Automatic__Group__3__Impl rule__Automatic__Group__4 )
            // InternalAssign4.g:2319:2: rule__Automatic__Group__3__Impl rule__Automatic__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalAssign4.g:2326:1: rule__Automatic__Group__3__Impl : ( ( rule__Automatic__NameAssignment_3 ) ) ;
    public final void rule__Automatic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2330:1: ( ( ( rule__Automatic__NameAssignment_3 ) ) )
            // InternalAssign4.g:2331:1: ( ( rule__Automatic__NameAssignment_3 ) )
            {
            // InternalAssign4.g:2331:1: ( ( rule__Automatic__NameAssignment_3 ) )
            // InternalAssign4.g:2332:2: ( rule__Automatic__NameAssignment_3 )
            {
             before(grammarAccess.getAutomaticAccess().getNameAssignment_3()); 
            // InternalAssign4.g:2333:2: ( rule__Automatic__NameAssignment_3 )
            // InternalAssign4.g:2333:3: rule__Automatic__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getNameAssignment_3()); 

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
    // InternalAssign4.g:2341:1: rule__Automatic__Group__4 : rule__Automatic__Group__4__Impl rule__Automatic__Group__5 ;
    public final void rule__Automatic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2345:1: ( rule__Automatic__Group__4__Impl rule__Automatic__Group__5 )
            // InternalAssign4.g:2346:2: rule__Automatic__Group__4__Impl rule__Automatic__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalAssign4.g:2353:1: rule__Automatic__Group__4__Impl : ( ( rule__Automatic__Group_4__0 )? ) ;
    public final void rule__Automatic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2357:1: ( ( ( rule__Automatic__Group_4__0 )? ) )
            // InternalAssign4.g:2358:1: ( ( rule__Automatic__Group_4__0 )? )
            {
            // InternalAssign4.g:2358:1: ( ( rule__Automatic__Group_4__0 )? )
            // InternalAssign4.g:2359:2: ( rule__Automatic__Group_4__0 )?
            {
             before(grammarAccess.getAutomaticAccess().getGroup_4()); 
            // InternalAssign4.g:2360:2: ( rule__Automatic__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAssign4.g:2360:3: rule__Automatic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Automatic__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutomaticAccess().getGroup_4()); 

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
    // InternalAssign4.g:2368:1: rule__Automatic__Group__5 : rule__Automatic__Group__5__Impl rule__Automatic__Group__6 ;
    public final void rule__Automatic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2372:1: ( rule__Automatic__Group__5__Impl rule__Automatic__Group__6 )
            // InternalAssign4.g:2373:2: rule__Automatic__Group__5__Impl rule__Automatic__Group__6
            {
            pushFollow(FOLLOW_34);
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
    // InternalAssign4.g:2380:1: rule__Automatic__Group__5__Impl : ( 'If' ) ;
    public final void rule__Automatic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2384:1: ( ( 'If' ) )
            // InternalAssign4.g:2385:1: ( 'If' )
            {
            // InternalAssign4.g:2385:1: ( 'If' )
            // InternalAssign4.g:2386:2: 'If'
            {
             before(grammarAccess.getAutomaticAccess().getIfKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getIfKeyword_5()); 

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
    // InternalAssign4.g:2395:1: rule__Automatic__Group__6 : rule__Automatic__Group__6__Impl rule__Automatic__Group__7 ;
    public final void rule__Automatic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2399:1: ( rule__Automatic__Group__6__Impl rule__Automatic__Group__7 )
            // InternalAssign4.g:2400:2: rule__Automatic__Group__6__Impl rule__Automatic__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalAssign4.g:2407:1: rule__Automatic__Group__6__Impl : ( 'approved' ) ;
    public final void rule__Automatic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2411:1: ( ( 'approved' ) )
            // InternalAssign4.g:2412:1: ( 'approved' )
            {
            // InternalAssign4.g:2412:1: ( 'approved' )
            // InternalAssign4.g:2413:2: 'approved'
            {
             before(grammarAccess.getAutomaticAccess().getApprovedKeyword_6()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getApprovedKeyword_6()); 

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
    // InternalAssign4.g:2422:1: rule__Automatic__Group__7 : rule__Automatic__Group__7__Impl rule__Automatic__Group__8 ;
    public final void rule__Automatic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2426:1: ( rule__Automatic__Group__7__Impl rule__Automatic__Group__8 )
            // InternalAssign4.g:2427:2: rule__Automatic__Group__7__Impl rule__Automatic__Group__8
            {
            pushFollow(FOLLOW_36);
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
    // InternalAssign4.g:2434:1: rule__Automatic__Group__7__Impl : ( 'jump' ) ;
    public final void rule__Automatic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2438:1: ( ( 'jump' ) )
            // InternalAssign4.g:2439:1: ( 'jump' )
            {
            // InternalAssign4.g:2439:1: ( 'jump' )
            // InternalAssign4.g:2440:2: 'jump'
            {
             before(grammarAccess.getAutomaticAccess().getJumpKeyword_7()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getJumpKeyword_7()); 

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
    // InternalAssign4.g:2449:1: rule__Automatic__Group__8 : rule__Automatic__Group__8__Impl rule__Automatic__Group__9 ;
    public final void rule__Automatic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2453:1: ( rule__Automatic__Group__8__Impl rule__Automatic__Group__9 )
            // InternalAssign4.g:2454:2: rule__Automatic__Group__8__Impl rule__Automatic__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Automatic__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__9();

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
    // InternalAssign4.g:2461:1: rule__Automatic__Group__8__Impl : ( 'to:' ) ;
    public final void rule__Automatic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2465:1: ( ( 'to:' ) )
            // InternalAssign4.g:2466:1: ( 'to:' )
            {
            // InternalAssign4.g:2466:1: ( 'to:' )
            // InternalAssign4.g:2467:2: 'to:'
            {
             before(grammarAccess.getAutomaticAccess().getToKeyword_8()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getToKeyword_8()); 

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


    // $ANTLR start "rule__Automatic__Group__9"
    // InternalAssign4.g:2476:1: rule__Automatic__Group__9 : rule__Automatic__Group__9__Impl rule__Automatic__Group__10 ;
    public final void rule__Automatic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2480:1: ( rule__Automatic__Group__9__Impl rule__Automatic__Group__10 )
            // InternalAssign4.g:2481:2: rule__Automatic__Group__9__Impl rule__Automatic__Group__10
            {
            pushFollow(FOLLOW_37);
            rule__Automatic__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__10();

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
    // $ANTLR end "rule__Automatic__Group__9"


    // $ANTLR start "rule__Automatic__Group__9__Impl"
    // InternalAssign4.g:2488:1: rule__Automatic__Group__9__Impl : ( ( rule__Automatic__NextApproveAssignment_9 ) ) ;
    public final void rule__Automatic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2492:1: ( ( ( rule__Automatic__NextApproveAssignment_9 ) ) )
            // InternalAssign4.g:2493:1: ( ( rule__Automatic__NextApproveAssignment_9 ) )
            {
            // InternalAssign4.g:2493:1: ( ( rule__Automatic__NextApproveAssignment_9 ) )
            // InternalAssign4.g:2494:2: ( rule__Automatic__NextApproveAssignment_9 )
            {
             before(grammarAccess.getAutomaticAccess().getNextApproveAssignment_9()); 
            // InternalAssign4.g:2495:2: ( rule__Automatic__NextApproveAssignment_9 )
            // InternalAssign4.g:2495:3: rule__Automatic__NextApproveAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__NextApproveAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getNextApproveAssignment_9()); 

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
    // $ANTLR end "rule__Automatic__Group__9__Impl"


    // $ANTLR start "rule__Automatic__Group__10"
    // InternalAssign4.g:2503:1: rule__Automatic__Group__10 : rule__Automatic__Group__10__Impl rule__Automatic__Group__11 ;
    public final void rule__Automatic__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2507:1: ( rule__Automatic__Group__10__Impl rule__Automatic__Group__11 )
            // InternalAssign4.g:2508:2: rule__Automatic__Group__10__Impl rule__Automatic__Group__11
            {
            pushFollow(FOLLOW_38);
            rule__Automatic__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__11();

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
    // $ANTLR end "rule__Automatic__Group__10"


    // $ANTLR start "rule__Automatic__Group__10__Impl"
    // InternalAssign4.g:2515:1: rule__Automatic__Group__10__Impl : ( 'If' ) ;
    public final void rule__Automatic__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2519:1: ( ( 'If' ) )
            // InternalAssign4.g:2520:1: ( 'If' )
            {
            // InternalAssign4.g:2520:1: ( 'If' )
            // InternalAssign4.g:2521:2: 'If'
            {
             before(grammarAccess.getAutomaticAccess().getIfKeyword_10()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getIfKeyword_10()); 

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
    // $ANTLR end "rule__Automatic__Group__10__Impl"


    // $ANTLR start "rule__Automatic__Group__11"
    // InternalAssign4.g:2530:1: rule__Automatic__Group__11 : rule__Automatic__Group__11__Impl rule__Automatic__Group__12 ;
    public final void rule__Automatic__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2534:1: ( rule__Automatic__Group__11__Impl rule__Automatic__Group__12 )
            // InternalAssign4.g:2535:2: rule__Automatic__Group__11__Impl rule__Automatic__Group__12
            {
            pushFollow(FOLLOW_35);
            rule__Automatic__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__12();

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
    // $ANTLR end "rule__Automatic__Group__11"


    // $ANTLR start "rule__Automatic__Group__11__Impl"
    // InternalAssign4.g:2542:1: rule__Automatic__Group__11__Impl : ( 'rejected' ) ;
    public final void rule__Automatic__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2546:1: ( ( 'rejected' ) )
            // InternalAssign4.g:2547:1: ( 'rejected' )
            {
            // InternalAssign4.g:2547:1: ( 'rejected' )
            // InternalAssign4.g:2548:2: 'rejected'
            {
             before(grammarAccess.getAutomaticAccess().getRejectedKeyword_11()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getRejectedKeyword_11()); 

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
    // $ANTLR end "rule__Automatic__Group__11__Impl"


    // $ANTLR start "rule__Automatic__Group__12"
    // InternalAssign4.g:2557:1: rule__Automatic__Group__12 : rule__Automatic__Group__12__Impl rule__Automatic__Group__13 ;
    public final void rule__Automatic__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2561:1: ( rule__Automatic__Group__12__Impl rule__Automatic__Group__13 )
            // InternalAssign4.g:2562:2: rule__Automatic__Group__12__Impl rule__Automatic__Group__13
            {
            pushFollow(FOLLOW_36);
            rule__Automatic__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__13();

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
    // $ANTLR end "rule__Automatic__Group__12"


    // $ANTLR start "rule__Automatic__Group__12__Impl"
    // InternalAssign4.g:2569:1: rule__Automatic__Group__12__Impl : ( 'jump' ) ;
    public final void rule__Automatic__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2573:1: ( ( 'jump' ) )
            // InternalAssign4.g:2574:1: ( 'jump' )
            {
            // InternalAssign4.g:2574:1: ( 'jump' )
            // InternalAssign4.g:2575:2: 'jump'
            {
             before(grammarAccess.getAutomaticAccess().getJumpKeyword_12()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getJumpKeyword_12()); 

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
    // $ANTLR end "rule__Automatic__Group__12__Impl"


    // $ANTLR start "rule__Automatic__Group__13"
    // InternalAssign4.g:2584:1: rule__Automatic__Group__13 : rule__Automatic__Group__13__Impl rule__Automatic__Group__14 ;
    public final void rule__Automatic__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2588:1: ( rule__Automatic__Group__13__Impl rule__Automatic__Group__14 )
            // InternalAssign4.g:2589:2: rule__Automatic__Group__13__Impl rule__Automatic__Group__14
            {
            pushFollow(FOLLOW_4);
            rule__Automatic__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group__14();

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
    // $ANTLR end "rule__Automatic__Group__13"


    // $ANTLR start "rule__Automatic__Group__13__Impl"
    // InternalAssign4.g:2596:1: rule__Automatic__Group__13__Impl : ( 'to:' ) ;
    public final void rule__Automatic__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2600:1: ( ( 'to:' ) )
            // InternalAssign4.g:2601:1: ( 'to:' )
            {
            // InternalAssign4.g:2601:1: ( 'to:' )
            // InternalAssign4.g:2602:2: 'to:'
            {
             before(grammarAccess.getAutomaticAccess().getToKeyword_13()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getToKeyword_13()); 

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
    // $ANTLR end "rule__Automatic__Group__13__Impl"


    // $ANTLR start "rule__Automatic__Group__14"
    // InternalAssign4.g:2611:1: rule__Automatic__Group__14 : rule__Automatic__Group__14__Impl ;
    public final void rule__Automatic__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2615:1: ( rule__Automatic__Group__14__Impl )
            // InternalAssign4.g:2616:2: rule__Automatic__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__Group__14__Impl();

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
    // $ANTLR end "rule__Automatic__Group__14"


    // $ANTLR start "rule__Automatic__Group__14__Impl"
    // InternalAssign4.g:2622:1: rule__Automatic__Group__14__Impl : ( ( rule__Automatic__NextRejectAssignment_14 ) ) ;
    public final void rule__Automatic__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2626:1: ( ( ( rule__Automatic__NextRejectAssignment_14 ) ) )
            // InternalAssign4.g:2627:1: ( ( rule__Automatic__NextRejectAssignment_14 ) )
            {
            // InternalAssign4.g:2627:1: ( ( rule__Automatic__NextRejectAssignment_14 ) )
            // InternalAssign4.g:2628:2: ( rule__Automatic__NextRejectAssignment_14 )
            {
             before(grammarAccess.getAutomaticAccess().getNextRejectAssignment_14()); 
            // InternalAssign4.g:2629:2: ( rule__Automatic__NextRejectAssignment_14 )
            // InternalAssign4.g:2629:3: rule__Automatic__NextRejectAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__NextRejectAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getNextRejectAssignment_14()); 

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
    // $ANTLR end "rule__Automatic__Group__14__Impl"


    // $ANTLR start "rule__Automatic__Group_4__0"
    // InternalAssign4.g:2638:1: rule__Automatic__Group_4__0 : rule__Automatic__Group_4__0__Impl rule__Automatic__Group_4__1 ;
    public final void rule__Automatic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2642:1: ( rule__Automatic__Group_4__0__Impl rule__Automatic__Group_4__1 )
            // InternalAssign4.g:2643:2: rule__Automatic__Group_4__0__Impl rule__Automatic__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Automatic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Automatic__Group_4__1();

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
    // $ANTLR end "rule__Automatic__Group_4__0"


    // $ANTLR start "rule__Automatic__Group_4__0__Impl"
    // InternalAssign4.g:2650:1: rule__Automatic__Group_4__0__Impl : ( 'Method:' ) ;
    public final void rule__Automatic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2654:1: ( ( 'Method:' ) )
            // InternalAssign4.g:2655:1: ( 'Method:' )
            {
            // InternalAssign4.g:2655:1: ( 'Method:' )
            // InternalAssign4.g:2656:2: 'Method:'
            {
             before(grammarAccess.getAutomaticAccess().getMethodKeyword_4_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAutomaticAccess().getMethodKeyword_4_0()); 

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
    // $ANTLR end "rule__Automatic__Group_4__0__Impl"


    // $ANTLR start "rule__Automatic__Group_4__1"
    // InternalAssign4.g:2665:1: rule__Automatic__Group_4__1 : rule__Automatic__Group_4__1__Impl ;
    public final void rule__Automatic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2669:1: ( rule__Automatic__Group_4__1__Impl )
            // InternalAssign4.g:2670:2: rule__Automatic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__Group_4__1__Impl();

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
    // $ANTLR end "rule__Automatic__Group_4__1"


    // $ANTLR start "rule__Automatic__Group_4__1__Impl"
    // InternalAssign4.g:2676:1: rule__Automatic__Group_4__1__Impl : ( ( rule__Automatic__MethodAssignment_4_1 ) ) ;
    public final void rule__Automatic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2680:1: ( ( ( rule__Automatic__MethodAssignment_4_1 ) ) )
            // InternalAssign4.g:2681:1: ( ( rule__Automatic__MethodAssignment_4_1 ) )
            {
            // InternalAssign4.g:2681:1: ( ( rule__Automatic__MethodAssignment_4_1 ) )
            // InternalAssign4.g:2682:2: ( rule__Automatic__MethodAssignment_4_1 )
            {
             before(grammarAccess.getAutomaticAccess().getMethodAssignment_4_1()); 
            // InternalAssign4.g:2683:2: ( rule__Automatic__MethodAssignment_4_1 )
            // InternalAssign4.g:2683:3: rule__Automatic__MethodAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Automatic__MethodAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAutomaticAccess().getMethodAssignment_4_1()); 

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
    // $ANTLR end "rule__Automatic__Group_4__1__Impl"


    // $ANTLR start "rule__Manual__Group__0"
    // InternalAssign4.g:2692:1: rule__Manual__Group__0 : rule__Manual__Group__0__Impl rule__Manual__Group__1 ;
    public final void rule__Manual__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2696:1: ( rule__Manual__Group__0__Impl rule__Manual__Group__1 )
            // InternalAssign4.g:2697:2: rule__Manual__Group__0__Impl rule__Manual__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAssign4.g:2704:1: rule__Manual__Group__0__Impl : ( 'Manual' ) ;
    public final void rule__Manual__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2708:1: ( ( 'Manual' ) )
            // InternalAssign4.g:2709:1: ( 'Manual' )
            {
            // InternalAssign4.g:2709:1: ( 'Manual' )
            // InternalAssign4.g:2710:2: 'Manual'
            {
             before(grammarAccess.getManualAccess().getManualKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalAssign4.g:2719:1: rule__Manual__Group__1 : rule__Manual__Group__1__Impl rule__Manual__Group__2 ;
    public final void rule__Manual__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2723:1: ( rule__Manual__Group__1__Impl rule__Manual__Group__2 )
            // InternalAssign4.g:2724:2: rule__Manual__Group__1__Impl rule__Manual__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalAssign4.g:2731:1: rule__Manual__Group__1__Impl : ( 'Step' ) ;
    public final void rule__Manual__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2735:1: ( ( 'Step' ) )
            // InternalAssign4.g:2736:1: ( 'Step' )
            {
            // InternalAssign4.g:2736:1: ( 'Step' )
            // InternalAssign4.g:2737:2: 'Step'
            {
             before(grammarAccess.getManualAccess().getStepKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getStepKeyword_1()); 

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
    // InternalAssign4.g:2746:1: rule__Manual__Group__2 : rule__Manual__Group__2__Impl rule__Manual__Group__3 ;
    public final void rule__Manual__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2750:1: ( rule__Manual__Group__2__Impl rule__Manual__Group__3 )
            // InternalAssign4.g:2751:2: rule__Manual__Group__2__Impl rule__Manual__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalAssign4.g:2758:1: rule__Manual__Group__2__Impl : ( 'Name:' ) ;
    public final void rule__Manual__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2762:1: ( ( 'Name:' ) )
            // InternalAssign4.g:2763:1: ( 'Name:' )
            {
            // InternalAssign4.g:2763:1: ( 'Name:' )
            // InternalAssign4.g:2764:2: 'Name:'
            {
             before(grammarAccess.getManualAccess().getNameKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getNameKeyword_2()); 

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
    // InternalAssign4.g:2773:1: rule__Manual__Group__3 : rule__Manual__Group__3__Impl rule__Manual__Group__4 ;
    public final void rule__Manual__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2777:1: ( rule__Manual__Group__3__Impl rule__Manual__Group__4 )
            // InternalAssign4.g:2778:2: rule__Manual__Group__3__Impl rule__Manual__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalAssign4.g:2785:1: rule__Manual__Group__3__Impl : ( ( rule__Manual__NameAssignment_3 ) ) ;
    public final void rule__Manual__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2789:1: ( ( ( rule__Manual__NameAssignment_3 ) ) )
            // InternalAssign4.g:2790:1: ( ( rule__Manual__NameAssignment_3 ) )
            {
            // InternalAssign4.g:2790:1: ( ( rule__Manual__NameAssignment_3 ) )
            // InternalAssign4.g:2791:2: ( rule__Manual__NameAssignment_3 )
            {
             before(grammarAccess.getManualAccess().getNameAssignment_3()); 
            // InternalAssign4.g:2792:2: ( rule__Manual__NameAssignment_3 )
            // InternalAssign4.g:2792:3: rule__Manual__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Manual__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getManualAccess().getNameAssignment_3()); 

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
    // InternalAssign4.g:2800:1: rule__Manual__Group__4 : rule__Manual__Group__4__Impl rule__Manual__Group__5 ;
    public final void rule__Manual__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2804:1: ( rule__Manual__Group__4__Impl rule__Manual__Group__5 )
            // InternalAssign4.g:2805:2: rule__Manual__Group__4__Impl rule__Manual__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalAssign4.g:2812:1: rule__Manual__Group__4__Impl : ( 'If' ) ;
    public final void rule__Manual__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2816:1: ( ( 'If' ) )
            // InternalAssign4.g:2817:1: ( 'If' )
            {
            // InternalAssign4.g:2817:1: ( 'If' )
            // InternalAssign4.g:2818:2: 'If'
            {
             before(grammarAccess.getManualAccess().getIfKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getIfKeyword_4()); 

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
    // InternalAssign4.g:2827:1: rule__Manual__Group__5 : rule__Manual__Group__5__Impl rule__Manual__Group__6 ;
    public final void rule__Manual__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2831:1: ( rule__Manual__Group__5__Impl rule__Manual__Group__6 )
            // InternalAssign4.g:2832:2: rule__Manual__Group__5__Impl rule__Manual__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalAssign4.g:2839:1: rule__Manual__Group__5__Impl : ( 'approved' ) ;
    public final void rule__Manual__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2843:1: ( ( 'approved' ) )
            // InternalAssign4.g:2844:1: ( 'approved' )
            {
            // InternalAssign4.g:2844:1: ( 'approved' )
            // InternalAssign4.g:2845:2: 'approved'
            {
             before(grammarAccess.getManualAccess().getApprovedKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getApprovedKeyword_5()); 

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
    // InternalAssign4.g:2854:1: rule__Manual__Group__6 : rule__Manual__Group__6__Impl rule__Manual__Group__7 ;
    public final void rule__Manual__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2858:1: ( rule__Manual__Group__6__Impl rule__Manual__Group__7 )
            // InternalAssign4.g:2859:2: rule__Manual__Group__6__Impl rule__Manual__Group__7
            {
            pushFollow(FOLLOW_36);
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
    // InternalAssign4.g:2866:1: rule__Manual__Group__6__Impl : ( 'jump' ) ;
    public final void rule__Manual__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2870:1: ( ( 'jump' ) )
            // InternalAssign4.g:2871:1: ( 'jump' )
            {
            // InternalAssign4.g:2871:1: ( 'jump' )
            // InternalAssign4.g:2872:2: 'jump'
            {
             before(grammarAccess.getManualAccess().getJumpKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getJumpKeyword_6()); 

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
    // InternalAssign4.g:2881:1: rule__Manual__Group__7 : rule__Manual__Group__7__Impl rule__Manual__Group__8 ;
    public final void rule__Manual__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2885:1: ( rule__Manual__Group__7__Impl rule__Manual__Group__8 )
            // InternalAssign4.g:2886:2: rule__Manual__Group__7__Impl rule__Manual__Group__8
            {
            pushFollow(FOLLOW_4);
            rule__Manual__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__8();

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
    // InternalAssign4.g:2893:1: rule__Manual__Group__7__Impl : ( 'to:' ) ;
    public final void rule__Manual__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2897:1: ( ( 'to:' ) )
            // InternalAssign4.g:2898:1: ( 'to:' )
            {
            // InternalAssign4.g:2898:1: ( 'to:' )
            // InternalAssign4.g:2899:2: 'to:'
            {
             before(grammarAccess.getManualAccess().getToKeyword_7()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getToKeyword_7()); 

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


    // $ANTLR start "rule__Manual__Group__8"
    // InternalAssign4.g:2908:1: rule__Manual__Group__8 : rule__Manual__Group__8__Impl rule__Manual__Group__9 ;
    public final void rule__Manual__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2912:1: ( rule__Manual__Group__8__Impl rule__Manual__Group__9 )
            // InternalAssign4.g:2913:2: rule__Manual__Group__8__Impl rule__Manual__Group__9
            {
            pushFollow(FOLLOW_37);
            rule__Manual__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__9();

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
    // $ANTLR end "rule__Manual__Group__8"


    // $ANTLR start "rule__Manual__Group__8__Impl"
    // InternalAssign4.g:2920:1: rule__Manual__Group__8__Impl : ( ( rule__Manual__NextApproveAssignment_8 ) ) ;
    public final void rule__Manual__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2924:1: ( ( ( rule__Manual__NextApproveAssignment_8 ) ) )
            // InternalAssign4.g:2925:1: ( ( rule__Manual__NextApproveAssignment_8 ) )
            {
            // InternalAssign4.g:2925:1: ( ( rule__Manual__NextApproveAssignment_8 ) )
            // InternalAssign4.g:2926:2: ( rule__Manual__NextApproveAssignment_8 )
            {
             before(grammarAccess.getManualAccess().getNextApproveAssignment_8()); 
            // InternalAssign4.g:2927:2: ( rule__Manual__NextApproveAssignment_8 )
            // InternalAssign4.g:2927:3: rule__Manual__NextApproveAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Manual__NextApproveAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getManualAccess().getNextApproveAssignment_8()); 

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
    // $ANTLR end "rule__Manual__Group__8__Impl"


    // $ANTLR start "rule__Manual__Group__9"
    // InternalAssign4.g:2935:1: rule__Manual__Group__9 : rule__Manual__Group__9__Impl rule__Manual__Group__10 ;
    public final void rule__Manual__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2939:1: ( rule__Manual__Group__9__Impl rule__Manual__Group__10 )
            // InternalAssign4.g:2940:2: rule__Manual__Group__9__Impl rule__Manual__Group__10
            {
            pushFollow(FOLLOW_38);
            rule__Manual__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__10();

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
    // $ANTLR end "rule__Manual__Group__9"


    // $ANTLR start "rule__Manual__Group__9__Impl"
    // InternalAssign4.g:2947:1: rule__Manual__Group__9__Impl : ( 'If' ) ;
    public final void rule__Manual__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2951:1: ( ( 'If' ) )
            // InternalAssign4.g:2952:1: ( 'If' )
            {
            // InternalAssign4.g:2952:1: ( 'If' )
            // InternalAssign4.g:2953:2: 'If'
            {
             before(grammarAccess.getManualAccess().getIfKeyword_9()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getIfKeyword_9()); 

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
    // $ANTLR end "rule__Manual__Group__9__Impl"


    // $ANTLR start "rule__Manual__Group__10"
    // InternalAssign4.g:2962:1: rule__Manual__Group__10 : rule__Manual__Group__10__Impl rule__Manual__Group__11 ;
    public final void rule__Manual__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2966:1: ( rule__Manual__Group__10__Impl rule__Manual__Group__11 )
            // InternalAssign4.g:2967:2: rule__Manual__Group__10__Impl rule__Manual__Group__11
            {
            pushFollow(FOLLOW_35);
            rule__Manual__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__11();

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
    // $ANTLR end "rule__Manual__Group__10"


    // $ANTLR start "rule__Manual__Group__10__Impl"
    // InternalAssign4.g:2974:1: rule__Manual__Group__10__Impl : ( 'rejected' ) ;
    public final void rule__Manual__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2978:1: ( ( 'rejected' ) )
            // InternalAssign4.g:2979:1: ( 'rejected' )
            {
            // InternalAssign4.g:2979:1: ( 'rejected' )
            // InternalAssign4.g:2980:2: 'rejected'
            {
             before(grammarAccess.getManualAccess().getRejectedKeyword_10()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getRejectedKeyword_10()); 

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
    // $ANTLR end "rule__Manual__Group__10__Impl"


    // $ANTLR start "rule__Manual__Group__11"
    // InternalAssign4.g:2989:1: rule__Manual__Group__11 : rule__Manual__Group__11__Impl rule__Manual__Group__12 ;
    public final void rule__Manual__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:2993:1: ( rule__Manual__Group__11__Impl rule__Manual__Group__12 )
            // InternalAssign4.g:2994:2: rule__Manual__Group__11__Impl rule__Manual__Group__12
            {
            pushFollow(FOLLOW_36);
            rule__Manual__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__12();

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
    // $ANTLR end "rule__Manual__Group__11"


    // $ANTLR start "rule__Manual__Group__11__Impl"
    // InternalAssign4.g:3001:1: rule__Manual__Group__11__Impl : ( 'jump' ) ;
    public final void rule__Manual__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3005:1: ( ( 'jump' ) )
            // InternalAssign4.g:3006:1: ( 'jump' )
            {
            // InternalAssign4.g:3006:1: ( 'jump' )
            // InternalAssign4.g:3007:2: 'jump'
            {
             before(grammarAccess.getManualAccess().getJumpKeyword_11()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getJumpKeyword_11()); 

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
    // $ANTLR end "rule__Manual__Group__11__Impl"


    // $ANTLR start "rule__Manual__Group__12"
    // InternalAssign4.g:3016:1: rule__Manual__Group__12 : rule__Manual__Group__12__Impl rule__Manual__Group__13 ;
    public final void rule__Manual__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3020:1: ( rule__Manual__Group__12__Impl rule__Manual__Group__13 )
            // InternalAssign4.g:3021:2: rule__Manual__Group__12__Impl rule__Manual__Group__13
            {
            pushFollow(FOLLOW_4);
            rule__Manual__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manual__Group__13();

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
    // $ANTLR end "rule__Manual__Group__12"


    // $ANTLR start "rule__Manual__Group__12__Impl"
    // InternalAssign4.g:3028:1: rule__Manual__Group__12__Impl : ( 'to:' ) ;
    public final void rule__Manual__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3032:1: ( ( 'to:' ) )
            // InternalAssign4.g:3033:1: ( 'to:' )
            {
            // InternalAssign4.g:3033:1: ( 'to:' )
            // InternalAssign4.g:3034:2: 'to:'
            {
             before(grammarAccess.getManualAccess().getToKeyword_12()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getManualAccess().getToKeyword_12()); 

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
    // $ANTLR end "rule__Manual__Group__12__Impl"


    // $ANTLR start "rule__Manual__Group__13"
    // InternalAssign4.g:3043:1: rule__Manual__Group__13 : rule__Manual__Group__13__Impl ;
    public final void rule__Manual__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3047:1: ( rule__Manual__Group__13__Impl )
            // InternalAssign4.g:3048:2: rule__Manual__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manual__Group__13__Impl();

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
    // $ANTLR end "rule__Manual__Group__13"


    // $ANTLR start "rule__Manual__Group__13__Impl"
    // InternalAssign4.g:3054:1: rule__Manual__Group__13__Impl : ( ( rule__Manual__NextRejectAssignment_13 ) ) ;
    public final void rule__Manual__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3058:1: ( ( ( rule__Manual__NextRejectAssignment_13 ) ) )
            // InternalAssign4.g:3059:1: ( ( rule__Manual__NextRejectAssignment_13 ) )
            {
            // InternalAssign4.g:3059:1: ( ( rule__Manual__NextRejectAssignment_13 ) )
            // InternalAssign4.g:3060:2: ( rule__Manual__NextRejectAssignment_13 )
            {
             before(grammarAccess.getManualAccess().getNextRejectAssignment_13()); 
            // InternalAssign4.g:3061:2: ( rule__Manual__NextRejectAssignment_13 )
            // InternalAssign4.g:3061:3: rule__Manual__NextRejectAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Manual__NextRejectAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getManualAccess().getNextRejectAssignment_13()); 

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
    // $ANTLR end "rule__Manual__Group__13__Impl"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalAssign4.g:3070:1: rule__Model__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3074:1: ( ( ruleEString ) )
            // InternalAssign4.g:3075:2: ( ruleEString )
            {
            // InternalAssign4.g:3075:2: ( ruleEString )
            // InternalAssign4.g:3076:3: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__SubjectAssignment_5"
    // InternalAssign4.g:3085:1: rule__Model__SubjectAssignment_5 : ( ruleSubject ) ;
    public final void rule__Model__SubjectAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3089:1: ( ( ruleSubject ) )
            // InternalAssign4.g:3090:2: ( ruleSubject )
            {
            // InternalAssign4.g:3090:2: ( ruleSubject )
            // InternalAssign4.g:3091:3: ruleSubject
            {
             before(grammarAccess.getModelAccess().getSubjectSubjectParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSubject();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSubjectSubjectParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__SubjectAssignment_5"


    // $ANTLR start "rule__Subject__NameAssignment_0"
    // InternalAssign4.g:3100:1: rule__Subject__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Subject__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3104:1: ( ( ruleEString ) )
            // InternalAssign4.g:3105:2: ( ruleEString )
            {
            // InternalAssign4.g:3105:2: ( ruleEString )
            // InternalAssign4.g:3106:3: ruleEString
            {
             before(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Subject__NameAssignment_0"


    // $ANTLR start "rule__Subject__FeatureAssignment_3_1"
    // InternalAssign4.g:3115:1: rule__Subject__FeatureAssignment_3_1 : ( ruleFeature ) ;
    public final void rule__Subject__FeatureAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3119:1: ( ( ruleFeature ) )
            // InternalAssign4.g:3120:2: ( ruleFeature )
            {
            // InternalAssign4.g:3120:2: ( ruleFeature )
            // InternalAssign4.g:3121:3: ruleFeature
            {
             before(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Subject__FeatureAssignment_3_1"


    // $ANTLR start "rule__Subject__FeatureAssignment_3_2_1"
    // InternalAssign4.g:3130:1: rule__Subject__FeatureAssignment_3_2_1 : ( ruleFeature ) ;
    public final void rule__Subject__FeatureAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3134:1: ( ( ruleFeature ) )
            // InternalAssign4.g:3135:2: ( ruleFeature )
            {
            // InternalAssign4.g:3135:2: ( ruleFeature )
            // InternalAssign4.g:3136:3: ruleFeature
            {
             before(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__Subject__FeatureAssignment_3_2_1"


    // $ANTLR start "rule__Subject__UserFeedbackAssignment_6"
    // InternalAssign4.g:3145:1: rule__Subject__UserFeedbackAssignment_6 : ( ruleUserFeedback ) ;
    public final void rule__Subject__UserFeedbackAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3149:1: ( ( ruleUserFeedback ) )
            // InternalAssign4.g:3150:2: ( ruleUserFeedback )
            {
            // InternalAssign4.g:3150:2: ( ruleUserFeedback )
            // InternalAssign4.g:3151:3: ruleUserFeedback
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleUserFeedback();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Subject__UserFeedbackAssignment_6"


    // $ANTLR start "rule__Subject__UserFeedbackAssignment_7_1"
    // InternalAssign4.g:3160:1: rule__Subject__UserFeedbackAssignment_7_1 : ( ruleUserFeedback ) ;
    public final void rule__Subject__UserFeedbackAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3164:1: ( ( ruleUserFeedback ) )
            // InternalAssign4.g:3165:2: ( ruleUserFeedback )
            {
            // InternalAssign4.g:3165:2: ( ruleUserFeedback )
            // InternalAssign4.g:3166:3: ruleUserFeedback
            {
             before(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUserFeedback();

            state._fsp--;

             after(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Subject__UserFeedbackAssignment_7_1"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalAssign4.g:3175:1: rule__Feature__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3179:1: ( ( ruleEString ) )
            // InternalAssign4.g:3180:2: ( ruleEString )
            {
            // InternalAssign4.g:3180:2: ( ruleEString )
            // InternalAssign4.g:3181:3: ruleEString
            {
             before(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Review__NameAssignment_2"
    // InternalAssign4.g:3190:1: rule__Review__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Review__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3194:1: ( ( ruleEString ) )
            // InternalAssign4.g:3195:2: ( ruleEString )
            {
            // InternalAssign4.g:3195:2: ( ruleEString )
            // InternalAssign4.g:3196:3: ruleEString
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
    // InternalAssign4.g:3205:1: rule__Review__GradeTypeAssignment_4_1 : ( ruleGradeType ) ;
    public final void rule__Review__GradeTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3209:1: ( ( ruleGradeType ) )
            // InternalAssign4.g:3210:2: ( ruleGradeType )
            {
            // InternalAssign4.g:3210:2: ( ruleGradeType )
            // InternalAssign4.g:3211:3: ruleGradeType
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
    // InternalAssign4.g:3220:1: rule__Review__ReviewTypeAssignment_5_1 : ( ruleReviewType ) ;
    public final void rule__Review__ReviewTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3224:1: ( ( ruleReviewType ) )
            // InternalAssign4.g:3225:2: ( ruleReviewType )
            {
            // InternalAssign4.g:3225:2: ( ruleReviewType )
            // InternalAssign4.g:3226:3: ruleReviewType
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


    // $ANTLR start "rule__Comment__NameAssignment_2"
    // InternalAssign4.g:3235:1: rule__Comment__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Comment__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3239:1: ( ( ruleEString ) )
            // InternalAssign4.g:3240:2: ( ruleEString )
            {
            // InternalAssign4.g:3240:2: ( ruleEString )
            // InternalAssign4.g:3241:3: ruleEString
            {
             before(grammarAccess.getCommentAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCommentAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Comment__NameAssignment_2"


    // $ANTLR start "rule__Comment__ReplyAssignment_4"
    // InternalAssign4.g:3250:1: rule__Comment__ReplyAssignment_4 : ( ( 'reply' ) ) ;
    public final void rule__Comment__ReplyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3254:1: ( ( ( 'reply' ) ) )
            // InternalAssign4.g:3255:2: ( ( 'reply' ) )
            {
            // InternalAssign4.g:3255:2: ( ( 'reply' ) )
            // InternalAssign4.g:3256:3: ( 'reply' )
            {
             before(grammarAccess.getCommentAccess().getReplyReplyKeyword_4_0()); 
            // InternalAssign4.g:3257:3: ( 'reply' )
            // InternalAssign4.g:3258:4: 'reply'
            {
             before(grammarAccess.getCommentAccess().getReplyReplyKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getReplyReplyKeyword_4_0()); 

            }

             after(grammarAccess.getCommentAccess().getReplyReplyKeyword_4_0()); 

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
    // $ANTLR end "rule__Comment__ReplyAssignment_4"


    // $ANTLR start "rule__Comment__ModerationAssignment_6"
    // InternalAssign4.g:3269:1: rule__Comment__ModerationAssignment_6 : ( ( 'moderation' ) ) ;
    public final void rule__Comment__ModerationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3273:1: ( ( ( 'moderation' ) ) )
            // InternalAssign4.g:3274:2: ( ( 'moderation' ) )
            {
            // InternalAssign4.g:3274:2: ( ( 'moderation' ) )
            // InternalAssign4.g:3275:3: ( 'moderation' )
            {
             before(grammarAccess.getCommentAccess().getModerationModerationKeyword_6_0()); 
            // InternalAssign4.g:3276:3: ( 'moderation' )
            // InternalAssign4.g:3277:4: 'moderation'
            {
             before(grammarAccess.getCommentAccess().getModerationModerationKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCommentAccess().getModerationModerationKeyword_6_0()); 

            }

             after(grammarAccess.getCommentAccess().getModerationModerationKeyword_6_0()); 

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
    // $ANTLR end "rule__Comment__ModerationAssignment_6"


    // $ANTLR start "rule__Comment__CommentTypeAssignment_8_2"
    // InternalAssign4.g:3288:1: rule__Comment__CommentTypeAssignment_8_2 : ( ruleCommentType ) ;
    public final void rule__Comment__CommentTypeAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3292:1: ( ( ruleCommentType ) )
            // InternalAssign4.g:3293:2: ( ruleCommentType )
            {
            // InternalAssign4.g:3293:2: ( ruleCommentType )
            // InternalAssign4.g:3294:3: ruleCommentType
            {
             before(grammarAccess.getCommentAccess().getCommentTypeCommentTypeEnumRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCommentType();

            state._fsp--;

             after(grammarAccess.getCommentAccess().getCommentTypeCommentTypeEnumRuleCall_8_2_0()); 

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
    // $ANTLR end "rule__Comment__CommentTypeAssignment_8_2"


    // $ANTLR start "rule__Comment__ModerationProcessAssignment_9_3"
    // InternalAssign4.g:3303:1: rule__Comment__ModerationProcessAssignment_9_3 : ( ruleModerationProcess ) ;
    public final void rule__Comment__ModerationProcessAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3307:1: ( ( ruleModerationProcess ) )
            // InternalAssign4.g:3308:2: ( ruleModerationProcess )
            {
            // InternalAssign4.g:3308:2: ( ruleModerationProcess )
            // InternalAssign4.g:3309:3: ruleModerationProcess
            {
             before(grammarAccess.getCommentAccess().getModerationProcessModerationProcessParserRuleCall_9_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModerationProcess();

            state._fsp--;

             after(grammarAccess.getCommentAccess().getModerationProcessModerationProcessParserRuleCall_9_3_0()); 

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
    // $ANTLR end "rule__Comment__ModerationProcessAssignment_9_3"


    // $ANTLR start "rule__ModerationProcess__NameAssignment_0"
    // InternalAssign4.g:3318:1: rule__ModerationProcess__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ModerationProcess__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3322:1: ( ( ruleEString ) )
            // InternalAssign4.g:3323:2: ( ruleEString )
            {
            // InternalAssign4.g:3323:2: ( ruleEString )
            // InternalAssign4.g:3324:3: ruleEString
            {
             before(grammarAccess.getModerationProcessAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModerationProcessAccess().getNameEStringParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ModerationProcess__NameAssignment_0"


    // $ANTLR start "rule__ModerationProcess__StartStepAssignment_4"
    // InternalAssign4.g:3333:1: rule__ModerationProcess__StartStepAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__ModerationProcess__StartStepAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3337:1: ( ( ( ruleEString ) ) )
            // InternalAssign4.g:3338:2: ( ( ruleEString ) )
            {
            // InternalAssign4.g:3338:2: ( ( ruleEString ) )
            // InternalAssign4.g:3339:3: ( ruleEString )
            {
             before(grammarAccess.getModerationProcessAccess().getStartStepValidationStepCrossReference_4_0()); 
            // InternalAssign4.g:3340:3: ( ruleEString )
            // InternalAssign4.g:3341:4: ruleEString
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


    // $ANTLR start "rule__ModerationProcess__StepAssignment_5_0"
    // InternalAssign4.g:3352:1: rule__ModerationProcess__StepAssignment_5_0 : ( ruleStep ) ;
    public final void rule__ModerationProcess__StepAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3356:1: ( ( ruleStep ) )
            // InternalAssign4.g:3357:2: ( ruleStep )
            {
            // InternalAssign4.g:3357:2: ( ruleStep )
            // InternalAssign4.g:3358:3: ruleStep
            {
             before(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__ModerationProcess__StepAssignment_5_0"


    // $ANTLR start "rule__ModerationProcess__StepAssignment_5_1"
    // InternalAssign4.g:3367:1: rule__ModerationProcess__StepAssignment_5_1 : ( ruleStep ) ;
    public final void rule__ModerationProcess__StepAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3371:1: ( ( ruleStep ) )
            // InternalAssign4.g:3372:2: ( ruleStep )
            {
            // InternalAssign4.g:3372:2: ( ruleStep )
            // InternalAssign4.g:3373:3: ruleStep
            {
             before(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__ModerationProcess__StepAssignment_5_1"


    // $ANTLR start "rule__End__NameAssignment_3"
    // InternalAssign4.g:3382:1: rule__End__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__End__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3386:1: ( ( ruleEString ) )
            // InternalAssign4.g:3387:2: ( ruleEString )
            {
            // InternalAssign4.g:3387:2: ( ruleEString )
            // InternalAssign4.g:3388:3: ruleEString
            {
             before(grammarAccess.getEndAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEndAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__End__NameAssignment_3"


    // $ANTLR start "rule__Automatic__NameAssignment_3"
    // InternalAssign4.g:3397:1: rule__Automatic__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Automatic__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3401:1: ( ( ruleEString ) )
            // InternalAssign4.g:3402:2: ( ruleEString )
            {
            // InternalAssign4.g:3402:2: ( ruleEString )
            // InternalAssign4.g:3403:3: ruleEString
            {
             before(grammarAccess.getAutomaticAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomaticAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Automatic__NameAssignment_3"


    // $ANTLR start "rule__Automatic__MethodAssignment_4_1"
    // InternalAssign4.g:3412:1: rule__Automatic__MethodAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Automatic__MethodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3416:1: ( ( ruleEString ) )
            // InternalAssign4.g:3417:2: ( ruleEString )
            {
            // InternalAssign4.g:3417:2: ( ruleEString )
            // InternalAssign4.g:3418:3: ruleEString
            {
             before(grammarAccess.getAutomaticAccess().getMethodEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomaticAccess().getMethodEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Automatic__MethodAssignment_4_1"


    // $ANTLR start "rule__Automatic__NextApproveAssignment_9"
    // InternalAssign4.g:3427:1: rule__Automatic__NextApproveAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Automatic__NextApproveAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3431:1: ( ( ( ruleEString ) ) )
            // InternalAssign4.g:3432:2: ( ( ruleEString ) )
            {
            // InternalAssign4.g:3432:2: ( ( ruleEString ) )
            // InternalAssign4.g:3433:3: ( ruleEString )
            {
             before(grammarAccess.getAutomaticAccess().getNextApproveStepCrossReference_9_0()); 
            // InternalAssign4.g:3434:3: ( ruleEString )
            // InternalAssign4.g:3435:4: ruleEString
            {
             before(grammarAccess.getAutomaticAccess().getNextApproveStepEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomaticAccess().getNextApproveStepEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getAutomaticAccess().getNextApproveStepCrossReference_9_0()); 

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
    // $ANTLR end "rule__Automatic__NextApproveAssignment_9"


    // $ANTLR start "rule__Automatic__NextRejectAssignment_14"
    // InternalAssign4.g:3446:1: rule__Automatic__NextRejectAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__Automatic__NextRejectAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3450:1: ( ( ( ruleEString ) ) )
            // InternalAssign4.g:3451:2: ( ( ruleEString ) )
            {
            // InternalAssign4.g:3451:2: ( ( ruleEString ) )
            // InternalAssign4.g:3452:3: ( ruleEString )
            {
             before(grammarAccess.getAutomaticAccess().getNextRejectStepCrossReference_14_0()); 
            // InternalAssign4.g:3453:3: ( ruleEString )
            // InternalAssign4.g:3454:4: ruleEString
            {
             before(grammarAccess.getAutomaticAccess().getNextRejectStepEStringParserRuleCall_14_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutomaticAccess().getNextRejectStepEStringParserRuleCall_14_0_1()); 

            }

             after(grammarAccess.getAutomaticAccess().getNextRejectStepCrossReference_14_0()); 

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
    // $ANTLR end "rule__Automatic__NextRejectAssignment_14"


    // $ANTLR start "rule__Manual__NameAssignment_3"
    // InternalAssign4.g:3465:1: rule__Manual__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Manual__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3469:1: ( ( ruleEString ) )
            // InternalAssign4.g:3470:2: ( ruleEString )
            {
            // InternalAssign4.g:3470:2: ( ruleEString )
            // InternalAssign4.g:3471:3: ruleEString
            {
             before(grammarAccess.getManualAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManualAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Manual__NameAssignment_3"


    // $ANTLR start "rule__Manual__NextApproveAssignment_8"
    // InternalAssign4.g:3480:1: rule__Manual__NextApproveAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Manual__NextApproveAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3484:1: ( ( ( ruleEString ) ) )
            // InternalAssign4.g:3485:2: ( ( ruleEString ) )
            {
            // InternalAssign4.g:3485:2: ( ( ruleEString ) )
            // InternalAssign4.g:3486:3: ( ruleEString )
            {
             before(grammarAccess.getManualAccess().getNextApproveStepCrossReference_8_0()); 
            // InternalAssign4.g:3487:3: ( ruleEString )
            // InternalAssign4.g:3488:4: ruleEString
            {
             before(grammarAccess.getManualAccess().getNextApproveStepEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManualAccess().getNextApproveStepEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getManualAccess().getNextApproveStepCrossReference_8_0()); 

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
    // $ANTLR end "rule__Manual__NextApproveAssignment_8"


    // $ANTLR start "rule__Manual__NextRejectAssignment_13"
    // InternalAssign4.g:3499:1: rule__Manual__NextRejectAssignment_13 : ( ( ruleEString ) ) ;
    public final void rule__Manual__NextRejectAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAssign4.g:3503:1: ( ( ( ruleEString ) ) )
            // InternalAssign4.g:3504:2: ( ( ruleEString ) )
            {
            // InternalAssign4.g:3504:2: ( ( ruleEString ) )
            // InternalAssign4.g:3505:3: ( ruleEString )
            {
             before(grammarAccess.getManualAccess().getNextRejectStepCrossReference_13_0()); 
            // InternalAssign4.g:3506:3: ( ruleEString )
            // InternalAssign4.g:3507:4: ruleEString
            {
             before(grammarAccess.getManualAccess().getNextRejectStepEStringParserRuleCall_13_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getManualAccess().getNextRejectStepEStringParserRuleCall_13_0_1()); 

            }

             after(grammarAccess.getManualAccess().getNextRejectStepCrossReference_13_0()); 

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
    // $ANTLR end "rule__Manual__NextRejectAssignment_13"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002030000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002030000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});

}