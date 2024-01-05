package udemy.sorting.bucket;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9,4,6,7,8,1,3,4,2};
        Bucket bucket = new Bucket(arr);

        System.out.println();
        bucket.bucketSort();
        System.out.println();
        bucket.printArray();
    }
}
