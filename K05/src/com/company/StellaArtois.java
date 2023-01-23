package com.company;

import java.util.ArrayList;
import java.util.List;

public class StellaArtois extends Marke{
    /**
     * @param name
     * @param gruendungsJahr
     * @param biers
     */
    public StellaArtois(String name, int gruendungsJahr, ArrayList<Bier> biers) {
        super(name, gruendungsJahr, biers);
    }

    /**
     * @param newBier
     */
    public void createStellaArtoisBier(Bier newBier){
        System.out.println("Neues Stelle Artois Bier");
        super.createBeer(newBier);
    }
}
