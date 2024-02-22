package leetcode.challenges.february;

import java.util.*;

public class Feb21 {
    public static void main(String[] args) {

    }

    public  boolean closeStrings(String w1, String w2) {
        if (w1.length() != w2.length()) return false;
        if(same(w1,w2)){
         List<Integer> l1 = getCounts(w1);
         List<Integer> l2 = getCounts(w2);
         return l1.equals(l2);
        }
        return false;
    }

     List<Integer> getCounts(String s1){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list;
    }

     boolean same(String s1, String s2){
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(char c : s1.toCharArray()){
            set1.add(c);
        }
        for(char c : s2.toCharArray()){
            set2.add(c);
        }
        return set1.equals(set2);
    }



    public boolean uniqueOccurrences(int[] arr) {
        //1 add t map and cout -> getOrDefault
        //2. loop the map we can use set

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) {
                return false;
            }
            set.add(entry.getValue());
        }
        return true;
    }

    public int rangeBitwiseAnd(int left, int right) {
        while (right > left) {
            right = right & right - 1;
        }
        return right & left;
    }
}
