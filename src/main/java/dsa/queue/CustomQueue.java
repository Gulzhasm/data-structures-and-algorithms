package dsa.queue;

public class CustomQueue {
    int[] arr;
    int beginningOfQueue;
    int topOfQueue;

    public CustomQueue(int size) {
        this.arr = new int[size];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted");
        }
    }

    public int dequeue() {
        int removed = -1;
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            removed = arr[beginningOfQueue];
            beginningOfQueue++;
            topOfQueue--;
        }
        return removed;
    }

    private boolean isEmpty() {
        return beginningOfQueue == -1 || (beginningOfQueue == arr.length);
    }

    private boolean isFull() {
        return topOfQueue == arr.length - 1;
    }

    public void delete() {
        arr = null;
    }
}
