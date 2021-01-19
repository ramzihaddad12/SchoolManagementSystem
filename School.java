package school.management.system;

import java.util.List;

public class School {

    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    private List<Teacher> teachers;
    private List<Student> students;

    public School(List<Teacher> teachers, List<Student> students){ //constructor
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
    //Getter and Setter functions
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int newMoneyEarned) {
        totalMoneyEarned += newMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int newMoneySpent) {
        totalMoneySpent += newMoneySpent;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher newTeacher) {
        teachers.add(newTeacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }
}
