public class HourlyEmployee extends Employee {

    private int hours;

    private double cost;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String firstName, String lastName, String phoneNo, int hours, double cost) {
        super(firstName, lastName, phoneNo);
        this.hours = hours;
        this.cost = cost;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Hours : " + this.hours);
        System.out.println("Cost of Hour : " + this.cost);
    }

    @Override
    public double calculateSalary() {
        double aux = hours * cost;
        setSalary(aux);

        return aux;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
