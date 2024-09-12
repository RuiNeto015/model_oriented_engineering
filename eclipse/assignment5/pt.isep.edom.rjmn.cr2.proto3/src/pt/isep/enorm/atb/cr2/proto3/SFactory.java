package pt.isep.enorm.atb.cr2.proto3;

import pt.isep.enorm.atb.cr2.proto3.domain.Comment;
import pt.isep.enorm.atb.cr2.proto3.domain.ValidationCommentProcess;

public interface SFactory {

	ValidationCommentProcess getValidationProcess(Comment c);
}
