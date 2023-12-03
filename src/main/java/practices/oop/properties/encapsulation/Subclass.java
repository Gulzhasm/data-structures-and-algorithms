package practices.oop.properties.encapsulation;

import practices.oop.access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass c = new Subclass(32, "Gul");
        System.out.println(c instanceof A);
        //A c = new Subclass(32, "Gul); c.num will give an error because class A does not know what they are extending
        int num = c.num; //only subclass can access protected member!!!
    }
}

class SubSubClass extends Subclass {

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubClass c = new SubSubClass(32, "Gul");
        int n = c.num;
    }
}

class Subclass2 extends A {

    public Subclass2(int num, String name) {
        super(num, name);
    }
}
