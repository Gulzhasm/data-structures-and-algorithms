package leetcode.assignments.strings;

public class StringEasy {
    public static void main(String[] args) {
        System.out.println(strStr("sfsdfsad", ("sad")));

    }

    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
      return -1;
    }
}
