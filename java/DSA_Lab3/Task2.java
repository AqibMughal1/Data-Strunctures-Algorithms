package DSA_Lab3;

import java.util.Scanner;

public class Task2 {

    static void insertElement(int rear, int arr[]) {
        int element;
        System.out.println("Enter the element you want to add");
        Scanner sc = new Scanner(System.in);
        element = sc.nextInt();

        arr[rear] = element;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        int front = -1, rear = -1;

        while (true) {
            System.out.println("Enter 1 to insert into queue\n" +
                    " Enter 2 to delete element\n" +
                    " Enter 3 to display element\n" +
                    " Enter 4 to exit\n" +
                    " Enter your choice: \n");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            if (input == 1) {
                if (front == -1 && rear == -1) {
                    front = 0;
                    rear = 0;
                    insertElement(rear, arr);
                    rear++;
                }

                if (rear != -1 && (rear != 0 && rear > 5)) {
                    insertElement(rear, arr);
                    rear++;
                }

                if (rear == 4 && front == 0) {
                    System.out.println("The queue is already full");
                }

                if (rear == 4 && front > 0) {
                    rear = 0;
                    insertElement(rear, arr);
                    rear++;
                }

            }

            if (input == 2) {

                if (rear == -1 && front == -1)
                    System.out.println("The queue is empty");

                if (front < 4)
                    front++;

                if (front == 4 && rear > 0)
                    front = 0;

                if (rear == front)
                    front = rear = -1;
            }

            if (input == 3) {
                int i = 0;
                if (front != -1 && rear != -1)
                    i = front;

                for (; i != rear; i++) {
                    System.out.println(arr[i]);
                    if (i == 4)
                        i = 0;
                }
                System.out.println(arr[i]);
            }

            if (input == 4)
                return;

        }
    }

}
