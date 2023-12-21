package leetcode.assignments.recursion;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(product(arr, arr.length));
    }

    static int product(int[] arr, int n){
        if(n <0 || n > arr.length){
            return -1;
        }

       if(n == 0){
           return arr[0];
       }
        return n * product(arr, n-1);
    }
}
