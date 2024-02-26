package leetcode.challenges.february;

import java.util.HashMap;
import java.util.Map;

public class Feb24 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mapM = new HashMap<>();

        for(char m: magazine.toCharArray()){
            mapM.put(m, mapM.getOrDefault(m, 0)+1);
        }

       for(char c : ransomNote.toCharArray()) {
           if (mapM.containsKey(c) && mapM.get(c) > 0) {
               mapM.put(c, mapM.get(c) - 1);
           } else return false;
       }
           return true;
    }

    public String reverseWords(String s) {
        //array with split
        //use string builder and append
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i >=0; i--){
            sb.append(arr[i]).append(" ");
        }

        return sb.toString().trim();
    }

}
