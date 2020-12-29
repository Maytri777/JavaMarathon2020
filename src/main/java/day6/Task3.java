package day6;

public class Task3 {
    public static void main(String[] args) {
        Student st = new Student("Maya Schneider");
        Prof pr = new Prof("Sebastian Reger", "Computernetzprotokole");

        pr.evaluate(st);
    }
}
