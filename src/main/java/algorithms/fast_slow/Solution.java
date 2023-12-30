package algorithms.fast_slow;


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

    //head = [1,2,2,1] use fast and slow
    public boolean isPalindrome(ListNode head) {

        ListNode fast = head,
                slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

      return false;
    }

}