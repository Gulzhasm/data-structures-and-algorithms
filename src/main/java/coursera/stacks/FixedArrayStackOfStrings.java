package coursera.stacks;

public class FixedArrayStackOfStrings {
    private String[] s;
    private int size = 0;

    public FixedArrayStackOfStrings(int capacity) {
        s = new String[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void  push(String item){
        s[size++] = item;
    }

    public String pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is Empty!");
        }
        return s[--size];
    }
}
