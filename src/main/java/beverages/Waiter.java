package beverages;

public class Waiter {

	public static TeaBuilder tea() {
		return new TeaBuilder();
	}
	
	public static CoffeeBuilder coffee() {
		return new CoffeeBuilder();
	}

	public static HotChocolateBuilder hotChocolate() {
		return new HotChocolateBuilder();
	}

	public static FantaBeverageBuilder fanta(){
		return new FantaBeverageBuilder();
	}

	public static CokeBeverageBuilder coke(){
		return new CokeBeverageBuilder();
	}

}
