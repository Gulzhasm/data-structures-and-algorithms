package coursera.stacks;

public class LLStackOfStrings {
    private Node first;
    int size;

    public LLStackOfStrings() {
        first = null;
        size = 0;
    }

    void push(String item) {
        Node oldFirst = first; // placeholder for the first item
        first = new Node(); // create a new box
        first.item = item; //assign value to the new box
        first.next = oldFirst; // new box points to the previous created box
        size++;
    }

    String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    int size() {
        return size;
    }

    public void print() {
        Node node = first;
        while (node != null) {
            System.out.print(node.item + "->");
            node = node.next;
        }
        System.out.println();
    }

    private class Node {
        String item;
        Node next;
    }
}