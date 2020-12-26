package day2;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt(); //23, 25,26
        int y =sc.nextInt(); //80

        if(x >= y ) {    //35, 25
            System.out.print("Некорректный ввод");
        }

        while(x<y){
            x++;
            if(x%5 ==0 && x%10!=0){
                System.out.print("\n" + x);
            }

        }
    }
}
