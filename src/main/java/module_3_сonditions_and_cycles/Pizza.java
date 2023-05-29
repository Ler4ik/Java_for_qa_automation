package module_3_сonditions_and_cycles;

import java.util.Scanner;

public class Pizza {

    //Solution for exercise 3.5.7

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int countPeople = in.nextInt();
        int countSliceOfPizza = in.nextInt();
        int countPizza = 1;

        while ((countSliceOfPizza*countPizza)%countPeople != 0){
            countPizza++;
        }

        System.out.println(countPizza);
    }


}
