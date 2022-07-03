package beverages;

public class CakeBuilder {

	private Cake cake;
	private Beverage beverage;
    private boolean isBeverage;

	public CakeBuilder(Beverage beverage) {
		this.cake = new Cake(beverage);
	}
	
	public final CakeBuilder cake() {
		isBeverage = false;
		return this;
	}

	public final CakeBuilder cake(Beverage beverage) {
		isBeverage = true;
		return this;
	}

	public final Cake make() {
		return cake;
	}
 }
