package module_2_data_types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DigitalWatch {

    //Solution for exercise 2.7

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();
        int hours = seconds / 3600 % 24;
        int minuts = seconds/ 60 % 60;
        seconds = seconds % 60;
        System.out.println(String.format("%01d:%02d:%02d", hours, minuts, seconds));
    }
}
