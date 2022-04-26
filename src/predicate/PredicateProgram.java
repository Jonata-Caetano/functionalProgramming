package predicate;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class PredicateProgram {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();

		productList.add(new Product("TV", 900.00));
		productList.add(new Product("Notebook", 1200.00));
		productList.add(new Product("Tablet", 450.00));
		productList.add(new Product("Celular", 1000.00));
		
		
		/**
		 *  1 - Implmentando um classe Predicate
		 */
//		productList.removeIf(new ProductPredicate());
		
		/**
		 * 2- Predicate com method reference 
		 */
//		productList.removeIf(Product::staticProductPredicate);
		
		/**
		 * 3- Predicate com method reference 
		 */
//		productList.removeIf(Product::nonStaticProductPredicate);
		
		/**
		 * 4- Expressão lambda declarada
		 */
		double min = 1000.00;
//		
//		Predicate<Product> predicate = product -> product.getPrice() >= min;
//		
//		productList.removeIf(predicate);
		
		
		/**
		 * 5 - Expressão lambda inline.
		 */
		productList.removeIf(product -> product.getPrice() >= min);
		
		for (Product product : productList) {
			System.out.println(product);
			
		}

	}

}
