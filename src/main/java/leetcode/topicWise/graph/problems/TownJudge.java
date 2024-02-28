package leetcode.topicWise.graph.problems;

import java.util.*;

public class TownJudge {
    public static void main(String[] args) {
        System.out.println(findJudge(3, new int[][]{{1,3}, {2,3}}));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] count = new int[n+1];

        for(int t[]: trust){
            count[t[0]]--;
            count[t[1]]++;
        }
        System.out.println(Arrays.toString(count));
        for(int i =1; i <=n; i++){
            if(count[i] == n-1) return i;
        }
        return -1;
    }
}
