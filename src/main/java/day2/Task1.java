package day2;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        if(0<n && n<5) { //1-4
            System.out.print("Малоэтажный дом");
        }
        if(4<n && n<9) { //5-8
            System.out.print("Среднеэтажный дом");
        }
        if(8<n && n<201) { //9. maximum 200
            System.out.print("Многоэтажный дом");
        }
        if(n<=0) {
            System.out.print("Идите-ка проспитесь!");
        }
    }
}
