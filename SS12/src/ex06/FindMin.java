package ex06;

import java.util.*;

public class FindMin {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>(List.of(15, 27, 13, 4, 57, 69, 7, 480, 99, 100));
        for (int i = 0; i < list.size(); i++) {
            queue.add(list.get(i));
        }
//
        System.out.println("Queue");
        System.out.println(queue);
        for (int i = 0; i < list.size(); i++) {
            int temp = queue.peek();
            boolean check = false;
            for (int j = 0; j < list.size(); j++) {
                if(temp > list.get(j)){
                    check = true;
                    break;
                }
            }
            if(check){
                queue.add(temp);
                queue.poll();
            }

        }
        System.out.println("New Queue");
        System.out.println(queue);
        System.out.println("Min is " + queue.peek());


        }
    }
