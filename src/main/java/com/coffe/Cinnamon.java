package com.coffe;

public class Cinnamon implements beverage {
    private beverage beverags;

    public Cinnamon(beverage beverages) {
        this.beverags = beverages;
    }

    @Override
    public double price() {
        return beverags.price() + 0.05;
    }
}
