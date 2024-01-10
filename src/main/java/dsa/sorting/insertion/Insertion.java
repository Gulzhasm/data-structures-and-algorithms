package dsa.sorting.insertion;

import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) { //O(N^2) - quadratic time complexity, SC - O(N)
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i;
            while (j > 0 && arr[j - 1] > temp) { // another array
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
