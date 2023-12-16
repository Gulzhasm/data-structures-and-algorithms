package practices.customs;

import java.util.Arrays;

public class CustomStack {
    /*
    Stack is First In Last Out
    push(item) - > Pushes an item onto the top of this stack. addElement(item)
    pop() - > removes the element from the top of the stack
    int peek() - similar to pop but without removing
     */

    int[] arr;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.arr = new int[size];
    }

    public void push(int item) {
        if (isFull()) {
           reSize();
        }
        arr[ptr+1] = item;
        ptr++;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int removed = arr[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        return arr[ptr];
    }

    private void reSize() {
        int[] temp = new int[DEFAULT_SIZE * 2];

        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return ptr == arr.length - 1;
    }

    private boolean isEmpty() {
        return ptr == -1;
    }

    @Override
    public String toString() {
        return "CustomStack{" +
                "arr=" + Arrays.toString(arr) +
                ", ptr=" + ptr +
                '}';
    }

    public void display() {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
