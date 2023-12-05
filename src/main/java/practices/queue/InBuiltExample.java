package practices.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExample {
    public static void main(String[] args) {
        //first in first out or last in last out
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //doubly ended queue - you can insert and remove from both side
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(55);
        deque.removeFirst();
    }
}
