package practices.oop.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love Humpy Dumpy");
    }

    @Override
    void normal(){
        super.normal();
    }
}
