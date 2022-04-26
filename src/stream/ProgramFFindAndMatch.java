package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class ProgramFFindAndMatch {

	private static List<Product> products = new ArrayList<>(
			List.of(new Product("Celular", 10.00),
					new Product("TV", 8.00),
					new Product("Computador", 5.00),
					new Product("Guitarra", 3.00),
					new Product("Guitarra", 3.00),
					new Product("Mouse", 2.00)));

	public static void main(String[] args) {

		//Todas a funções abaixo recebem um Predicate (interface funcional) como parâmetro, 
		//utilizando o método test que retorna um boolean.
		
		//Existe algum produto maior que 9?
		System.out.println(products.stream().anyMatch(product -> product.getPrice() > 9));
		//Todos os produtos sao maior que 0?
		System.out.println(products.stream().allMatch(product -> product.getPrice() > 0));
		//Nenhum elemento é maior que zero?
		System.out.println(products.stream().noneMatch(product -> product.getPrice() < 0));
		
		//Os Find's retornam um Optional, pois a busca pode resultar em null.
		
		//Irá encontrar qualquer produto maior 3.
		products.stream()
		.filter(product -> product.getPrice() > 3)
		.sorted(Comparator.comparing(Product::getPrice))
		.findAny().ifPresent(System.out::println);
		
		//Irá encontrar o primeiro produto maior que 3.
		products.stream()
		.filter(product -> product.getPrice() > 3)
		.max(Comparator.comparing(Product::getPrice))
		.ifPresent(System.out::println);

	}
}