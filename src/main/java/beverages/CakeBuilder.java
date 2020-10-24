package beverages;

public class CakeBuilder {

	private Cake cake;
    private boolean isCake;

	public CakeBuilder(Beverage beverage) {
		this.cake = new Cake(beverage);
	}
	
	public final CakeBuilder cake() {
		isCake = true;
		return this;
	}


	public final Cake make(Beverage beverage) {
		if(isCake) {
			cake = new Cake(beverage);
		}


		return cake;
	}
 }
