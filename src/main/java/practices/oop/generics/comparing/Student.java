package practices.oop.generics.comparing;

public class Student implements Comparable<Student> {

    int sNo;
    float marks;

    public Student(int sNo, float marks) {
        this.sNo = sNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " " + sNo;
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.marks - o.marks);
    }
}
