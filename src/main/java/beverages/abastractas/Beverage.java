package beverages.abastractas;

public abstract class Beverage implements Cloneable{

    public abstract double price();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    };

}
