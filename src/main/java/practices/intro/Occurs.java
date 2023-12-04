package practices.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Occurs {
    public static void main(String[] args) {
    String[] nums = {"abc","bcd","aaaa","cbc"};
        System.out.println(findWordsContaining(nums, 'a'));
    }
    public static  List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(char ch : words[i].toCharArray()){
                if(ch == x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }


    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 9 && nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i] * nums[i]);
        }
        bubble(nums);
        return nums;
    }

    void occur(int num){
        // n = 12343 how many times occurs 3
        int n = 1234333333;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 3) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
