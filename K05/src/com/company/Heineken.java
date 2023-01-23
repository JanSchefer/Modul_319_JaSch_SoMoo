package com.company;

import java.util.ArrayList;
import java.util.List;

public class Heineken extends Marke{

    /**
     * @param name
     * @param gruendungsJahr
     * @param biers
     */
    public Heineken(String name, int gruendungsJahr, ArrayList<Bier> biers) {
        super(name, gruendungsJahr, biers);
    }

    /**
     * @param newBier
     */
    public void createHeinekenBier(Bier newBier){
        System.out.println("Neues Heineken Bier");
        super.createBeer(newBier);
    }
}
