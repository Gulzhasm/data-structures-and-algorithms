package leetcode.challenges.december;

public class MagicAndUgly {
    public static void main(String[] args) {
        /*
                Input: n = 3, a = 2, b = 3, c = 5
Output: 4
Explanation: The ugly numbers are 2, 3, 4, 5, 6, 8, 9, 10... The 3rd is 4.

Input: n = 1, a = 2, b = 3
Output: 2
         */
        int n = 6;
        int ans = 0;
        int base = 2;
        while(n > 0){
            int last = n & 1;
            n = n >>1;
            ans+=last*base;
            base = base * 2;}
            System.out.println(ans);
       // System.out.println(nthMagicalNumber(4,2,3));
    }

    public static int nthMagicalNumber(int n, int a, int b) {
        int ans = 0;
        while(n > 0){
            int last = n & 1;
            n = n >>1;
            ans+=last*a;
            a = a * a;
        }
        return ans;
    }
/*
Input: grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]
Output: 1
Explanation:
The following subgrid is a 3 x 3 magic square:
 */
    public static int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        if(grid.length < 3 || grid[0].length < 3){
            count = 0;
        }
        return count;
    }
}
