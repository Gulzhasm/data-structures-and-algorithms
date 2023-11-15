package udemy.arrays;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] mid = middleElementsOfArray(new int[]{1, 2, 2, 3, 4, 4, 5}); // 1.2.3.4.5
        // System.out.println(Arrays.toString(new int[]{removeDuplicate(new int[]{1, 2, 2, 3, 4, 4, 5, 5})}));

        //System.out.println(maxProfit2Way(new int[]{7, 1, 5, 3, 6, 4}));
        //  System.out.println(Arrays.toString(findTopTwoScores(new int[]{2, 7, 11, 15})));
       // System.out.println(isPermutationComplex(new int[]{2, 7, 11, 15}, new int[]{15, 7, 11, 2}));
        //System.out.println(isPermutationOptimized(new int[]{7, 11, 15}, new int[]{15, 7, 11, 2}));
        System.out.println(removeDupes(new int[]{1, 2, 2, 3, 4, 4, 5}));
    }

    public static int[] middleElementsOfArray(int[] array) {
        // udemy.arrays length is 4, {1-0,2-1,3-2,4} } then midX=2
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
        System.out.println(" first" + firstHighest);
        System.out.println(" second" + secondHighest);
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

    //leetcode 26 easy categories
    public static int removeDupes(int[] array) {
        //1 1 2
        // 1-> j=1 i = 0 1=1
        // 2-> j=2 i =0 1=2
        int i = 1;
        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i - 1]) {
                array[i] = array[j];
                i++;
            }
        }
        return i;
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

    public static boolean isUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isPermutationComplex(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
        //Time Complexity O(n^2)
    }

    public static boolean isPermutationOptimized(int[] array1, int[] array2) {

        int sumArray1 = 0;
        int multiplicationArray1 = 1;

        int sumArray2 = 0;
        int multiplicationArray2 = 1;

        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            sumArray1 += array1[i];
            sumArray2 += array2[i];

            multiplicationArray1 *= array1[i];
            multiplicationArray2 *= array2[i];
        }
        return sumArray1 == sumArray2 && multiplicationArray1 == multiplicationArray2;
    }

    public static boolean rotateMatrix(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;
        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[i][last] = top;
            }
        }
        return true;
    }
}
