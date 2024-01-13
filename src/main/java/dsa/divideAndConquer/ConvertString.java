package dsa.divideAndConquer;

public class ConvertString {
    //s1 and s2 are given strings
    //convert s2 to s1 using delete, insert, replace
    //find the min count of edit operations
    public static void main(String[] args) {
        System.out.println(findMinOperation("table", "tbres"));
    }

    public static int findMinOperation(String s1, String s2) {
        return findMinOperation(s1, s2, 0, 0);
    }

    private static int findMinOperation(String s1, String s2, int i1, int i2) {
        if (i1 == s1.length()) return s2.length() - i2;
        if (i2 == s2.length()) return s1.length() - i1;
        if (s1.charAt(i1) == s2.charAt(i2)) return findMinOperation(s1, s2, i1 + 1, i2 + 1);

        int delete = 1 + findMinOperation(s1, s2, i1 + 1, i2);
        int insert = 1 + findMinOperation(s1, s2, i1, i2 + 1);
        int replace = 1 + findMinOperation(s1, s2, i1 + 1, i2 + 1);
        return Math.min(delete, Math.min(insert, replace));
    }
}
