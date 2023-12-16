package practices.customs;

import practices.linkedLists.interviewQs.LL;

public class CustomLL {

    private Node head;
    private Node tail;
    private int size;

    public CustomLL() {
        this.size = 0;
    }

    //insertFirst = push
    //insertLast
    //insertAtIndex(index)
    //remove at index
    //removeFirst
    //removeLast


    //insertAtIndex(index)
    public void insert(int index, int value) { //O(N)
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size - 1) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void remove(int index) { //O(N)
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node beforeIndex = get(index - 1);
        beforeIndex.next = beforeIndex.next.next;
        size--;
    }

    public void removeFirst() {//O(1)
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void removeLast() { //O(N)
        if (size == 1) {
            removeFirst();
            return;
        }
        tail = get(size - 2);
        tail.next = null;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }


    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
            tail.next = null;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void deleteLL(){
        head = null;
        tail = null;
    }

    @Override
    public String toString() {
        return "CustomLL{" +
                "head=" + head.value +
                ", tail=" + tail.value +
                ", size=" + size +
                '}';
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}

