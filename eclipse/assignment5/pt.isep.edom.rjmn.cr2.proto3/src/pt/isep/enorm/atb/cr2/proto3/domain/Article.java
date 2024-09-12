package pt.isep.enorm.atb.cr2.proto3.domain;

import java.util.ArrayList;
import java.util.List;

public class Article {
	
	private String title;
	private String author;
	private String text;
	private String date;
	private List<Comment> comments;	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	protected Article(String title, String author, String text, String date) {
		this.title=title;
		this.author=author;
		this.text=text;
		this.date=date;
		this.comments=new ArrayList<Comment>();
	}

	public String toString() {
		return this.title + " - Author: "+ this.author + " - Text: "+ this.text + " - Date: " + this.date; 
	}
}
