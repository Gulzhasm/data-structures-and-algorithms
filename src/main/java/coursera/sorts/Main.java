package coursera.sorts;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Chen", 1);
        Student s3 = new Student("Fox", 3);
        Student s2 = new Student("Andrew", 2);

        Student[] a = {s1, s2, s3};

        Arrays.sort(a, Student.BY_NAME);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a, Student.BY_SECTION);
        System.out.println(Arrays.toString(a));

    }
}
