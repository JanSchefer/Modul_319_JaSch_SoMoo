package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public ArrayList<Bier> sort(ArrayList<Bier> listToSort){

        Bier smallInt = null;
        int j = 0;
        int smallIntIndex = 0;

        for (int i = 1; i < listToSort.size(); i++) {

            smallIntIndex = i - 1;

            smallInt = listToSort.get(smallIntIndex);

            for (j = i; j < listToSort.size(); j++) {
                if (listToSort.get(j).getPreis() < smallInt.getPreis()) {
                    smallInt = listToSort.get(j);
                    smallIntIndex = j;
                }
            }

            //Swap the smallest element with the first element of unsorted subarray
            swap(i - 1, smallIntIndex,listToSort);
        }

        return listToSort;
    }


    public void swap(int sourceIndex, int destIndex,List<Bier> listToSwap) {
        Bier temp = listToSwap.get(destIndex);
        listToSwap.set(destIndex, listToSwap.get(sourceIndex));
        listToSwap.set(sourceIndex, temp);
    }
}

