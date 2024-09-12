package pt.isep.enorm.atb.publico.domain;

import pt.isep.enorm.atb.publico.domain.Comment;

public class ValidationCommentProcessImpl implements ValidationCommentProcess {
	
	private Comment comment=null;

	public ValidationCommentProcessImpl(Comment c) {
		comment=c;
	}
	
	public boolean validate() {
		
		boolean result=false;
		
		result=autoValidation();
				
		if (result==false) {
			// End node
			return result;
		}
		else {
			result=manualValidation();
			if (result==false) {
				// End node
				return result;				
			}
			else {
				// End node
				return result;				
			}
		}
	}
	
	private boolean autoValidation() {
		
		// call automatica validation routine/method
		if (comment.getText().contains("pig")) {
			return false;
		}
		else {
			return true;
		}
	}
	
	private boolean manualValidation() {
		
		// someone has to look into this comment
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.println("As a moderator, do you accept the previous comment? (yes/no)");
		String answer = in.nextLine();
		if (answer.compareTo("yes")==0) {
			return true;
		}
		else {
			return false;			
		}
	}
}
