package leetcode.topicWise.arrays.base;

public class Misc {
    public static void main(String[] args) {
        int x = -120;
        System.out.println(reverse(x));
    }

    //123
    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        if (x < 0) {
            x = Math.abs(x);
            sb.append("-");
        }
        while (x > 0) {
            int rem = x % 10;
            sb.append(rem);
            x = x / 10;
        }

        return Integer.parseInt(sb.toString());
    }

    public int reverseTEST(int x) {
        int ans = 0;
        while (x != 0) {
            int rem = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            ans = ans * 10 + rem;
            x = x / 10;
        }

        return ans;
    }


    public int hammingWeight(int n) {
        int mask = 1;
        int bits = 0;
        for(int i = 1; i <=32; i++) {
            bits+= (n & mask) == 0 ? 0 : 1;
            mask<<=1;
        }
        return bits;
    }
}
