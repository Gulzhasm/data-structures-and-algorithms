package leetcode.challenges.february;


import java.util.*;

public class Feb22 {
    public static void main(String[] args) {
        int[] A = {1, 7, 11, 1};
        int[] B = {2, 4, 6, 1};
        Feb22 f = new Feb22();
        System.out.println(f.kSmallestPairs(A, B, 3));

    }

    class Node{
        int sum, i, j;
        Node(int sum, int i, int j){
            this.sum = sum;
            this.i = i;
            this.j = j;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "sum=" + sum +
                    ", i=" + i +
                    ", j=" + j +
                    '}';
        }
    }

    public  List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Node> q = new PriorityQueue<>((n1, n2)->n1.sum-n2.sum);

        for(int i=0;i<nums1.length;i++){
            q.offer(new Node(nums1[i]+nums2[0], i, 0));
        }

        List<List<Integer>> ans = new ArrayList<>();
        while(k>0 && !q.isEmpty()){
            Node val = q.poll();
            System.out.println("q:" + val);
            List<Integer> list = new ArrayList<>();
            list.add(nums1[val.i]);
            list.add(nums2[val.j]);
            ans.add(list);
            if(val.j<nums2.length-1){
                q.offer(new Node(nums1[val.i]+nums2[val.j+1], val.i, val.j+1));
            }
            k-=1;
        }

        return ans;
    }

    public static int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1)
            return 1;
        int[] count = new int[n + 1];
        for (int[] person : trust) {
            count[person[0]]--;
            count[person[1]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == n - 1) return i;
        }
        return -1;
    }
}
