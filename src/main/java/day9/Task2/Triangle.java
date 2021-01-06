package day9.Task2;

public class Triangle extends Figure {

    private double seite1;
    private double seite2;
    private double seite3;

    public Triangle(String color, double seite1, double seite2, double seite3) {
        super(color);
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite3;
    }

    public double ShowPerimeter() { //@override
        double perimeter = seite1 + seite2 + seite3;
        return perimeter;
    }

    public double ShowArea() { //@override
        double halfP = (seite1 + seite2 + seite3) / 2.0;  //=ShowPerimeter()/2
        double area = Math.sqrt(halfP * (halfP - seite1) * (halfP - seite2) * (halfP - seite3));
        return area;
    }
}
