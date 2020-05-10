public abstract class Employee {

    private String firstName;

    private String lastName;

    private String phoneNo;

    private double salary;

    public Employee() { }

    public Employee(String firstName, String lastName, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
    }

    public abstract double calculateSalary();

    public void print(){
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Phone No : " + this.phoneNo);
        System.out.println("Salary : " + this.salary);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
