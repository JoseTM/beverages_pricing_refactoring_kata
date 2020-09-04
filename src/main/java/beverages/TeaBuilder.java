package beverages;

public class TeaBuilder {
	private boolean withMilk = false;
	private boolean withCinammon = false;
	private Beverage beverage;
	
	public TeaBuilder() {
		this.beverage = new Tea();
	}
	
	public  final TeaBuilder withMilk () {
		withMilk = true;
		return this;
	}
	
	public TeaBuilder withCinammon() {
		withCinammon = true;
		return this;
	}
	
	public Beverage make() {
		if (withMilk) {			
			beverage = new WithMilk(beverage);
		}
		if (withCinammon) {
			beverage = new WithCinammon(beverage);
		}
		
		return beverage;
	}
}
