package practices.linkedLists;

public class DLL {

    Node head;
    int size;

    public void insertAtIndex(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
        size++;
    }

   public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
   }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size += 1;
    }


    public void insertLast(int value) {
        Node node = new Node(value);  // create a new box, aka a node
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
         last = last.next;
        }

        last.next = node;
        node.prev = last;
        size += 1;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }


    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
