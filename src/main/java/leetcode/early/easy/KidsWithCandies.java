package leetcode.early.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {

        int[] arr = {2,3,5,1,3}; //5 6 9 4 6
        System.out.println(kidsWithCandies(arr, 3));
    }

    /*
    Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
    Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
     */

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        for(int kidWithCandies : candies){
            int temp = kidWithCandies + extraCandies;
            if(temp >= max){
                output.add(true);
            }
            else{
                output.add(false);
            }
        }
        return output;
    }
}
