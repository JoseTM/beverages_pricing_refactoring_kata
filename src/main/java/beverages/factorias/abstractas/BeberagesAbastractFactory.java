package beverages.factorias.abstractas;


import beverages.interfaces.IBeverage;

import java.util.Objects;


public abstract class BeberagesAbastractFactory {

    private static Object _beberage;


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


    public abstract IBeverage createBeverage();

    public abstract IBeverage createWithMilk();
    public abstract IBeverage createWithCinammon();
    public abstract IBeverage createWithCream();




}
