package practices.oop.properties.inheritance;

public class BoxColor extends BoxWeight{
    String colour;

    public BoxColor(String colour) {
        this.colour = colour;
    }

    public BoxColor(BoxWeight other, String colour) {
        super(other);
        this.colour = colour;
    }

    public BoxColor(double side, double weight, String colour) {
        super(side, weight);
        this.colour = colour;
    }

    public BoxColor(double l, double h, double w, double weight, String colour) {
        super(l, h, w, weight);
        this.colour = colour;
    }
}
