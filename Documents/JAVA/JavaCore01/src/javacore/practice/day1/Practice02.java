package javacore.practice.day1;

public class Practice02 {

    public static void main(String[] args) {
        int[] numbers = {3,4,10,4,5,6,4,2,4,5,6};
//        int[] fac = {};

        for (int i = 0;i < numbers.length; i++){
            int factorial = 1;
            for (int j = 1; j<=numbers[i]; j++){
                factorial *=j;
            }

            numbers[i] = factorial;
        }

        for (int i = 0;i <numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }

}
