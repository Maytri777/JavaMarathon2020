package day5;

public class Task1 {
    public static void main(String[] args) {
        Car auto = new Car();  //new Car(2010, "black", "BMW");

        auto.setJahr(2010);
        auto.setFarbe("black");
        auto.setModel("BMW");

        System.out.println( "Jahr= "   + auto.getJahr() );
        System.out.println( "Farbe: "  + auto.getFarbe() );
        System.out.println( "Model: "  + auto.getModel() );
    }
}
