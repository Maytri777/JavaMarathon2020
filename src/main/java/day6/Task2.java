package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane ap = new Airplane("Boing-666", 2000, 20.0, 20000.0, 20.0);

        ap.setPr("Airbus");
        ap.setYe(2005);
        ap.setLe(150.0);
        ap.setWe(500000.0);
        System.out.println("1) Сколько бензина до set? " + ap.getFu());
        ap.setFu(5.0);

        ap.info();
        System.out.println("3) Сколько бензина после set? " + ap.getFu());
        System.out.println("4) Заполнили бак на: " + ap.fillUp(888));

        Airplane ap2 = new Airplane("TU-66", 2020, 60.0, 666000.0, 0.600);
        System.out.println("\n1)) год выпуска: " + ap2.setYe(1982));
        System.out.println("2)) длина=" + ap2.setLe(82.0));
        System.out.println("3)) Сколько Бензина осталось? " + ap.fillUp(82));
        System.out.println("4)) На сколько заправились? " + ap.fillUp(820));
    }
}
