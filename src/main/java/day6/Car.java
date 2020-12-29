package day6;

public class Car {
    private int jahr;
    private String farbe;
    private String model;

    public String info(String str) {
        String sCar = str;
        return sCar;
    }

    public int yearDifference(int inputYear) { //2021
        int difference = inputYear - this.jahr; //Разница=2021-2010
        return difference; //11
    }

    public void setJahr(int j) {
        this.jahr = j;
    }

    public void setFarbe(String f) {
        this.farbe = f;
    }

    public void setModel(String m) {
        this.model = m;
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
