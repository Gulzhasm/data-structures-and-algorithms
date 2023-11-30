package practices.sort.interviewQs;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        System.out.println(findAllDuplicates(arr));
    }

    static List<Integer> findAllDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        //cyclic sort algo
        int i = 0;
        while (i < arr.length) { // 2,3,4,1
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) { //arr[0] = 2 arr[
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
