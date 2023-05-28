package module_3_сonditions_and_cycles;

import java.util.Scanner;

public class MaximumInSequence {

    //Solution for exercise 3.5.5

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int max = 0;
        int number;

        do{
            number = in.nextInt();
            if(max < number){
                max = number;
            }
        } while (number != 0);

        System.out.println(max);
    }
}
