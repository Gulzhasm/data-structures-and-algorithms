package practices.queue;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(7);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(4);
        queue.display();
    }
}
