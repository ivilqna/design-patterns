package factorymethod;

public class CheeseFactory extends FarmFactory {

	@Override
	public FarmProduct createProduct(String productName) {

		FarmProduct product = null;
		
		if(productName == "COW_CHEESE") {
			product = new CowCheese();
			product.setPrice(3.5);
		}
		
		if(productName == "GOAT_CHEESE") {
			product = new GoatCheese();
			product.setPrice(4.5);
		}
		
		return product;
	}

}
