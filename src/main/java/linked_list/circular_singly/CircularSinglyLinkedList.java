package linked_list.circular_singly;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;


    //creation CSLL
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

    //insertion CSLL
    public void insertCSLL(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue; // --------------------------- O(1)
        if (head == null) { // --------------------------- O(1)
            createCSLL(nodeValue);
            return;
        } else if (location == 0) { // --------------------------- O(1)
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) { // --------------------------- O(1)
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {// --------------------------- O(N)
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next; // --------------------------- O(1)
            tempNode.next = node;
        }
        size++; // --------------------------- O(1)
        // Time complexity --------------------------- O(N)
        // Space complexity --------------------------- O(1)
    }


    //traversal CSLL
    public void traverseCSLL() {
        if (head != null) {
            Node tempNode = head; // --------------------------- O(1)
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);  // --------------------------- O(N)
                if (i != size - 1) {
                    System.out.print(" -> ");  // --------------------------- O(1)
                }
                tempNode = tempNode.next; // --------------------------- O(1)

            }
            System.out.println("\n"); // --------------------------- O(1)
        } else {
            System.out.println("\n CSLL does not exist"); // --------------------------- O(1)
        }
        // Time complexity --------------------------- O(N)
        // Space complexity --------------------------- O(1)
    }

    //search CSLL
    public boolean searchNode(int nodeValue) {
        if (head != null) {// --------------------------- O(1)
            Node tempNode = head;// --------------------------- O(1)
            for (int i = 0; i < size; i++) {// --------------------------- O(N)
                if (tempNode.value == nodeValue) {
                    System.out.println("\nFound at the location: " + i);// --------------------------- O(1)
                    return true;
                }
                tempNode = tempNode.next;// --------------------------- O(1)
            }
        }
        System.out.println("Not found");// --------------------------- O(1)
        return false;
        // Time complexity --------------------------- O(N)
        // Space complexity --------------------------- O(1)
    }


    //deletion of a node from CSLL
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does not exist! ");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                tail = null;
                head.next = null;
                head = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
        // Time complexity --------------------------- O(N)
        // Space complexity --------------------------- O(1)
    }

    // delete all
    public void deleteCSLL() {
        if (head == null) {
            System.out.println("The CSLL does not exist! ");
            return;
        } else {
            head = null;
            tail.next = null;
            System.out.println("The CSLL has been deleted successfully");
        }
        // Time complexity --------------------------- O(1)
        // Space complexity --------------------------- O(1)
    }

}



