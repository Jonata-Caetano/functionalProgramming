package predicate;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product product) {
		return product.getPrice() >= 1000.00;
	}

}
