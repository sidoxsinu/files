abstract class Transport {
    String no;
    double dist;
    int pass;

    Transport(String no, double dist, int pass) {
        this.no = no;
        this.dist = dist;
        this.pass = pass;
    }

    abstract double calculateFare();

    void display() {
        System.out.println(no + " Fare: " + calculateFare());
    }
}

class Bus extends Transport {
    Bus(String no, double dist, int pass) {
        super(no, dist, pass);
    }

    double calculateFare() {
        return dist * pass * 2;
    }
}

class Taxi extends Transport {
    Taxi(String no, double dist, int pass) {
        super(no, dist, pass);
    }

    double calculateFare() {
        return (dist * 15) + (pass * 50) + 100;
    }
}

class ElectricVehicle extends Transport {
    ElectricVehicle(String no, double dist, int pass) {
        super(no, dist, pass);
    }

    double calculateFare() {
        return (dist * 8) + (pass * 20) + 50;
    }
}

class Main {
    public static void main(String[] args) {
        Transport[] t = {
            new Bus("Bus-101", 10, 20),
            new Taxi("Taxi-202", 10, 2),
            new ElectricVehicle("EV-303", 10, 2)
        };

        for (Transport tr : t) {
            tr.display();
        }
    }
}
