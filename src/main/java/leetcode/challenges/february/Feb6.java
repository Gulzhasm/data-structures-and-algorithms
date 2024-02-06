package leetcode.challenges.february;

import java.util.*;

public class Feb6 {

    public static void main(String[] args) {
       String[] s = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(s));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        int i = 0;
        String start = strs[0];
        String end = strs[strs.length-1];
        while (i < start.length() && i <end.length()){
            if(start.charAt(i) == end.charAt(i)){
                i++;
            } else break;
        }

        return start.substring(0, i);
    }

    public static  List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public  List<List<String>> groupAnagramsBF(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] added = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if(added[i]) continue;
            List<String> current = new ArrayList<>();
            for(int j = 0; j < strs.length; j++){
                if(added[j]) continue;
                if(Arrays.equals(freq(strs[i]), freq(strs[j]))){
                    current.add(strs[j]);
                    added[j] = true;
                }
            }
            ans.add(current);
        }
        return ans;
    }

    private int[] freq(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        return freq;
    }

    public static  List<List<String>> groupAnagrams2(String[] strs) { // frequency is better than this sorting
        List<List<String>> ans = new ArrayList<>();
        boolean[] added = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            if(added[i]) continue;
            List<String> current = new ArrayList<>();
            for(int j = 0; j < strs.length; j++) {
                char[] p = strs[j].toCharArray();
                Arrays.sort(p);
                if(added[j]) continue;
                if(Arrays.equals(c,p)){
                    current.add(strs[j]);
                    added[j] = true;
                }
            }
            ans.add(current);
        }
        return ans;
    }






}
