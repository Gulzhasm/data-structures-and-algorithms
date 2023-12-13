package leetcode.assignments.strings;

import java.util.Arrays;

public class REverse {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
     String[] arr = s.trim().split("\\s+");
     StringBuilder sb = new StringBuilder();
     for(int i = arr.length - 1; i >= 0; i--){
         sb.append(arr[i]).append(" ");
     }
     return sb.toString().trim();
    }
}
