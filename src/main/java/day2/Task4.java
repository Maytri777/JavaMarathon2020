package day2;

public class Task4 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                double x =sc.nextDouble();
                double y;
                if(x>=5){
                    y=(Math.pow(x,2) - 10) / (x + 7);
                }
                else if (-3<x && x<5) {
                    y=(x+3)*(x*x-2);
                } else {
                    y=420;
                }
                System.out.print(y);

    }
}
