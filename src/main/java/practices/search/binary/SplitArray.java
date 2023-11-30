package practices.search.binary;

public class SplitArray {

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int j : nums) {
            start = Math.max(start, j); // linear search
            end += j;
        }

        while (start < end) {
            // try for the middle as potential ans
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    //you can not add this in this subarray, make a new one
                    //so you add this num in new sub array, then sun = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
         if(pieces > m){
             start = mid + 1;
         }else {
             end = mid;
         }
        }
        return end;
    }
}
