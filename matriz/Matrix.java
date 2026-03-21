package matriz;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        // int[][] mat = {
        //     {1,2,3,4},
        //     {4,5,6,7},
        //     {7,8,9,4}
        // };

        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de linhas: ");
        int linhas = s.nextInt();
        System.out.println("Digite a quantidade de colunas: ");
        int colunas = s.nextInt();


        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.println("Digite o elem [" + i + "][" + j+"]");
                mat[i][j] = s.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        s.close();
    }
}
