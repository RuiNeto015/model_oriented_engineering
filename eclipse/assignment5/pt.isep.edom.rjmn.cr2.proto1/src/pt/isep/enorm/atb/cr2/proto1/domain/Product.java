package pt.isep.enorm.atb.cr2.proto1.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String name;
	private String code;
	private String description;
	private BigDecimal price;
	private List<Review> reviews;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	protected Product(String name, String code, String description, BigDecimal price) {
		this.name=name;
		this.code=code;
		this.description=description;
		this.price=price;
		this.reviews=new ArrayList<Review>();
	}

	public String toString() {
		return this.name + " - Code: "+ this.code + " - Description: "+ this.description + " - Price: " + this.price; 
	}
}
