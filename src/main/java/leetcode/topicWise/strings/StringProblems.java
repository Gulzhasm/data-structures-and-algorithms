package leetcode.topicWise.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringProblems {
    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(pangrams("The string contains all letters in the English alphabet, so return pangram.\n" +
                "\n"));
    }

    public static String pangrams(String s) {
        // Write your code here


        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       Map<Character, Integer> map = new HashMap<>();

       for(char c: s.toUpperCase().toCharArray()){
           map.put(c, map.getOrDefault(c,0)+1);
        }

       for(char c : alphabet.toCharArray()){
           if(!map.containsKey(c))  return "not pangram";
       }
        return "pangram";
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

    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if((word.charAt(0) == board[i][j]) && search(board, word, i, j, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    private boolean search(char[][]board, String word, int i, int j, int index){
        if(index == word.length()){
            return true;
        }

        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
            return false;
        }

        visited[i][j] = true;
        if(search(board, word, i-1, j, index+1) ||
                search(board, word, i+1, j, index+1) ||
                search(board, word, i, j-1, index+1) ||
                search(board, word, i, j+1, index+1)){
            return true;
        }

        visited[i][j] = false;
        return false;
    }

}
