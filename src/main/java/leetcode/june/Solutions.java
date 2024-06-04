package leetcode.june;

import java.util.HashMap;
import java.util.Map;

public class Solutions {
    public int appendCharacters(String s, String t) {
        int sIndex = 0, tIndex = 0;
        int sLength = s.length(), tLength = t.length();

        while (sIndex < sLength && tIndex < tLength) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                tIndex++;
            }
            sIndex++;
        }

        return tLength - tIndex;

    }

    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int odd = 0;
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
            if(map.get(c) % 2 == 1) odd++;
            else odd--;
        }
        if(odd > 1) return s.length() - odd + 1;

        return s.length();
    }
}
