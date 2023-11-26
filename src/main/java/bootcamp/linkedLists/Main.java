package bootcamp.linkedLists;

public class Main {
    public static void main(String[] args) {
      /*  LL ll = new LL();
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



        DLL dll  = new DLL();
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(8);
        dll.insertFirst(17);
        dll.display();
        dll.insertLast(99);
        dll.display();
        dll.insertAtIndex(99,65);
        dll.display();
        */
        CLL cll  = new CLL();
        cll.insert(3);
        cll.insert(2);
        cll.insert(8);
        cll.insert(17);
        cll.display();
        cll.delete(8);
        cll.display();


    }
}
