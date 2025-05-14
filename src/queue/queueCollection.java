package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class queueCollection {
    public static void main(String[] args) {
//        LinkedList<Integer> a = new LinkedList<>();
        ArrayDeque<Integer> a = new ArrayDeque<>();
        //these function don't through exception error
        a.offer(30);
        a.offer(45);
        a.offer(60);
        System.out.println(a.isEmpty());
        System.out.println(a.peek()); //retrieves first input (head)
        System.out.println(a.poll()); //retrieves and remove first input
        System.out.println(a.peek());

        // these function through exception error
        a.add(37);
        a.add(58);
        System.out.println(a.element()); //retrieves first input (head)
        System.out.println(a.remove()); //retrieves and remove first input
        System.out.println(a.element());
        
    }
}
