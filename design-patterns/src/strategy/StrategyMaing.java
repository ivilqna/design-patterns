package strategy;

public class StrategyMaing {

	public static void main(String[] args) {


		ShoppingCart shoppingCart = new ShoppingCart();
		
		Product product1= new Product("Apples", 2.4);
		Product product2 = new Product("Bananas",3);
		
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		
		shoppingCart.pay(new PaypalStrategy("ivan@abv.bg","123"));
		shoppingCart.pay(new CreditCardStrategy("Ivan Ivanov","1234 1234 1234 1234","10/22","123"));

	}

}
