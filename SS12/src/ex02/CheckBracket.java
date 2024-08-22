package ex02;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of bracket: ");
        String bracket = sc.nextLine();
        Stack<Character> stack = new Stack<>();
    for (int i = 0; i < bracket.length(); i++) {
        if (bracket.charAt(i) == '('||bracket.charAt(i) == '{'||bracket.charAt(i) == '[') {
            stack.push(bracket.charAt(i));
        } else if ((bracket.charAt(i) == ')' && stack.peek() == '(') ||
                (bracket.charAt(i) == '}' && stack.peek() == '{') ||
                (bracket.charAt(i) == ']' && stack.peek() == '[')) {
            stack.pop();
        }
    }
    if (stack.isEmpty()) {
        System.out.println("Balanced");
    } else
        System.out.println("Not Balanced");
    }
}
