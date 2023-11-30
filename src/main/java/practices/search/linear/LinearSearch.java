package practices.search.linear;

public class LinearSearch {

    static boolean search(String string, char target) {
        //time complexity o(n)
        if (string.length() == 0) return false;
        for (int i = 0; i < string.length(); i++) {
            if (target == string.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return false;
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    static int minElement(int[] ints) {
        if (ints.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (int el : ints) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    static int maxElement(int[] ints) {
        if (ints.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        for (int el : ints) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }




    static int findElement(int[] arr, int element) {
        //time complexity o(n)
        //this will grow linearly as the input grows
        if (arr.length == 0) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }




    static boolean search2(String s, char target) {
        if (s.length() == 0) return false;
        for (char c : s.toCharArray()) {
            if (target == c) {
                return true;
            }
        }
        return false;
    }
}
