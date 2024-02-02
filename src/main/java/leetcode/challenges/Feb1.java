package leetcode.challenges;

import java.util.Arrays;
import java.util.Stack;

public class Feb1 {

//Input: s = "ab#c", t = "ad#c"
//Output: true
//Explanation: Both s and t become "ac".
public static void main(String[] args) {
    System.out.println(backspaceCompare("ab##", "c#d#"));

}
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> sStack = new Stack<>();
        Stack<Character> tStack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '#'){
                if(!sStack.isEmpty()) {
                    sStack.pop();
                }
            } else if(s.charAt(i) != '#') {
                sStack.add(s.charAt(i));
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == '#'){
                if(!tStack.isEmpty()) {
                    tStack.pop();
                }
            } else  if(t.charAt(i) != '#') {
                tStack.add(t.charAt(i));
            }
        }
        if(sStack.size() != tStack.size()) {
            return false;

        }
            for (int i = 0; i < sStack.size(); i++) {
                if(sStack.get(i) != tStack.get(i)){
                    return false;
                }
            }

        return true;
    }




    //Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
//Output: [[1,1,3],
//         [3,4,5],
//         [7,8,9]]
//Explanation: We can divide the array into the following arrays: [1,1,3], [3,4,5] and [7,8,9].
//The difference between any two elements in each array is less than or equal to 2.
//Note that the order of elements is not important.
    public int[][] divideArray(int[] nums, int k) {
        int N = nums.length;
        int[][] ans = new int[N / 3][3];
        Arrays.sort(nums);

        for (int i = 2; i < N; i += 3) {
            if (nums[i - 2] - nums[i - 1] > k) {
                return new int[N / 3][];
            }
            ans[i / 3] = new int[]{nums[i - 2], nums[i - 1], nums[i]};
        }
        return ans;
    }
}
