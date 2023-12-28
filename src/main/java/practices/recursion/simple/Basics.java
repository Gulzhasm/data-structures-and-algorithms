package practices.recursion.simple;

public class Basics {
    public static void main(String[] args) {
        Basics basics = new Basics();
        System.out.println(basics.mul(-2, 3));
    }

    int sum(int n) {
        //base case
        if (n <= 0) {
            return 0;
        }
        return sum(n - 1) + n;
    }

    int mul(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        if (a < 0) {
            return mul(a + 1, b) - b;
        }
        return mul(a - 1, b) + b;
    }

}
