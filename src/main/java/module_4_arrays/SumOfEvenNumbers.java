package module_4_arrays;

import java.util.Scanner;

public class SumOfEvenNumbers {

    //Solution for exercise 4.6.2

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];
        int sum = 0;

        for(int i: array){
            i = in.nextInt();
            if(i % 2 == 0){
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
