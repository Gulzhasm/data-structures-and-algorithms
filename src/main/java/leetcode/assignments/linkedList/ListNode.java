package leetcode.assignments.linkedList;

import java.util.HashSet;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}
class LinkedList{
    ListNode head;
    ListNode tail;
    int size;

    public boolean isPalindrome() {
        ListNode temp = head;
        int size = 0;

        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;

        for(int i = 0; i < size/2; i++){
            if(get(temp, i) != get(temp,size-i-1)){
                return false;
            }
        }
        return true;
    }


    public int get(ListNode head, int index) {
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        if(size == 1 || size == n) return head.next;

        temp = head;

        for(int i=0; i<size-n-1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }


    public int countElements(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    public void removeDuplicates(LinkedList ll){
        HashSet<Integer> hs = new HashSet<>();
        ListNode current = ll.head;
        ListNode prev = null;

        while(current != null){
            int val = current.val;
            if(hs.contains(val)){
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(val);
                prev = current;
            }
            current = current.next;
        }
    }

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
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
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }


    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }


}
class Solution{

    public static void main(String[] args) {
        //[1,1,2,1]
        LinkedList ll = new LinkedList();
        ll.insertLast(1);
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(1);
        ll.display();
        System.out.println();

        System.out.println(ll.isPalindrome());

    }


}