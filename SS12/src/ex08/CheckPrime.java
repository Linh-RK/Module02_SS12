package ex08;

import java.util.Scanner;
import java.util.Stack;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                stack.push(Character.getNumericValue(s.charAt(i)));
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        boolean flag = true;
        while(!stack.isEmpty()){
            if(!isPrime(stack.pop())){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("All numbers in stack are prime");
        } else
            System.out.println("All numbers in stack are not prime");
    }

    private static boolean isPrime(Integer element) {

        for (int i = 2; i < Math.sqrt(element); i++) {
            if (element % i == 0 && element != 2) {
                return false;
            }
        }
        return true;
    }
}
