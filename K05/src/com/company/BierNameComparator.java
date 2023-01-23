package com.company;

import java.util.Comparator;

public class BierNameComparator implements Comparator<Bier>{

    @Override
    public int compare(Bier o1, Bier o2) {
        return o1.getName().compareTo(o2.getName());

    }
}
