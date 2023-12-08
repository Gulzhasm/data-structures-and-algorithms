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
    int size;
}
class Solution{





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
}