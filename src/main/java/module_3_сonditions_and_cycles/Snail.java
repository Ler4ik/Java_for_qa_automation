package module_3_сonditions_and_cycles;

import java.util.Scanner;

public class Snail {

    //Solution for exercise 3.5.3

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int h = in.nextInt();
        int s = 0;
        int days = 0;

        if(a > b || a > h){
            while (s < h){
                s += a;
                ++days;
                if(s >= h){
                    System.out.println(days);
                    break;
                }
                s = s - b;
            }
        } else {
            System.out.println("Никогда");
        }
    }
}
