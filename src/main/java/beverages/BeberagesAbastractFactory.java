package beverages;


import java.util.Objects;

public abstract class BeberagesAbastractFactory {

    private static Object _beberage;

    protected static Object newInstanceOf(Object beverage) throws IllegalAccessException, InstantiationException {
        if (Objects.isNull(_beberage)) {
            _beberage = beverage.getClass().newInstance();
        }
        return _beberage;
    };


    public abstract Beverage createBeverage();

    public abstract Beverage createWithMilk();
    public abstract Beverage createWithCinammon();
    public abstract Beverage createWithCream();




}
