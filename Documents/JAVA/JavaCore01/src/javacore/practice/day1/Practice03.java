package javacore.practice.day1;

public class Practice03 {

    public static void main(String[] args) {
        int[] numbers = {3,4,10,4,5,6,4,2,4,5,6};
        int sum = 0;

        for (int i = 0;i < numbers.length; i++){
            sum+= numbers[i];
        }
        System.out.println(sum);

    }

}
