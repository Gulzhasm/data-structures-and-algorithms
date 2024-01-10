package dsa.linked_list.circular_singly;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4, 2);
        csll.insertCSLL(6, 1);
        csll.insertCSLL(7, 8);
        System.out.println(csll.head.value);
        csll.traverseCSLL();
        csll.deleteNode(7);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();
    }
}
