package day9.Task2;

public class Circle extends Figure {

    public double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    public double ShowPerimeter() {  //@override
        double perimeter = 2.0 * 3, 14 * radius;
        return perimeter;
    }

    public double ShowArea() {  //@override
        double area = 3.14 * (radius * radius);
        return area;
    }
}