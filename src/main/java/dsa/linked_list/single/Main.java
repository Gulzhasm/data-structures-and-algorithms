package dsa.linked_list.single;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(8);
        ll.insertFirst(17);
        ll.insertLast(99);
        ll.insert(100,3);
        ll.display();
        System.out.println(ll.deleteLast());
    }
}
