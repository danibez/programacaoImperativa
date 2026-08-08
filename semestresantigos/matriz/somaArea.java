package semestresantigos.matriz;
import java.util.Scanner;

public class somaArea {
    public static void main(String[] args) {
        int[][] m = {
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12},
            {1,2,3,4,5,6,7,8,9,10,11,12}
        };

        int soma = 0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(j > i && i+j < m.length - 1){
                    soma = soma + m[i][j];
                }
            }
        }

        System.out.println(soma);

    }
}
