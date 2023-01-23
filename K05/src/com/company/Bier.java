package com.company;

public class Bier implements Comparable {
    private String name;
    private String farbe;
    private double preis;

    /**
     * @param name
     * @param farbe
     * @param preis
     */
    public Bier(String name, String farbe, double preis) {
        this.name = name;
        this.farbe = farbe;
        this.preis = preis;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getFarbe() {
        return farbe;
    }

    /**
     * @param farbe
     */
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    /**
     * @return
     */
    public double getPreis() {
        return preis;
    }

    /**
     * @param preis
     */
    public void setPreis(double preis) {
        this.preis = preis;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        if(o instanceof Bier){
            Bier otherBier = (Bier)o;
            if(otherBier.getPreis() < this.getPreis()){
                return -1;
            }else{
                return 1;
            }
        }
        return 0;
    }
}
