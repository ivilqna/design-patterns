package abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		// Color factory cannot create shape instance
		return null;
	}

	@Override
	Color getColor(String color) {
		
		if(color == "BLUE") {
			return new Blue();
		}
		
		if(color == "RED") {
			return new Red();
		}
		
		System.out.println("Unknown color:" + color);
		
		return null;
	}

}
