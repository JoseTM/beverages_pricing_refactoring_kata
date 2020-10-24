package beverages;

public class SpanishCoffeeAdapter implements Beverage{

    private SpanishCoffee spanishCoffee;

    SpanishCoffeeAdapter(){
        spanishCoffee = new SpanishCoffee();
    }

    @Override
    public double price() {
         return spanishCoffee.precio();
    }


}
