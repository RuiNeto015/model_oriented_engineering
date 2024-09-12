package pt.isep.enorm.atb.publico.domain;

public class Factory {

	public static Article newArticle(  String title,  String text,  String author	) {
		Article a=new Article(title, text, author);
		return a;
	}

	public static Comment newComment(String author, String text, String date) {
		Comment c=new Comment(author, text, date);
		return c;
	}
	
}