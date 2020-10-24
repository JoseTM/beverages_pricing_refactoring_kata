package beverages;

public class CokeBeverageBuilder {

	private FreshBeverage beverage;

	private boolean coke = false;


	public CokeBeverageBuilder() {
		beverage = new Coke();
	}
	
	public final CokeBeverageBuilder coke() {
		coke = true;
		return this;
	}


	public final FreshBeverage make() {
		if(coke) {
			beverage = new Coke();
		}


		return beverage;
	}
 }
