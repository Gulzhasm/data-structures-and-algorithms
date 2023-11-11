package arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] mid = middleElementsOfArray(new int[]{1, 2, 2, 3, 4, 4, 5}); // 1.2.3.4.5
        // System.out.println(Arrays.toString(new int[]{removeDuplicate(new int[]{1, 2, 2, 3, 4, 4, 5, 5})}));

        //System.out.println(maxProfit2Way(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));

    }

    public static int[] middleElementsOfArray(int[] array) {
        // arrays length is 4, {1-0,2-1,3-2,4} } then midX=2
        int midX = array.length / 2;
        return new int[]{array[midX - 1], array[midX]};
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
            } else if (array[i] > secondHighest && array[i] < firstHighest) {
                secondHighest = array[i];
            }
        }

        return new int[]{firstHighest, secondHighest};
        //Time complexity -> O(n)
        //Space complexity -> O(1)?
    }

    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int number : array) {
            actualSum += number;
        }
        return expectedSum - actualSum;
    }

    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        int[] uniqueArray = new int[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            boolean isDuplicated = false;
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    isDuplicated = true;
                    break;
                }
            }
            if (!isDuplicated) {
                uniqueArray[index++] = array[i];
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }


    public static int removeDupes(int[] array) {
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[i] != array[j]) {
                i++;
                array[i] = array[j];
            }

        }
        return i + 1;
    }

    public static int removeDuplicate(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicated = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isDuplicated = true;
                    break;
                }
            }
            if (!isDuplicated) {
                index = array[i];
            }
        }
        return index;
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            if (prices[i] > max) max = prices[i];
        }

        if (prices[0] == max) {
            prices[0] = min;
        }
        return max - min;
    }

    public static int maxProfit2Way(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // identified the min price
            }
            if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }


    public static int[] twoSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }

            //Time complexity O(n^2);
            //Space Complexity O(n)
        }
        return array;
    }
}
