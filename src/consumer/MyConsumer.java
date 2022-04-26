package consumer;

import java.util.function.Consumer;

import entities.Product;

public class MyConsumer implements Consumer<Product> {

	@Override
	public void accept(Product product) {
		product.setPrice(product.getPrice() * 1.1);
		
	}

}
