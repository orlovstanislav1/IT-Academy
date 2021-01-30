package com.company.HW6.EX_1;

public class Apartment extends Premises {
    private final Room[] rooms;

    public Apartment(int countPeople, int apartmentNumber, int floorNumber, int entranceNumber, int rentCost,
                     Room[] rooms) {
        super ( countPeople, apartmentNumber, floorNumber, entranceNumber, rentCost );
        this.rooms = rooms;
        super.setWater ( 200 );
    }

    @Override
    public String getType() {
        return "apartment";
    }
}
