package leetcode.leetcode.daily.january;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Jan26 {
    //Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

    //1. create a hashmap, store and count frequency
    //2. from the hashmap store values to set, if size is equal return true
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }

    public static boolean uniqueOccurrences1(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (set.contains(m.getValue())) {
                return false;
            }
            set.add(m.getValue());
        }
        return true;
    }

    public static int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i].concat(nums[j]).equals(target)) {
                    count++;
                }
            }
        }

        return count;
    }


    //Input: nums = ["123","4","12","34"], target = "1234"
    //Output: 2
    //Explanation: Valid pairs are:
    //- (0, 1): "123" + "4"
    //- (2, 3): "12" + "34"


    public static int numOfPairsMap(String[] nums, String target) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String s : nums) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s : map.keySet()){
            if(target.startsWith(s)) {
                if (target.equals(s + s)) {
                    count = map.get(s) * (map.get(s)-1);
                }else if (map.containsKey(target.substring(s.length()))) {
                    count += map.get(s) * map.get(target.substring(s.length()));
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "1", "1"};
        System.out.println(numOfPairsMap(arr, "11"));


    }
}
