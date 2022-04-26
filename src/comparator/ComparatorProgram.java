package comparator;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class ComparatorProgram {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<>();

		productList.add(new Product("TV", 900.00));
		productList.add(new Product("Notebook", 1200.00));
		productList.add(new Product("Tablet", 450.00));
		productList.add(new Product("Celular", 1000.00));

		/**
		 * 1 - Implementando uma nova instancia.
		 */
//		productList.sort(new MyComparator());

		/**
		 * 2 - Implementando uma classe anonima direto na Classe
		 */
//		Comparator<Product> comparator = new Comparator<Product>() {
//			
//			@Override
//			public int compare(Product p1, Product p2) {
//				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//			}
//		};
//		
//		productList.sort(comparator);

		/**
		 * 3 - Usando arrow fuction. (função anonima).
		 */
//		Comparator<Product> comparator = (p1, p2) -> {
//			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//		};
//
		/**
		 * 3.1 - Refatorando - Usando arrow fuction. (função anonima).
		 */
//		Comparator<Product> comparator = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

//		productList.sort(comparator);

		/**
		 * 4 - Inserindo lambda inline.
		 */
		productList.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		// para cada produto na lista de produtos.
		for (Product product : productList) {
			System.out.println(product);
		}

	}

}
