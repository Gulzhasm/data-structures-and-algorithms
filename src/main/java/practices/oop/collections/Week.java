package practices.oop.collections;

public enum Week implements A{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    Week() {
        System.out.println("constructor is being called for " + this);
    }

    @Override
    public void hello() {
        System.out.println("Hey how are you");
    }
}
