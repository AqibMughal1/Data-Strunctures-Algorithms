package DSA_Lab2;

public class Main {
    public static void main(String[] args) {
        int capacity = 4;
        ManualStack ms1 = new ManualStack(capacity);
        ms1.push(40);
        ms1.push(25);
        ms1.push(17);
        ms1.push(620);
        for (int i = capacity; i > 0; i--) {
            System.out.println(ms1.pop());
        }
    }
}
