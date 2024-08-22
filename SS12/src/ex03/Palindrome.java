package ex03;
import java.lang.String;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(String.valueOf(s.charAt(i)));
            queue.add(String.valueOf(s.charAt(i)));
        }
//        System.out.println("Stack");
//        while (!stack.isEmpty()) {
//            System.out.print(stack.pop());
//        }
//        System.out.println();
//        System.out.println("Queue");
//        while (!queue.isEmpty()) {
//            System.out.print(queue.poll());
//        }
        boolean isPalindrome = true;
            for (int i = 0; i < stack.size()/2; i++) {
                if(!stack.pop().equalsIgnoreCase(queue.poll())){
                    isPalindrome = false;
                    break;
                }
            }

        if(isPalindrome){
            System.out.println(s + " is Palindrome");
        }else
            System.out.println(s + " is not Palindrome");
    }
}
