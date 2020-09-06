package beverages;

import beverages.interfaces.IBeverage;

public class CoffeeBuilder {

	private IBeverage beverage;
	private boolean withMilk = false;
	private boolean withCream = false;
	private boolean withCinammon = false;
	
	public CoffeeBuilder() {
		beverage = new Coffee();
	}
	
	public final CoffeeBuilder withMilk() {
		withMilk = true;
		return this;
	}
	public final CoffeeBuilder withCream() {
		withCream = true;
		return this;
	}
	public final CoffeeBuilder withCinammon() {
		withCinammon = true;
		return this;
	}
	public final IBeverage make() {
		if(withMilk) {
			beverage = new WithMilk(beverage);
		}
		if(withCream) {
			beverage = new WithCream(beverage);
		}
		if(withCinammon) {
			beverage = new WithCinammon(beverage);
		}
		return beverage;
	}
 }
