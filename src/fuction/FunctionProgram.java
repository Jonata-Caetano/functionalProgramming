package fuction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class FunctionProgram {
	
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<>();

		productList.add(new Product("TV", 900.00));
		productList.add(new Product("Notebook", 1200.00));
		productList.add(new Product("Tablet", 450.00));
		productList.add(new Product("Celular", 1000.00));
		
		/**
		 * 1-Imlementação da Interface
		 * Obs.: A função "map" é uma função que aplica uma função a todos elementos de uma stream.
		 */
//		List<String> names = productList.stream().map(new MyFunction()).collect(Collectors.toList());
		
		/**
		 * 2-Reference Method com método estático
		 */
//		List<String> names = productList.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		/**
		 * 3-Reference Method com método não estático
		 */
//		List<String> names = productList.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		/**
		 * 4- Expressão Lambda declarada
		 */
//		Function<Product, String> function = product -> product.getName().toUpperCase();
//		
//		List<String> names = productList.stream().map(function).collect(Collectors.toList());
//		names.forEach(System.out::println);
		
		/**
		 * 5- Expressão Lambda inline
		 */
		List<String> names = productList.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
		
	}

}
