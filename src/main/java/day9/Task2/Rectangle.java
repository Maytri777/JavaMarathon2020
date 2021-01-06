package day9.Task2;

public class Rectangle extends Figure {

    public double width;
    public double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double ShowPerimeter() {  //@override
        double perimeter = (width + length) * 2.0;
        return perimeter;
    }

    public double ShowArea() {  //@override
        double area = width * length;
        return area;
    }
}
