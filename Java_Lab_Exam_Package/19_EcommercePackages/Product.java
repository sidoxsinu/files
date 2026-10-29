package shopping.product;

public class Product {
    private int id;
    String category = "General";
    protected double price;
    public String name;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public double getPrice() { return price; }
}
