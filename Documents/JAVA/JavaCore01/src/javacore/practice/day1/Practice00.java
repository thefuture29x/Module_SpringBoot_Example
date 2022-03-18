package javacore.practice.day1;

import java.util.Scanner;

public class Practice00 {
    int[] numbers = {3,4,10,4,5,6,4,2,4,5,6};
    public void Pr1(){
        for (int i = 0;i < numbers.length; i++){
            for (int j = i+1; j<numbers.length; j++){
                int tmp = 0;
                if(numbers[i] >= numbers[j]){
                    tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }

        for (int i = 0;i <numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
    public void Pr2(){
        for (int i = 0;i < numbers.length; i++){
            int factorial = 1;
            for (int j = 1; j<=numbers[i]; j++){
                factorial *=j;
            }
            numbers[i] = factorial;
        }

        for (int i = 0;i <numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
    public void Pr3(){
        int sum = 0;
        for (int i = 0;i < numbers.length; i++){
            sum+= numbers[i];
        }
        System.out.print(sum);

    }
    public void Pr4(){
        int max = numbers[0];
        for (int i = 0;i+1 < numbers.length; i++){
            if (max <= numbers[i]){
                max = numbers[i];
            }
        }
        System.out.print(max);
    }


    public static void main(String[] args) {
        System.out.println("Choose Practice: ");
        System.out.println("1. Practice 01 ");
        System.out.println("2. Practice 02 ");
        System.out.println("3. Practice 03 ");
        System.out.println("4. Practice 04 ");

        Scanner scanner = new Scanner(System.in);
        int number_choose = scanner.nextInt();
        Practice00 pr = new Practice00();
        switch (number_choose){

            case 1:
                pr.Pr1();
                Scanner scanner01 = new Scanner(System.in);
                System.out.println("1. Continute ");
                System.out.println("0. Stop ");
                int number01 = scanner.nextInt();
                if (number01 == 1){

                }else {
                    scanner01.close();
                }
                break;
            case 2:
                pr.Pr2();
                break;
            case 3:
                pr.Pr3();
                break;
            case 4:
                Practice04 pr4 = new Practice04();
                Scanner sc4 = new Scanner(System.in);
                System.out.println("1. Continute ");
                System.out.println("0. Stop ");
                break;
        }




    }
}
