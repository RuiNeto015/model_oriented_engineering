package pt.isep.enorm.atb.publico;

import pt.isep.enorm.atb.publico.domain.Comment;
import pt.isep.enorm.atb.publico.domain.ValidationCommentProcess;

public interface SFactory {

	ValidationCommentProcess getValidationProcess(Comment c);
}
