package beverages;

public class TeaWithCinnamon extends BeveragesWith {
    @Override
    public double price() {
        Tea tea = new Tea();
        return tea.price() + withCinnamon();
    }
}
