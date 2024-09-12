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
import org.xtext.example.mydsl.services.Assign4GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAssign4Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'name:'", "'Subject'", "'has:'", "'Features:'", "','", "'User'", "'feedback:'", "'Review'", "'{'", "'gradeType'", "'reviewType'", "'}'", "'Comment'", "'('", "'reply'", "'moderation'", "')'", "'Type:'", "'Moderation'", "'Process'", "'Name:'", "'Steps:'", "'Start'", "'Step:'", "'End'", "'Automatic'", "'Step'", "'Method:'", "'If'", "'approved'", "'jump'", "'to:'", "'rejected'", "'Manual'", "'CUSTOM'", "'STARS'", "'ONLYGRADE'", "'ANNOTATED'", "'SIMPLE'", "'RICHTEXT'"
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

        public InternalAssign4Parser(TokenStream input, Assign4GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Assign4GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAssign4.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAssign4.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalAssign4.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalAssign4.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Subject' otherlv_4= 'name:' ( (lv_subject_5_0= ruleSubject ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_subject_5_0 = null;



        	enterRule();

        try {
            // InternalAssign4.g:78:2: ( (otherlv_0= 'Model' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Subject' otherlv_4= 'name:' ( (lv_subject_5_0= ruleSubject ) ) ) )
            // InternalAssign4.g:79:2: (otherlv_0= 'Model' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Subject' otherlv_4= 'name:' ( (lv_subject_5_0= ruleSubject ) ) )
            {
            // InternalAssign4.g:79:2: (otherlv_0= 'Model' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Subject' otherlv_4= 'name:' ( (lv_subject_5_0= ruleSubject ) ) )
            // InternalAssign4.g:80:3: otherlv_0= 'Model' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'Subject' otherlv_4= 'name:' ( (lv_subject_5_0= ruleSubject ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getNameKeyword_1());
            		
            // InternalAssign4.g:88:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAssign4.g:89:4: (lv_name_2_0= ruleEString )
            {
            // InternalAssign4.g:89:4: (lv_name_2_0= ruleEString )
            // InternalAssign4.g:90:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Assign4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getSubjectKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getModelAccess().getNameKeyword_4());
            		
            // InternalAssign4.g:115:3: ( (lv_subject_5_0= ruleSubject ) )
            // InternalAssign4.g:116:4: (lv_subject_5_0= ruleSubject )
            {
            // InternalAssign4.g:116:4: (lv_subject_5_0= ruleSubject )
            // InternalAssign4.g:117:5: lv_subject_5_0= ruleSubject
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSubjectSubjectParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_subject_5_0=ruleSubject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"subject",
            						lv_subject_5_0,
            						"org.xtext.example.mydsl.Assign4.Subject");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUserFeedback"
    // InternalAssign4.g:138:1: entryRuleUserFeedback returns [EObject current=null] : iv_ruleUserFeedback= ruleUserFeedback EOF ;
    public final EObject entryRuleUserFeedback() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserFeedback = null;


        try {
            // InternalAssign4.g:138:53: (iv_ruleUserFeedback= ruleUserFeedback EOF )
            // InternalAssign4.g:139:2: iv_ruleUserFeedback= ruleUserFeedback EOF
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
    // InternalAssign4.g:145:1: ruleUserFeedback returns [EObject current=null] : (this_Review_0= ruleReview | this_Comment_1= ruleComment ) ;
    public final EObject ruleUserFeedback() throws RecognitionException {
        EObject current = null;

        EObject this_Review_0 = null;

        EObject this_Comment_1 = null;



        	enterRule();

        try {
            // InternalAssign4.g:151:2: ( (this_Review_0= ruleReview | this_Comment_1= ruleComment ) )
            // InternalAssign4.g:152:2: (this_Review_0= ruleReview | this_Comment_1= ruleComment )
            {
            // InternalAssign4.g:152:2: (this_Review_0= ruleReview | this_Comment_1= ruleComment )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAssign4.g:153:3: this_Review_0= ruleReview
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
                    // InternalAssign4.g:162:3: this_Comment_1= ruleComment
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
    // InternalAssign4.g:174:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalAssign4.g:174:45: (iv_ruleStep= ruleStep EOF )
            // InternalAssign4.g:175:2: iv_ruleStep= ruleStep EOF
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
    // InternalAssign4.g:181:1: ruleStep returns [EObject current=null] : (this_End_0= ruleEnd | this_Automatic_1= ruleAutomatic | this_Manual_2= ruleManual ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        EObject this_End_0 = null;

        EObject this_Automatic_1 = null;

        EObject this_Manual_2 = null;



        	enterRule();

        try {
            // InternalAssign4.g:187:2: ( (this_End_0= ruleEnd | this_Automatic_1= ruleAutomatic | this_Manual_2= ruleManual ) )
            // InternalAssign4.g:188:2: (this_End_0= ruleEnd | this_Automatic_1= ruleAutomatic | this_Manual_2= ruleManual )
            {
            // InternalAssign4.g:188:2: (this_End_0= ruleEnd | this_Automatic_1= ruleAutomatic | this_Manual_2= ruleManual )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case 45:
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
                    // InternalAssign4.g:189:3: this_End_0= ruleEnd
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
                    // InternalAssign4.g:198:3: this_Automatic_1= ruleAutomatic
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
                    // InternalAssign4.g:207:3: this_Manual_2= ruleManual
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
    // InternalAssign4.g:219:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalAssign4.g:219:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalAssign4.g:220:2: iv_ruleSubject= ruleSubject EOF
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
    // InternalAssign4.g:226:1: ruleSubject returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Subject' otherlv_2= 'has:' (otherlv_3= 'Features:' ( (lv_feature_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) ) )* )? otherlv_7= 'User' otherlv_8= 'feedback:' ( (lv_userFeedback_9_0= ruleUserFeedback ) ) (otherlv_10= ',' ( (lv_userFeedback_11_0= ruleUserFeedback ) ) )* ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_feature_4_0 = null;

        EObject lv_feature_6_0 = null;

        EObject lv_userFeedback_9_0 = null;

        EObject lv_userFeedback_11_0 = null;



        	enterRule();

        try {
            // InternalAssign4.g:232:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Subject' otherlv_2= 'has:' (otherlv_3= 'Features:' ( (lv_feature_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) ) )* )? otherlv_7= 'User' otherlv_8= 'feedback:' ( (lv_userFeedback_9_0= ruleUserFeedback ) ) (otherlv_10= ',' ( (lv_userFeedback_11_0= ruleUserFeedback ) ) )* ) )
            // InternalAssign4.g:233:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Subject' otherlv_2= 'has:' (otherlv_3= 'Features:' ( (lv_feature_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) ) )* )? otherlv_7= 'User' otherlv_8= 'feedback:' ( (lv_userFeedback_9_0= ruleUserFeedback ) ) (otherlv_10= ',' ( (lv_userFeedback_11_0= ruleUserFeedback ) ) )* )
            {
            // InternalAssign4.g:233:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Subject' otherlv_2= 'has:' (otherlv_3= 'Features:' ( (lv_feature_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) ) )* )? otherlv_7= 'User' otherlv_8= 'feedback:' ( (lv_userFeedback_9_0= ruleUserFeedback ) ) (otherlv_10= ',' ( (lv_userFeedback_11_0= ruleUserFeedback ) ) )* )
            // InternalAssign4.g:234:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Subject' otherlv_2= 'has:' (otherlv_3= 'Features:' ( (lv_feature_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) ) )* )? otherlv_7= 'User' otherlv_8= 'feedback:' ( (lv_userFeedback_9_0= ruleUserFeedback ) ) (otherlv_10= ',' ( (lv_userFeedback_11_0= ruleUserFeedback ) ) )*
            {
            // InternalAssign4.g:234:3: ( (lv_name_0_0= ruleEString ) )
            // InternalAssign4.g:235:4: (lv_name_0_0= ruleEString )
            {
            // InternalAssign4.g:235:4: (lv_name_0_0= ruleEString )
            // InternalAssign4.g:236:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubjectRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.Assign4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSubjectAccess().getSubjectKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSubjectAccess().getHasKeyword_2());
            		
            // InternalAssign4.g:261:3: (otherlv_3= 'Features:' ( (lv_feature_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAssign4.g:262:4: otherlv_3= 'Features:' ( (lv_feature_4_0= ruleFeature ) ) (otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) ) )*
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubjectAccess().getFeaturesKeyword_3_0());
                    			
                    // InternalAssign4.g:266:4: ( (lv_feature_4_0= ruleFeature ) )
                    // InternalAssign4.g:267:5: (lv_feature_4_0= ruleFeature )
                    {
                    // InternalAssign4.g:267:5: (lv_feature_4_0= ruleFeature )
                    // InternalAssign4.g:268:6: lv_feature_4_0= ruleFeature
                    {

                    						newCompositeNode(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_feature_4_0=ruleFeature();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubjectRule());
                    						}
                    						add(
                    							current,
                    							"feature",
                    							lv_feature_4_0,
                    							"org.xtext.example.mydsl.Assign4.Feature");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAssign4.g:285:4: (otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAssign4.g:286:5: otherlv_5= ',' ( (lv_feature_6_0= ruleFeature ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSubjectAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalAssign4.g:290:5: ( (lv_feature_6_0= ruleFeature ) )
                    	    // InternalAssign4.g:291:6: (lv_feature_6_0= ruleFeature )
                    	    {
                    	    // InternalAssign4.g:291:6: (lv_feature_6_0= ruleFeature )
                    	    // InternalAssign4.g:292:7: lv_feature_6_0= ruleFeature
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubjectAccess().getFeatureFeatureParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_feature_6_0=ruleFeature();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"feature",
                    	    								lv_feature_6_0,
                    	    								"org.xtext.example.mydsl.Assign4.Feature");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getSubjectAccess().getUserKeyword_4());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getSubjectAccess().getFeedbackKeyword_5());
            		
            // InternalAssign4.g:319:3: ( (lv_userFeedback_9_0= ruleUserFeedback ) )
            // InternalAssign4.g:320:4: (lv_userFeedback_9_0= ruleUserFeedback )
            {
            // InternalAssign4.g:320:4: (lv_userFeedback_9_0= ruleUserFeedback )
            // InternalAssign4.g:321:5: lv_userFeedback_9_0= ruleUserFeedback
            {

            					newCompositeNode(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_userFeedback_9_0=ruleUserFeedback();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubjectRule());
            					}
            					add(
            						current,
            						"userFeedback",
            						lv_userFeedback_9_0,
            						"org.xtext.example.mydsl.Assign4.UserFeedback");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssign4.g:338:3: (otherlv_10= ',' ( (lv_userFeedback_11_0= ruleUserFeedback ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAssign4.g:339:4: otherlv_10= ',' ( (lv_userFeedback_11_0= ruleUserFeedback ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_10, grammarAccess.getSubjectAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalAssign4.g:343:4: ( (lv_userFeedback_11_0= ruleUserFeedback ) )
            	    // InternalAssign4.g:344:5: (lv_userFeedback_11_0= ruleUserFeedback )
            	    {
            	    // InternalAssign4.g:344:5: (lv_userFeedback_11_0= ruleUserFeedback )
            	    // InternalAssign4.g:345:6: lv_userFeedback_11_0= ruleUserFeedback
            	    {

            	    						newCompositeNode(grammarAccess.getSubjectAccess().getUserFeedbackUserFeedbackParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_userFeedback_11_0=ruleUserFeedback();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"userFeedback",
            	    							lv_userFeedback_11_0,
            	    							"org.xtext.example.mydsl.Assign4.UserFeedback");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // InternalAssign4.g:367:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAssign4.g:367:47: (iv_ruleEString= ruleEString EOF )
            // InternalAssign4.g:368:2: iv_ruleEString= ruleEString EOF
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
    // InternalAssign4.g:374:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAssign4.g:380:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAssign4.g:381:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAssign4.g:381:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalAssign4.g:382:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAssign4.g:390:3: this_ID_1= RULE_ID
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
    // InternalAssign4.g:401:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalAssign4.g:401:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalAssign4.g:402:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalAssign4.g:408:1: ruleFeature returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAssign4.g:414:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalAssign4.g:415:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalAssign4.g:415:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalAssign4.g:416:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalAssign4.g:416:3: ()
            // InternalAssign4.g:417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFeatureAccess().getFeatureAction_0(),
            					current);
            			

            }

            // InternalAssign4.g:423:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAssign4.g:424:4: (lv_name_1_0= ruleEString )
            {
            // InternalAssign4.g:424:4: (lv_name_1_0= ruleEString )
            // InternalAssign4.g:425:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.Assign4.EString");
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
    // InternalAssign4.g:446:1: entryRuleReview returns [EObject current=null] : iv_ruleReview= ruleReview EOF ;
    public final EObject entryRuleReview() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReview = null;


        try {
            // InternalAssign4.g:446:47: (iv_ruleReview= ruleReview EOF )
            // InternalAssign4.g:447:2: iv_ruleReview= ruleReview EOF
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
    // InternalAssign4.g:453:1: ruleReview returns [EObject current=null] : ( () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}' ) ;
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
            // InternalAssign4.g:459:2: ( ( () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}' ) )
            // InternalAssign4.g:460:2: ( () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}' )
            {
            // InternalAssign4.g:460:2: ( () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}' )
            // InternalAssign4.g:461:3: () otherlv_1= 'Review' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )? (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )? otherlv_8= '}'
            {
            // InternalAssign4.g:461:3: ()
            // InternalAssign4.g:462:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReviewAccess().getReviewAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getReviewAccess().getReviewKeyword_1());
            		
            // InternalAssign4.g:472:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAssign4.g:473:4: (lv_name_2_0= ruleEString )
            {
            // InternalAssign4.g:473:4: (lv_name_2_0= ruleEString )
            // InternalAssign4.g:474:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReviewAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReviewRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Assign4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getReviewAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAssign4.g:495:3: (otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAssign4.g:496:4: otherlv_4= 'gradeType' ( (lv_gradeType_5_0= ruleGradeType ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getReviewAccess().getGradeTypeKeyword_4_0());
                    			
                    // InternalAssign4.g:500:4: ( (lv_gradeType_5_0= ruleGradeType ) )
                    // InternalAssign4.g:501:5: (lv_gradeType_5_0= ruleGradeType )
                    {
                    // InternalAssign4.g:501:5: (lv_gradeType_5_0= ruleGradeType )
                    // InternalAssign4.g:502:6: lv_gradeType_5_0= ruleGradeType
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
                    							"org.xtext.example.mydsl.Assign4.GradeType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAssign4.g:520:3: (otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAssign4.g:521:4: otherlv_6= 'reviewType' ( (lv_reviewType_7_0= ruleReviewType ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getReviewAccess().getReviewTypeKeyword_5_0());
                    			
                    // InternalAssign4.g:525:4: ( (lv_reviewType_7_0= ruleReviewType ) )
                    // InternalAssign4.g:526:5: (lv_reviewType_7_0= ruleReviewType )
                    {
                    // InternalAssign4.g:526:5: (lv_reviewType_7_0= ruleReviewType )
                    // InternalAssign4.g:527:6: lv_reviewType_7_0= ruleReviewType
                    {

                    						newCompositeNode(grammarAccess.getReviewAccess().getReviewTypeReviewTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_reviewType_7_0=ruleReviewType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReviewRule());
                    						}
                    						set(
                    							current,
                    							"reviewType",
                    							lv_reviewType_7_0,
                    							"org.xtext.example.mydsl.Assign4.ReviewType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAssign4.g:553:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalAssign4.g:553:48: (iv_ruleComment= ruleComment EOF )
            // InternalAssign4.g:554:2: iv_ruleComment= ruleComment EOF
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
    // InternalAssign4.g:560:1: ruleComment returns [EObject current=null] : (otherlv_0= 'Comment' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_reply_4_0= 'reply' ) ) otherlv_5= ',' ( (lv_moderation_6_0= 'moderation' ) ) otherlv_7= ')' (otherlv_8= 'Comment' otherlv_9= 'Type:' ( (lv_commentType_10_0= ruleCommentType ) ) )? (otherlv_11= 'Moderation' otherlv_12= 'Process' otherlv_13= 'Name:' ( (lv_moderationProcess_14_0= ruleModerationProcess ) ) )? ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_reply_4_0=null;
        Token otherlv_5=null;
        Token lv_moderation_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_commentType_10_0 = null;

        EObject lv_moderationProcess_14_0 = null;



        	enterRule();

        try {
            // InternalAssign4.g:566:2: ( (otherlv_0= 'Comment' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_reply_4_0= 'reply' ) ) otherlv_5= ',' ( (lv_moderation_6_0= 'moderation' ) ) otherlv_7= ')' (otherlv_8= 'Comment' otherlv_9= 'Type:' ( (lv_commentType_10_0= ruleCommentType ) ) )? (otherlv_11= 'Moderation' otherlv_12= 'Process' otherlv_13= 'Name:' ( (lv_moderationProcess_14_0= ruleModerationProcess ) ) )? ) )
            // InternalAssign4.g:567:2: (otherlv_0= 'Comment' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_reply_4_0= 'reply' ) ) otherlv_5= ',' ( (lv_moderation_6_0= 'moderation' ) ) otherlv_7= ')' (otherlv_8= 'Comment' otherlv_9= 'Type:' ( (lv_commentType_10_0= ruleCommentType ) ) )? (otherlv_11= 'Moderation' otherlv_12= 'Process' otherlv_13= 'Name:' ( (lv_moderationProcess_14_0= ruleModerationProcess ) ) )? )
            {
            // InternalAssign4.g:567:2: (otherlv_0= 'Comment' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_reply_4_0= 'reply' ) ) otherlv_5= ',' ( (lv_moderation_6_0= 'moderation' ) ) otherlv_7= ')' (otherlv_8= 'Comment' otherlv_9= 'Type:' ( (lv_commentType_10_0= ruleCommentType ) ) )? (otherlv_11= 'Moderation' otherlv_12= 'Process' otherlv_13= 'Name:' ( (lv_moderationProcess_14_0= ruleModerationProcess ) ) )? )
            // InternalAssign4.g:568:3: otherlv_0= 'Comment' otherlv_1= 'name:' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_reply_4_0= 'reply' ) ) otherlv_5= ',' ( (lv_moderation_6_0= 'moderation' ) ) otherlv_7= ')' (otherlv_8= 'Comment' otherlv_9= 'Type:' ( (lv_commentType_10_0= ruleCommentType ) ) )? (otherlv_11= 'Moderation' otherlv_12= 'Process' otherlv_13= 'Name:' ( (lv_moderationProcess_14_0= ruleModerationProcess ) ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getNameKeyword_1());
            		
            // InternalAssign4.g:576:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAssign4.g:577:4: (lv_name_2_0= ruleEString )
            {
            // InternalAssign4.g:577:4: (lv_name_2_0= ruleEString )
            // InternalAssign4.g:578:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCommentAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Assign4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getCommentAccess().getLeftParenthesisKeyword_3());
            		
            // InternalAssign4.g:599:3: ( (lv_reply_4_0= 'reply' ) )
            // InternalAssign4.g:600:4: (lv_reply_4_0= 'reply' )
            {
            // InternalAssign4.g:600:4: (lv_reply_4_0= 'reply' )
            // InternalAssign4.g:601:5: lv_reply_4_0= 'reply'
            {
            lv_reply_4_0=(Token)match(input,26,FOLLOW_20); 

            					newLeafNode(lv_reply_4_0, grammarAccess.getCommentAccess().getReplyReplyKeyword_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(current, "reply", lv_reply_4_0 != null, "reply");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getCommentAccess().getCommaKeyword_5());
            		
            // InternalAssign4.g:617:3: ( (lv_moderation_6_0= 'moderation' ) )
            // InternalAssign4.g:618:4: (lv_moderation_6_0= 'moderation' )
            {
            // InternalAssign4.g:618:4: (lv_moderation_6_0= 'moderation' )
            // InternalAssign4.g:619:5: lv_moderation_6_0= 'moderation'
            {
            lv_moderation_6_0=(Token)match(input,27,FOLLOW_22); 

            					newLeafNode(lv_moderation_6_0, grammarAccess.getCommentAccess().getModerationModerationKeyword_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommentRule());
            					}
            					setWithLastConsumed(current, "moderation", lv_moderation_6_0 != null, "moderation");
            				

            }


            }

            otherlv_7=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getCommentAccess().getRightParenthesisKeyword_7());
            		
            // InternalAssign4.g:635:3: (otherlv_8= 'Comment' otherlv_9= 'Type:' ( (lv_commentType_10_0= ruleCommentType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAssign4.g:636:4: otherlv_8= 'Comment' otherlv_9= 'Type:' ( (lv_commentType_10_0= ruleCommentType ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getCommentAccess().getCommentKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommentAccess().getTypeKeyword_8_1());
                    			
                    // InternalAssign4.g:644:4: ( (lv_commentType_10_0= ruleCommentType ) )
                    // InternalAssign4.g:645:5: (lv_commentType_10_0= ruleCommentType )
                    {
                    // InternalAssign4.g:645:5: (lv_commentType_10_0= ruleCommentType )
                    // InternalAssign4.g:646:6: lv_commentType_10_0= ruleCommentType
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getCommentTypeCommentTypeEnumRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_commentType_10_0=ruleCommentType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"commentType",
                    							lv_commentType_10_0,
                    							"org.xtext.example.mydsl.Assign4.CommentType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAssign4.g:664:3: (otherlv_11= 'Moderation' otherlv_12= 'Process' otherlv_13= 'Name:' ( (lv_moderationProcess_14_0= ruleModerationProcess ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAssign4.g:665:4: otherlv_11= 'Moderation' otherlv_12= 'Process' otherlv_13= 'Name:' ( (lv_moderationProcess_14_0= ruleModerationProcess ) )
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_27); 

                    				newLeafNode(otherlv_11, grammarAccess.getCommentAccess().getModerationKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,31,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getCommentAccess().getProcessKeyword_9_1());
                    			
                    otherlv_13=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getCommentAccess().getNameKeyword_9_2());
                    			
                    // InternalAssign4.g:677:4: ( (lv_moderationProcess_14_0= ruleModerationProcess ) )
                    // InternalAssign4.g:678:5: (lv_moderationProcess_14_0= ruleModerationProcess )
                    {
                    // InternalAssign4.g:678:5: (lv_moderationProcess_14_0= ruleModerationProcess )
                    // InternalAssign4.g:679:6: lv_moderationProcess_14_0= ruleModerationProcess
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getModerationProcessModerationProcessParserRuleCall_9_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_moderationProcess_14_0=ruleModerationProcess();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"moderationProcess",
                    							lv_moderationProcess_14_0,
                    							"org.xtext.example.mydsl.Assign4.ModerationProcess");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleModerationProcess"
    // InternalAssign4.g:701:1: entryRuleModerationProcess returns [EObject current=null] : iv_ruleModerationProcess= ruleModerationProcess EOF ;
    public final EObject entryRuleModerationProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModerationProcess = null;


        try {
            // InternalAssign4.g:701:58: (iv_ruleModerationProcess= ruleModerationProcess EOF )
            // InternalAssign4.g:702:2: iv_ruleModerationProcess= ruleModerationProcess EOF
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
    // InternalAssign4.g:708:1: ruleModerationProcess returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Steps:' otherlv_2= 'Start' otherlv_3= 'Step:' ( ( ruleEString ) ) ( ( (lv_step_5_0= ruleStep ) ) ( (lv_step_6_0= ruleStep ) )* )? ) ;
    public final EObject ruleModerationProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_step_5_0 = null;

        EObject lv_step_6_0 = null;



        	enterRule();

        try {
            // InternalAssign4.g:714:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Steps:' otherlv_2= 'Start' otherlv_3= 'Step:' ( ( ruleEString ) ) ( ( (lv_step_5_0= ruleStep ) ) ( (lv_step_6_0= ruleStep ) )* )? ) )
            // InternalAssign4.g:715:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Steps:' otherlv_2= 'Start' otherlv_3= 'Step:' ( ( ruleEString ) ) ( ( (lv_step_5_0= ruleStep ) ) ( (lv_step_6_0= ruleStep ) )* )? )
            {
            // InternalAssign4.g:715:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Steps:' otherlv_2= 'Start' otherlv_3= 'Step:' ( ( ruleEString ) ) ( ( (lv_step_5_0= ruleStep ) ) ( (lv_step_6_0= ruleStep ) )* )? )
            // InternalAssign4.g:716:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= 'Steps:' otherlv_2= 'Start' otherlv_3= 'Step:' ( ( ruleEString ) ) ( ( (lv_step_5_0= ruleStep ) ) ( (lv_step_6_0= ruleStep ) )* )?
            {
            // InternalAssign4.g:716:3: ( (lv_name_0_0= ruleEString ) )
            // InternalAssign4.g:717:4: (lv_name_0_0= ruleEString )
            {
            // InternalAssign4.g:717:4: (lv_name_0_0= ruleEString )
            // InternalAssign4.g:718:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModerationProcessAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModerationProcessRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.Assign4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getModerationProcessAccess().getStepsKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getModerationProcessAccess().getStartKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getModerationProcessAccess().getStepKeyword_3());
            		
            // InternalAssign4.g:747:3: ( ( ruleEString ) )
            // InternalAssign4.g:748:4: ( ruleEString )
            {
            // InternalAssign4.g:748:4: ( ruleEString )
            // InternalAssign4.g:749:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModerationProcessRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModerationProcessAccess().getStartStepValidationStepCrossReference_4_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssign4.g:763:3: ( ( (lv_step_5_0= ruleStep ) ) ( (lv_step_6_0= ruleStep ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=36 && LA12_0<=37)||LA12_0==45) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAssign4.g:764:4: ( (lv_step_5_0= ruleStep ) ) ( (lv_step_6_0= ruleStep ) )*
                    {
                    // InternalAssign4.g:764:4: ( (lv_step_5_0= ruleStep ) )
                    // InternalAssign4.g:765:5: (lv_step_5_0= ruleStep )
                    {
                    // InternalAssign4.g:765:5: (lv_step_5_0= ruleStep )
                    // InternalAssign4.g:766:6: lv_step_5_0= ruleStep
                    {

                    						newCompositeNode(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_step_5_0=ruleStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModerationProcessRule());
                    						}
                    						add(
                    							current,
                    							"step",
                    							lv_step_5_0,
                    							"org.xtext.example.mydsl.Assign4.Step");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAssign4.g:783:4: ( (lv_step_6_0= ruleStep ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=36 && LA11_0<=37)||LA11_0==45) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalAssign4.g:784:5: (lv_step_6_0= ruleStep )
                    	    {
                    	    // InternalAssign4.g:784:5: (lv_step_6_0= ruleStep )
                    	    // InternalAssign4.g:785:6: lv_step_6_0= ruleStep
                    	    {

                    	    						newCompositeNode(grammarAccess.getModerationProcessAccess().getStepStepParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_step_6_0=ruleStep();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModerationProcessRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"step",
                    	    							lv_step_6_0,
                    	    							"org.xtext.example.mydsl.Assign4.Step");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleModerationProcess"


    // $ANTLR start "entryRuleEnd"
    // InternalAssign4.g:807:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalAssign4.g:807:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalAssign4.g:808:2: iv_ruleEnd= ruleEnd EOF
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
    // InternalAssign4.g:814:1: ruleEnd returns [EObject current=null] : ( () otherlv_1= 'End' otherlv_2= 'Step:' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalAssign4.g:820:2: ( ( () otherlv_1= 'End' otherlv_2= 'Step:' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalAssign4.g:821:2: ( () otherlv_1= 'End' otherlv_2= 'Step:' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalAssign4.g:821:2: ( () otherlv_1= 'End' otherlv_2= 'Step:' ( (lv_name_3_0= ruleEString ) ) )
            // InternalAssign4.g:822:3: () otherlv_1= 'End' otherlv_2= 'Step:' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalAssign4.g:822:3: ()
            // InternalAssign4.g:823:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndAccess().getEndAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getEndAccess().getEndKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEndAccess().getStepKeyword_2());
            		
            // InternalAssign4.g:837:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAssign4.g:838:4: (lv_name_3_0= ruleEString )
            {
            // InternalAssign4.g:838:4: (lv_name_3_0= ruleEString )
            // InternalAssign4.g:839:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEndAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.Assign4.EString");
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
    // InternalAssign4.g:860:1: entryRuleAutomatic returns [EObject current=null] : iv_ruleAutomatic= ruleAutomatic EOF ;
    public final EObject entryRuleAutomatic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutomatic = null;


        try {
            // InternalAssign4.g:860:50: (iv_ruleAutomatic= ruleAutomatic EOF )
            // InternalAssign4.g:861:2: iv_ruleAutomatic= ruleAutomatic EOF
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
    // InternalAssign4.g:867:1: ruleAutomatic returns [EObject current=null] : (otherlv_0= 'Automatic' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'Method:' ( (lv_method_5_0= ruleEString ) ) )? otherlv_6= 'If' otherlv_7= 'approved' otherlv_8= 'jump' otherlv_9= 'to:' ( ( ruleEString ) ) otherlv_11= 'If' otherlv_12= 'rejected' otherlv_13= 'jump' otherlv_14= 'to:' ( ( ruleEString ) ) ) ;
    public final EObject ruleAutomatic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_method_5_0 = null;



        	enterRule();

        try {
            // InternalAssign4.g:873:2: ( (otherlv_0= 'Automatic' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'Method:' ( (lv_method_5_0= ruleEString ) ) )? otherlv_6= 'If' otherlv_7= 'approved' otherlv_8= 'jump' otherlv_9= 'to:' ( ( ruleEString ) ) otherlv_11= 'If' otherlv_12= 'rejected' otherlv_13= 'jump' otherlv_14= 'to:' ( ( ruleEString ) ) ) )
            // InternalAssign4.g:874:2: (otherlv_0= 'Automatic' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'Method:' ( (lv_method_5_0= ruleEString ) ) )? otherlv_6= 'If' otherlv_7= 'approved' otherlv_8= 'jump' otherlv_9= 'to:' ( ( ruleEString ) ) otherlv_11= 'If' otherlv_12= 'rejected' otherlv_13= 'jump' otherlv_14= 'to:' ( ( ruleEString ) ) )
            {
            // InternalAssign4.g:874:2: (otherlv_0= 'Automatic' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'Method:' ( (lv_method_5_0= ruleEString ) ) )? otherlv_6= 'If' otherlv_7= 'approved' otherlv_8= 'jump' otherlv_9= 'to:' ( ( ruleEString ) ) otherlv_11= 'If' otherlv_12= 'rejected' otherlv_13= 'jump' otherlv_14= 'to:' ( ( ruleEString ) ) )
            // InternalAssign4.g:875:3: otherlv_0= 'Automatic' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'Method:' ( (lv_method_5_0= ruleEString ) ) )? otherlv_6= 'If' otherlv_7= 'approved' otherlv_8= 'jump' otherlv_9= 'to:' ( ( ruleEString ) ) otherlv_11= 'If' otherlv_12= 'rejected' otherlv_13= 'jump' otherlv_14= 'to:' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getAutomaticAccess().getAutomaticKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getAutomaticAccess().getStepKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAutomaticAccess().getNameKeyword_2());
            		
            // InternalAssign4.g:887:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAssign4.g:888:4: (lv_name_3_0= ruleEString )
            {
            // InternalAssign4.g:888:4: (lv_name_3_0= ruleEString )
            // InternalAssign4.g:889:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAutomaticAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAutomaticRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.Assign4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAssign4.g:906:3: (otherlv_4= 'Method:' ( (lv_method_5_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAssign4.g:907:4: otherlv_4= 'Method:' ( (lv_method_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getAutomaticAccess().getMethodKeyword_4_0());
                    			
                    // InternalAssign4.g:911:4: ( (lv_method_5_0= ruleEString ) )
                    // InternalAssign4.g:912:5: (lv_method_5_0= ruleEString )
                    {
                    // InternalAssign4.g:912:5: (lv_method_5_0= ruleEString )
                    // InternalAssign4.g:913:6: lv_method_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutomaticAccess().getMethodEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_method_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutomaticRule());
                    						}
                    						set(
                    							current,
                    							"method",
                    							lv_method_5_0,
                    							"org.xtext.example.mydsl.Assign4.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getAutomaticAccess().getIfKeyword_5());
            		
            otherlv_7=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getAutomaticAccess().getApprovedKeyword_6());
            		
            otherlv_8=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_8, grammarAccess.getAutomaticAccess().getJumpKeyword_7());
            		
            otherlv_9=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getAutomaticAccess().getToKeyword_8());
            		
            // InternalAssign4.g:947:3: ( ( ruleEString ) )
            // InternalAssign4.g:948:4: ( ruleEString )
            {
            // InternalAssign4.g:948:4: ( ruleEString )
            // InternalAssign4.g:949:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutomaticRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAutomaticAccess().getNextApproveStepCrossReference_9_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,40,FOLLOW_39); 

            			newLeafNode(otherlv_11, grammarAccess.getAutomaticAccess().getIfKeyword_10());
            		
            otherlv_12=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_12, grammarAccess.getAutomaticAccess().getRejectedKeyword_11());
            		
            otherlv_13=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_13, grammarAccess.getAutomaticAccess().getJumpKeyword_12());
            		
            otherlv_14=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_14, grammarAccess.getAutomaticAccess().getToKeyword_13());
            		
            // InternalAssign4.g:979:3: ( ( ruleEString ) )
            // InternalAssign4.g:980:4: ( ruleEString )
            {
            // InternalAssign4.g:980:4: ( ruleEString )
            // InternalAssign4.g:981:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAutomaticRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAutomaticAccess().getNextRejectStepCrossReference_14_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleAutomatic"


    // $ANTLR start "entryRuleManual"
    // InternalAssign4.g:999:1: entryRuleManual returns [EObject current=null] : iv_ruleManual= ruleManual EOF ;
    public final EObject entryRuleManual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManual = null;


        try {
            // InternalAssign4.g:999:47: (iv_ruleManual= ruleManual EOF )
            // InternalAssign4.g:1000:2: iv_ruleManual= ruleManual EOF
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
    // InternalAssign4.g:1006:1: ruleManual returns [EObject current=null] : (otherlv_0= 'Manual' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'If' otherlv_5= 'approved' otherlv_6= 'jump' otherlv_7= 'to:' ( ( ruleEString ) ) otherlv_9= 'If' otherlv_10= 'rejected' otherlv_11= 'jump' otherlv_12= 'to:' ( ( ruleEString ) ) ) ;
    public final EObject ruleManual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalAssign4.g:1012:2: ( (otherlv_0= 'Manual' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'If' otherlv_5= 'approved' otherlv_6= 'jump' otherlv_7= 'to:' ( ( ruleEString ) ) otherlv_9= 'If' otherlv_10= 'rejected' otherlv_11= 'jump' otherlv_12= 'to:' ( ( ruleEString ) ) ) )
            // InternalAssign4.g:1013:2: (otherlv_0= 'Manual' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'If' otherlv_5= 'approved' otherlv_6= 'jump' otherlv_7= 'to:' ( ( ruleEString ) ) otherlv_9= 'If' otherlv_10= 'rejected' otherlv_11= 'jump' otherlv_12= 'to:' ( ( ruleEString ) ) )
            {
            // InternalAssign4.g:1013:2: (otherlv_0= 'Manual' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'If' otherlv_5= 'approved' otherlv_6= 'jump' otherlv_7= 'to:' ( ( ruleEString ) ) otherlv_9= 'If' otherlv_10= 'rejected' otherlv_11= 'jump' otherlv_12= 'to:' ( ( ruleEString ) ) )
            // InternalAssign4.g:1014:3: otherlv_0= 'Manual' otherlv_1= 'Step' otherlv_2= 'Name:' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'If' otherlv_5= 'approved' otherlv_6= 'jump' otherlv_7= 'to:' ( ( ruleEString ) ) otherlv_9= 'If' otherlv_10= 'rejected' otherlv_11= 'jump' otherlv_12= 'to:' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getManualAccess().getManualKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getManualAccess().getStepKeyword_1());
            		
            otherlv_2=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getManualAccess().getNameKeyword_2());
            		
            // InternalAssign4.g:1026:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAssign4.g:1027:4: (lv_name_3_0= ruleEString )
            {
            // InternalAssign4.g:1027:4: (lv_name_3_0= ruleEString )
            // InternalAssign4.g:1028:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getManualAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getManualRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.xtext.example.mydsl.Assign4.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getManualAccess().getIfKeyword_4());
            		
            otherlv_5=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getManualAccess().getApprovedKeyword_5());
            		
            otherlv_6=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getManualAccess().getJumpKeyword_6());
            		
            otherlv_7=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getManualAccess().getToKeyword_7());
            		
            // InternalAssign4.g:1061:3: ( ( ruleEString ) )
            // InternalAssign4.g:1062:4: ( ruleEString )
            {
            // InternalAssign4.g:1062:4: ( ruleEString )
            // InternalAssign4.g:1063:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManualRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManualAccess().getNextApproveStepCrossReference_8_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,40,FOLLOW_39); 

            			newLeafNode(otherlv_9, grammarAccess.getManualAccess().getIfKeyword_9());
            		
            otherlv_10=(Token)match(input,44,FOLLOW_37); 

            			newLeafNode(otherlv_10, grammarAccess.getManualAccess().getRejectedKeyword_10());
            		
            otherlv_11=(Token)match(input,42,FOLLOW_38); 

            			newLeafNode(otherlv_11, grammarAccess.getManualAccess().getJumpKeyword_11());
            		
            otherlv_12=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getManualAccess().getToKeyword_12());
            		
            // InternalAssign4.g:1093:3: ( ( ruleEString ) )
            // InternalAssign4.g:1094:4: ( ruleEString )
            {
            // InternalAssign4.g:1094:4: ( ruleEString )
            // InternalAssign4.g:1095:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getManualRule());
            					}
            				

            					newCompositeNode(grammarAccess.getManualAccess().getNextRejectStepCrossReference_13_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleManual"


    // $ANTLR start "ruleGradeType"
    // InternalAssign4.g:1113:1: ruleGradeType returns [Enumerator current=null] : ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'STARS' ) ) ;
    public final Enumerator ruleGradeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAssign4.g:1119:2: ( ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'STARS' ) ) )
            // InternalAssign4.g:1120:2: ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'STARS' ) )
            {
            // InternalAssign4.g:1120:2: ( (enumLiteral_0= 'CUSTOM' ) | (enumLiteral_1= 'STARS' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            else if ( (LA14_0==47) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAssign4.g:1121:3: (enumLiteral_0= 'CUSTOM' )
                    {
                    // InternalAssign4.g:1121:3: (enumLiteral_0= 'CUSTOM' )
                    // InternalAssign4.g:1122:4: enumLiteral_0= 'CUSTOM'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getGradeTypeAccess().getCUSTOMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGradeTypeAccess().getCUSTOMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign4.g:1129:3: (enumLiteral_1= 'STARS' )
                    {
                    // InternalAssign4.g:1129:3: (enumLiteral_1= 'STARS' )
                    // InternalAssign4.g:1130:4: enumLiteral_1= 'STARS'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    // InternalAssign4.g:1140:1: ruleReviewType returns [Enumerator current=null] : ( (enumLiteral_0= 'ONLYGRADE' ) | (enumLiteral_1= 'ANNOTATED' ) ) ;
    public final Enumerator ruleReviewType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAssign4.g:1146:2: ( ( (enumLiteral_0= 'ONLYGRADE' ) | (enumLiteral_1= 'ANNOTATED' ) ) )
            // InternalAssign4.g:1147:2: ( (enumLiteral_0= 'ONLYGRADE' ) | (enumLiteral_1= 'ANNOTATED' ) )
            {
            // InternalAssign4.g:1147:2: ( (enumLiteral_0= 'ONLYGRADE' ) | (enumLiteral_1= 'ANNOTATED' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==48) ) {
                alt15=1;
            }
            else if ( (LA15_0==49) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAssign4.g:1148:3: (enumLiteral_0= 'ONLYGRADE' )
                    {
                    // InternalAssign4.g:1148:3: (enumLiteral_0= 'ONLYGRADE' )
                    // InternalAssign4.g:1149:4: enumLiteral_0= 'ONLYGRADE'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getReviewTypeAccess().getONLYGRADEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getReviewTypeAccess().getONLYGRADEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign4.g:1156:3: (enumLiteral_1= 'ANNOTATED' )
                    {
                    // InternalAssign4.g:1156:3: (enumLiteral_1= 'ANNOTATED' )
                    // InternalAssign4.g:1157:4: enumLiteral_1= 'ANNOTATED'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

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
    // InternalAssign4.g:1167:1: ruleCommentType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'RICHTEXT' ) ) ;
    public final Enumerator ruleCommentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAssign4.g:1173:2: ( ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'RICHTEXT' ) ) )
            // InternalAssign4.g:1174:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'RICHTEXT' ) )
            {
            // InternalAssign4.g:1174:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'RICHTEXT' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==50) ) {
                alt16=1;
            }
            else if ( (LA16_0==51) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAssign4.g:1175:3: (enumLiteral_0= 'SIMPLE' )
                    {
                    // InternalAssign4.g:1175:3: (enumLiteral_0= 'SIMPLE' )
                    // InternalAssign4.g:1176:4: enumLiteral_0= 'SIMPLE'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCommentTypeAccess().getSIMPLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCommentTypeAccess().getSIMPLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAssign4.g:1183:3: (enumLiteral_1= 'RICHTEXT' )
                    {
                    // InternalAssign4.g:1183:3: (enumLiteral_1= 'RICHTEXT' )
                    // InternalAssign4.g:1184:4: enumLiteral_1= 'RICHTEXT'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000041000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000203000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});

}