package beverages;

public abstract class
BeveragesWith implements Beverage {

    public double withMilk(){
        return 0.10;
    }

    public double withCream(){
        return 0.15;
    }

    public double withCinnamon(){
        return 0.05;
    }
}
