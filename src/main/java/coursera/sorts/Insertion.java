package coursera.sorts;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        Comparable[] arr = {4, 5, 9, 2, 3, 1, 8};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if (less(a[j], a[j - 1])) {
                    swap(a, j, j - 1);
                } else break;
            }
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
}
