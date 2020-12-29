package day6;

public class Prof {
    private String name;
    private String fach;
    String str = "";

    public Prof(String n, String f) {
        this.name = n;
        this.fach = f;
    }

    public int evaluate(Student student) {
        int x = 2 + (int) (Math.random() * 6);
        if (x == 2) {
            str = "неудовлетворительно=2";
        }
        if (x == 3) {
            str = "удовлетворительно=3";
        }
        if (x == 4) {
            str = "хорошо=4";
        } else {
            str = "отлично=5";
        }
        System.out.println("Prof: " + this.name + " hat Note gegeben dem " + student + ". Fach: " + this.fach + "; Note: " + str);
        return x;
    }
}
