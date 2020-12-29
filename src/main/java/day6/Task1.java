package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2020, "rot", "Audi");
        Car auto = new Car();
        auto.setJahr(2010);
        auto.setFarbe("black");
        auto.setModel("BMW");

        System.out.println( "Что за транспорт? "   + bike.info(" - Bike") );
        System.out.println( "Что за транспорт? "   + auto.info(" - Car") );
        System.out.println( "Сколько лет Bike? "   + bike.yearDifference(2021) );
        System.out.println( "Сколько лет Car? "    + auto.yearDifference(2021) );
    }
}
