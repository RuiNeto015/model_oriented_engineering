package pt.isep.enorm.atb.publico.domain;

import pt.isep.enorm.atb.publico.domain.Comment;

public class ValidationCommentProcessImpl2 implements ValidationCommentProcess {

	private Comment comment=null;

	public ValidationCommentProcessImpl2(Comment c) {
		comment=c;
	}
	
	public boolean validate() {
		return false;
	}
		
}
