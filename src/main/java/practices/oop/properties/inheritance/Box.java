package practices.oop.properties.inheritance;

import java.sql.SQLOutput;

public class Box {
    double length;
    double height;
    double weight;

    Box() {
        this.height = -1;
        this.length = -1;
        this.weight = -1;
    }

    //cube
    Box(double side){
        //super(); calling Object class
        this.height = side;
        this.length = side;
        this.weight = side;
    }

    public Box(double length, double height, double weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    //old box
    Box(Box old){
        this.length = old.length;
        this.height = old.height;
        this.weight = old.weight;
    }

    public void information(){
        System.out.println("Displaying the box..");
    }
}
