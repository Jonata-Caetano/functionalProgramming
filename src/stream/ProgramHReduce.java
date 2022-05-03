package stream;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

//Somar todos os preços acima de 3
public class ProgramHReduce {
	
	private static List<Product> products = new ArrayList<>(
			List.of(new Product("Celular", 10.00),
					new Product("TV", 8.00),
					new Product("Computador", 5.00),
					new Product("Guitarra", 3.00),
					new Product("Guitarra", 3.00),
					new Product("Mouse", 2.00)));

	public static void main(String[] args) {
	
		products.stream()
				.map(Product::getPrice)
				.filter(price -> price > 3)
				.reduce(Double::sum)
				.ifPresent(System.out::println);
		
		double sum = products.stream()
		.mapToDouble(Product::getPrice)
		.filter(price -> price > 3)
		.sum();
	}

}
