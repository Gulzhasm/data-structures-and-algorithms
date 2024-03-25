package leetcode.topicWise.arrays;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        System.out.println(findDuplicate(nums));
    }

    public List<Integer> findDuplicates(int[] nums) { // Time complexity - O(N), Space Complexity O(N)
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(set.contains(num)) {
                ans.add(num);
            }
            set.add(num);
        }
        return ans;
    }


    public  static int findDuplicate(int[] A) {
        int dupe = 0, s = 0, n = 1;
        Arrays.sort(A);
        while(n < A.length){
            if(A[s] == A[n]){
                dupe = A[s];
            }
            s++; n++;
        }
     return dupe;
    }



    public static int findMaxLength(int[] n) {
        int ans = 0, N = n.length;

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);

        for(int i = 0; i <N; i++){
            sum += n[i] == 0? -1 : n[i];

            if(map.containsKey(sum)){
                ans = Math.max(ans, i - map.get(sum));
            } else map.put(sum, i);
        }
        return ans;

    }

    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> l: paths) set.add(l.get(1));
        for (List<String> l: paths) set.remove(l.get(0));
        return set.iterator().next();
    }

    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length; int lp = 1, rp =1;
        int[] res = new int[N];
        for(int i = 0; i < N; i++){
           res[i] = lp;
           lp *= nums[i];
        }
       for(int i = N-1; i >= 0; i--){
         res[i] = res[i] * rp;
          rp *= nums[i];
        }
        return res;
    }

    public int[] intersection(int[] n1, int[] n2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int n : n1){
            s1.add(n);
        }

        for(int n : n2){
            if(s1.contains(n)) s2.add(n);
        }

        int[] ans = new int[s2.size()];
        int i =0;

        for(int n : s2){
            ans[i++] = n;
        }
        return ans;
    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int freq = 0, max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) freq = max = entry.getValue();
            else if (max == entry.getValue()) freq += max;
        }
        return freq == 0 ? map.size() : freq;
    }

    public int getCommon(int[] n1, int[] n2) {
        int  i = 0, j = 0;

        while(i < n1.length && j < n2.length){
            if(n1[i] < n2[j]) i++;
            else if(n1[i] > n2[j]) j++;
            else if(n1[i] == n2[j]) return n1[i];
        }
        return -1;
    }



    public static  int[] sumOddLengthSubarrays(int[] arr) {
        int N = arr.length;
        int[] pSum = new int[N];
        pSum[0] = arr[0];

        for(int i = 1; i < N; i++){
            int prev = pSum[i-1];
                pSum[i] = prev +arr[i];
        }
     return pSum;
    }
}
