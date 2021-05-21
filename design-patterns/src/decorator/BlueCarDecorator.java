package decorator;

public class BlueCarDecorator extends CarDecorator {

	public BlueCarDecorator( Car decoratedCar) {
		super(decoratedCar);
	}	
		public void create() {
			this.decoratedCar.create();
			setBlueColor();
		}
	
	
private void setBlueColor() {
	 System.out.println("Setting blue to the decorated car");
}
}
