package dsa.stack;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
    }

    public boolean isEmpty() { // T-O(1), S-O(1)
        return topOfStack == -1;
    }

    public boolean isFull() {// T-O(1), S-O(1)
        return topOfStack == arr.length - 1;
    }

    public void push(int value) {// T-O(1), S-O(1)
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is inserted");
        }
    }

    public int pop(){// T-O(1), S-O(1)
        int removed = -1;
        if(isEmpty()){
            System.out.println("The stack is empty");
        } else {
            removed = arr[topOfStack];
            topOfStack--;
        }
        return removed;
    }

    public int peek(){ // T-O(1), S-O(1)
        int peeked = -1;
        if(isEmpty()){
            System.out.println("The stack is empty");
        } else {
            peeked = arr[topOfStack];
        }
        return peeked;
    }

    public void delete(){// T-O(1), S-O(1)
        arr = null;
    }
}

