package practices.oop.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student gul = new Student(23, 89.9f);
        Student aika = new Student(24, 90.9f);
        Student john = new Student(25, 77.9f);
        Student joe = new Student(26, 67.9f);
        Student karan = new Student(27, 56.9f);

        Student[] list = {gul, aika, john, joe, karan};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
