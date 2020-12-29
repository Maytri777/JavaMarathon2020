package day4;

public class Task3 {
    public static void main(String[] args) {
        int [][]matrix = new int [12][8]; //12,8
        int summe_m = 0;
        int maxSumme = 0;
        int index_m = 0;
        for (int m=0; m< matrix.length; m++){
            for (int n=0; n<matrix[m].length; n++ ){
                int x = (int) (Math.random()*50); //50
                matrix[m][n] = x;
                System.out.print(x + " ");
                summe_m=summe_m + matrix[m][n];
            }
            System.out.println();
            if(summe_m > maxSumme){
                maxSumme = summe_m;
                index_m = m;
                summe_m = 0;
            }
        }
        System.out.println( "\nДанн следующий массив: " + Arrays.deepToString(matrix) );
        System.out.println("Индекс искомой строки: " + index_m + ".  Максимальная Сумма = " + maxSumme);
    }
}
