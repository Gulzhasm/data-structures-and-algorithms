package practices.oop.abstractDemo.interfaces;

public class Main {
    public static void main(String[] args) {

//        Engine car = new Car();
//        //car.a; is not accessible as engine super class cannot see what is available in a subclass
//        car.accelerate();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar niceCar = new NiceCar();
        niceCar.start();
        niceCar.stopMusic();


    }
}
