package leetcode.assignments.recursion;

public class Power {
    public static void main(String[] args) {
        Power recursion = new Power();
        System.out.println(recursion.power(2, 3));
    }

    public int power(int base, int exponent) {
        // step1: recursive case
        // step2: base condition
        // step3: constraint

        if(base < 0){
            return -1;
        }
        if (exponent == 1) {
            return base;
        }
        return base * power(base, exponent-1);
    }


}
