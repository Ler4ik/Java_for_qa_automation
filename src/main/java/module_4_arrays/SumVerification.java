package module_4_arrays;

import java.util.Scanner;
import  java.util.Arrays;

public class SumVerification {

    //Solution for exercise 4.6.3

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] array = new int[length];
        boolean[] booleanArray = new boolean[length];
        booleanArray[0] = booleanArray[1] = false;

        for(int i = 0; i < length; i++){
            array[i] = in.nextInt();
            if(i > 1){
            if (array[i] == array[i-1] + array[i-2]){
                booleanArray[i] = true;
            } else {
                booleanArray[i] = false;
            }
        }
        }

        System.out.println(Arrays.toString(booleanArray));
    }
}
