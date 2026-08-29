package matrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] m = new int[3][3];
        int[][] m2 =    {
                            {1,2},
                            {3,4},
                            {5,6},
                            {7,8}
                        };

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m[i][j] = s.nextInt();
            }
        }
        System.out.println("\n==============");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
