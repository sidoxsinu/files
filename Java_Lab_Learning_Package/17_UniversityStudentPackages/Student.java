package college.student;

public class Student {
    private int id;
    String dept = "CSE";
    protected double cgpa = 8.5;
    public String name = "Arun";

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getDept() { return dept; }
    public void setDept(String d) { this.dept = d; }
}
