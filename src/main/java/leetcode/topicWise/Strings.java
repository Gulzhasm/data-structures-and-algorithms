package leetcode.topicWise;

import java.util.HashMap;
import java.util.Map;

public class Strings {

    public int maxDepth(String s) {
        int count = 0, max = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                count++;
                if(max < count){
                    max = count;
                }
            } else if(c == ')') count--;
        }
        return max;
    }

    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())  map.put(ch, map.getOrDefault(ch, 0)+1);

        for(char c: order.toCharArray()){
            if(map.containsKey(c)) {
                int count = map.get(c);
                while(count-->0){
                    sb.append(c);
                    map.remove(c);
                }
            }
        }

        for(char ch : map.keySet()){
            int count = map.get(ch);
            while(count-->0)    sb.append(ch);
        }
        return sb.toString();

    }

    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();

        for(char s : stones.toCharArray()){
            map.put(s, map.getOrDefault(s,0)+1);
        }

        int ans = 0;
        for(char j: jewels.toCharArray()){
            if(map.containsKey(j)){
                int c = map.get(j);
                ans+=c;
            }

        }

        return ans;
    }

    public int numSubarraysWithSum(int[] A, int S) {
        return atMost(A, S) - atMost(A, S - 1);
    }

    public int atMost(int[] A, int S) {
        if (S < 0) return 0;
        int res = 0, i = 0, n = A.length;
        for (int j = 0; j < n; j++) {
            S -= A[j];
            while (S < 0)
                S += A[i++];
            res += j - i + 1;
        }
        return res;
    }
}
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalCount = 0;
        int sum = 0;
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 1;

        for (int num : nums) {
            sum += num;
            if (sum >= goal) {
                totalCount += prefixSum[sum - goal];
            }
            prefixSum[sum]++;
        }

        return totalCount;
    }
}