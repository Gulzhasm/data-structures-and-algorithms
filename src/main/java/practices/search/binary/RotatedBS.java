package practices.search.binary;

public class RotatedBS {
    //TODO comeback after while and try to resolve again

    public static void main(String[] args) {
        int[] arr = {3,5,6,7,0,1,2 }; //4,5,6,7,0,1,2 //11,13,15,17
        RotatedBS rotatedBS = new RotatedBS();
        System.out.println(rotatedBS.findMin(arr));
    }

    public int findMin(int[] nums) {
        int pivot = findPivotIndex(nums);
        if(pivot == nums.length-1){
            return nums[0];
        }
        return nums[pivot+1];

    }

     private int  findPivotIndex(int[] arr) {// 3,4,5,1,2
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int pivot = 0;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                pivot = arr[mid];
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                pivot = arr[mid];
            }
            if (arr[mid] >= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return pivot;
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        //if you do not find the pivot, then array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length);
        }
        //if pivot is found, then array is asc
        if (arr[pivot] == target) {
            return pivot;
        }
        //second case
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }
        //third case
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) { //3, 4, 7, 12,
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) { //{3, 4, 7, 12, 9, 6, 5, 1};
            int mid = start + (end - start) / 2;
            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if elements at middle, start, end are equal, then skip

            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the elements
                //check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //check if end is pivot
                if (arr[end] == arr[end - 1]) {
                    return end;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
