package practices.sort.bubble;

import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = {2, 1, 3};
        sort.bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
/*
there goes the intuition
 */

    public void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
