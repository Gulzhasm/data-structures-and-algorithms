package linked_list.circular_singly;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue) {
        head = new Node(); // --------------------------- O(1)
        Node node = new Node();
        node.value = nodeValue; // --------------------------- O(1)
        node.next = node; // --------------------------- O(1)

        head = node;
        tail = node;// --------------------------- O(1)
        size = 1; // --------------------------- O(1)
        return head;
        // Time complexity --------------------------- O(1)
        // Space complexity --------------------------- O(1)
    }
}
