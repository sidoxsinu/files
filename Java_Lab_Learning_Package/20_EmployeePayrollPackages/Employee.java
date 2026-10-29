package company.employee;

public class Employee {
    private int id;
    private double basic;
    String dept = "CSE";
    protected String grade = "A";
    public String name;

    public Employee(int id, String name, double basic) {
        this.id = id;
        this.name = name;
        this.basic = basic;
    }

    public int getId() { return id; }
    public double getBasic() { return basic; }
}
