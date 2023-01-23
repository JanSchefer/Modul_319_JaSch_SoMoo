package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lager implements LagerService {
    Sorting sorting = new Sorting();
    private String name;
    private List<Marke> marken = List.of(new Heineken("Heineken", 1899, new ArrayList<Bier>() {
        {
            add(new Bier("bier1", "dunkel", 09.95));
            add(new Bier("bier2", "hell", 06.95));
            add(new Bier("bier3", "dunkel", 02.10));
        }
    }));

    /**
     * @param name
     * @param marken
     */
    public Lager(String name, List<Marke> marken) {
        this.name = name;
        this.marken = marken;
    }

    /**
     * @param name
     */
    public Lager(String name) {
        this.name = name;
    }

    public void getPrice(String name) {
        for (int i = 0; i < marken.size(); i++) {
            Marke marke = marken.get(i);
            for (int y = 0; y < marke.getBiers().size(); y++) {
                Bier thisBier = marke.getBiers().get(y);
                if (thisBier.getName().equals(name)) {
                    System.out.println(thisBier.getPreis());
                }
            }
        }
    }


    public void allBier() {
        System.out.println("Alle Bier");
        System.out.println("------------------------------------");

        for (int i = 0; i < marken.size(); i++) {
            Marke marke = marken.get(i);
            ArrayList<Bier> sortedList = sorting.sort(marke.getBiers());
            System.out.println(marke.getName() + ":");
            for (int y = 0; y < sortedList.size(); y++) {
                Bier thisBier = marke.getBiers().get(y);
                System.out.println("name: " + thisBier.getName());
                System.out.println("farbe: " + thisBier.getFarbe());
                System.out.println("preis: " + thisBier.getPreis());
                System.out.println("------------------------------------");
            }
            System.out.println(marke.getName());
        }


    }
}
