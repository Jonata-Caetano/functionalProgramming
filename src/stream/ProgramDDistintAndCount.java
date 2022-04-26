package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import entities.Product;

public class ProgramDDistintAndCount {
	
	private static List<Product> products = new ArrayList<>(List.of(
			new Product("Celular", 10.00),
			new Product("TV", 8.00),
			new Product("Computador", 5.00),
			new Product("Guitarra", 3.00),
			new Product("Guitarra", 3.00),
			new Product("Mouse", 2.00)));
	
	public static void main(String[] args) {
		Stream<Product> stream = products.stream();
		products.forEach(System.out::println);
		
		//Distinct - Utilizado quando você precisa buscar itens que nao se repetem na lista.
		long count = stream
				.distinct()
				.filter(ln  -> ln.getPrice() <= 5)
				.count();
		System.out.println(count);
	}

}
