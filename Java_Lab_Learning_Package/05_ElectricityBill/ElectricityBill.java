class ElectricityBill {
    int no, units;
    String name;
    double bill;

    ElectricityBill(int no, String name, int units) {
        this.no = no;
        this.name = name;
        this.units = units;
        calculate();
    }

    void calculate() {
        if (units <= 100) bill = units * 2;
        else if (units <= 200) bill = 100 * 2 + (units - 100) * 3;
        else bill = 100 * 2 + 100 * 3 + (units - 200) * 5;
    }

    void display() {
        System.out.println("Consumer: " + no + " Name: " + name + " Units: " + units + " Bill: " + bill);
    }

    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill(101, "Arun", 75);
        ElectricityBill e2 = new ElectricityBill(102, "Anu", 150);
        ElectricityBill e3 = new ElectricityBill(103, "Ravi", 250);
        e1.display();
        e2.display();
        e3.display();
    }
}
