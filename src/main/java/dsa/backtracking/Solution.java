package dsa.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

        public int maxLength(List<String> arr) {
            Set<String> set = arr.stream().filter(this::unique).collect(Collectors.toSet());
            backtrack(arr, set, 0, new StringBuilder());
            int max = 0;
            for (String word : set) max = Math.max(max, word.length());
            return max;
        }

        private void backtrack(List<String> arr, Set<String> set, int i, StringBuilder sb) {
            if (i == arr.size()) {
                String word = sb.toString();
                if (unique(word)) set.add(word);
                return;
            }

            int len = sb.length();
            sb.append(arr.get(i));
            backtrack(arr, set, i + 1, sb);
            sb.setLength(len);

            backtrack(arr, set, i + 1, sb);
        }

        private boolean unique(String word) {
            Set<Character> set = new HashSet<>();
            for (char c : word.toCharArray()) set.add(c);
            return set.size() == word.length();
        }
}
