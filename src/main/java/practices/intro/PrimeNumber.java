package practices.intro;

public class PrimeNumber {

    static boolean isPrime(int num) {
        //A prime number is a number that can only be divided by 1 and itself without remainders.
        //1, 2, 3, 4, 5, 6, 7 num = 7;
        // num/2=0

        int c = 2;
        if (num <= 1) {
            return false;
        }
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}
