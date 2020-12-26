package day2;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt(); //23, (25,26)
        int y =sc.nextInt(); //80

        if(x >= y ) {    //35, 25
            System.out.print("Некорректный ввод");
        }

        if(x%10>=5){  //25,26
            x= x -(x%10);
            x = x + 15;
        } else {      //23
            x= x -(x%10); // 25-5=20
            x= x+5;
        }
        for( ; x<y; x = x+10){
            System.out.print("\n" + x);
        }
    }
}
