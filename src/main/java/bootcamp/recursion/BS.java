package bootcamp.recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int midX = start + (end - start) / 2;
        if (arr[midX] == target) {
            return midX;
        }
        if (target < arr[midX]) { // 1 2 3 4, 5
            return search(arr, target, start, midX - 1);
        }
        return search(arr, target, midX + 1, end);
    }
}
