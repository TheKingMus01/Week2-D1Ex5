package com.coffe;

public class Milk implements beverage {
    private beverage beverag;

    public Milk(beverage beverages) {
        this.beverag = beverages;
    }

    @Override
    public double price() {
        return beverag.price() +  0.10;
    }
}
