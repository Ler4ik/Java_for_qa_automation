package module_3_сonditions_and_cycles;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Сheck {

    //Solution for exercise 3.5.4

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        int friends = in.nextInt();

        if( friends <= 0){
            System.out.println("Кто здесь?!");
        } else if (amount < 0){
            System.out.println("Еда не так плоха, чтобы за ее поедание доплачивали");
        } else {
            int partAmount =(int)(1.1 * amount) / friends;
            System.out.println(partAmount);
        }
    }
}
