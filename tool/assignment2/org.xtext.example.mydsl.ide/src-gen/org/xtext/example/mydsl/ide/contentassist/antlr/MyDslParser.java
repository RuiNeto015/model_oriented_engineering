/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getUserFeedbackAccess().getAlternatives(), "rule__UserFeedback__Alternatives");
			builder.put(grammarAccess.getStepAccess().getAlternatives(), "rule__Step__Alternatives");
			builder.put(grammarAccess.getValidationStepAccess().getAlternatives(), "rule__ValidationStep__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getGradeTypeAccess().getAlternatives(), "rule__GradeType__Alternatives");
			builder.put(grammarAccess.getReviewTypeAccess().getAlternatives(), "rule__ReviewType__Alternatives");
			builder.put(grammarAccess.getCommentTypeAccess().getAlternatives(), "rule__CommentType__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getSubjectAccess().getGroup(), "rule__Subject__Group__0");
			builder.put(grammarAccess.getSubjectAccess().getGroup_6(), "rule__Subject__Group_6__0");
			builder.put(grammarAccess.getSubjectAccess().getGroup_8(), "rule__Subject__Group_8__0");
			builder.put(grammarAccess.getSubjectAccess().getGroup_8_3(), "rule__Subject__Group_8_3__0");
			builder.put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
			builder.put(grammarAccess.getReviewAccess().getGroup(), "rule__Review__Group__0");
			builder.put(grammarAccess.getReviewAccess().getGroup_4(), "rule__Review__Group_4__0");
			builder.put(grammarAccess.getReviewAccess().getGroup_5(), "rule__Review__Group_5__0");
			builder.put(grammarAccess.getCommentAccess().getGroup(), "rule__Comment__Group__0");
			builder.put(grammarAccess.getCommentAccess().getGroup_5(), "rule__Comment__Group_5__0");
			builder.put(grammarAccess.getCommentAccess().getGroup_6(), "rule__Comment__Group_6__0");
			builder.put(grammarAccess.getModerationProcessAccess().getGroup(), "rule__ModerationProcess__Group__0");
			builder.put(grammarAccess.getModerationProcessAccess().getGroup_5(), "rule__ModerationProcess__Group_5__0");
			builder.put(grammarAccess.getModerationProcessAccess().getGroup_5_3(), "rule__ModerationProcess__Group_5_3__0");
			builder.put(grammarAccess.getEndAccess().getGroup(), "rule__End__Group__0");
			builder.put(grammarAccess.getAutomaticAccess().getGroup(), "rule__Automatic__Group__0");
			builder.put(grammarAccess.getAutomaticAccess().getGroup_3(), "rule__Automatic__Group_3__0");
			builder.put(grammarAccess.getManualAccess().getGroup(), "rule__Manual__Group__0");
			builder.put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
			builder.put(grammarAccess.getModelAccess().getSubjectAssignment_4(), "rule__Model__SubjectAssignment_4");
			builder.put(grammarAccess.getSubjectAccess().getNameAssignment_1(), "rule__Subject__NameAssignment_1");
			builder.put(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_5(), "rule__Subject__UserFeedbackAssignment_5");
			builder.put(grammarAccess.getSubjectAccess().getUserFeedbackAssignment_6_1(), "rule__Subject__UserFeedbackAssignment_6_1");
			builder.put(grammarAccess.getSubjectAccess().getFeatureAssignment_8_2(), "rule__Subject__FeatureAssignment_8_2");
			builder.put(grammarAccess.getSubjectAccess().getFeatureAssignment_8_3_1(), "rule__Subject__FeatureAssignment_8_3_1");
			builder.put(grammarAccess.getFeatureAccess().getNameAssignment_2(), "rule__Feature__NameAssignment_2");
			builder.put(grammarAccess.getReviewAccess().getNameAssignment_2(), "rule__Review__NameAssignment_2");
			builder.put(grammarAccess.getReviewAccess().getGradeTypeAssignment_4_1(), "rule__Review__GradeTypeAssignment_4_1");
			builder.put(grammarAccess.getReviewAccess().getReviewTypeAssignment_5_1(), "rule__Review__ReviewTypeAssignment_5_1");
			builder.put(grammarAccess.getCommentAccess().getReplyAssignment_0(), "rule__Comment__ReplyAssignment_0");
			builder.put(grammarAccess.getCommentAccess().getModerationAssignment_1(), "rule__Comment__ModerationAssignment_1");
			builder.put(grammarAccess.getCommentAccess().getNameAssignment_3(), "rule__Comment__NameAssignment_3");
			builder.put(grammarAccess.getCommentAccess().getCommentTypeAssignment_5_1(), "rule__Comment__CommentTypeAssignment_5_1");
			builder.put(grammarAccess.getCommentAccess().getModerationProcessAssignment_6_1(), "rule__Comment__ModerationProcessAssignment_6_1");
			builder.put(grammarAccess.getModerationProcessAccess().getNameAssignment_1(), "rule__ModerationProcess__NameAssignment_1");
			builder.put(grammarAccess.getModerationProcessAccess().getStartStepAssignment_4(), "rule__ModerationProcess__StartStepAssignment_4");
			builder.put(grammarAccess.getModerationProcessAccess().getStepAssignment_5_2(), "rule__ModerationProcess__StepAssignment_5_2");
			builder.put(grammarAccess.getModerationProcessAccess().getStepAssignment_5_3_1(), "rule__ModerationProcess__StepAssignment_5_3_1");
			builder.put(grammarAccess.getEndAccess().getNameAssignment_2(), "rule__End__NameAssignment_2");
			builder.put(grammarAccess.getAutomaticAccess().getNameAssignment_1(), "rule__Automatic__NameAssignment_1");
			builder.put(grammarAccess.getAutomaticAccess().getMethodAssignment_3_1(), "rule__Automatic__MethodAssignment_3_1");
			builder.put(grammarAccess.getAutomaticAccess().getNextApproveAssignment_5(), "rule__Automatic__NextApproveAssignment_5");
			builder.put(grammarAccess.getAutomaticAccess().getNextRejectAssignment_7(), "rule__Automatic__NextRejectAssignment_7");
			builder.put(grammarAccess.getManualAccess().getNameAssignment_1(), "rule__Manual__NameAssignment_1");
			builder.put(grammarAccess.getManualAccess().getNextApproveAssignment_4(), "rule__Manual__NextApproveAssignment_4");
			builder.put(grammarAccess.getManualAccess().getNextRejectAssignment_6(), "rule__Manual__NextRejectAssignment_6");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
