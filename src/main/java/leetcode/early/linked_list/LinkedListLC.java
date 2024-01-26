package leetcode.early.linked_list;

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

class LinkedListLC {

    public ListNode oddEvenList(ListNode head) {
        if(head != null){
            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenHead = even;

            while(even != null && even.next != null ){
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }

    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode node = ans;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        node.next = (list1 != null) ? list1 : list2;
        return ans.next;
    }

    //Input: head = [1,3,4,7,1,2,6]
//Output: [1,3,4,1,2,6]
    public ListNode deleteMiddleFastAndSlow(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode prevMid = getPevMid(head);
        ListNode node = head;

        while (node != null) {
            if (node == prevMid) {
                prevMid.next = prevMid.next.next;
            }
            node = node.next;
        }
        return head;
    }

    private ListNode getPevMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        return midPrev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome1(ListNode head) {
        ListNode reverse = reverseList(copy(head));
        while (head != null && reverse != null) {
            if (head.val != reverse.val) {
                return false;
            }
            head = head.next;
            reverse = reverse.next;
        }
        return false;
    }

    //Reverse Linked List
    public ListNode reverseList(ListNode head) {
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

    public ListNode copy(ListNode node) {
        ListNode newHead = new ListNode(node.val);
        ListNode current = newHead;
        node = node.next;

        while (node != null) {
            current.next = new ListNode(node.val);
            node = node.next;
            current = current.next;
        }

        return newHead;
    }

    //Reverse Linked List II
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        for (int i = 0; current != null && i < right - left + 1; i++) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }
        newEnd.next = current;
        return head;
    }


    //1. get mid
    //2. merge sort -> sort first halve and the second half from starting from the mid
    //3. merge lists-> left and right
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode node = ans;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }
        node.next = (list1 != null) ? list1 : list2;
        return ans.next;
    }

    private ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
