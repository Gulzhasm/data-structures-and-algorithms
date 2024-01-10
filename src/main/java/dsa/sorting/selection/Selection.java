package dsa.sorting.selection;

public class Selection {
    public static void main(String[] args) {
        Selection selection = new Selection();
        int[] arr = {3, 1, 4, 9, 5, 2};
        selection.selectionSort(arr);
        selection.print(arr);
    }


//Time complexity - O(N^2), Space complexity - O(1)
    public void selectionSort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            int minimumIndex = j;
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i] < arr[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j) {
                int temp = arr[j];
                arr[j] = arr[minimumIndex];
                arr[minimumIndex] = temp;
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
