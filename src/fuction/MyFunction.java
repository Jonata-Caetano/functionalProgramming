package fuction;

import java.util.function.Function;

import entities.Product;

public class MyFunction implements Function<Product, String>{

	@Override
	public String apply(Product product) {
		return product.getName().toUpperCase();
	}


}
