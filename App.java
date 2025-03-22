import java.util.ArrayList;

//Abstract class representing a generic employee
abstract class Employee {
    private String name;
    private int id;
    //Constructor
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    //Getters
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    //Abstract method to be implemented by subclasses to calculate salary
    public abstract double calculateSalary();
    
    @Override
    public String toString(){
        return "Employee[name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

// Subclass representing a full-time employee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

//Subclass representing a part-time employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate){
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    //Calculating the salary
    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}

//Class managing the payroll system
class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    // Adds a new employee to the payroll
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    //Removes an employee by ID
    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        //Search for the specific employee by "id"
        for(Employee employee : employeeList){
            if(employee.getId() == id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    //Displays details of all employees in the system
    public void displayEmployees(){
        for (Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}

//The application
public class App {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        //Creating employees
        FullTimeEmployee emp1 = new FullTimeEmployee("Mihai", 1, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Cristian", 2, 40, 100);

        //Adding employees to the system
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details: ");
        payrollSystem.displayEmployees();

        //Example of removing an employee
        System.out.println("Removing Employee");
        payrollSystem.removeEmployee(2);

        //Print the remaining employees
        System.out.println("Remaining Employee Details:");
        payrollSystem.displayEmployees();
    }
}
