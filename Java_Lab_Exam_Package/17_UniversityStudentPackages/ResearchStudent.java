package college.faculty;

import college.student.Student;

public class ResearchStudent extends Student {
    public void show() {
        System.out.println("Name: " + name + ", CGPA: " + cgpa + ", ID: " + getId());
    }
}
