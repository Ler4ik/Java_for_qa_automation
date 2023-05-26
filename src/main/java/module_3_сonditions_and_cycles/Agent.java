package module_3_сonditions_and_cycles;

import java.util.Scanner;

public class Agent {

    //Solution for exercise 3.5.1

    final static int PASSWORD = 133976;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int externalPassword = in.nextInt();

        if (externalPassword == PASSWORD){
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
