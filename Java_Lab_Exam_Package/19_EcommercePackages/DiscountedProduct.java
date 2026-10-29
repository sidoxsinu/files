package shopping.order;

import shopping.product.Product;

public class DiscountedProduct extends Product {
    public DiscountedProduct(int id, String name, double price) {
        super(id, name, price);
    }

    public double discount() { return price * 0.10; }
    public double finalPrice() { return price - discount(); }

    public void display() {
        System.out.println("Product: " + name + " ID: " + getId() + " Final Price: " + finalPrice());
    }
}
