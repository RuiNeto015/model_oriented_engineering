package pt.isep.enorm.atb.cr2.proto3.domain;

public class ValidationCommentProcessImpl2 implements ValidationCommentProcess {

	private Comment comment=null;

	public ValidationCommentProcessImpl2(Comment c) {
		comment=c;
	}
	
	public boolean validate() {
		return false;
	}
		
}
