package practices.sort.quick;

import java.util.Arrays;

public class QuickSort {

    public void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        // recursion calls for two pivot's halves to be sorted, as the pivot at the correct index
        sort(arr, low, end);
        sort(arr, start, high);
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {5, 4, 3, 2, 1};
        quickSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
