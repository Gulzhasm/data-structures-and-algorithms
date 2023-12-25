package leetcode.assignments.strings;

import java.util.Arrays;

public class REverse {
    public static void main(String[] args) {
        System.out.println(reverseStr("efef", -1));
    }


    public static String reverseStr(String s, int k) {
        if(s.length() == 0 || k <= 0) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = k-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.append(s.substring(k)).toString();
    }


    public static String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}
