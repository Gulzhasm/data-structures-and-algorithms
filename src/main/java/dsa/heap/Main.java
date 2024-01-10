package dsa.heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(10);
        System.out.println(bh.peek());
        bh.insert(10, "Min");
        bh.insert(5, "Min");
        bh.insert(15, "Min");
        bh.insert(1, "Min");
        bh.levelOrder();
        bh.extractHeapOfBP("Min");
        bh.levelOrder();
        bh.extractHeapOfBP("Max");
        bh.levelOrder();
        bh.deleteBH();
        bh. levelOrder();
    }
}
