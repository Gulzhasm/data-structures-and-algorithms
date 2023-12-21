package leetcode.assignments.recursion;

public class RecursiveRange {
    public static void main(String[] args) {
        System.out.println(recursiveRange(10));
    }

    static int recursiveRange(int n){
        if(n < 0){
            return -1;
        }
        if(n == 1){
            return n;
        }
        return n + recursiveRange(n-1);
    }
}
