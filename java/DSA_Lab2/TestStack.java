package DSA_Lab2;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack stk = new Stack();
        boolean result = stk.empty();
        System.out.println("Is stack empty: " + result);
        stk.push(78);
        stk.push(100);
        stk.push(2983);
        System.out.println("Elements stored in stack: " + stk);
        result = stk.empty();
        System.out.println("Is the stack empty? " + result);
    }
}
