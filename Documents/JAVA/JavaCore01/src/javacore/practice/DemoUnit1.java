package javacore.practice;

import java.util.Scanner;

public class DemoUnit1 {
    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void inputInformation(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap number");
        this.setNumber(sc1.nextInt());

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhap name");
        this.setName(sc2.nextLine());

        sc1.close();
        sc2.close();

    }
    public void displayImformation(){
        System.out.println("Number : " + this.number + " | Name : " + this.name);
    }

    public static void main(String[] args) {

        DemoUnit1 demo = new DemoUnit1();
        demo.inputInformation();
        demo.displayImformation();
    }
}

