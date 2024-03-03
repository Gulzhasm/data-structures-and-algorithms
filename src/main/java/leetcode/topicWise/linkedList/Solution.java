package leetcode.topicWise.linkedList;


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    //Input: head = [1,2,3,4,5], n = 2
    //Output: [1,2,3,5]
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size == 1 || size == n) return head.next;
        temp = head;

        for (int i = 0; i < size - n - 1; i++) {
            temp = temp.next;
        }
        temp = temp.next.next;
        return head;
    }

    public ListNode removeNthFromEndFS(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for(int i = 0; i <n; i++) fast = fast.next;
        if(fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;

    }


}