package day5;

public class Motorbike {
    private int    jahr;
    private String farbe;
    private String model;

    public Motorbike (int godVipuska, String zvet, String modelAuto){
        this.jahr=godVipuska;
        this.farbe=zvet;
        this.model=modelAuto;
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
