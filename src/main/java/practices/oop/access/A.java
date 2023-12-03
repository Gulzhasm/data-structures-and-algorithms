package practices.oop.access;

public class A {
    protected int num;
    String name;
    int[] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
