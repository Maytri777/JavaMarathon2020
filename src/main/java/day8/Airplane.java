package day8;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public void setPr(String s) {
        this.producer = s;
    }

    public int setYe(int i) {
        this.year = i;
        return this.year;
    }

    public double setLe(double d1) {
        this.length = d1;
        return this.length;
    }

    public void setWe(double d2) {
        this.weight = d2;
    }

    public void setFu(double d3) {
        this.fuel = d3;
    }

    public double getFu() {
        return this.fuel;
    }

    public Airplane(String p, int y, double l, double w, double f) {  //double f=0
        this.producer = p;
        this.year = y;
        this.length = l;
        this.weight = w;
        this.fuel = f;
    }

    public void info() {
        System.out.println("2) Производитель = " + this.producer + "; год=" + this.year + "; длина=" + this.length + "; вес=" + this.weight + "; горючее=" + this.fuel);

    }

    public String toString() {
        return producer + ", " + year + ", " + length + ", " + weight + ", " + fuel;
    }

    public double fillUp(int n) {
        this.fuel = n;
        return this.fuel;
    }
}
