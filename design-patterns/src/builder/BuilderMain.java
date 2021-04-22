package builder;

public class BuilderMain {

	public static void main(String[] args) {
		Cake cocoaCake = new Cake.Builder().cocoa(15).eggs(3).milk(1).sugar(1).build();
		
		Cake vanillaCake = new Cake.Builder().vanilla(3).sugar(2).eggs(3).milk(2).build();
	}

}
