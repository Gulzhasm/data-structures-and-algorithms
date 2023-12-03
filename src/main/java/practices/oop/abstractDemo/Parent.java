package practices.oop.abstractDemo;

public abstract class Parent {
    int age;
    final int VALUE = 234224242;

    protected Parent(int age) {
        this.age = age;
    }


    abstract void career();
    abstract void partner();

    static void hello(){
        System.out.println("Hello!");
    }

    void normal(){
        System.out.println("I am a normal function");
    }
}
