public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID + " | Department: " + department + " | Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(5001, "IT", 45000.0);
        employee.displayEmployeeDetails();
        employee.setSalary(48000.0);
        System.out.println("Updated salary: " + employee.getSalary());
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager: " + employeeID + " | Department: " + department);
    }
}
