package practices.customs;

import java.util.Arrays;

public class CustomArrayList {
    int[] arr;
    private static final int DEFAULT_SIZE = 10;
    int ptr = 0;

    public CustomArrayList() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int value) { //O(1) if size is not exceed, O(N) when you double the size
        if (isFull()) {
            doubleSize();
        }
        arr[ptr] = value;
        ptr++;
    }

    public int get(int index) throws Exception {//O(N)
        if (index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
        }
        int value = 0;
        for (int i = 0; i < index; i++) {
            value = arr[index];
        }
        return value;
    }

    public void remove(int index) throws Exception { // O(N)
        int[] temp = new int[arr.length - 1];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            temp[k++] = arr[i];
        }
        arr = temp;
        ptr--;
    }

    private void doubleSize() {//O(N)
        int[] temp = new int[DEFAULT_SIZE * 2]; //space O(N)

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return arr.length == DEFAULT_SIZE;
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", ptr=" + ptr +
                '}';
    }
}
