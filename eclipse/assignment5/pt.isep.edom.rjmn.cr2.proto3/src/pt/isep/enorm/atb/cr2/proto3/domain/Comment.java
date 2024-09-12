package pt.isep.enorm.atb.cr2.proto3.domain;

public class Comment {

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String text;
	private String author;
	private String date;
		
	protected Comment(String text, String author, String date) {
		this.text=text;
		this.author=author;
		this.date=date;
	}

	public String toString() {
		return this.text + " - Author: "+ this.author + " - Date: " + this.date; 
	}
}
