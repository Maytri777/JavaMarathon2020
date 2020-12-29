package day6;

public class Airplane {
    public static void main(String[] args) {
        Airplane ap = new Airplane("Boing-666", 2000, 20.0, 20000.0, 20.0);

        ap.setPr("Airbus");
        ap.setYe(2005);
        ap.setLe(150.0);
        ap.setWe(500000.0);
        System.out.println("1) Wie viel gibt Benzin? " + ap.getFu()); //wie im Konstruktor=0.500, bis set
        ap.setFu(5.0);

        ap.info(); //nicht aus Konstruktor, schon mit set()
        System.out.println("3) Wie viel gibt Benzin? " + ap.getFu());
        System.out.println("4) Wie viel jetzt gibt noch Benzin? " + ap.fillUp(888));

        Airplane ap2 = new Airplane("TU-66", 2020, 60.0, 666000.0, 0.600);
        System.out.println("\n1)) Jahr 1982?: " + ap2.setYe(1982));
        System.out.println("2)) Lange 82=" + ap2.setLe(82.0));
        System.out.println("3)) Wie viel jetzt gibt noch Benzin 555? " + ap.fillUp(555));
        System.out.println("4)) Wie viel jetzt gibt noch Benzin 666? " + ap.fillUp(666));
    }
}
