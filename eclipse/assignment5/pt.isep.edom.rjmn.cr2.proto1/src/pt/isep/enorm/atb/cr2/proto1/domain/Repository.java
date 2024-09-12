package pt.isep.enorm.atb.cr2.proto1.domain;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	
	private List<Product> products;
	
	private static Repository repository=null;
	
	private Repository() {
		products=new ArrayList<Product>();
	}
	
	public static Repository getRepository() {
		if (repository==null) {
			repository=new Repository();
		}
		return repository;
	}
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void saveProduct(Product p) {
		products.add(p);
	}
	
	public Product getProductByName(String name) {
		for (Product p: products) {
			if (p.getName().compareTo(name)==0) return p;
		}
		return null;
	}	
}
