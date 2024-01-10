package dsa.sorting.bucket;

import java.util.ArrayList;
import java.util.Collections;

public class Bucket {
    int arr[];

    public Bucket(int[] arr){
        this.arr = arr;
    }

    public void printArray(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    //print buckets
    public void printBucket(ArrayList<Integer>[] buckets){
        for(int i=0; i < buckets.length; i++){
            System.out.println("\nBuckets" + i + ":");
            for(int j = 0; j < buckets.length; j++){
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }

    //bucket sort
    public void bucketSort(){
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(arr.length));
        int maxValue = Integer.MIN_VALUE;
        for(int value : arr){
            if(value > maxValue){
                maxValue = value;
            }
        }

        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }

        for(int value: arr){
            int bucketNumber = (int) Math.ceil(((float)value * numberOfBuckets/(float)maxValue));
            buckets[bucketNumber-1].add(value);
        }

        for(ArrayList<Integer> bucket: buckets){
            Collections.sort(bucket);
        }


        printBucket(buckets);

        int index = 0;

        for(ArrayList<Integer> bucket: buckets){
            for(int value: bucket){
                arr[index] = value;
                index++;
            }
        }
    }
}
