package factorymethod;

public class MilkFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String productName) {
	
		FarmProduct product = null;
		
		if(productName == "COW_MILK") {
			product = new CowMilk();
			product.setPrice(2.1);
		}
		
		if(productName == "GOAT_MILK") {
			product = new GoatMilk();
			product.setPrice(2.5);
		}
		
		return product;
	}

}
