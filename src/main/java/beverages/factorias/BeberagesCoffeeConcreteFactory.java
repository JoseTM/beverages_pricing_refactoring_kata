package beverages.factorias;

import beverages.interfaces.Beverage;
import beverages.Waiter;
import beverages.factorias.abstractas.BeberagesAbastractFactory;

public class BeberagesCoffeeConcreteFactory extends BeberagesAbastractFactory {

    private static BeberagesCoffeeConcreteFactory _concreteFactory;


    public static BeberagesCoffeeConcreteFactory newInstance() throws InstantiationException, IllegalAccessException {
         _concreteFactory = new BeberagesCoffeeConcreteFactory() ;
        return (BeberagesCoffeeConcreteFactory) newInstanceOf(_concreteFactory);
    };

    @Override
    public Beverage createBeverage(){
        beberages.put("coffee", "coffee");
        return Waiter.coffee().make();
    }

    @Override
    public Beverage createWithMilk() {
        return Waiter.coffee().withMilk().make();
    }

    @Override
    public Beverage createWithCinammon() {
        return Waiter.coffee().withCinammon().make();
    }

    @Override
    public Beverage createWithCream() {
        return Waiter.coffee().withCream().make();
    }

    /**
     * Métododo presente solo en la instancia concreta
     * @return
     */
    public Beverage createWithMilkAndCream(){
        return Waiter.coffee().withMilk().withCream().make();
    };


}
