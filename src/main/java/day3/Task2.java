package day3;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double delimoe;
        double delitel = 666;

        while (true) {    //(delitel!=0)
            delimoe = sc.nextDouble();
            delitel = sc.nextDouble();

            if (delitel == 0) break;

            System.out.println("Resultat delenia: " + delimoe / delitel);
        }
    }
}
