package Publico;

import java.util.ArrayList;
import java.util.List;

public class Article {

	private String Title;
	private String Text;
	private String Author;
	private List<Comment> comments;

	/**
	 * Gets the value of Title
	 */
	public String getTitle() {
		return Title;
	}
	
	/**
	 * Sets the value of Title
	 */
	public void setTitle(String Title) {
		this.Title = Title;
	}
	
	/**
	 * Gets the value of Text
	 */
	public String getText() {
		return Text;
	}
	
	/**
	 * Sets the value of Text
	 */
	public void setText(String Text) {
		this.Text = Text;
	}
	
	/**
	 * Gets the value of Author
	 */
	public String getAuthor() {
		return Author;
	}
	
	/**
	 * Sets the value of Author
	 */
	public void setAuthor(String Author) {
		this.Author = Author;
	}
	
	/**
	 * Gets the value of Comments
	 */
	public List<Comment> getComments() {
		return comments;
	}
	
	/**
	 * Sets the value of Comments
	 */
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
		
	public String toString() {
		return "Title: " + Title + " " + "Text: " + Text + " " + "Author: " + Author;
	}
}
