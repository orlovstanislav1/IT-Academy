package com.company.HW16;

import java.util.LinkedList;
import java.util.List;

public class AdminPart implements com.company.HW16.Locality {
    private final List<com.company.HW16.Locality> localities = new LinkedList<> ();
    String name;
    private int populations;

    public AdminPart(String name) {
        this.name = name;
    }

    public void add(com.company.HW16.Locality adminPart) {
        localities.add ( adminPart );
    }

    public void remove(com.company.HW16.Locality adminPart) {
        localities.remove ( adminPart );
    }

    @Override
    public int countPopulation() {
        for (com.company.HW16.Locality locality : localities)
            populations += locality.countPopulation ();
        return populations;
    }
}
