package leetcode.assignments.gcd;

public class GCD {
    int greatest_common_divisor(int a, int b) {
        int low = Math.min(a, b);
        int high = Math.max(a, b);
        int gcd = 0;
        for (int div = low; div > 0; --div)
        {
            if ((low % div == 0) && (high % div == 0))
                if (gcd < div)
                    gcd = div;
        }
        return gcd;
    }
}
