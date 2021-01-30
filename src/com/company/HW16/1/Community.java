package com.company.HW16;

public class Community implements com.company.HW16.Locality {
    private String name;
    private int populations;

    public Community(String name, int populations) {
        this.name = name;
        this.populations = populations;
    }

    @Override
    public int countPopulation() {
        return populations;
    }
}
