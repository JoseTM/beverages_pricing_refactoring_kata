package beverages;

/**
 * abstract bridge entre Beverages y Desert
 */
public abstract class Postre implements Desert{
    Beverage beverage;
    Desert desert;



    public abstract Beverage getBeverage();

    public abstract void setBeverage(Beverage beverage);

    public Desert getDesert() {
        return desert;
    }

    public void setDesert(Desert desert) {
        this.desert = desert;
    }
}
