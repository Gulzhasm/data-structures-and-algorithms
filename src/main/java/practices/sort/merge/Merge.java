package practices.sort.merge;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        //base condition for recursion
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
//left array
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        //swapping elements while comparing two arrays elements
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                merged[k] = first[i];
                i++;
            } else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete, copy the remaining elements
        //in both of the loops, either one of them will be true, hence only one loop will be run
        while (i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }
        return merged;
    }
}
