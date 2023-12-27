package practices.math;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(25));
    }

    //use binary search
    public static int mySqrt(int x) {
        int start = 0;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return mid;
            }
            if (mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
