package com.company.HW16;

import java.util.LinkedList;
import java.util.List;

public class Country implements com.company.HW16.Locality {
    private final List<com.company.HW16.Locality> adminParts = new LinkedList<> ();
    String name;
    private int populations;

    public Country(String name) {
        this.name = name;
    }

    public void add(com.company.HW16.Locality adminPart) {
        adminParts.add ( adminPart );
    }

    public void remove(com.company.HW16.Locality adminPart) {
        adminParts.remove ( adminPart );
    }

    @Override
    public int countPopulation() {
        for (com.company.HW16.Locality adminPart : adminParts)
            populations += adminPart.countPopulation ();
        return populations;
    }
}
