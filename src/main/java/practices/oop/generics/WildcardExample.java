package practices.oop.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildcardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }

    T remove(){
        return (T) data[--size];
    }

    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public void add(T num){
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the current array items in the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }


    public void getList(List<? extends Number> list){
        //here you can pass only number type
        //? extends Number - you can pass all number types integer, floats and etc
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardExample<Number> list = new WildcardExample<>();
        list.add(45);
        list.add(47);

        for(int i = 0; i < 10; i++){
            list.add(2*i);
        }
        System.out.println(list);
    }
}
