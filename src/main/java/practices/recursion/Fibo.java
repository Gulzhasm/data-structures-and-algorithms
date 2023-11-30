package practices.recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(50)); //
    }

    static int fibo(int n) { //golden ratio is O(n^2), but the number increases, for ex: 50, time complexity is exponentially increases, very very very bad :)
        //base condition
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
