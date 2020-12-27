package day3;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double delimoe;
        double delitel = 666;

        for (int i = 1; i <= 5; i++) {    //(delitel!=0)
            delimoe = sc.nextDouble();
            delitel = sc.nextDouble();

            if (delitel == 0) {
                System.out.println("Деление на 0!");
                continue;
            }

            System.out.println(delimoe / delitel);
        }
    }

}
