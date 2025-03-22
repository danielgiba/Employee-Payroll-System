-------------------------------------------------- Employee Payroll System --------------------------------------------------

NOTE: This project belongs to Giba George-Daniel, ACS IS – Faculty of Automatic Control and Computer Science.

Welcome to Employee Payroll System – a simple Java-based application designed to demonstrate core principles of 
Object-Oriented Programming (OOP). This project simulates payroll processing for different types of employees, 
including full-time and part-time workers.

The system is implemented using clean, modular code and follows best practices in OOP design: abstraction, 
inheritance, polymorphism, and encapsulation.

-------------------------------------------------- OOP Architecture --------------------------------------------------

-> Abstract Class: "Employee"
   - Represents a generic employee
   - Declares the abstract method "calculateSalary()" to be implemented by all subclasses

-> Subclasses: "FullTimeEmployee" and "PartTimeEmployee"
   - Inherit from "Employee"
   - Implement their own version of "calculateSalary()" based on specific logic:
       - Full-time: fixed monthly salary
       - Part-time: hourly rate * hours worked

-> Polymorphism in action:
   - The "PayrollSystem" class manages a list of employees: ArrayList<Employee>
   - Calls to "calculateSalary()" are dynamically resolved at runtime depending on the employee type

-> Encapsulation:
   - All fields are private
   - Access is managed through public getters and constructors

Features: Add new employees (full-time or part-time), Remove employees by ID, Calculate and display salaries using polymorphism, 
          Console-based interface for quick testing, Clean OOP structure for easy extensibility
