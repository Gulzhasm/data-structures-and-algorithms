package practices.oop;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(23, "Kunal", 90.09f);
        Student student2 = new Student(23, "Rahul", 90.09f);
        System.out.println(student1.getName());
        student2.greeting();
        student2.changeName("Shoemaker");
        student2.greeting();
    }
}
