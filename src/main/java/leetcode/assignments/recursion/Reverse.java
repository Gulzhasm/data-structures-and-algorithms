package leetcode.assignments.recursion;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("java"));
    }

    static String reverse(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
