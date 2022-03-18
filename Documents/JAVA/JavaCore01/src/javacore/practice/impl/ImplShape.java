package javacore.practice.impl;

public class ImplShape {

    public static void main(String[] args) {
//        Circle circle = new Circle("Red",5);
//        Square square = new Square("Green",5);
//
//        circle.createArea();
//        square.createArea();

        BackEndDevelopment ba = new BackEndDevelopment(
                1,
                "Phong",
                "JavaCore",
                "VietNamese",
                "Java");

        FrontEndDevelopment fa = new FrontEndDevelopment(
                1,
                "Long",
                "CSS",
                "VietNamese",
                "Java");

        ba.displayInformation();
        fa.displayInformation();
    }

}
