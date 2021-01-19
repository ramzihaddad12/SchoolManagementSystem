package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Pam = new Teacher(1, "Pam", 500);
        Teacher Angela = new Teacher(2, "Angela", 200);
        Teacher Kelly = new Teacher(3, "Kelly", 400);
        Teacher Phyllis = new Teacher(4, "Phyllis", 250);
        List<Teacher> teachers = new ArrayList<>();
        //Method 1 to add teacher
        teachers.add(Pam);
        teachers.add(Angela);
        teachers.add(Kelly);

        Student Michael = new Student("Michael", 1, 4);
        Student Jim = new Student("Jim", 2, 12);
        Student Dwight = new Student("Dwight", 3,4);

        List<Student> students = new ArrayList<>();
        students.add(Michael);
        students.add(Jim);
        students.add(Dwight);

        School DunderMifflin = new School(teachers, students);


        Michael.payFee(2000);
        System.out.println(DunderMifflin.getTotalMoneyEarned());

        Jim.payFee(3000);
        System.out.println(DunderMifflin.getTotalMoneyEarned());
        ///////////////////////////////////
        Pam.receiveSalary(100);
        Kelly.receiveSalary(125);
        System.out.println(DunderMifflin.getTotalMoneySpent());

        System.out.println(Pam);

        //Method 2: use method from School class
        DunderMifflin.addTeacher(Phyllis);
    }
}
