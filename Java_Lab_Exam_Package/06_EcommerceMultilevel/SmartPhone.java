class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class ElectronicProduct extends Product {
    int warranty;
    double gst;

    ElectronicProduct(int id, String name, double price, int warranty, double gst) {
        super(id, name, price);
        this.warranty = warranty;
        this.gst = gst;
    }
}

class SmartPhone extends ElectronicProduct {
    int storage;
    double insurance;

    SmartPhone(int id, String name, double price, int warranty, double gst, int storage, double insurance) {
        super(id, name, price, warranty, gst);
        this.storage = storage;
        this.insurance = insurance;
    }

    void display() {
        double gstAmount = price * gst / 100;
        double finalPrice = price + gstAmount + insurance;
        System.out.println("Product: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("GST: " + gstAmount);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Insurance: " + insurance);
        System.out.println("Final Price: " + finalPrice);
    }

    public static void main(String[] args) {
        SmartPhone s = new SmartPhone(101, "Phone", 20000, 2, 18, 128, 500);
        s.display();
    }
}
