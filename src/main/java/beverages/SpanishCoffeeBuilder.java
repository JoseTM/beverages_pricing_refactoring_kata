package beverages;

public class SpanishCoffeeBuilder {

	private Beverage beverage;
	private boolean withMilk = false;
	private boolean withCream = false;
	private boolean withCinammon = false;

	public SpanishCoffeeBuilder() {
		beverage = new SpanishCoffeeAdapter();
	}
	
	public final SpanishCoffeeBuilder withMilk() {
		withMilk = true;
		return this;
	}
	public final SpanishCoffeeBuilder withCream() {
		withCream = true;
		return this;
	}
	public final SpanishCoffeeBuilder withCinammon() {
		withCinammon = true;
		return this;
	}
	public final Beverage make() {
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
