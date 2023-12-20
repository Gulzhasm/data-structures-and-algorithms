package udemy.recursion;

public class SumRec {
    //sum of digits
    public static void main(String[] args) {
        System.out.println(sumOfDigits(112456));
    }


    static int sumOfDigits(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    static int sumOfDigitsLoop(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
}
