package visitor;

public class Book implements Product {
	
	private String title;
	private String isbnNumber;
	private double price;

	public Book(String title, String isbnNumber, double price) {
		this.title = title;
		this.isbnNumber = isbnNumber;
		this.price = price; 
	}

	public String getTitle() {
		return title;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {	
		return visitor.visit(this);
	}

}
