package dsa.linked_list.exercises;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node NthToLast(int location) {
        // size - location

        Node first = head;
        Node second = head;

        for (int i = 0; i < location; i++) {
            if (second == null) return null;
            second = second.next;
        }
        while (second != null) {
            first = first.next;
            second = second.next;
        }
        return first;
    }


    public void removeDupes() {
        // head -> 1->2->1->3 -> tail
        //linkedList = 1->2->1->3
        //output = 1->2->3

        Set<Integer> unique = new HashSet<>();

        Node current = head;
        Node prev = null;

        while (current != null) {
            int currentValue = current.value;
            if (unique.contains(currentValue)) {
                prev.next = current.next;
                size--;
            } else {
                unique.add(currentValue);
                prev = current;
            }
            current = current.next;
        }
    }

    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traverseLL() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value);
            if (i < size - 1) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println("\n");
    }
}
