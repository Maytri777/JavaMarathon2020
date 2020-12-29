package day6;

public class Motorbike {
    private int jahr;
    private String farbe;
    private String model;

    public Motorbike(int godVipuska, String zvet, String modelAuto) {
        this.jahr = godVipuska;
        this.farbe = zvet;
        this.model = modelAuto;
    }

    public String info(String s) {
        String sBike = s;
        return sBike;
    }

    public int yearDifference(int inputYear) { //2021
        int difference = inputYear - this.jahr; //разница=2021-2020
        return difference;  //1
    }

    public int getJahr() {
        return jahr;
    }

    public String getFarbe() {
        return farbe;
    }

    public String getModel() {
        return model;
    }
}
