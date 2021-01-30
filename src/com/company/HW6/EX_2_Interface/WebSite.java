package com.company.HW6.EX_2_Interface;

public abstract class WebSite implements MassMedia {
    private int circulation; // тираж
    private int profit; // прибыль

    public WebSite(int circulation, int profit) {
        this.circulation = circulation;
        this.profit = profit;
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int donate) {
        this.profit = profit;
    }
}
