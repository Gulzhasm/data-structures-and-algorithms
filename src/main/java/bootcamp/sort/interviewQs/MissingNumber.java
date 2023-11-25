package bootcamp.sort.interviewQs;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }

    //smarter version with the better time complexity O(N)
    static int missingNumberSum(int[] arr) {
        int sum = 0;
        int max = 0; //n*(n+1)/2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }
        max = max * (max + 1) / 2;
        return max - sum;
    }

    //brute force with the sorted cycle time complexity O(N^2)
    static int missingNumber(int[] arr) {
        int n = 0; // 3, 0, 1  n = 2
        int correct = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
        }

        // find the missing number
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != arr[correct]){
                n = correct;
            }
        }
        return n;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
