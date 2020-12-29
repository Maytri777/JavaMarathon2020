package day4;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  //5
        int[] arr = new int[n];  //0,1,2,3,4.
        int count_8 = 0;
        int count_1 = 0;
        int count_g = 0;
        int count_ng = 0;
        int summe = 0;

        for (int index = arr.length - 1; index >= 0; --index) { //4,3,2,1,0.
            int x = (int) (Math.random() * 10); // [0, 10)
            arr[index] = x;
            if (arr[index] > 8) {
                count_8++;
            }
            if (arr[index] == 1) {
                count_1++;
            }
            if (x % 2 == 0 && x != 0) {
                count_g++;
            }
            if (x % 2 != 0 && x != 0) {
                count_ng++;
            }
            summe = summe + x;
        }
        System.out.println("Сгенерирован следующий массив: " + Arrays.toString(arr));  // zeig arr in [, , , ,]
        System.out.println("Длина массива: " + arr.length);     
        System.out.println("Количество чисел больше 8: " + count_8);
        System.out.println("Количество чисел равных 1: " + count_1);
        System.out.println("Количество четных чисел:  " + count_g);
        System.out.println("Количество нечетных чисел:  " + count_ng);
        System.out.println("Сумма всех элементов массива: " + summe);
    }
}

