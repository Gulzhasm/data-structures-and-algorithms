package kunal.linked_lists.single;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value); // create a box
        node.next = head; // box'x first element equals to head
        head = node;   // now head needs to be the first element and needs to be pointing to the newly added element

        if (tail == null) {
            tail = head; // if there is only one element, then tail also needs to point to the same element tail = head;
        }
        size += 1; // increasing the size after adding the first element
    }

    public void display() {
        Node tempNode = head;

        while (tempNode != null) {  // O(N)
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }
        System.out.print("END");
        System.out.println("\n");
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }


    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
    }


    public int deleteFirst() {
        int value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size -= 1;
        return value;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node temp = get(size - 2);
        int value = tail.value;
        tail = temp;
        tail.next = null;
        return value;

    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
