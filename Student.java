package school.management.system;

public class Student {
    private int id;
    private int grade;
    private String name;
    private int feesTotal;
    private int feesPaid;

    public Student(String name, int id, int grade){ //constructor
        this.name = name;
        this.id = id;
        this.grade = grade;

        this.feesTotal = 10000; // tuition is $10,000
        this.feesPaid = 0;
    }

    public void setGrade(int newGrade){// update grade after a year
        this.grade = newGrade;
    }

    public void payFee(int feePaidNow){
        feesPaid += feePaidNow;
        // update money earned by the school
        School.updateTotalMoneyEarned(feePaidNow);
    }

    //getter functions
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    @Override
    public String toString(){
        return name;
    }
}
