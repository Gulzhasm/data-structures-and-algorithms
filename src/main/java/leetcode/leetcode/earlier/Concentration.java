package leetcode.leetcode.earlier;

import java.util.Arrays;

public class Concentration {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(getConcentration(arr)));
    }

    static int[] getConcentration(int[] arr) {

        int n = arr.length;
        int[] output = new int[2 * n];
        for (int i = 0; i < arr.length; i++) {
            output[i] = arr[i];
            output[n] = arr[i];
            n++;
        }
        return output;
    }
}
