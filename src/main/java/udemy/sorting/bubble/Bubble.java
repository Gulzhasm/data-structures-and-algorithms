package udemy.sorting.bubble;

public class Bubble { //Sinking sort
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 9, 5, 2};
        Bubble bubble = new Bubble();
        bubble.bubble(arr);
        bubble.print(arr);

    }

    public void bubble(int[] arr) { //O(N^2) - quadratic time complexity, SC - O(N)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}
