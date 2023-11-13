package linked_list.exercises;


public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.traverseLL();
        Node node = ll.NthToLast(3);
        System.out.println(node.value);

    }
}
