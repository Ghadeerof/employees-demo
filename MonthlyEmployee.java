public class MonthlyEmployee extends Employee {

    public MonthlyEmployee(){}

    public MonthlyEmployee(String firstName, String lastName, String phoneNo) {
        super(firstName, lastName, phoneNo);
    }

    @Override
    public double calculateSalary() {
        return getSalary();
    }
}
