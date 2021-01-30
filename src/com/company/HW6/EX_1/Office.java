package com.company.HW6.EX_1;

public class Office extends Premises {
    private final String companyName;
    private final String premisesOwner;

    public Office(int countPeople, int apartmentNumber, int floorNumber, int entranceNumber, int rentCost,
                  String companyName, String premisesOwner) {
        super ( countPeople, apartmentNumber, floorNumber, entranceNumber, rentCost );
        this.companyName = companyName;
        this.premisesOwner = premisesOwner;
        super.setWater ( 10 ); //работник тратит 10л воды в день
    }

    @Override
    public String getType() {
        return "office";
    }
}
