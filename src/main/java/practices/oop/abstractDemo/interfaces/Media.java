package practices.oop.abstractDemo.interfaces;

public interface Media {
    void start();
    void stop();

    default void playMusic(){
        System.out.println("I am a default method of Media");
    }

    static void hello(){
        System.out.println("Static interface methods should have always a body. Call via the interface name");
    }
}
