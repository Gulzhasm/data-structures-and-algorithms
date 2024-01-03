package algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 6, 7};
        List<Integer> list = new ArrayList<>();
        System.out.println(find(arr, 8, 0));
        System.out.println(findIndex(arr, 4, 0));
        System.out.println(findIndexLast(arr, 0, arr.length - 1));
        System.out.println(findAllIndex(arr, 4, 0, list));

    }

    static boolean find(int[] arr, int target, int index) {
        //base condition
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int last) {
        if (last == -1) {
            return -1;
        }
        if (arr[last] == target) {
            return last;
        } else {
            return findIndexLast(arr, target, last - 1);
        }
    }

    static List<Integer> findAllIndex(int[] arr, int target, int index, List<Integer> ans) {
        if (index == arr.length) {
            return ans;
        }
        if (arr[index] == target) {
            ans.add(index);
        }
        return findAllIndex(arr, target, index + 1, ans);
    }
}
