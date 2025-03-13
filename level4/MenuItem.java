package level4;

public class MenuItem {
    private String name;
    private double price;
    private String explain;

    MenuItem(String name, double price, String explain){
        this.name = name;
        this.price = price;
        this.explain = explain;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }
}