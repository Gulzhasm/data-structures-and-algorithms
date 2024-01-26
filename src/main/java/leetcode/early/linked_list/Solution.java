package leetcode.early.linked_list;


class ListNodee {
    int val;
    ListNodee next;

    ListNodee() {
    }

    ListNodee(int val) {
        this.val = val;
    }

    ListNodee(int val, ListNodee next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    public ListNodee middleNode(ListNodee head) {
      ListNodee fast = head;
      ListNodee slow = head;

      while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
      }
      return slow;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n = n / 10;
        }
        return ans;
    }

    //TODO comeback and solve
    public ListNodee detectCycle(ListNodee head) {
        return head;
    }

    public boolean hasCycle(ListNodee head) {
        ListNodee slow = head;
        ListNodee fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int cycleLength(ListNodee head) {
        ListNodee slow = head;
        ListNodee fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                ListNodee temp = slow;
                int count = 0;
                do {
                    temp = temp.next;
                    count++;
                } while (temp != slow);

                return count;
            }
        }

        return 0;
    }

    public ListNodee mergeTwoLists(ListNodee list1, ListNodee list2) {
        ListNodee ans = new ListNodee();
        ListNodee node = ans;

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

    public ListNodee deleteDuplicates(ListNodee node) {
        ListNodee head = node;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}