package practices.oop.cloning;

import java.util.Arrays;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

    @Override
    public String toString() {
        return name;
    }

//    public Object clone() throws CloneNotSupportedException {
//        //this is a shallow copying
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {

        Human twin = (Human) super.clone();
        //this is a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}


class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human gul = new Human("Gul", 34);

        Human twin = (Human) gul.clone();
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(gul.arr));
    }
}