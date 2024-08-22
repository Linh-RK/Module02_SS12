package ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindMax {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>(List.of(15, 27, 13, 4, 57, 69, 7, 480, 99, 100));
        for (int i = 0; i < list.size(); i++) {
            if(stack.isEmpty() || list.get(i)>stack.peek()) {
                stack.push(list.get(i));
                System.out.println(stack);
            }
//            else {
//                stack.pop();
//                System.out.println(stack);
//            }
        }
        System.out.println(stack);
    }
}
