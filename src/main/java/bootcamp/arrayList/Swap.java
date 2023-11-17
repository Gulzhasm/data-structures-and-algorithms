package bootcamp.arrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 123, 3, 4, 5};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
        int max = maxItem(arr);
        System.out.println(max);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }


    static int maxItem(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
