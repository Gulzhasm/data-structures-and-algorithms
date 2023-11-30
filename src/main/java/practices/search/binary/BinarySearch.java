package practices.search.binary;

public class BinarySearch {
    public static void main(String[] args) {
        int target = binarySearch(new int[]{4, 5, 6, 343, 4343, 45454}, 4);
        System.out.println(target);
    }

    //return the index
    static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) return -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle
            int midX = start + (end - start) / 2;
            if (target < arr[midX]) {
                end = midX - 1;
            } else if (target > arr[midX]) {
                start = midX + 1;
            } else {
                return midX;
            }
        }
        return -1;
    }
}
