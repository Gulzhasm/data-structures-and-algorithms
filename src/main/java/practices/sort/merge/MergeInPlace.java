package practices.sort.merge;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        //base condition for recursion
        if (end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;

        //left array
        mergeSort(arr, start, mid);
        //right array
        mergeSort(arr, mid, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start];
        int i = start, j = mid, k = 0;

        //swapping elements while comparing two arrays elements
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete, copy the remaining elements
        //in both of the loops, either one of them will be true, hence only one loop will be run
        while (i < mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        //copying elements into a merged array
        for (int l = 0; l < merged.length; l++) {
            arr[start + l] = merged[l];
        }
    }

}
