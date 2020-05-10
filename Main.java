import java.util.Scanner;

public class Main {
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);

        MonthlyEmployee monthlyEmployee = new MonthlyEmployee();
        DailyEmployee dailyEmployee = new DailyEmployee();
        HourlyEmployee hourlyEmployee = new HourlyEmployee();

        System.out.println("Enter first name of monthly employee");
        String firstNameMonthlyEmp = scanner.nextLine();

        System.out.println("Enter last name of monthly employee");
        String lastNameMonthlyEmp = scanner.nextLine();

        System.out.println("Enter phone no of monthly employee");
        String phoneNoMonthlyEmp = scanner.nextLine();

        System.out.println("Enter salary of monthly employee");
        String salaryMonthlyEmp = scanner.nextLine();
        Double salaryMonthly = Double.valueOf(salaryMonthlyEmp);

        monthlyEmployee.setFirstName(firstNameMonthlyEmp);
        monthlyEmployee.setLastName(lastNameMonthlyEmp);
        monthlyEmployee.setPhoneNo(phoneNoMonthlyEmp);
        monthlyEmployee.setSalary(salaryMonthly);

        System.out.println("##############################");
        System.out.println("Print info of monthly employee");
        monthlyEmployee.print();
        System.out.println("-------------------------------");

        System.out.println("Enter first name of daily employee");
        String firstNameDailyEmp = scanner.nextLine();

        System.out.println("Enter last name of daily employee");
        String lastNameDailyEmp = scanner.nextLine();

        System.out.println("Enter phone no of daily employee");
        String phoneNoDailyEmp = scanner.nextLine();

        System.out.println("Enter days number  of daily employee");
        String daysDailyEmp = scanner.nextLine();
        int daysDaily = Integer.valueOf(daysDailyEmp);

        System.out.println("Enter day cost  of daily employee");
        String costDailyEmp = scanner.nextLine();
        double costDaily = Double.valueOf(costDailyEmp);

        dailyEmployee.setFirstName(firstNameDailyEmp);
        dailyEmployee.setLastName(lastNameDailyEmp);
        dailyEmployee.setPhoneNo(phoneNoDailyEmp);
        dailyEmployee.setCost(costDaily);
        dailyEmployee.setDays(daysDaily);

        dailyEmployee.calculateSalary();

        System.out.println("##############################");
        System.out.println("Print info of daily employee");
        dailyEmployee.print();
        System.out.println("-------------------------------");

        System.out.println("Enter first name of hourly employee");
        String firstNameHourlyEmp = scanner.nextLine();

        System.out.println("Enter last name of hourly employee");
        String lastNameHourlyEmp = scanner.nextLine();

        System.out.println("Enter phone no of hourly employee");
        String phoneNoHourlyEmp = scanner.nextLine();

        System.out.println("Enter hourly number  of hourly employee");
        String hoursHourlyEmp = scanner.nextLine();
        int hoursHoulry = Integer.valueOf(hoursHourlyEmp);

        System.out.println("Enter hour cost  of daily employee");
        String costHourEmp = scanner.nextLine();
        double costHourly = Double.valueOf(costHourEmp);

        hourlyEmployee.setFirstName(firstNameHourlyEmp);
        hourlyEmployee.setLastName(lastNameHourlyEmp);
        hourlyEmployee.setPhoneNo(phoneNoHourlyEmp);
        hourlyEmployee.setCost(costHourly);
        hourlyEmployee.setHours(hoursHoulry);

        hourlyEmployee.calculateSalary();

        System.out.println("##############################");
        System.out.println("Print info of hourly employee");
        hourlyEmployee.print();
        System.out.println("-------------------------------");


    }
}
