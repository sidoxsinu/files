package college.admin;

import college.student.Student;
import college.faculty.ResearchStudent;

public class Admin {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        System.out.println("Name: " + s.name);
        System.out.println("ID via getter: " + s.getId());
        System.out.println("Dept via getter: " + s.getDept());

        ResearchStudent r = new ResearchStudent();
        r.setId(201);
        r.show();
    }
}
