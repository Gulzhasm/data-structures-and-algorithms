package practices.customs;


public class Main {
    public static void main(String[] args) {
        CustomLL ll = new CustomLL();
        ll.insertFirst(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.display();
        ll.insert(1, 5);
        ll.display();
        ll.deleteLL();
        ll.display();
    }
}
