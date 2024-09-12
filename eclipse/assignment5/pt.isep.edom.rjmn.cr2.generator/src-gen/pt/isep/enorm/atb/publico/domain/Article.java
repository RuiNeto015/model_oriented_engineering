package pt.isep.enorm.atb.publico.domain;

import java.util.ArrayList;
import java.util.List;

public class Article {
	
	
	private String title;
	
	private String text;
	
	private String author;
	

	private List<Comment> comments;	

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

  /**
   * Gets the value of title
   */
   public String getTitle() {
      return title;
   }

  /**
   * Sets the value of title
   */
   public void setTitle(String title) {
      this.title = title;
   }
  /**
   * Gets the value of text
   */
   public String getText() {
      return text;
   }

  /**
   * Sets the value of text
   */
   public void setText(String text) {
      this.text = text;
   }
  /**
   * Gets the value of author
   */
   public String getAuthor() {
      return author;
   }

  /**
   * Sets the value of author
   */
   public void setAuthor(String author) {
      this.author = author;
   }
		
	protected Article(String title, String text, String author) {
	
		this.title=title; 	
		this.text=text; 	
		this.author=author; 	
		
		
		this.comments=new ArrayList<Comment>(); 	
		
		// protected region user code on begin
		// begin user code
		// end user code
		// protected region user code end					
	}

	public String toString() {
		return " Title: "+ this.title+ " Text: "+ this.text+ " Author: "+ this.author;		
	}
}