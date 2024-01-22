package coursera.algorithmAnalysis;

public class ThreeSumSort {

    public static int threeSumBF(int[] a) { //N^3
        int N = a.length;
        int count = 0;
        insertionSort(a);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (-a[i] + a[j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }


    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //outer loop
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
