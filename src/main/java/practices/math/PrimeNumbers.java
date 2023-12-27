package practices.math;


public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(countPrimesSieve(50000));
        //findAllPrimes(10);
    }

    //Use Sieve of Eratosthenes.
    public static boolean[] sieve(int n){
        boolean[] primes = new boolean[n+1];
        for(int i = 2; i < n; i++){
            if(!primes[i]){
                for(int j = i*2; j <= n; j+=i){
                    primes[j] = true;
                }
            }
        }
        return primes;
    }

    public static int countPrimesSieve(int n) {
        boolean[] sieve = sieve(n);
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!sieve[i]){
                count++;
            }
        }
        return count;
    }

    public static int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        for(int i = 2; i < n; i++){
            if(isPrimeOptimal(i)){
                count++;
            }
        }
        return count;
    }

    static boolean isPrimeOptimal(int num) { // O(sqrtN) faster
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) { //square root of num
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    static void findAllPrimes(int num) {
        int count = 0;
        if (num <= 1) {
            System.out.println("Negatives are not prime");
            return;
        }
        for (int i = 2; i <= num; i++) {
            if (isPrimeOptimal(i)) {
                count++;
                System.out.println(i + " is a prime number");
            }
        }
        System.out.println(count + " prime numbers from 1 to " + num);
    }

    //classic way
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
