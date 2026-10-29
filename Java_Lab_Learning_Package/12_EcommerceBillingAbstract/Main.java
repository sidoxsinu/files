abstract class Product {
    int id, qty;
    String name;
    double price;

    Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    abstract double calculateFinalPrice();

    void display() {
        System.out.println(name + " Original: " + (price * qty) + " Final: " + calculateFinalPrice());
    }
}

class Electronics extends Product {
    Electronics(int id, String name, double price, int qty) {
        super(id, name, price, qty);
    }

    double calculateFinalPrice() {
        double total = price * qty;
        return total + (total * 0.18) + 500;
    }
}

class Clothing extends Product {
    Clothing(int id, String name, double price, int qty) {
        super(id, name, price, qty);
    }

    double calculateFinalPrice() {
        double total = price * qty;
        double disc = total >= 2000 ? total * 0.10 : 0;
        return (total - disc) + (total - disc) * 0.05;
    }
}

class Grocery extends Product {
    Grocery(int id, String name, double price, int qty) {
        super(id, name, price, qty);
    }

    double calculateFinalPrice() {
        double total = price * qty;
        double disc = qty >= 10 ? total * 0.05 : 0;
        return (total - disc) + (total - disc) * 0.05;
    }
}

class Main {
    public static void main(String[] args) {
        Product[] p = {
            new Electronics(1, "Laptop", 10000, 1),
            new Clothing(2, "Shirt", 1000, 3),
            new Grocery(3, "Rice", 100, 12)
        };

        for (Product item : p) {
            item.display();
        }
    }
}
