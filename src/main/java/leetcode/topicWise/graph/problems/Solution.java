package leetcode.topicWise.graph.problems;

import java.util.Arrays;

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

    static int[] reverseArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
