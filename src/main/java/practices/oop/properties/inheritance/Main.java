package practices.oop.properties.inheritance;

import practices.oop.properties.inheritance.BoxWeight;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4, 5.6, 9.6);
//        Box box2 = new Box(box1);
//        System.out.println(box2.height);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(3, 4, 5, 6);
//        System.out.println(box3.height + " " + box3.weight);

//        Box box5 = new BoxWeight(2.0, 3.0,5.8,6.0);
//        System.out.println(box5.weight);


        BoxPrice box = new BoxPrice(5, 8, 200);
        System.out.println(box.weight);

        //Box.greeting();
        Box box1 = new BoxWeight();
        BoxWeight.greeting(); // you can inherit, but you cannot override
    }
}
