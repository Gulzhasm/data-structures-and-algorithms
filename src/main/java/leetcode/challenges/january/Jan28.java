package leetcode.challenges.january;

import java.util.*;

public class Jan28 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        //System.out.println(uniqueMorseRepresentations(words));
        String order = "cba", s = "abcd";
        System.out.println(customSortString(order, s));

    }

    //Input: order = "cba", s = "abcd"
//Output: "cbad"
    public static String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < order.length(); i++) {
            char current = order.charAt(i);
            if (map.containsKey(current)) {
                int freq = map.get(current);
                while (freq > 0) {
                    sb.append(current);
                    freq--;
                }
                map.put(current, 0);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) > 0) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");

        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            char[] current = word.toCharArray();
            for (char c : current) {
                sb.append(map.get(c));
            }
            set.add(sb.toString());
        }

        return set.size();
    }


    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0, n = nums.length;
        int[] ans = nums.clone();
        Arrays.sort(ans);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.putIfAbsent(ans[i], i);
        }
        for (int i = 0; i < n; i++) {
            ans[i] = map.get(nums[i]);
        }
        return ans;
    }
}
