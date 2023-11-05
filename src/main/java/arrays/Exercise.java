package arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        middleElementsOfArray(new int[]{1, 2});
    }

    public static int[] middleElementsOfArray(int[] array) {
        // arrays length is 4, {1-0,2-1,3-2,4} } then midX=2
        int[] result = new int[2];
        int midX = array.length / 2;
        result[0] = array[midX - 1];
        result[1] = array[midX];
        System.out.println(Arrays.toString(result));
        return result;

        //Time complexity -> O(1)
        //Space complexity -> O(1)?
    }

    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;

        //Time complexity -> O(n)
        //Space complexity -> O(1)?
    }

    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = 0;
        int secondHighest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstHighest) {
                // {84,85,83}
                // 84>0  yes: secondHighest = 0, firstHighest = 84
                // 85>84 yes: secondHighest = 84, firstHighest = 85
                // 83>85 no
                secondHighest = firstHighest;
                firstHighest = array[i];
            }
        }
        return new int[]{firstHighest, secondHighest};
    }
}
