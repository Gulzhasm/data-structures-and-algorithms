package leetcode.challenges.february;

import java.util.*;

public class Feb7 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abpr", "cp"));
    }

    //Input: word1 = "abc", word2 = "pqr"
    //Output: "apbqcr"
    public  static String mergeAlternately(String word1, String word2) {
      StringBuilder sb = new StringBuilder();
      int i = 0, j = 0;

      while(i < word1.length() && j < word2.length()){
          sb.append(word1.charAt(i));
          sb.append(word2.charAt(j));
          i++; j++;
      }

      if(word1.length() > word2.length()){
          sb.append(word1.substring(i));
      } else {
          sb.append(word2.substring(j));
      }

      return sb.toString();
    }









    //Input: s = "tree"
    //Output: "eert"
    //Explanation: 'e' appears twice while 'r' and 't' both appear once.
    //So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list =
                map.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList();

        for(Map.Entry<Character, Integer> entry : list){
            int n = entry.getValue();
            while(n >0) {
                sb.append(entry.getKey());
                n--;
            }
        }

        return sb.toString();
    }
}
