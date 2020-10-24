package beverages;

public class Waiter {

	public static TeaBuilder tea() {
		return new TeaBuilder();
	}
	
	public static CoffeeBuilder coffee() {
		return new CoffeeBuilder();
	}

	public static SpanishCoffeeBuilder spanishCoffee() {
		return new SpanishCoffeeBuilder();
	}

	public static HotChocolateBuilder hotChocolate() {
		
		return new HotChocolateBuilder();
	}
}
