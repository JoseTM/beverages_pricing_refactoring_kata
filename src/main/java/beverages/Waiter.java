package beverages;

public class Waiter {
    private static final Coffee _coffee;
    private static final Tea _tea;
    private static final HotChocolate _hotChocolate;
    private static final TeaWithMilk _teaWithMilk ;

    static{
		_coffee = new Coffee();
		_tea = new Tea();
		_hotChocolate = new HotChocolate();
		_teaWithMilk = new TeaWithMilk();
	}

	public Coffee serveCoffee() {
		return (Coffee) this._coffee.clone();
	}

	public Tea serveTea() {
		return (Tea) this._tea.clone();
	}

	public Tea serveTeaWithMilk(){
		return (Tea) this._teaWithMilk.clone();
	}

	public HotChocolate serveHotChocolate() {
		return (HotChocolate) this._hotChocolate.clone();
	}
}
