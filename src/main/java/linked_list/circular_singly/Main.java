package linked_list.circular_singly;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(7);
        System.out.println(csll.head.value);
    }
}
