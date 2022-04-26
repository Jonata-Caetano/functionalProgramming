package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

//1. Ordenar por Titulo
//2. Buscar pelos 3 primeiros e preço menor que 5.
public class ProgramC {
	
	private static List<Product> list = new ArrayList<>(List.of(
			new Product("Celular", 10.00),
			new Product("TV", 8.00),
			new Product("Computador", 5.00),
			new Product("Guitarra", 3.00),
			new Product("Mouse", 2.00)));
	
	public static void main(String[] args) {
		
		list.stream()
				.sorted(Comparator.comparing(Product:: getName))
				.filter(p -> p.getPrice() <= 5)
				.limit(3)
				.map(Product:: getClass)
				.collect(Collectors.toList());
		
	}
}
