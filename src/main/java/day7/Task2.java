package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random ranObjekt = new Random();
        int r1 = ranObjekt.nextInt(11) + 90;
        int r2 = ranObjekt.nextInt(11) + 90;
        int r3 = ranObjekt.nextInt(11) + 90;
        int r4 = ranObjekt.nextInt(11) + 90;
        int r5 = ranObjekt.nextInt(11) + 90;
        int r6 = ranObjekt.nextInt(11) + 90;
        int r7 = ranObjekt.nextInt(11) + 90;
        int r8 = ranObjekt.nextInt(11) + 90;

        Player p1 = new Player(r1);
        Player p2 = new Player(r2);
        Player p3 = new Player(r3);
        Player p4 = new Player(r4);
        Player p5 = new Player(r5);
        Player p6 = new Player(r6);

        p3.info();
        while (r3 > 0) {
            p3.run((r3));
            r3--;
        }
        p3.info();
    }
}
