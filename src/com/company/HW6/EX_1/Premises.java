package com.company.HW6.EX_1;

public abstract class Premises implements Rentable {
    private final int countPeople; //кол-во человек
    private final int apartmentNumber;//№ кв
    private final int floorNumber; //этаж
    private final int entranceNumber; //подъезд
    private final int rentCost;//ст-ть аренды
    private boolean isRent = false; // false - нет аренды.
    private int water;

    public Premises(int countPeople, int apartmentNumber, int floorNumber, int entranceNumber, int rentCost) {
        this.countPeople = countPeople;
        this.apartmentNumber = apartmentNumber;
        this.floorNumber = floorNumber;
        this.entranceNumber = entranceNumber;
        this.rentCost = rentCost;
    }

    public int getAllWater() {    //для помещения
        return water * countPeople;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public String getType() {
        return "premises";
    }

    @Override
    public void rent() {
        isRent = true;
    }

    @Override
    public int receiveRentalPayment() {
        if (isRent) {
            return rentCost;
        } else {
            return 0;
        }
    }
}
