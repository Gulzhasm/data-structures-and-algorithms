package bootcamp.linkedLists.interviewQs;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.print();
        ll.deleteDupes();
        ll.print();
    }
}
