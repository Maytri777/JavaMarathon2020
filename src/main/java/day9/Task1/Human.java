package day9.Task1;

public class Human {
    public String name;

    public Human(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("-2-имя этого человека " + this.name);  //*2
    }
}
