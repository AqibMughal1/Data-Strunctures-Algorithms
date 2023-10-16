import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //aqib mehmood //fa21-bcs-073

        Linkedlist list = new Linkedlist();
        System.out.println("EMPLOYEE INFO SYSTEM");
        System.out.println("*********************\n\n");

        System.out.println("1-Add an Employee");
        System.out.println("2-See the Employee");
        System.out.println("3-Remove the Employee");
        System.out.println("4-Exit");
        System.out.println("5-Print all the entries");
        System.out.println("Enter the operation you want to perform from 1-4");

        Scanner choice = new Scanner(System.in);
        int value = choice.nextInt();

        if(value == 1) {
            System.out.println("Enter the id you want to in ");
            int id = choice.nextInt();
            String name = choice.next();
            list.addEmployee(id, name);

        }
        else if(value ==2){
            System.out.println("enter the id you want to see");
            int id = choice.nextInt();
            list.display(id);

        }
        else if(value ==3){
            list.removeduplicates();
        }
        else if(value == 4){
            System.exit(1);

        }
        else if(value == 5){
            list.print();
        }
        else if(value<1||value>5){
            System.out.println("Invalid choice");
        }

    }
}
