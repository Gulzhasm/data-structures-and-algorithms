package leetcode.assignments.arrays;


public class Solution {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5, 5, 5, 10, 5, 5, 10, 20, 20, 20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int count5 = 0;
        int count10 = 0;
        int index = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] / 5 == 1) {
                count5++;
                index++;
            }
            if (bills[i] / 5 == 2) {
                count10++;
                count5--;
            }

        }
        return true;
    }

    public static int subtractProductAndSum(int n) {
        int m = 1;
        int s = 0;
        while (n > 0) {
            int last = n % 10;
            s += last;
            m *= last;
            n = n / 10;
        }
        return m - s;
    }
}
