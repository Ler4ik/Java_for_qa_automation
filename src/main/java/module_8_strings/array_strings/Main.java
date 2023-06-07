package module_8_strings.array_strings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Solution for exercise 8.4

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int stringCount = in.nextInt();

        String[] strings = new String[stringCount];

        for(int i = 0; i < stringCount; i++){
            strings[i] = in.next();
        }

        System.out.println(Arrays.toString(strings));
    }
}
