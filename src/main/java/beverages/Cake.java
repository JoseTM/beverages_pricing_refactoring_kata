package beverages;

public class Cake extends  Postre {

    private boolean sugar;

    public Cake(Beverage beverage) {
        this.sugar = true;
        this.beverage = beverage;
    }

    @Override
    public Beverage getBeverage() {
        return this.beverage;
    }

    @Override
    public void setBeverage(Beverage beverage ) {
        this.beverage = beverage;
    }

    @Override
    public boolean isSugared() {
        return sugar;
    }

    @Override
    public double price() {
        return this.beverage.price() + 2.5;
    }
}
