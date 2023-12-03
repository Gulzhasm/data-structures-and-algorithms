package practices.oop.access;

public class ObjectDemo {
  int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //unique representation of the object via numbers
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12);
        ObjectDemo obj3 = new ObjectDemo(43);

        if(obj1 == obj3){
            System.out.println("obj1 is equal to obj3");
        }

        System.out.println(obj1.getClass().getName());
        //obj1.getClass() - this is stored in Heap memory
    }
}
