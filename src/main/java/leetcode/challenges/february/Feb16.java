package leetcode.challenges.february;

import java.util.*;

public class Feb16 {

    public static void main(String[] args) {
        int[] arr = {2,1,1,3,3,3}; // 1 2
        System.out.println(findLeastNumOfUniqueInts(arr, 3));

    }


    //Input: matrix = [[1,3,5,7],
    //                [10,11,16,20],
    //                [23,30,34,60]], target = 3
    //Output: true
    public boolean searchMatrix(int[][] M, int target) {//BF
        for (int[] ints : M) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean searchMatrixBS(int[][] M, int target) {//BF
        int r = M.length; int c = M[0].length;
        int lo = 0, hi = (r*c)-1;
        while(lo <= hi) {
            int m = lo +(hi-lo)/2;
            if(M[m/c][m%c] < target){
                lo = m + 1;
            } else if(M[m/c][m%c] > target){
                hi = m -1;
            } else {
                return true;
            }

        }
        return false;
    }

    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;

        while(lo <= hi){
            int mid = lo +(hi-lo)/2;
            if(nums[mid] < target){
                lo = mid + 1;
            } else if(nums[mid] > target){
                hi = mid -1;
            } else {
                return mid;
            }
        }
        return -1;
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
