package dsa.recursion;

public class PowerOfNumber {
    // step 1:  recursive case - base*power(base, exp-1)
    // step 2: base condition to stop the infinite loop
    // step 3: unconditional case - the constraint


    static int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }
}
