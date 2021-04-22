package builder;

public class Cake {

	private final double sugar;
	private final int eggs;
	private final double cocoa;
	private final int vanilla;
	private final double milk;
	
	static class Builder {
		
		private  double sugar;
		private  int eggs;
		private  double cocoa;
		private  int vanilla;
		private  double milk;
		
		public Builder sugar(double cups) {
			
			this.sugar= cups;
			return this;
		}
		
		public Builder eggs(int count) {
			
			this.eggs= count;
			return this;
		}

		public Builder cocoa(double spoons) {
	
			this.cocoa= spoons;
			return this;
}

		public Builder vanilla(int packages) {
			
			this.vanilla= packages;
			return this;
}

		public Builder milk(double cups) {
	
			this.milk= milk;
			return this;
}
	public Cake build() {
		return new Cake(this);
	}

	
}
	
	private Cake (Builder builder) {
		this.sugar=builder.sugar;
		this.eggs=builder.eggs;
		this.cocoa=builder.cocoa;
		this.vanilla=builder.vanilla;
		this.milk=builder.milk;
	}
}
