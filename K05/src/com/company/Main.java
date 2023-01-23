package com.company;

public class Main {

    public static void main(String[] args) {
	Laden laden = new Laden("Kiosk", "Zuerich");
    laden.getLager().allBier();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //laden.getLager().getPrice("bier1");
        //Sorting ob = new Sorting();
        //double arr[] = {64.4,25,12.34,22,11};
        //ob.sort(arr);
        //ob.printArray(arr);
    }
}
