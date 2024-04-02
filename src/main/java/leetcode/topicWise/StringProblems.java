package leetcode.topicWise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringProblems {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();

        for (char ch : s.toCharArray()) {
            first.put(ch, first.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            second.put(ch, second.getOrDefault(ch, 0) + 1);
        }

        if (first.size() != second.size()) return false;

        int[] f = new int[first.size()];
        int[] n = new int[second.size()];
        int i = 0;


        for (Map.Entry<Character, Integer> entry : first.entrySet()) {
            f[i] = entry.getValue();
            i++;
        }

        i = 0;
        for (Map.Entry<Character, Integer> entry : second.entrySet()) {
            n[i] = entry.getValue();
            i++;
        }
        Arrays.sort(f);
        Arrays.sort(n);
        return Arrays.equals(f, n);
    }
}
