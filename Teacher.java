package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){// constructor
        this.id = id;
        this.name = name;
        this.salary = salary;
        salaryEarned = 0;
    }

    //getter functions

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }
    //

    public void setSalary(int salary) { //set salary for updating/promoting purposes
        this.salary = salary;
    }

    public void receiveSalary(int salaryReceived){
        salaryEarned += salaryReceived;
        School.updateTotalMoneySpent(salaryReceived);
    }

    @Override
    public String toString(){
        return name;
    }
}
