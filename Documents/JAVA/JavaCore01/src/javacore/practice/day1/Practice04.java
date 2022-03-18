package javacore.practice.day1;

public class Practice04 {

    public static void main(String[] args) {
        int[] numbers = {3,4,10,4,5,6,4,2,4,5,6};
        int max = numbers[0];
        for (int i = 0;i+1 < numbers.length; i++){
            if (max <= numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(max);
    }
}
