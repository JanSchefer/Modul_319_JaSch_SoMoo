package com.company;

import java.util.ArrayList;
import java.util.List;

public class Marke {
    private String name;
    private int gruendungsJahr;
    private ArrayList<Bier> biers;

    /**
     * @param name
     * @param gruendungsJahr
     */
    public Marke(String name, int gruendungsJahr) {
        this.name = name;
        this.gruendungsJahr = gruendungsJahr;
    }

    /**
     * @param name
     * @param gruendungsJahr
     * @param biers
     */
    public Marke(String name, int gruendungsJahr, ArrayList<Bier> biers) {
        this.name = name;
        this.gruendungsJahr = gruendungsJahr;
        this.biers = biers;
    }

    /**
     * @param newBier
     */
    public void createBeer(Bier newBier){
        this.biers.add(newBier);
        setBiers(this.biers);
        System.out.println(newBier + " wurde erstellt");
    }

    /**
     * @param bier
     */
    public void removeBeer(Bier bier){
        this.biers.remove(bier);
        setBiers(this.biers);
        System.out.println(bier + " wurde gelöst");
    }

    /**
     * @return
     */
    public ArrayList<Bier> getBiers() {
        return biers;
    }

    /**
     * @param beers
     */
    public void setBiers(List<Bier> beers) {
        this.biers = biers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
