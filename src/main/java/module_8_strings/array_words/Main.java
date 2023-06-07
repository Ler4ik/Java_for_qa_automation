package module_8_strings.array_words;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    //Solution for exercise 8.4

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        Pattern p = Pattern.compile("[ ,!?;.:]+");
        String word[] = p.split(str);

        System.out.println(Arrays.toString(word));
    }
}
