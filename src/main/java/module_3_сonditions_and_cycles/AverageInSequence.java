package module_3_сonditions_and_cycles;

import java.util.Scanner;

public class AverageInSequence {

    //Solution for exercise 3.5.5

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int average = 0,
            sum = 0,
            count = 0,
            number = 0;

        do{

            number = in.nextInt();
            sum = sum + number;
            if (number != 0){
                count++;
            }
        } while(number != 0);

        average = sum / count;
        System.out.println(average);
    }
}
