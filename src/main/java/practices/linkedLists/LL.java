package practices.linkedLists;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public static void main(String[] args) {
        LL ll = new LL();

        ll.insertLast(1);
        ll.insertLast(3);
        ll.insertLast(9);
        ll.insertLast(6666);
        ll.insertLast(14);
        ll.display();
        System.out.println();
        System.out.println(ll.countElements());
        ll.removeNthFromEnd(3);
        System.out.println();
        ll.display();
    }

    public void removeNthFromEnd(int n) {
        int deleteIndex = countElements() - n;
        Node node = get(deleteIndex - 1);
        node.next = node.next.next;
    }

    Node getNodeAtIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int countElements() {
        Node node = head;
        if (head == null) return 0;
        int count = 0;
        while (node.next != null) {
            node = node.next;
            count++;
        }
        return count + 1;
    }

    public void removeDuplicates() { // O(N) time complexity, O(1) - Space complexity
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void removeElements(int val) {
        if (head.value == val) {
            head = head.next;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    //merge
    public static LL mergeTwoLists(LL list1, LL list2) {
        Node f = list1.head;
        Node s = list2.head;
        LL ans = new LL();

        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }




    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        }
        if (index == size) {
            insertLast(val);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size += 1;
    }
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public int deleteFirst() {
        int deletedValue = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return deletedValue;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }


    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int valueToBeDeleted = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return valueToBeDeleted;
    }

    public Node findNodeByValue(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
