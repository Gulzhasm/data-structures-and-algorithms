package practices.oop.abstractDemo.interfaces;

public class Car implements Engine, Brake, Media {
    int a = 10;
    @Override
    public void brake() {
        System.out.println("I break the break like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate engine like a normal car");
    }
}
