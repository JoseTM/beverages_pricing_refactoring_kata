package beverages.factorias.abstractas;


import beverages.interfaces.Beverage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public abstract class BeberagesAbastractFactory {

    private static Object _beberage;
    protected static Map<String, String> beberages = new HashMap<>();


    protected BeberagesAbastractFactory() {
    }

    /**
     * La clase abstracta tendrá una implementación singleton
     * @param beverage
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
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
