package dsa.recursion;

public class DecToBinary {
    // step 1:  recursive case -  divide by two and take remainders from bottom to top f(n) = n mod 2 + 10*f(n/2)
    //f(n) = n mod 2 + 10*f(n/2)
    // step 2: base condition to stop the infinite loop
    // step 3: unconditional case - the constraint
    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }

    public static int decimalToBinary(int n) {
        if(n < 0){
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n / 2);
    }
}
