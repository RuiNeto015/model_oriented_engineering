package pt.isep.enorm.atb.cr2.proto2.domain;

public class Factory {

	public static Article newArticle(String title, String author, String text, String date) {
		Article a=new Article(title, author, text, date);
		return a;
	}

	public static Comment newComment(String author, String text, String date) {
		Comment c=new Comment(author, text, date);
		return c;
	}
	
}
