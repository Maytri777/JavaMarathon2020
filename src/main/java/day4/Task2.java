package day4;

public class Task2 {
    public static void main(String[] args) {
        int [] massiv1 = new int [100];
        int max = 0;
        int min = 10000;
        int count1=0;
        int summe=0;

        for (int x: massiv1){
            x = (int) ( Math.random()*10000 );
            System.out.print(x + " " );
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
            if (x%10==0)	{
                count1++;
                summe =summe + x;
            }
        }
        System.out.println( "Maximum: " + max );
        System.out.println( "Minimum: " + min );
        System.out.println( "Количество чисел оканчивающихся на ноль " + count1 );
        System.out.println( "Сумма: " + summe );
    }
}
