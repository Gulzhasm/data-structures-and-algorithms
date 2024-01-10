package dsa.heap;

import java.util.Arrays;

public class BinaryHeap {
    int[] arr;
    int size;

    public BinaryHeap(int size) { //O(1)
        arr = new int[size];
        this.size = 0;
    }

    public void heapifyBottomToTop(int index, String heapType) { //O(LogN)
        int parent = index / 2;
        if (index <= 1) {
            return;
        }
        if (heapType == "Min") {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (heapType == "Max") {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomToTop(parent, heapType);//O(LogN)
    }


    public void heapifyTopToBottom(int index, String heapType) { //O(LogN)
        int left = index * 2;
        int right = index * 2 + 1;
        int swapChild = 0;

        if (size < left) {
            return;
        }

        if (heapType == "Max") {
            if (size == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
        } else if (heapType == "Min") {
            if (size == left) {
                if (arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            } else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp;
                }
            }
            heapifyTopToBottom(swapChild, heapType);//O(LogN)
        }
    }

    public int extractHeapOfBP(String heapType) { //O(LogN)
        if (isEmpty()) {
            return -1;
        } else {
            int extractedValue = arr[1];
            arr[1] = arr[size];
            size--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }

    public void insert(int value, String heapType) { //O(LogN)
        arr[size + 1] = value;
        size++;
        heapifyBottomToTop(size, heapType);
        System.out.println(value + " has been inserted");
    }

    public int peek() { //O(1)
        if (isEmpty()) {
            return -1;
        }
        return arr[1];
    }

    public boolean isEmpty() { //O(1)
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void levelOrder() {//O(N)
        if(arr == null){
            System.out.println("BH is empty");
            return;
        }
            for (int i = 1; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");

    }

    public void deleteBH() {
        arr = null;
    }

    @Override
    public String toString() {
        return "BinaryHeap{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }
}
