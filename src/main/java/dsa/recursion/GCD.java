package dsa.recursion;

public class GCD {
    //GCD - The Greatest Common Divisor

    // step 1:  recursive case - Euclidean algorithm => gcd(a, 0)=a; gcd(a,b)=gcd(b, a mod b)
    // step 1.1: - gcd(48,18) => 48/18=2 remainder 12
    // step 1.2 - 18/12 = 1 remainder 6
    // step 1.3 - 12/6 = 2 remainder 0 =>

    //!!!! Euclidean algorithm => gcd(a, 0)=a; gcd(a,b)=gcd(b, a mod b)

    // step 2: base condition to stop the infinite loop
    // step 3: unconditional case - the constraint

    public static void main(String[] args) {
        System.out.println(gcd(8,4));
    }


    public static int gcd(int a, int b) {
        if(a < 0 || b < 0){ // step 3 - unconditional case
            return -1;
        }
        if(b == 0){ // step 2 - base condition
            return a;
        }
        return gcd(b, a % b); // step 1 - recursive case
    }
}
