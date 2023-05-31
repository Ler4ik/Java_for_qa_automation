package module_6_oop_basics.action;

import java.util.Scanner;

public class Main {

    //Solution for exercise 6.8.1

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        double b = sc.nextDouble();
        String c = sc.next();

        System.out.println(Action.sum(a, a));
        System.out.println(Action.sum(a, b));
        System.out.println(Action.sum(c, a));
    }
}

class Action {

    public static String sum(int firstNum, int secondNum){
     return "" + (firstNum + secondNum);
    }

    public static String sum(int firstNum, double secondNum){
        return "" + (firstNum + secondNum);
    }

    public static String sum(String firstNum, int secondNum){
        return firstNum + secondNum;
    }
}
