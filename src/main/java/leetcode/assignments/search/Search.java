package leetcode.assignments.search;

public class Search {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr, 9));
    }

    public int lengthOfLastWord(String s) {
        if(s.length() == 0) return -1;
        String[] sArr = s.trim().split("\\s");
        return sArr[sArr.length-1].length();
    }

    public static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end ){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
               return mid;
            }
            if(nums[mid] <= target){
                start = mid + 1;
            }
            else if(nums[mid] >= target){
                end = mid - 1;
            }
        }
        return -1;
    }
}
