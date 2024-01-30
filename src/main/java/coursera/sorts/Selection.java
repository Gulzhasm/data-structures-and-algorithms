package coursera.sorts;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        Comparable[] arr = {4, 5, 9, 2, 3, 1, 8};
        //find the minium index arr[min] swap int[i]
        selectSortComparable(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectSortComparable(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int minIdx = i;
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[minIdx])) {
                    minIdx = j;
                }
            }
            swap(a, i, minIdx);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    void selectionSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int minIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            if (minIndex != j) {
                int temp = arr[j];
                arr[j] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
