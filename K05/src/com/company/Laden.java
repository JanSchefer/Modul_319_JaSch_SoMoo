package com.company;

public class Laden {
    private String name;
    private String ort;
    private Lager lager = new Lager("lager1");

    /**
     * @param name
     * @param ort
     */
    public Laden(String name, String ort) {
        this.name = name;
        this.ort = ort;
    }

    /**
     * @return
     */
    public Lager getLager() {
        return lager;
    }

    /**
     * @param lager
     */
    public void setLager(Lager lager) {
        this.lager = lager;
    }
}
