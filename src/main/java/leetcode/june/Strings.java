package leetcode.june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Strings {
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
