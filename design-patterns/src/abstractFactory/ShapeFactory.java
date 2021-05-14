package abstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		
		if(shape == "CIRCLE") {
			return new Circle();
		}
		
		if(shape == "SQUARE") {
			return new Square();
		}
		
		System.out.println("Unknown shape: " + shape);
		
		return null;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
