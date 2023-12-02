package practices.oop;

public class Student {
    private int rno;
    private String name;
    private float mark;

    public Student(int rno, String name, float mark) {
        this.rno = rno;
        this.name = name;
        this.mark = mark;
    }

    Student() {
        this(13, "default student", 89.0f);
    }


    public void greeting() {
        System.out.println("Hello! my name is " + name);
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public int getRno() {
        return rno;
    }

    public String getName() {
        return name;
    }

    public float getMark() {
        return mark;
    }


    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
