package module_3_сonditions_and_cycles;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {

    //Solution for exercise 3.5.8

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        float a = in.nextFloat(),
              b = in.nextFloat(),
              c = in.nextFloat();
        double root1,root2;

        float d = (b * b) - (4 * a *c);

        if (d < 0){
            System.out.println("без корней");
        } else if (d == 0){
            root1 = (-b) / (2 * a);
            System.out.println(root1);
        } else {
            root1 = (-b + sqrt(d)) / (2 * a);
            root2 = (-b - sqrt(d)) / (2 * a);
            System.out.println((root1 < root2)? root1 +" " + root2 : root2 + " " + root1);
        }
    }
}
