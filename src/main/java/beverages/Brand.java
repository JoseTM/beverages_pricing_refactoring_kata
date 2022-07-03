package beverages;

public enum Brand {

    COCA_COLA("Coca Cola","Coca Cola"),
    FANTA("Fanta", "Coca Cola"),
    @Deprecated  MIRINDA("Mirinda", "Pepsi Cola");

    private final String brand;
    private final String maker;

    Brand(String brand, String maker) {
        this.brand = brand;
        this.maker = maker;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaker() {
        return maker;
    }
}
