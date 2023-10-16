package Cpp.Lab1;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Management employeeManagement = new Management(10);

            String username = "admin";
            String password = "12345";

            System.out.print("Enter username: ");
            String inputUsername = sc.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = sc.nextLine();

            if (!inputUsername.equals(username) || !inputPassword.equals(password)) {
                System.out.println("Invalid username or password. Exiting.");
                return;
            }

            while (true) {
                System.out.println("Menu:");
                System.out.println("Choose from the following options");
                System.out.println("1. Input employee data");
                System.out.println("2. Display all data");
                System.out.println("3. Search employee");
                System.out.println("4. Compare salary");
                System.out.println("e. Exit");

                System.out.print("Enter your choice: ");
                char choice = sc.nextLine().charAt(0);

                switch (choice) {
                    case '1':
                        System.out.print("Enter employee name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter employee email: ");
                        String email = sc.nextLine();

                        System.out.print("Enter employee salary: ");
                        int salary = sc.nextInt();
                        sc.nextLine();

                        employeeManagement.addEmployee(name, email, salary);
                        break;

                    case '2':
                        employeeManagement.displayAllEmployees();
                        break;

                    case '3':
                        System.out.print("Enter employee ID to search: ");
                        int searchID = sc.nextInt();
                        sc.nextLine(); 
                        employeeManagement.searchEmployee(searchID);
                        break;

                    case '4':
                        employeeManagement.compareSalaries();
                        break;

                    case 'e':
                        System.out.println("Exiting the program.");
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
