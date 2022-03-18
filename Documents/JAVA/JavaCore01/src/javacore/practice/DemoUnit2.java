package javacore.practice;

import java.util.Scanner;

public class DemoUnit2 {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void checkTypeNumber(){
        Scanner sc_Number = new Scanner(System.in);
        System.out.println("Input Number: ");

        this.setNumber(sc_Number.nextInt());

        if (this.getNumber() % 2 ==0 ){
            System.out.println("Input number is Even !");
        }else {
            System.out.println("Input number is Odd !");
        }

        sc_Number.close();
    }

    public static void main(String[] args) {
        DemoUnit2 demoUnit2 = new DemoUnit2();
        demoUnit2.checkTypeNumber();
    }
}
