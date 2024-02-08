package leetcode.challenges.february;

import java.util.Arrays;

public class Feb8 {

    public String gcdOfStrings(String str1, String str2) {
       int gcd = gcd(str1.length(), str2.length());
       StringBuilder sb = new StringBuilder();
        int i =0, j =0;
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        while(gcd > 0 && j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                sb.append(str1.charAt(i));
            }
            gcd--;
            i++;
            j++;
        }
        return sb.toString();
    }

    private  int gcd(int a, int b) {
        if(a < 0 || b < 0){ // step 3 - unconditional case
            return -1;
        }
        if(b == 0){ // step 2 - base condition
            return a;
        }
        return gcd(b, a % b); // step 1 - recursive case
    }

    //Input: n = 12
    //Output: 3
    //Explanation: 12 = 4 + 4 + 4.
    public static void main(String[] args) {
        System.out.println((12));
    }


    public static void coinChangeProblem(int[] coins, int N) {
        Arrays.sort(coins);
        int index = coins.length - 1;
        do {
            int coinValue = coins[index];
            index--;
            int max = (N / coinValue) * coinValue;
            if (max > 0) {
                System.out.println("Value: " + coinValue + "count: " + (N / coinValue));
                N = N - max;
            }
        } while (N != 0);
    }
}
