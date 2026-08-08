package semestresantigos.matriz;

import java.util.Scanner;

public class matrizDiagPrincipal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int soma = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                mat[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j){
                    soma = soma + mat[i][j];//soma += mat[i][j]
                }
            }
        }

        System.out.println("Soma: " + soma);
        
    }
}
