package strategy;

public class PaypalStrategy implements PaymentStrategy {

	private String email;
	private String password;
	
	public PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}
	public void pay(double annount) {
		System.out.println("Paypal paument: " + annount);
	}

}
