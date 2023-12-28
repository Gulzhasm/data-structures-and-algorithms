package leetcode.leetcode.daily;

public class Dec28 {
    public static void main(String[] args) {
        Dec28 dec = new Dec28();
        int[] arr = {0,10,5,2};
        System.out.println(dec.peakIndexInMountainArray(arr));
    }

    //1. binary search // [0,2,1,0]
    // 4 cases - 1. mid > start and mid > end
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

          if(mid < end && arr[mid] > arr[mid -1]){
              return mid;
          }
          if(mid > start && arr[mid] < arr[mid-1]){
              return mid - 1;
          }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            } else{
                start = mid + 1;
            }
        }

        return -1;
    }
}
