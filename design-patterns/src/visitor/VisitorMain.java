package visitor;

public class VisitorMain {

	public static void main(String[] args) {

		Product book = new Book("The witcher", "SSN123AAS34 " , 70);
		Fruit apples = new Fruit("Apple", 2.5, 3);
		Fruit bananas = new Fruit("Bananas", 3.5, 2);
		
		ShoppingCartVisitor shoppingCart = new ShoppingCart();
		double bookPrice = book.accept(shoppingCart);
		double applesPrice = apples.accept(shoppingCart);
		double bananasPrice = bananas.accept(shoppingCart);
		
	}

}
