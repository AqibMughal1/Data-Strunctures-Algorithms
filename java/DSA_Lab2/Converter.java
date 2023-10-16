package DSA_Lab2;

import java.util.Stack;

/* FA21-BCS-071 Mahir Javaid
   FA21-BCS-073 Aqib Mehmood
*/

public class Converter {
    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;

            default:
                return -1;
        }
    }

    public static String infixToPostfix(String infix) {
        Stack<Character> stack1 = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack1.push(c);
            } else if (c == ')') {
                while (stack1.isEmpty() != true && stack1.peek() != '(') {
                    postfix.append(stack1.pop());
                }
                stack1.pop();
            } else {
                while (stack1.isEmpty() != true && precedence(c) <= precedence(stack1.peek())) {
                    postfix.append(stack1.pop());
                }
                stack1.push(c);
            }
        }
        while (stack1.isEmpty() != true) {
            postfix.append(stack1.pop());
        }
        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "(A+B)-C/D";
        String postfix = infixToPostfix(infix);
        System.out.println("Infix expression: " + infix);
        System.out.println("Postfix expression: " + postfix);
    }
}
