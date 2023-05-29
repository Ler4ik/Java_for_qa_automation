package module_4_arrays;

import java.util.Scanner;

public class MaxInArray {

    //Solution for exercise 4.6.1

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int max = 0;
        int[] array = new int[length];

        if(length <= 0){
            System.out.println("Массив нулевого размера");
        } else{
            for(int i: array){
                i = in.nextInt();
                if( i > max){
                    max = i;
                }
            }
            System.out.println(max);
        }
    }
}
