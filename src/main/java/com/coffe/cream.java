package com.coffe;

public class cream implements beverage {
    private beverage beverag;

    public cream(beverage beverages) {
        this.beverag = beverages;
    }

    @Override
    public double price() {
        return beverag.price() +  0.15;
    }
}
