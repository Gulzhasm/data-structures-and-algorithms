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

    //L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
    // 1 2 3 4 -> 1 4 2 3
    public void reorderList(ListNode head) {
       //find the middle
        //reverse the left side
        //merge one by one
        ListNode fast = head, slow = head, prev =null, left = head;
        while(fast !=null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        prev.next = null;

        ListNode right = reverse(slow);

        merge(left, right);

    }

    ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode current = node;

        while(current != null && current.next != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    private static void merge(ListNode head1, ListNode head2) {
        ListNode next = head1.next;
        head1.next = head2;
        head1 = head2;
        head2 = next;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,2,2,1,1};
        System.out.println(isPalindromeArr(arr));
    }
    public static boolean isPalindromeArr(int[] arr){
        int N = arr.length;
        for(int i = 0; i < N/2; i++){
            if(arr[i] != arr[N-i-1]) return false;
        }
        return true;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode reverse = reverseList(copy(head));
        while (head != null && reverse != null) {
            if (head.val != reverse.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return true;
    }

    //Reverse Linked List
    private ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public ListNode copy(ListNode node){
        ListNode newHead = new ListNode(node.val);
        ListNode current = newHead;
        node = node.next;

        while(node != null){
            current.next = new ListNode(node.val);
            node = node.next;
            current = current.next;
        }

        return newHead;
    }


    public ListNode reverseList(ListNode head) {
        ListNode newNode = null;
        ListNode current = head;

        while (current != null) {
            ListNode temp = current.next;
            current.next = newNode;
            newNode = current;
            current = temp;
        }
        return newNode;
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode end = list1, start = null;
        for (int i = 0; i < b; i++, end = end.next) {
            if (i == a - 1) start = end;
        }
        start.next = list2;

        while (start.next != null) start = start.next;
        start.next = end.next;

        return list1;
    }


    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }

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
        temp.next = temp.next.next;
        return head;
    }

    public ListNode removeNthFromEndFS(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    public ListNode deleteMiddle(ListNode head) {
        ListNode node = head;
        int N = 0;
        if (head == null) return null;

        while (node != null) {
            N++;
            node = node.next;
        }
        if (N == 1) return head.next;

        node = head;
        for (int i = 0; i < N / 2 - 1; i++) {
            node = node.next;
        }

        node.next = node.next.next;
        return head;
    }



}