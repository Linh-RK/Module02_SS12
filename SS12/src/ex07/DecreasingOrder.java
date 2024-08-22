package ex07;

import java.util.Scanner;
import java.util.Stack;

public class DecreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of number:");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push( s.charAt(i));
        }
        boolean flag = true;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.pop().compareTo(stack.get(0))>0){
                flag = false;
                break;
            };
        }
        if (flag){
            System.out.println("Decreasing order");
        }else
            System.out.println("Not decreasing order");

    }
}
