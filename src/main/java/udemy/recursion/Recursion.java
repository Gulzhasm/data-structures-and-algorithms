package udemy.recursion;

public class Recursion {
    public static void main(String[] args) {
       // recursiveMethod(4);
        System.out.println(fibonacci(4));
    }

    static void recursiveMethod(int n) {
        if (n < 1) {
            System.out.println("n is less than 1");
        } else {
            recursiveMethod(n - 1);
            System.out.println(n);
        }
    }

    static int factorial(int n) {
        if(n < 1){
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int fibonacci(int n){
        if(n < 0){
            return -1;
        }
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
