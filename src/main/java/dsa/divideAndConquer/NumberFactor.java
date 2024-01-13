package dsa.divideAndConquer;

public class NumberFactor {

    //given N, find the numbers of ways to express N as a sum of 1,3,4 -> {4}{1,3}{3,1}{1,1,1,1}

    public static void main(String[] args) {
        System.out.println(waysToGetN(4));
        System.out.println(waysToGetN(5));
    }

    public static int waysToGetN(int n) {
        //base condition
        if (n == 0 || n == 1 || n == 2) return 1;
        if (n == 3) return 2; // {1,1,1}{3}
        //recursive case
        int sub1 = waysToGetN(n - 1);
        int sub2 = waysToGetN(n - 3);
        int sub3 = waysToGetN(n - 4);

        return sub1 + sub2 + sub3;
    }
}
