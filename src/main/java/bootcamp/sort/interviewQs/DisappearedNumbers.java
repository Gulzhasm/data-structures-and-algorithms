package bootcamp.sort.interviewQs;

import java.util.ArrayList;
import java.util.List;

//asked in Google
public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        findDisappearedNumbers(nums);
        System.out.println(findDisappearedNumbers(nums));
    }


    //brute force solution
    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        sort(arr);
        //find missing numbers
        for(int index = 0; index < arr.length; index++){ //1, 2,3
            if(arr[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr.length - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }


    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
