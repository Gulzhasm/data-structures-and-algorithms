package practices.recursion.arrays;

public class SortedArray {
    public static void main(String[] args) {
        SortedArray sorted = new SortedArray();
        System.out.println(sorted.isSorted(new int[]{1, 2, 1, 5}, 0));
    }

    boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }


}
