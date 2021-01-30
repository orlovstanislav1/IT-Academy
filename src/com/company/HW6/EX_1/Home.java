package com.company.HW6.EX_1;

public class Home {
    private final Premises[] premises;
    private final String infoOwner;
    private final int yearBuilding;
    private final int countFlours;

    public Home(Premises[] premises, String infoOwner, int yearBuilding, int countFlours) {
        this.premises = premises;
        this.infoOwner = infoOwner;
        this.yearBuilding = yearBuilding;
        this.countFlours = countFlours;
    }

    public int getTotalCostForRent() {
        int totalCostForRent = 0;
        for (Premises premise : premises) {    //стоимость аренды помещений с учетом того сдано оно или нет
            totalCostForRent += premise.receiveRentalPayment ();
        }
        return totalCostForRent;
    }

    public int getCountApartmets() {
        int totalApartmens = 0;
        for (Premises premise : premises) {
            if (premise instanceof Apartment) {
                totalApartmens++;
            }
        }
        return totalApartmens;
    }

    public int getCountOffices() {
        int totalOffices = 0;
        for (Premises premise : premises) {
            if (premise instanceof Office) {
                totalOffices++;
            }
        }
        return totalOffices;
    }

    public int getAllWaterHouse() { //для всего дома
        int totalWater = 0;
        for (Premises premise : premises) {
            totalWater += premise.getAllWater ();
        }
        return totalWater;
    }
}