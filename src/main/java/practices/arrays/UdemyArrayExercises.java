package practices.arrays;

import java.util.Arrays;

public class UdemyArrayExercises {
    public static void main(String[] args) {
        int[] myArray2D = {7,1,5,3,6,4};
        int[] array1 = {1,2,3,4,7};
        int[] array2 = {5,1,2,3,4};
        System.out.println(isPermutation(array1, array2));
    }


    static boolean isPermutation(int[] arr1, int[] arr2){
        int sum1 = 0;
        int sum2 = 0;
        int mult1 = 1;
        int mult2 = 1;
        if(arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
                mult1 *= arr1[i];
                mult2 *= arr2[i];
            }
        } else {
            return false;
        }
        return sum1 == sum2 && mult1 == mult2;
    }










    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            if (prices[i] - minPrice > maxProfit) { //7-7=0, maxProfit =0; 1-1=0, maxProfit =0; 5-1 =4; 4>0; maxProfit =4; 3-1, 6-1=5
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }


    //brute force
    static int[] removeDupes(int[] arr) {
        int[] uniques = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDupe = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDupe = true;
                    break;
                }
            }
            if (!isDupe) {
                uniques[index++] = arr[i];
            }
        }
        return Arrays.copyOf(uniques, index);
    }

    /*
    Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
    Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
     */
    static int removeDupesFromSorted(int[] arr) {
        // 1,1,2,2,3
        int i = 0;
        int count = 0;

        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                count++;
            }
            i++;
        }

        return arr.length - count;
    }


    static int findMissingNumber(int[] nums) { //1,2,3,4,6
        int nSum = nums[nums.length - 1];
        nSum = (nSum * (nSum + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nSum - sum;
    }

    static int[] midElements(int[] arr) {
        if (arr.length <= 2) {
            return arr;
        }
        int[] midElements = new int[arr.length - 2];
        for (int i = 0; i < midElements.length; i++) {
            midElements[i] = arr[i + 1];
        }
        return midElements;
    }

    static int sumOfDiagonals(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }

    static int[] firstAndSecondBestScores(int[] arr) { //{84,85,86,87,85,90,85,83,23,45,84,1,2,0}
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = arr[i];
            } else if (arr[i] > secondHighest && arr[i] < firstHighest) { // very important point or check
                secondHighest = arr[i];
            }
        }
        return new int[]{firstHighest, secondHighest};
    }


}
