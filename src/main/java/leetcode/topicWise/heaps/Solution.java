package leetcode.topicWise.heaps;

import java.util.*;
import java.util.PriorityQueue;

public class Solution {

    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        //very important how you use Priority Queue-> in this case we are sorting ith in reverse, by default it is sorted by asc
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, c) -> c.getValue() - a.getValue());
        pq.addAll(map.entrySet());

       while(!pq.isEmpty()){
           Map.Entry<Character, Integer> entry = pq.poll();
           sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
       }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("Aabb"));
    }
}
