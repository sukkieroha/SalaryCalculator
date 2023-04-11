import java.util.Scanner;

class Employee {
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String birthdate;

    public Employee(int employeeNumber, String firstName, String lastName, String birthdate) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeNumber = employeeId;
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

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}

class WeeklyPayCalculator {
    private Employee employee;
    private double hourlyRate;
    private double riceAllowance;
    private double phoneAllowance;
    private double clothingAllowance;
    private double sssDeduction;
    private double philhealthDeduction;
    private double pagibigDeduction;
    private double taxDeduction;
    public WeeklyPayCalculator(double hourlyRate, double riceAllowance,
                               double phoneAllowance,double clothingAllowance) {
        this.hourlyRate = hourlyRate;
        this.riceAllowance = riceAllowance;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.sssDeduction = sssDeduction;
        this.philhealthDeduction = philhealthDeduction;
        this.pagibigDeduction = pagibigDeduction;
        this.taxDeduction = taxDeduction;
    }
    public double calculateGrossWeeklySalary(double hoursWorked) {
        double basicPay = hoursWorked * hourlyRate;
        double totalAllowance = riceAllowance + phoneAllowance + clothingAllowance;
        return basicPay + totalAllowance;
    }

    public double calculateNetWeeklySalary(double hoursWorked) {
        double grossWeeklySalary = calculateGrossWeeklySalary(hoursWorked);
        double totalDeductions = sssDeduction + philhealthDeduction + pagibigDeduction + taxDeduction;
        return grossWeeklySalary - totalDeductions;
    }
}
   public class Main{

        public static void main(String[] args) {

            // Create an instance of Employee with existing details
            Employee employee = new Employee(1234, "Juan", "Crisostomo", "1988.02.14");

            // Create an instance of WeeklyPayCalculator for allowance details
            WeeklyPayCalculator calculator = new WeeklyPayCalculator(373, 1500, 1000,1000);
            // Prompt user to enter first name, last name and number of hours worked
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter number of hours worked: ");
            double hoursWorked = scanner.nextDouble();

            // Calculate gross and net weekly pay
            double grossWeeklySalary = calculator.calculateGrossWeeklySalary(hoursWorked);
            double netWeeklySalary = calculator.calculateNetWeeklySalary(grossWeeklySalary);

            // Display employee details, hours worked, gross pay, and net pay
            System.out.println("Employee Details:");
            System.out.println("Employee Number: " + employee.getEmployeeNumber());
            System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
            System.out.println("Birthdate: " + employee.getBirthdate());

            System.out.println("Hours Worked: " + hoursWorked);
            System.out.println("Gross Pay: " + grossWeeklySalary);
            System.out.println("Net Pay: " + netWeeklySalary);
        }
    }

