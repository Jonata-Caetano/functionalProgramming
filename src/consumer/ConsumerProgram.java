package consumer;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ConsumerProgram {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();

		productList.add(new Product("TV", 900.00));
		productList.add(new Product("Notebook", 1200.00));
		productList.add(new Product("Tablet", 450.00));
		productList.add(new Product("Celular", 1000.00));

		/**
		 * 1- Aplicando uma instancia de Consumer
		 */
//		productList.forEach(new MyConsumer());

		/**
		 * 2- Consumer com method reference static
		 */
//		productList.forEach(Product::staticPriceUpdate);
		
		/**
		 * 3-Consumer com method reference nonStatic
		 */
//		productList.forEach(Product::nonStaticPriceUpdate);
		
		double factor = 1.1;
		
		/**
		 * 4- Consumer com expressão lambda declarada
		 */
//		Consumer<Product> consumer = product -> product.setPrice(product.getPrice() * factor);
//		productList.forEach(consumer);
		
		/**
		 * 5- Expressão lambda inline
		 */
		productList.forEach(product -> product.setPrice(product.getPrice() * factor));
	
		productList.forEach(System.out::println);
	}
	

}
