package bootcamp.search.binary;

public class CeilingNumber {
    public static void main(String[] args) {
        int target = ceiling(new int[]{2,3,5,9,14,16,18}, 2);
        System.out.println(target);
    }

     static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
          int mid = start + (end - start)/2;
          if(target < arr[mid]){
              end = mid - 1;
          } else if (target > arr[mid]) {
              start = mid + 1;
          } else {
              return mid;
          }
        }
        return start;
    }
}
