package practices.oop.access;

public class B extends A{

    public B(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A b = new B(32, "Gul");
        int num = b.num;
    }
}
