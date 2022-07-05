package beverages;

public class HotChocolateWithCinammon extends BeveragesWith {
    @Override
    public double price() {
        HotChocolate hotChocolate = new HotChocolate();
        return hotChocolate.price() + withCinnamon();
    }
}
