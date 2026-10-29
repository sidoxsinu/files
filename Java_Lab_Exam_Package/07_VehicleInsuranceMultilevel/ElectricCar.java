class Vehicle {
    String regNo, owner;
    double value;

    Vehicle(String r, String o, double v) {
        regNo = r;
        owner = o;
        value = v;
    }
}

class Car extends Vehicle {
    double premium;

    Car(String r, String o, double v) {
        super(r, o, v);
        premium = value * 0.05;
    }
}

class ElectricCar extends Car {
    int battery;

    ElectricCar(String r, String o, double v, int b) {
        super(r, o, v);
        battery = b;
    }

    void display() {
        double batteryCharge = battery * 100;
        double total = premium + batteryCharge;
        System.out.println("Reg No: " + regNo);
        System.out.println("Owner: " + owner);
        System.out.println("Value: " + value);
        System.out.println("Basic Premium: " + premium);
        System.out.println("Battery Insurance: " + batteryCharge);
        System.out.println("Total Premium: " + total);
    }

    public static void main(String[] args) {
        ElectricCar e = new ElectricCar("KL01AB1234", "Arun", 500000, 50);
        e.display();
    }
}
