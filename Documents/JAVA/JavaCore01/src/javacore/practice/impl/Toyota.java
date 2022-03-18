package javacore.practice.impl;

import javacore.practice.Car;

public class Toyota extends Car {
    @Override
    public void InitStart() {
        Toyota toyota = new Toyota();
        toyota.setColor("Color is Black");
        toyota.setProducter("Producter is Japan");

        System.out.println("------------");
        System.out.println("Toyota car with " + toyota.getColor() + " and " + toyota.getProducter());
        System.out.println("------------");
    }

    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.InitStart();
    }
}
