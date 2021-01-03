package day8;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\ncold start time " + String.format("%,12d", measure()) + " ns");
        System.out.println("warmed JRE time " + String.format("%,12d", measure()) + " ns");


        StringBuilder sb = new StringBuilder("0");
        for (int i = 0; i < 200; i++) {
            sb.append(" " + i);
        }
        System.out.print(sb.toString());
        System.out.println("\ncold start time " + String.format("%,12d", measure()) + " ns");
        System.out.println("warmed JRE time " + String.format("%,12d", measure()) + " ns");
    }

    public static long measure() {
        long start, end;
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
        }
        end = System.nanoTime();
        return end - start;
    }
}
