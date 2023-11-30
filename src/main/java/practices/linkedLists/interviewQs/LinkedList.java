package practices.linkedLists.interviewQs;


public class LinkedList {

    Node head;
    Node tail;
    int size;

    //TODO this needs a re-work, add an internal loop or HashSet
    public void deleteDupes(){ // 1 2 3 2
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void createLL(int value) {
        Node newNode = new Node(value);
        newNode.value = value;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void insertNode(int value) {
        Node newNode = new Node(value);
        newNode.value = value;
        newNode.next = null;

        tail.next = newNode;
        tail = newNode;
        size++;
    }


    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    private class Node {
        public int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
