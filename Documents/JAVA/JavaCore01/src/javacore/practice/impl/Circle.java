package javacore.practice.impl;

import javacore.practice.Shape;

public class Circle implements Shape {
    private final double pi = 3.14;
    private int radius;


//    public Circle(String color, int radius) {
//        super(color);
//        this.radius = radius;
//    }

    public double getPi(){
        return pi;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }



//
//    @Override
//    public void createArea() {
//        System.out.println("Create Circle with color " + this.getColor() + " and acreage is " +
//                this.getRadius()*this.getRadius()*this.getPi() );
//    }
        public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display();


    }


    public void display() {
        System.out.println("Display !");
    }
}
