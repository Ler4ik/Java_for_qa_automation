package module_3_сonditions_and_cycles;

import java.util.Scanner;

public class Welcome {

    //Solution for exercise 3.5

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();

        if(amount > 0) {
            for (int i = 0; i < amount; i++) {
                String name = in.next();
                System.out.println("Привет, " + name);
            }
        }else if(amount == 0){
            System.out.println("Оу... Похоже здесь никого...");
            } else {
            System.out.println("Серьезно? А что так негативно?");
        }
        }
    }
