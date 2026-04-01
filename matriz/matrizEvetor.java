package matriz;

import java.util.Scanner;

public class matrizEvetor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] mat = new int[3][3];
        int [] vet = new int[3];

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = s.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i+j == mat.length - 1){
                    vet[i] = mat[i][j];
                }
            }
        }

        for(int i = vet.length-1; i >= 0; i--){
            System.out.println(vet[i] + " ");
        }

    }
}
