package entities;

import java.util.Objects;

public class Product {

	private String name;
	private Double price;
	
	public Product() {
		super();
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * 2- Predicate com method reference
	 */
//	public static boolean staticProductPredicate(Product product) {
//		return product.getPrice() >= 1000.00;
//		
//	}
	
	/**
	 * 3- Vai trabalhar com o proprio Objeto aonde estou
	 */
//	public boolean nonStaticProductPredicate() {
//		return price >= 1000.00;
//		
//	}
	
	/**
	 * 2-Consumer com method reference
	 */
//	public static void staticPriceUpdate(Product product) {
//		product.setPrice(product.getPrice() * 1.1);
//	}
	
	
	/**
	 * 3- Consumer com método não static
	 */
//	public void nonStaticPriceUpdate() {
//		price = price * 1.1;
//	}
	
	/**
	 * 2- Function com método static
	 */
//	public static String staticUpperCaseName(Product product) {
//		return product.getName().toUpperCase();
//	}
	
	/**
	 * 3-Reference Method com método não estático
	 */
//	public String nonStaticUpperCaseName() {
//		return name.toUpperCase();
//	}
	
	@Override
	public String toString() {
		return "Product: " + name + " | " + String.format("%.2f", price);
	}
	
	
}
