public class DailyEmployee extends Employee {

    private int days;

    private double cost;

    public DailyEmployee() { }

    public DailyEmployee(String firstName, String lastName, String phoneNo, int days, double cost) {
        super(firstName, lastName, phoneNo);
        this.days = days;
        this.cost = cost;
    }

    @Override
    public double calculateSalary() {
        double temp =  days * cost;
        setSalary(temp);
        return temp;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Days : " + this.days);
        System.out.println("Cost of Day : " + this.cost);
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
