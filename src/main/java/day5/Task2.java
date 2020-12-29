package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2020, "rot", "Audi");

        System.out.println( "Jahr= "   + bike.getJahr() );
        System.out.println( "Farbe: "  + bike.getFarbe() );
        System.out.println( "Model: "  + bike.getModel() );
    }
}
