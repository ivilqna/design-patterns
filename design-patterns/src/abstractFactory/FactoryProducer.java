package abstractFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		
		if(factory == "SHAPE") {
			return new ShapeFactory();
		}
		
		if(factory == "COLOR") {
			return new ColorFactory();
		}
		System.out.println("Unknown factory:" + factory);
		
		
		return null;
	}
}
