package linked_list;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.createSingleLinkedList(5);
        System.out.println(singleLinkedList.head.value);

        singleLinkedList.insertInLinkedList(6,1);
        singleLinkedList.insertInLinkedList(6,3);
        System.out.println(singleLinkedList.head.next.next.value);
        singleLinkedList.deletionOfNode(0);
        System.out.println(singleLinkedList.head.value);
    }
}
