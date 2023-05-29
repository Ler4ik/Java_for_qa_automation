package module_4_arrays;

import java.util.Scanner;

public class TransposedMatrix {

    //Solution for exercise 4.6.5

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] array = new int[m][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[j][i] = in.nextInt();
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(array[i][j]);
                if(j != n - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
