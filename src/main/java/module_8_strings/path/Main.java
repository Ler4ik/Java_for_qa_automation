package module_8_strings.path;

import java.util.Scanner;

public class Main {

    //Solution for exercise 8.4

    public static void main(String[] args){

        String base = new Scanner(System.in).nextLine();

        boolean unixBool =  base.matches("(((~?)|(\\.{1,2}))(/?))(([\\w\\s]*(\\.{2})?/?)*)([\\w\\s]+\\.\\w+)?");
        boolean windowsBool = base.matches("((([A-Za-z]:\\\\)?)|(\\.{1,2}))(([\\w\\s]*(\\.{2})?\\\\?)*)(([\\w\\s]+\\.\\w+)?)");

        if (unixBool&windowsBool){
            System.out.println("Both");
        } else if (unixBool) {
            System.out.println("Unix");
        } else if (windowsBool) {
            System.out.println("Windows");
        } else {
            System.out.println("Error");
        }
    }
}
