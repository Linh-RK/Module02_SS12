package ex01;

import java.util.Scanner;
import java.util.Stack;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Stack<String> stackReversed = new Stack<>();

        int n = inputNum(sc);
        for (int i = 0; i < n; i++) {
            System.out.println(i+"Enter a new word:");
            stack.push(sc.nextLine());
        }
        while (!stack.isEmpty()) {
            stackReversed.push(stack.pop());
        }
        System.out.println("Stack reversed:");
        while (!stackReversed.isEmpty()) {
            System.out.println(stackReversed.pop());
        }
    }

    private static int inputNum(Scanner sc) {
        int n= 0;
        do {
            System.out.println("Enter the number of words you want to add:");
            String word = sc.nextLine();
            if (word.isEmpty()) {
                System.out.println("Input data cannot be empty");
                break;
            } else {
                try {
                    n = Integer.parseInt(word);
                    break;
                }catch (Exception e) {
                    System.err.println("Must input number");
                }
            }
        }while(true);
        return n;
    }
}
