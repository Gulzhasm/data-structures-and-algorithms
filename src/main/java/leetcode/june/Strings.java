package leetcode.june;

import java.util.*;

public class Strings {


    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) return false;


        Map<Integer, Integer> count = new HashMap<>();
        for (int card : hand) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }

        // Iterate over the map
        for (int key : count.keySet()) {
            if (count.get(key) > 0) {
                for (int i = 1; i < groupSize; i++) {
                    if (count.getOrDefault(key + i, 0) < count.get(key)) {
                        return false;
                    }
                    count.put(key + i, count.get(key + i) - count.get(key));
                }
            }
        }
        return true;
    }

//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]

    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }

    public static  List<Character> commonChars(String[] words) {
        List<Character> result = new ArrayList<>();

        // Loop through each character from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int minCount = Integer.MAX_VALUE;

            // Count occurrences of the current character in each word
            for (String word : words) {
                int count = 0;
                for (char c : word.toCharArray()) {
                    if (c == ch) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
            }

            // Add the character to the result list the required number of times
            for (int i = 0; i < minCount; i++) {
                result.add(ch);
            }
        }

        return result;
    }
}
