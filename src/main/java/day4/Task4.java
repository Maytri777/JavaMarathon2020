package day4;

public class Task4 {
    public static void main(String[] args) {
        int [] massiv = new int [100];
        int maxSumme3 =0;


        for (int index=1;   index < massiv.length;   index++){

            int x = (int) (Math.random()*10000);
            massiv[index] = x;

            int summe3 = massiv[index] + massiv[index+1] + massiv[index+2];
            System.out.print("Summe:" + summe3 + " ");

            if (maxSumme3<summe){
                maxSumme3 =summe3;
            }
        }
        System.out.println( "\nИмеющийся массив: " + Arrays.toString(massiv) );
        System.out.println("Максимальная сумма кортеджа = " + maxSumme3);
    }
}
