package beverages;

public class FantaBeverageBuilder {

	private FreshBeverage beverage;

	private boolean fanta = false;


	public FantaBeverageBuilder() {
		beverage = new Fanta();
	}
	
	public final FantaBeverageBuilder fanta() {
		fanta = true;
		return this;
	}


	public final FreshBeverage make() {
		if(fanta) {
			beverage = new Fanta();
		}


		return beverage;
	}
 }
