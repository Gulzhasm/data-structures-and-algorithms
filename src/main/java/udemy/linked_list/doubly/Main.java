package udemy.linked_list.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(5);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(4, 5);
        dll.insertDLL(5, 7);
        dll.traverseDLL();
        dll.reverseTraverseDLL();

    }


}
