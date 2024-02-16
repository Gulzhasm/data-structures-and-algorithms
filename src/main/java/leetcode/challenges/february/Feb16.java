package leetcode.challenges.february;

import java.util.*;

public class Feb16 {
    //Input: arr = [4,3,1,1,3,3,2], k = 3
    //Output: 2
    //Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
    public static void main(String[] args) {
        int[] arr = {2,1,1,3,3,3}; // 1 2
        System.out.println(findLeastNumOfUniqueInts(arr, 3));

    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        // List<Integer> sorted = new ArrayList<>(map.keySet());
        //        Collections.sort(sorted, (a, b) -> map.get(b) - map.get(a));
        //use hashmap with getOrDefault
        //use min priority queue and heap.poll()
        //remove till k and return map.size()
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        minHeap.addAll(map.entrySet());
        System.out.println(minHeap);
        int  val =0, sum =0, ans =0, count = k;
        while (k > 0) {
            if(sum == count){
               break;
            }
            Map.Entry<Integer, Integer> entry = minHeap.remove();//1 2 3
            val = entry.getValue();
            sum+= val;
            k = k - val;
            if(count < sum){
                ans = 1;
            }
        }
        return minHeap.size() + ans;
    }
    public int findLeastNumOfUniqueIntsSort(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(map.entrySet());

        elements.sort((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : elements) {
            if (entry.getValue() <= k) {
                k -= entry.getValue();
                map.remove(entry.getKey());
            } else {
                break;
            }
        }
        return map.size();
    }
}
