package pt.isep.enorm.atb.publico;


import pt.isep.enorm.atb.publico.SFactory;
import pt.isep.enorm.atb.publico.domain.Comment;
import pt.isep.enorm.atb.publico.domain.ValidationCommentProcess;
import pt.isep.enorm.atb.publico.domain.ValidationCommentProcessImpl2;

public class SFactoryAlternativeImpl implements SFactory {

	@Override
	public ValidationCommentProcess getValidationProcess(Comment c) {
		// TODO Auto-generated method stub
		return new ValidationCommentProcessImpl2(c);
	}
}
