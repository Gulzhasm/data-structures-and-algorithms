package bootcamp.linkedLists;

public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.insertFirst(3);
        ll.insertFirst(2);
        ll.insertFirst(8);
        ll.insertFirst(17);
        ll.insertLast(99);
        ll.insert(100, 3);
        ll.display();
        System.out.println();
        System.out.println(ll.deleteAtIndex(2));
        ll.display();
    }
}
