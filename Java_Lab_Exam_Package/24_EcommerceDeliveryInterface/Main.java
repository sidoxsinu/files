interface DeliveryService {
    double calculateDeliveryCharge(double dist, double wt);
    String estimateDeliveryTime();
}

interface Trackable {
    void trackOrder();
    void updateLocation(String loc);
}

class StandardDelivery implements DeliveryService, Trackable {
    String loc = "Hub";
    public double calculateDeliveryCharge(double d, double w) { return d * 2 + w * 10; }
    public String estimateDeliveryTime() { return "5 days"; }
    public void trackOrder() { System.out.println("Standard: " + loc); }
    public void updateLocation(String l) { loc = l; }
}

class ExpressDelivery implements DeliveryService, Trackable {
    String loc = "Hub";
    public double calculateDeliveryCharge(double d, double w) { return d * 5 + w * 20; }
    public String estimateDeliveryTime() { return "2 days"; }
    public void trackOrder() { System.out.println("Express: " + loc); }
    public void updateLocation(String l) { loc = l; }
}

class InternationalDelivery implements DeliveryService, Trackable {
    String loc = "Hub";
    public double calculateDeliveryCharge(double d, double w) { return d * 10 + w * 30 + 500; }
    public String estimateDeliveryTime() { return "10 days"; }
    public void trackOrder() { System.out.println("International: " + loc); }
    public void updateLocation(String l) { loc = l; }
}

class Main {
    public static void main(String[] args) {
        DeliveryService d = new ExpressDelivery();
        System.out.println("Charge: " + d.calculateDeliveryCharge(10, 2));
        System.out.println("Time: " + d.estimateDeliveryTime());

        Trackable t = (Trackable) d;
        t.updateLocation("Kochi");
        t.trackOrder();
    }
}
