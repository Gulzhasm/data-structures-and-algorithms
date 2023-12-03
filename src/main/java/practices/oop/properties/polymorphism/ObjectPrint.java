package practices.oop.properties.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(3);
        System.out.println(obj);
    }

    @Override
    public String toString(){
        return "ObjectPrinting {" + num + "}";
    }
}
