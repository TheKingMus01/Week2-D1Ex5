package com.coffe;

public class Main {
    public static void main(String[] args) {

        beverage coffee = new coffe();
        beverage teaWithMilkAndCinnamon = new Cinnamon(new Milk(new tea()));

        System.out.println("coffee: " + coffee.price());
        System.out.println("tea : " + teaWithMilkAndCinnamon.price());


    }
}