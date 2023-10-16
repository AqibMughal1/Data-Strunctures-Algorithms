package Cpp.Lab1;

class Employee {
    private static int idCounter = 1;

    private int ID;
    private String name;
    private String email;
    private int salary;

    public Employee(String name, String email, int salary) {
        this.ID = idCounter++;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Employee ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
    }
}

