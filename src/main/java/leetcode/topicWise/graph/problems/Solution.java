package leetcode.topicWise.graph.problems;

public class Solution {
    //Input: n = 3, trust = [[1,3],[2,3]]
    //      1
    //   3
    //      2
    //count array -> if c[i] == n-1, then that is the judge
    public int findJudge(int n, int[][] trust) {
        int[] count = new int[n+1];
         for(int[] t : trust){
             count[t[0]]--;
             count[t[1]]++;
        }
         for(int i = 1; i <n; i++){
             if(count[i] == n-1) return i;
         }
         return -1;
    }
}
