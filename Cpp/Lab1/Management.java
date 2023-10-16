package Cpp.Lab1;
class Management {
    private Employee[] employees;
    private int employeeCount;

    public Management(int capacity) {
        employees = new Employee[capacity];
        employeeCount = 0;
    }

    public void addEmployee(String name, String email, int salary) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = new Employee(name, email, salary);
            employeeCount++;
            System.out.println("Employee added successfully.");
        } else {
            System.out.println("Employee database is full.");
        }
    }

    public void displayAllEmployees() {
        for (int i = 0; i < employeeCount; i++) {
            employees[i].display();
            System.out.println("---------------");
        }
    }

    public void searchEmployee(int searchID) {
        boolean found = false;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getID() == searchID) {
                employees[i].display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No employee found with the given ID.");
        }
    }

    public void compareSalaries() {
        if (employeeCount == 0) {
            System.out.println("No employees to compare.");
            return;
        }

        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employeeCount; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }

        System.out.println("Employee with the highest salary:");
        maxSalaryEmployee.display();
    }
}
