package javacore.practice.day1;

public class Practice01 {

    public static void main(String[] args) {
        int[] numbers = {3,4,10,4,5,6,4,2,4,5,6};
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
            System.out.println(numbers[i]);
        }
    }

}
