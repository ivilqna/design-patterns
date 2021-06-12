package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Product> products;
	
	public ShoppingCart() {
	this.products = new ArrayList<Product>();
	}
	
	public void addProduct (Product product) {
		this.products.add(product);
	}
	
	public void removeProduct (Product product) {
		this.products.remove(product);
	}
	
	public double getTotal() {
		double total = 0;
		for(Product product : products) {
			total = total + product.getPrice();
		}
		return total;
	}
	
	
		public void pay(PaymentStrategy paymentstrategy ) {
			double total = this.getTotal();
			paymentstrategy.pay(total);
		}
		
}