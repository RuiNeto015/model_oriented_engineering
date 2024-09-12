package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.Assign5GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssign5Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'subject'", "'}'", "'Subject'", "'userFeedback'", "','", "'feature'", "'Feature'", "'Review'", "'gradeType'", "'reviewType'", "'reply'", "'moderation'", "'Comment'", "'commentType'", "'moderationProcess'", "'ModerationProcess'", "'startStep'", "'step'", "'End'", "'Automatic'", "'method'", "'nextApprove'", "'nextReject'", "'Manual'", "'CUSTOM'", "'STARS'", "'ONLYGRADE'", "'ANNOTATED'", "'SIMPLE'", "'RICHTEXT'"
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


        public InternalAssign5Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAssign5Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAssign5Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalAssign5.g"; }



     	private Assign5GrammarAccess grammarAccess;

        public InternalAssign5Parser(TokenStream input, Assign5GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Assign5GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAssign5.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAssign5.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalAssign5.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAssign5.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'subject' ( (lv_subject_4_0= ruleSubject ) ) otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_subject_4_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:78:2: ( (otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'subject' ( (lv_subject_4_0= ruleSubject ) ) otherlv_5= '}' ) )
            // InternalAssign5.g:79:2: (otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'subject' ( (lv_subject_4_0= ruleSubject ) ) otherlv_5= '}' )
            {
            // InternalAssign5.g:79:2: (otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'subject' ( (lv_subject_4_0= ruleSubject ) ) otherlv_5= '}' )
            // InternalAssign5.g:80:3: otherlv_0= 'Model' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'subject' ( (lv_subject_4_0= ruleSubject ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalAssign5.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAssign5.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalAssign5.g:85:4: (lv_name_1_0= ruleEString )
            // InternalAssign5.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getSubjectKeyword_3());
            		
            // InternalAssign5.g:111:3: ( (lv_subject_4_0= ruleSubject ) )
            // InternalAssign5.g:112:4: (lv_subject_4_0= ruleSubject )
            {
            // InternalAssign5.g:112:4: (lv_subject_4_0= ruleSubject )
            // InternalAssign5.g:113:5: lv_subject_4_0= ruleSubject
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSubjectSubjectParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_subject_4_0=ruleSubject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"subject",
            						lv_subject_4_0,
            						"org.xtext.example.mydsl.Assign5.Subject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUserFeedback"
    // InternalAssign5.g:138:1: entryRuleUserFeedback returns [EObject current=null] : iv_ruleUserFeedback= ruleUserFeedback EOF ;
    public final EObject entryRuleUserFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserFeedback = null;


        try {
            // InternalAssign5.g:138:53: (iv_ruleUserFeedback= ruleUserFeedback EOF )
            // InternalAssign5.g:139:2: iv_ruleUserFeedback= ruleUserFeedback EOF
            {
             newCompositeNode(grammarAccess.getUserFeedbackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserFeedback=ruleUserFeedback();

            state._fsp--;

             current =iv_ruleUserFeedback; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUserFeedback"


    // $ANTLR start "ruleUserFeedback"
    // InternalAssign5.g:145:1: ruleUserFeedback returns [EObject current=null] : (this_Review_0= ruleReview | this_Comment_1= ruleComment ) ;
    public final EObject ruleUserFeedback() throws RecognitionException {
        EObject current = null;

        EObject this_Review_0 = null;

        EObject this_Comment_1 = null;



        	enterRule();

        try {
            // InternalAssign5.g:151:2: ( (this_Review_0= ruleReview | this_Comment_1= ruleComment ) )
            // InternalAssign5.g:152:2: (this_Review_0= ruleReview | this_Comment_1= ruleComment )
            {
            // InternalAssign5.g:152:2: (this_Review_0= ruleReview | this_Comment_1= ruleComment )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAssign5.g:153:3: this_Review_0= ruleReview
                    {

                    			newCompositeNode(grammarAccess.getUserFeedbackAccess().getReviewParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Review_0=ruleReview();

                    state._fsp--;


                    			current = this_Review_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAssign5.g:162:3: this_Comment_1= ruleComment
                    {

                    			newCompositeNode(grammarAccess.getUserFeedbackAccess().getCommentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comment_1=ruleComment();

                    state._fsp--;


                    			current = this_Comment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUserFeedback"


    // $ANTLR start "entryRuleStep"
    // InternalAssign5.g:174:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalAssign5.g:174:45: (iv_ruleStep= ruleStep EOF )
            // InternalAssign5.g:175:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalAssign5.g:181:1: ruleStep returns [EObject current=null] : (this_End_0= ruleEnd | this_Automatic_1= ruleAutomatic | this_Manual_2= ruleManual ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_End_0 = null;

        EObject this_Automatic_1 = null;

        EObject this_Manual_2 = null;



        	enterRule();

        try {
            // InternalAssign5.g:187:2: ( (this_End_0= ruleEnd | this_Automatic_1= ruleAutomatic | this_Manual_2= ruleManual ) )
            // InternalAssign5.g:188:2: (this_End_0= ruleEnd | this_Automatic_1= ruleAutomatic | this_Manual_2= ruleManual )
            {
            // InternalAssign5.g:188:2: (this_End_0= ruleEnd | this_Automatic_1= ruleAutomatic | this_Manual_2= ruleManual )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 36:
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
                    // InternalAssign5.g:189:3: this_End_0= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getEndParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_0=ruleEnd();

                    state._fsp--;


                    			current = this_End_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAssign5.g:198:3: this_Automatic_1= ruleAutomatic
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getAutomaticParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Automatic_1=ruleAutomatic();

                    state._fsp--;


                    			current = this_Automatic_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAssign5.g:207:3: this_Manual_2= ruleManual
                    {

                    			newCompositeNode(grammarAccess.getStepAccess().getManualParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Manual_2=ruleManual();

                    state._fsp--;


                    			current = this_Manual_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleSubject"
    // InternalAssign5.g:219:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalAssign5.g:219:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalAssign5.g:220:2: iv_ruleSubject= ruleSubject EOF
            {
             newCompositeNode(grammarAccess.getSubjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubject=ruleSubject();

            state._fsp--;

             current =iv_ruleSubject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalAssign5.g:226:1: ruleSubject returns [EObject current=null] : (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'userFeedback' otherlv_4= '{' ( (lv_userFeedback_5_0= ruleUserFeedback ) ) (otherlv_6= ',' ( (lv_userFeedback_7_0= ruleUserFeedback ) ) )* otherlv_8= '}' (otherlv_9= 'feature' otherlv_10= '{' ( (lv_feature_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_userFeedback_5_0 = null;

        EObject lv_userFeedback_7_0 = null;

        EObject lv_feature_11_0 = null;

        EObject lv_feature_13_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:232:2: ( (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'userFeedback' otherlv_4= '{' ( (lv_userFeedback_5_0= ruleUserFeedback ) ) (otherlv_6= ',' ( (lv_userFeedback_7_0= ruleUserFeedback ) ) )* otherlv_8= '}' (otherlv_9= 'feature' otherlv_10= '{' ( (lv_feature_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalAssign5.g:233:2: (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'userFeedback' otherlv_4= '{' ( (lv_userFeedback_5_0= ruleUserFeedback ) ) (otherlv_6= ',' ( (lv_userFeedback_7_0= ruleUserFeedback ) ) )* otherlv_8= '}' (otherlv_9= 'feature' otherlv_10= '{' ( (lv_feature_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalAssign5.g:233:2: (otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'userFeedback' otherlv_4= '{' ( (lv_userFeedback_5_0= ruleUserFeedback ) ) (otherlv_6= ',' ( (lv_userFeedback_7_0= ruleUserFeedback ) ) )* otherlv_8= '}' (otherlv_9= 'feature' otherlv_10= '{' ( (lv_feature_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalAssign5.g:234:3: otherlv_0= 'Subject' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'userFeedback' otherlv_4= '{' ( (lv_userFeedback_5_0= ruleUserFeedback ) ) (otherlv_6= ',' ( (lv_userFeedback_7_0= ruleUserFeedback ) ) )* otherlv_8= '}' (otherlv_9= 'feature' otherlv_10= '{' ( (lv_feature_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubjectAccess().getSubjectKeyword_0());
            		
            // InternalAssign5.g:238:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAssign5.g:239:4: (lv_name_1_0= ruleEString )
            {
            // InternalAssign5.g:239:4: (lv_name_1_0= ruleEString )
            // InternalAssign5.g:240:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSubjectAccess().getUserFeedbackKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAssign5.g:269:3: ( (lv_userFeedback_5_0= ruleUserFeedback ) )
            // InternalAssign5.g:270:4: (lv_userFeedback_5_0= ruleUserFeedback )
            {
            // InternalAssign5.g:270:4: (lv_userFeedback_5_0= ruleUserFeedback )
            // InternalAssign5.g:271:5: lv_userFeedback_5_0= ruleUserFeedback
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_userFeedback_5_0=ruleUserFeedback();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubjectRule());
            					}
            					add(
            						current,
            						"userFeedback",
            						lv_userFeedback_5_0,
            						"org.xtext.example.mydsl.Assign5.UserFeedback");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssign5.g:288:3: (otherlv_6= ',' ( (lv_userFeedback_7_0= ruleUserFeedback ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAssign5.g:289:4: otherlv_6= ',' ( (lv_userFeedback_7_0= ruleUserFeedback ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSubjectAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAssign5.g:293:4: ( (lv_userFeedback_7_0= ruleUserFeedback ) )
            	    // InternalAssign5.g:294:5: (lv_userFeedback_7_0= ruleUserFeedback )
            	    {
            	    // InternalAssign5.g:294:5: (lv_userFeedback_7_0= ruleUserFeedback )
            	    // InternalAssign5.g:295:6: lv_userFeedback_7_0= ruleUserFeedback
            	    {

            	    						newCompositeNode(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_userFeedback_7_0=ruleUserFeedback();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"userFeedback",
            	    							lv_userFeedback_7_0,
            	    							"org.xtext.example.mydsl.Assign5.UserFeedback");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalAssign5.g:317:3: (otherlv_9= 'feature' otherlv_10= '{' ( (lv_feature_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) ) )* otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAssign5.g:318:4: otherlv_9= 'feature' otherlv_10= '{' ( (lv_feature_11_0= ruleFeature ) ) (otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubjectAccess().getFeatureKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getSubjectAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalAssign5.g:326:4: ( (lv_feature_11_0= ruleFeature ) )
                    // InternalAssign5.g:327:5: (lv_feature_11_0= ruleFeature )
                    {
                    // InternalAssign5.g:327:5: (lv_feature_11_0= ruleFeature )
                    // InternalAssign5.g:328:6: lv_feature_11_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_feature_11_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubjectRule());
                    						}
                    						add(
                    							current,
                    							"feature",
                    							lv_feature_11_0,
                    							"org.xtext.example.mydsl.Assign5.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAssign5.g:345:4: (otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAssign5.g:346:5: otherlv_12= ',' ( (lv_feature_13_0= ruleFeature ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSubjectAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalAssign5.g:350:5: ( (lv_feature_13_0= ruleFeature ) )
                    	    // InternalAssign5.g:351:6: (lv_feature_13_0= ruleFeature )
                    	    {
                    	    // InternalAssign5.g:351:6: (lv_feature_13_0= ruleFeature )
                    	    // InternalAssign5.g:352:7: lv_feature_13_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_feature_13_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feature",
                    	    								lv_feature_13_0,
                    	    								"org.xtext.example.mydsl.Assign5.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSubjectAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRuleEString"
    // InternalAssign5.g:383:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAssign5.g:383:47: (iv_ruleEString= ruleEString EOF )
            // InternalAssign5.g:384:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAssign5.g:390:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAssign5.g:396:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAssign5.g:397:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAssign5.g:397:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAssign5.g:398:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAssign5.g:406:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFeature"
    // InternalAssign5.g:417:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAssign5.g:417:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAssign5.g:418:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalAssign5.g:424:1: ruleFeature returns [EObject current=null] : ( () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:430:2: ( ( () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalAssign5.g:431:2: ( () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalAssign5.g:431:2: ( () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) ) )
            // InternalAssign5.g:432:3: () otherlv_1= 'Feature' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalAssign5.g:432:3: ()
            // InternalAssign5.g:433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureAccess().getFeatureAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getFeatureKeyword_1());
            		
            // InternalAssign5.g:443:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAssign5.g:444:4: (lv_name_2_0= ruleEString )
            {
            // InternalAssign5.g:444:4: (lv_name_2_0= ruleEString )
            // InternalAssign5.g:445:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleReview"
    // InternalAssign5.g:466:1: entryRuleReview returns [EObject current=null] : iv_ruleReview= ruleReview EOF ;
    public final EObject entryRuleReview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReview = null;


        try {
            // InternalAssign5.g:466:47: (iv_ruleReview= ruleReview EOF )
            // InternalAssign5.g:467:2: iv_ruleReview= ruleReview EOF
            {
             newCompositeNode(grammarAccess.getReviewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReview=ruleReview();

            state._fsp--;

             current =iv_ruleReview; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReview"


    // $ANTLR start "ruleReview"
    // InternalAssign5.g:473:1: ruleReview returns [EObject current=null] : ( () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleReview() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_gradeType_5_0 = null;

        Enumerator lv_reviewType_7_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:479:2: ( ( () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}' ) )
            // InternalAssign5.g:480:2: ( () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}' )
            {
            // InternalAssign5.g:480:2: ( () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}' )
            // InternalAssign5.g:481:3: () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}'
            {
            // InternalAssign5.g:481:3: ()
            // InternalAssign5.g:482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReviewAccess().getReviewAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReviewAccess().getReviewKeyword_1());
            		
            // InternalAssign5.g:492:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAssign5.g:493:4: (lv_name_2_0= ruleEString )
            {
            // InternalAssign5.g:493:4: (lv_name_2_0= ruleEString )
            // InternalAssign5.g:494:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReviewAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReviewRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAssign5.g:515:3: (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAssign5.g:516:4: otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getReviewAccess().getGradeTypeKeyword_4_0());
                    			
                    // InternalAssign5.g:520:4: ( (lv_gradeType_5_0= ruleGradeType ) )
                    // InternalAssign5.g:521:5: (lv_gradeType_5_0= ruleGradeType )
                    {
                    // InternalAssign5.g:521:5: (lv_gradeType_5_0= ruleGradeType )
                    // InternalAssign5.g:522:6: lv_gradeType_5_0= ruleGradeType
                    {

                    						newCompositeNode(grammarAccess.getReviewAccess().getGradeTypeGradeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_gradeType_5_0=ruleGradeType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReviewRule());
                    						}
                    						set(
                    							current,
                    							"gradeType",
                    							lv_gradeType_5_0,
                    							"org.xtext.example.mydsl.Assign5.GradeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAssign5.g:540:3: (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAssign5.g:541:4: otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getReviewAccess().getReviewTypeKeyword_5_0());
                    			
                    // InternalAssign5.g:545:4: ( (lv_reviewType_7_0= ruleReviewType ) )
                    // InternalAssign5.g:546:5: (lv_reviewType_7_0= ruleReviewType )
                    {
                    // InternalAssign5.g:546:5: (lv_reviewType_7_0= ruleReviewType )
                    // InternalAssign5.g:547:6: lv_reviewType_7_0= ruleReviewType
                    {

                    						newCompositeNode(grammarAccess.getReviewAccess().getReviewTypeReviewTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_reviewType_7_0=ruleReviewType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReviewRule());
                    						}
                    						set(
                    							current,
                    							"reviewType",
                    							lv_reviewType_7_0,
                    							"org.xtext.example.mydsl.Assign5.ReviewType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getReviewAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReview"


    // $ANTLR start "entryRuleComment"
    // InternalAssign5.g:573:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalAssign5.g:573:48: (iv_ruleComment= ruleComment EOF )
            // InternalAssign5.g:574:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalAssign5.g:580:1: ruleComment returns [EObject current=null] : ( ( (lv_reply_0_0= 'reply' ) ) ( (lv_moderation_1_0= 'moderation' ) ) otherlv_2= 'Comment' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'commentType' ( (lv_commentType_6_0= ruleCommentType ) ) )? (otherlv_7= 'moderationProcess' ( (lv_moderationProcess_8_0= ruleModerationProcess ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_reply_0_0=null;
        Token lv_moderation_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_commentType_6_0 = null;

        EObject lv_moderationProcess_8_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:586:2: ( ( ( (lv_reply_0_0= 'reply' ) ) ( (lv_moderation_1_0= 'moderation' ) ) otherlv_2= 'Comment' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'commentType' ( (lv_commentType_6_0= ruleCommentType ) ) )? (otherlv_7= 'moderationProcess' ( (lv_moderationProcess_8_0= ruleModerationProcess ) ) )? otherlv_9= '}' ) )
            // InternalAssign5.g:587:2: ( ( (lv_reply_0_0= 'reply' ) ) ( (lv_moderation_1_0= 'moderation' ) ) otherlv_2= 'Comment' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'commentType' ( (lv_commentType_6_0= ruleCommentType ) ) )? (otherlv_7= 'moderationProcess' ( (lv_moderationProcess_8_0= ruleModerationProcess ) ) )? otherlv_9= '}' )
            {
            // InternalAssign5.g:587:2: ( ( (lv_reply_0_0= 'reply' ) ) ( (lv_moderation_1_0= 'moderation' ) ) otherlv_2= 'Comment' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'commentType' ( (lv_commentType_6_0= ruleCommentType ) ) )? (otherlv_7= 'moderationProcess' ( (lv_moderationProcess_8_0= ruleModerationProcess ) ) )? otherlv_9= '}' )
            // InternalAssign5.g:588:3: ( (lv_reply_0_0= 'reply' ) ) ( (lv_moderation_1_0= 'moderation' ) ) otherlv_2= 'Comment' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'commentType' ( (lv_commentType_6_0= ruleCommentType ) ) )? (otherlv_7= 'moderationProcess' ( (lv_moderationProcess_8_0= ruleModerationProcess ) ) )? otherlv_9= '}'
            {
            // InternalAssign5.g:588:3: ( (lv_reply_0_0= 'reply' ) )
            // InternalAssign5.g:589:4: (lv_reply_0_0= 'reply' )
            {
            // InternalAssign5.g:589:4: (lv_reply_0_0= 'reply' )
            // InternalAssign5.g:590:5: lv_reply_0_0= 'reply'
            {
            lv_reply_0_0=(Token)match(input,23,FOLLOW_17); 

            					newLeafNode(lv_reply_0_0, grammarAccess.getCommentAccess().getReplyReplyKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(current, "reply", lv_reply_0_0 != null, "reply");
            				

            }


            }

            // InternalAssign5.g:602:3: ( (lv_moderation_1_0= 'moderation' ) )
            // InternalAssign5.g:603:4: (lv_moderation_1_0= 'moderation' )
            {
            // InternalAssign5.g:603:4: (lv_moderation_1_0= 'moderation' )
            // InternalAssign5.g:604:5: lv_moderation_1_0= 'moderation'
            {
            lv_moderation_1_0=(Token)match(input,24,FOLLOW_18); 

            					newLeafNode(lv_moderation_1_0, grammarAccess.getCommentAccess().getModerationModerationKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(current, "moderation", lv_moderation_1_0 != null, "moderation");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getCommentKeyword_2());
            		
            // InternalAssign5.g:620:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAssign5.g:621:4: (lv_name_3_0= ruleEString )
            {
            // InternalAssign5.g:621:4: (lv_name_3_0= ruleEString )
            // InternalAssign5.g:622:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAssign5.g:643:3: (otherlv_5= 'commentType' ( (lv_commentType_6_0= ruleCommentType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAssign5.g:644:4: otherlv_5= 'commentType' ( (lv_commentType_6_0= ruleCommentType ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommentAccess().getCommentTypeKeyword_5_0());
                    			
                    // InternalAssign5.g:648:4: ( (lv_commentType_6_0= ruleCommentType ) )
                    // InternalAssign5.g:649:5: (lv_commentType_6_0= ruleCommentType )
                    {
                    // InternalAssign5.g:649:5: (lv_commentType_6_0= ruleCommentType )
                    // InternalAssign5.g:650:6: lv_commentType_6_0= ruleCommentType
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getCommentTypeCommentTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_commentType_6_0=ruleCommentType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"commentType",
                    							lv_commentType_6_0,
                    							"org.xtext.example.mydsl.Assign5.CommentType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAssign5.g:668:3: (otherlv_7= 'moderationProcess' ( (lv_moderationProcess_8_0= ruleModerationProcess ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAssign5.g:669:4: otherlv_7= 'moderationProcess' ( (lv_moderationProcess_8_0= ruleModerationProcess ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommentAccess().getModerationProcessKeyword_6_0());
                    			
                    // InternalAssign5.g:673:4: ( (lv_moderationProcess_8_0= ruleModerationProcess ) )
                    // InternalAssign5.g:674:5: (lv_moderationProcess_8_0= ruleModerationProcess )
                    {
                    // InternalAssign5.g:674:5: (lv_moderationProcess_8_0= ruleModerationProcess )
                    // InternalAssign5.g:675:6: lv_moderationProcess_8_0= ruleModerationProcess
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getModerationProcessModerationProcessParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_moderationProcess_8_0=ruleModerationProcess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"moderationProcess",
                    							lv_moderationProcess_8_0,
                    							"org.xtext.example.mydsl.Assign5.ModerationProcess");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleModerationProcess"
    // InternalAssign5.g:701:1: entryRuleModerationProcess returns [EObject current=null] : iv_ruleModerationProcess= ruleModerationProcess EOF ;
    public final EObject entryRuleModerationProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModerationProcess = null;


        try {
            // InternalAssign5.g:701:58: (iv_ruleModerationProcess= ruleModerationProcess EOF )
            // InternalAssign5.g:702:2: iv_ruleModerationProcess= ruleModerationProcess EOF
            {
             newCompositeNode(grammarAccess.getModerationProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModerationProcess=ruleModerationProcess();

            state._fsp--;

             current =iv_ruleModerationProcess; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModerationProcess"


    // $ANTLR start "ruleModerationProcess"
    // InternalAssign5.g:708:1: ruleModerationProcess returns [EObject current=null] : (otherlv_0= 'ModerationProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startStep' ( ( ruleEString ) ) (otherlv_5= 'step' otherlv_6= '{' ( (lv_step_7_0= ruleStep ) ) (otherlv_8= ',' ( (lv_step_9_0= ruleStep ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleModerationProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_step_7_0 = null;

        EObject lv_step_9_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:714:2: ( (otherlv_0= 'ModerationProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startStep' ( ( ruleEString ) ) (otherlv_5= 'step' otherlv_6= '{' ( (lv_step_7_0= ruleStep ) ) (otherlv_8= ',' ( (lv_step_9_0= ruleStep ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalAssign5.g:715:2: (otherlv_0= 'ModerationProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startStep' ( ( ruleEString ) ) (otherlv_5= 'step' otherlv_6= '{' ( (lv_step_7_0= ruleStep ) ) (otherlv_8= ',' ( (lv_step_9_0= ruleStep ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalAssign5.g:715:2: (otherlv_0= 'ModerationProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startStep' ( ( ruleEString ) ) (otherlv_5= 'step' otherlv_6= '{' ( (lv_step_7_0= ruleStep ) ) (otherlv_8= ',' ( (lv_step_9_0= ruleStep ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalAssign5.g:716:3: otherlv_0= 'ModerationProcess' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'startStep' ( ( ruleEString ) ) (otherlv_5= 'step' otherlv_6= '{' ( (lv_step_7_0= ruleStep ) ) (otherlv_8= ',' ( (lv_step_9_0= ruleStep ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModerationProcessAccess().getModerationProcessKeyword_0());
            		
            // InternalAssign5.g:720:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAssign5.g:721:4: (lv_name_1_0= ruleEString )
            {
            // InternalAssign5.g:721:4: (lv_name_1_0= ruleEString )
            // InternalAssign5.g:722:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModerationProcessAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModerationProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getModerationProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getModerationProcessAccess().getStartStepKeyword_3());
            		
            // InternalAssign5.g:747:3: ( ( ruleEString ) )
            // InternalAssign5.g:748:4: ( ruleEString )
            {
            // InternalAssign5.g:748:4: ( ruleEString )
            // InternalAssign5.g:749:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModerationProcessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModerationProcessAccess().getStartStepValidationStepCrossReference_4_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssign5.g:763:3: (otherlv_5= 'step' otherlv_6= '{' ( (lv_step_7_0= ruleStep ) ) (otherlv_8= ',' ( (lv_step_9_0= ruleStep ) ) )* otherlv_10= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAssign5.g:764:4: otherlv_5= 'step' otherlv_6= '{' ( (lv_step_7_0= ruleStep ) ) (otherlv_8= ',' ( (lv_step_9_0= ruleStep ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getModerationProcessAccess().getStepKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getModerationProcessAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalAssign5.g:772:4: ( (lv_step_7_0= ruleStep ) )
                    // InternalAssign5.g:773:5: (lv_step_7_0= ruleStep )
                    {
                    // InternalAssign5.g:773:5: (lv_step_7_0= ruleStep )
                    // InternalAssign5.g:774:6: lv_step_7_0= ruleStep
                    {

                    						newCompositeNode(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_step_7_0=ruleStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModerationProcessRule());
                    						}
                    						add(
                    							current,
                    							"step",
                    							lv_step_7_0,
                    							"org.xtext.example.mydsl.Assign5.Step");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAssign5.g:791:4: (otherlv_8= ',' ( (lv_step_9_0= ruleStep ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAssign5.g:792:5: otherlv_8= ',' ( (lv_step_9_0= ruleStep ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_25); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getModerationProcessAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalAssign5.g:796:5: ( (lv_step_9_0= ruleStep ) )
                    	    // InternalAssign5.g:797:6: (lv_step_9_0= ruleStep )
                    	    {
                    	    // InternalAssign5.g:797:6: (lv_step_9_0= ruleStep )
                    	    // InternalAssign5.g:798:7: lv_step_9_0= ruleStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_step_9_0=ruleStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModerationProcessRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"step",
                    	    								lv_step_9_0,
                    	    								"org.xtext.example.mydsl.Assign5.Step");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getModerationProcessAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getModerationProcessAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModerationProcess"


    // $ANTLR start "entryRuleEnd"
    // InternalAssign5.g:829:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalAssign5.g:829:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalAssign5.g:830:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalAssign5.g:836:1: ruleEnd returns [EObject current=null] : ( () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:842:2: ( ( () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalAssign5.g:843:2: ( () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalAssign5.g:843:2: ( () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) ) )
            // InternalAssign5.g:844:3: () otherlv_1= 'End' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalAssign5.g:844:3: ()
            // InternalAssign5.g:845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndAccess().getEndAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEndAccess().getEndKeyword_1());
            		
            // InternalAssign5.g:855:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAssign5.g:856:4: (lv_name_2_0= ruleEString )
            {
            // InternalAssign5.g:856:4: (lv_name_2_0= ruleEString )
            // InternalAssign5.g:857:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleAutomatic"
    // InternalAssign5.g:878:1: entryRuleAutomatic returns [EObject current=null] : iv_ruleAutomatic= ruleAutomatic EOF ;
    public final EObject entryRuleAutomatic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomatic = null;


        try {
            // InternalAssign5.g:878:50: (iv_ruleAutomatic= ruleAutomatic EOF )
            // InternalAssign5.g:879:2: iv_ruleAutomatic= ruleAutomatic EOF
            {
             newCompositeNode(grammarAccess.getAutomaticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutomatic=ruleAutomatic();

            state._fsp--;

             current =iv_ruleAutomatic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutomatic"


    // $ANTLR start "ruleAutomatic"
    // InternalAssign5.g:885:1: ruleAutomatic returns [EObject current=null] : (otherlv_0= 'Automatic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) )? otherlv_5= 'nextApprove' ( ( ruleEString ) ) otherlv_7= 'nextReject' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleAutomatic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_method_4_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:891:2: ( (otherlv_0= 'Automatic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) )? otherlv_5= 'nextApprove' ( ( ruleEString ) ) otherlv_7= 'nextReject' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalAssign5.g:892:2: (otherlv_0= 'Automatic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) )? otherlv_5= 'nextApprove' ( ( ruleEString ) ) otherlv_7= 'nextReject' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalAssign5.g:892:2: (otherlv_0= 'Automatic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) )? otherlv_5= 'nextApprove' ( ( ruleEString ) ) otherlv_7= 'nextReject' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalAssign5.g:893:3: otherlv_0= 'Automatic' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) )? otherlv_5= 'nextApprove' ( ( ruleEString ) ) otherlv_7= 'nextReject' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAutomaticAccess().getAutomaticKeyword_0());
            		
            // InternalAssign5.g:897:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAssign5.g:898:4: (lv_name_1_0= ruleEString )
            {
            // InternalAssign5.g:898:4: (lv_name_1_0= ruleEString )
            // InternalAssign5.g:899:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomaticAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomaticRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getAutomaticAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAssign5.g:920:3: (otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAssign5.g:921:4: otherlv_3= 'method' ( (lv_method_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutomaticAccess().getMethodKeyword_3_0());
                    			
                    // InternalAssign5.g:925:4: ( (lv_method_4_0= ruleEString ) )
                    // InternalAssign5.g:926:5: (lv_method_4_0= ruleEString )
                    {
                    // InternalAssign5.g:926:5: (lv_method_4_0= ruleEString )
                    // InternalAssign5.g:927:6: lv_method_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutomaticAccess().getMethodEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_method_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomaticRule());
                    						}
                    						set(
                    							current,
                    							"method",
                    							lv_method_4_0,
                    							"org.xtext.example.mydsl.Assign5.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAutomaticAccess().getNextApproveKeyword_4());
            		
            // InternalAssign5.g:949:3: ( ( ruleEString ) )
            // InternalAssign5.g:950:4: ( ruleEString )
            {
            // InternalAssign5.g:950:4: ( ruleEString )
            // InternalAssign5.g:951:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutomaticRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAutomaticAccess().getNextApproveStepCrossReference_5_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAutomaticAccess().getNextRejectKeyword_6());
            		
            // InternalAssign5.g:969:3: ( ( ruleEString ) )
            // InternalAssign5.g:970:4: ( ruleEString )
            {
            // InternalAssign5.g:970:4: ( ruleEString )
            // InternalAssign5.g:971:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutomaticRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAutomaticAccess().getNextRejectStepCrossReference_7_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAutomaticAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutomatic"


    // $ANTLR start "entryRuleManual"
    // InternalAssign5.g:993:1: entryRuleManual returns [EObject current=null] : iv_ruleManual= ruleManual EOF ;
    public final EObject entryRuleManual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManual = null;


        try {
            // InternalAssign5.g:993:47: (iv_ruleManual= ruleManual EOF )
            // InternalAssign5.g:994:2: iv_ruleManual= ruleManual EOF
            {
             newCompositeNode(grammarAccess.getManualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManual=ruleManual();

            state._fsp--;

             current =iv_ruleManual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManual"


    // $ANTLR start "ruleManual"
    // InternalAssign5.g:1000:1: ruleManual returns [EObject current=null] : (otherlv_0= 'Manual' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nextApprove' ( ( ruleEString ) ) otherlv_5= 'nextReject' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleManual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAssign5.g:1006:2: ( (otherlv_0= 'Manual' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nextApprove' ( ( ruleEString ) ) otherlv_5= 'nextReject' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalAssign5.g:1007:2: (otherlv_0= 'Manual' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nextApprove' ( ( ruleEString ) ) otherlv_5= 'nextReject' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalAssign5.g:1007:2: (otherlv_0= 'Manual' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nextApprove' ( ( ruleEString ) ) otherlv_5= 'nextReject' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalAssign5.g:1008:3: otherlv_0= 'Manual' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'nextApprove' ( ( ruleEString ) ) otherlv_5= 'nextReject' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getManualAccess().getManualKeyword_0());
            		
            // InternalAssign5.g:1012:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAssign5.g:1013:4: (lv_name_1_0= ruleEString )
            {
            // InternalAssign5.g:1013:4: (lv_name_1_0= ruleEString )
            // InternalAssign5.g:1014:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManualAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManualRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.Assign5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getManualAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getManualAccess().getNextApproveKeyword_3());
            		
            // InternalAssign5.g:1039:3: ( ( ruleEString ) )
            // InternalAssign5.g:1040:4: ( ruleEString )
            {
            // InternalAssign5.g:1040:4: ( ruleEString )
            // InternalAssign5.g:1041:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManualRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManualAccess().getNextApproveStepCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getManualAccess().getNextRejectKeyword_5());
            		
            // InternalAssign5.g:1059:3: ( ( ruleEString ) )
            // InternalAssign5.g:1060:4: ( ruleEString )
            {
            // InternalAssign5.g:1060:4: ( ruleEString )
            // InternalAssign5.g:1061:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManualRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManualAccess().getNextRejectStepCrossReference_6_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getManualAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManual"


    // $ANTLR start "ruleGradeType"
    // InternalAssign5.g:1083:1: ruleGradeType returns [Enumerator current=null] : ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'STARS' ) ) ;
    public final Enumerator ruleGradeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAssign5.g:1089:2: ( ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'STARS' ) ) )
            // InternalAssign5.g:1090:2: ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'STARS' ) )
            {
            // InternalAssign5.g:1090:2: ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'STARS' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAssign5.g:1091:3: (enumLiteral_0= 'CUSTOM' )
                    {
                    // InternalAssign5.g:1091:3: (enumLiteral_0= 'CUSTOM' )
                    // InternalAssign5.g:1092:4: enumLiteral_0= 'CUSTOM'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getGradeTypeAccess().getCUSTOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGradeTypeAccess().getCUSTOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign5.g:1099:3: (enumLiteral_1= 'STARS' )
                    {
                    // InternalAssign5.g:1099:3: (enumLiteral_1= 'STARS' )
                    // InternalAssign5.g:1100:4: enumLiteral_1= 'STARS'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getGradeTypeAccess().getSTARSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGradeTypeAccess().getSTARSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGradeType"


    // $ANTLR start "ruleReviewType"
    // InternalAssign5.g:1110:1: ruleReviewType returns [Enumerator current=null] : ( (enumLiteral_0= 'ONLYGRADE' ) | (enumLiteral_1= 'ANNOTATED' ) ) ;
    public final Enumerator ruleReviewType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAssign5.g:1116:2: ( ( (enumLiteral_0= 'ONLYGRADE' ) | (enumLiteral_1= 'ANNOTATED' ) ) )
            // InternalAssign5.g:1117:2: ( (enumLiteral_0= 'ONLYGRADE' ) | (enumLiteral_1= 'ANNOTATED' ) )
            {
            // InternalAssign5.g:1117:2: ( (enumLiteral_0= 'ONLYGRADE' ) | (enumLiteral_1= 'ANNOTATED' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==40) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAssign5.g:1118:3: (enumLiteral_0= 'ONLYGRADE' )
                    {
                    // InternalAssign5.g:1118:3: (enumLiteral_0= 'ONLYGRADE' )
                    // InternalAssign5.g:1119:4: enumLiteral_0= 'ONLYGRADE'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getReviewTypeAccess().getONLYGRADEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getReviewTypeAccess().getONLYGRADEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign5.g:1126:3: (enumLiteral_1= 'ANNOTATED' )
                    {
                    // InternalAssign5.g:1126:3: (enumLiteral_1= 'ANNOTATED' )
                    // InternalAssign5.g:1127:4: enumLiteral_1= 'ANNOTATED'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getReviewTypeAccess().getANNOTATEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getReviewTypeAccess().getANNOTATEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReviewType"


    // $ANTLR start "ruleCommentType"
    // InternalAssign5.g:1137:1: ruleCommentType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'RICHTEXT' ) ) ;
    public final Enumerator ruleCommentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAssign5.g:1143:2: ( ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'RICHTEXT' ) ) )
            // InternalAssign5.g:1144:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'RICHTEXT' ) )
            {
            // InternalAssign5.g:1144:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'RICHTEXT' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAssign5.g:1145:3: (enumLiteral_0= 'SIMPLE' )
                    {
                    // InternalAssign5.g:1145:3: (enumLiteral_0= 'SIMPLE' )
                    // InternalAssign5.g:1146:4: enumLiteral_0= 'SIMPLE'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCommentTypeAccess().getSIMPLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCommentTypeAccess().getSIMPLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign5.g:1153:3: (enumLiteral_1= 'RICHTEXT' )
                    {
                    // InternalAssign5.g:1153:3: (enumLiteral_1= 'RICHTEXT' )
                    // InternalAssign5.g:1154:4: enumLiteral_1= 'RICHTEXT'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCommentTypeAccess().getRICHTEXTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCommentTypeAccess().getRICHTEXTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000604000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001180000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});

}