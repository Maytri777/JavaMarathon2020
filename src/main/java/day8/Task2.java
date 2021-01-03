package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane ap = new Airplane("Boing-666", 2000, 20.0, 20000.0, 20.0);

        ap.setPr("Airbus");
        ap.setYe(2005);
        ap.setLe(150.0);
        ap.setWe(500000.0);
        System.out.println("1) Сколько бензина? " + ap.getFu());
        ap.setFu(5.0);

        ap.info();
        System.out.println("3) Сколько бензина? " + ap.getFu());
        System.out.println("4) Сколько бензина? " + ap.fillUp(888));

        Airplane ap2 = new Airplane("TU-66", 2020, 60.0, 666000.0, 0.600);
        System.out.println("\n1)) Какой год?: " + ap2.setYe(1982));
        System.out.println("2)) Длина = " + ap2.setLe(82.0));
        System.out.println("3)) Сколько бензина сейчас? " + ap.fillUp(555));
        System.out.println("4)) Сколько бензина сейчас? " + ap.fillUp(666));

        Airplane airplane = new Airplane("Boeing", 2000, 150.0, 10000.0, 666.6); //,
        System.out.println("\n" + airplane);
    }
}
