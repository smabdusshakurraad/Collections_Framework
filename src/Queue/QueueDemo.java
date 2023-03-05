package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b"); // throws exception if queue is full and the element can't added
        // b -> a -> c
        queue.offer("b"); // returns false if the queue is full and the element can't be added
        System.out.println(queue);

        var front = queue.peek(); // peak returns null if the queue is empty
        System.out.println(front);

        front = queue.element(); // element throws exceptions if the queue is empty
        System.out.println(front);

        queue.remove(); // remove throws exceptions if the queue is empty
        System.out.println(queue);

        queue.poll(); // poll returns null if the queue is empty
        System.out.println(queue);

    }
}
