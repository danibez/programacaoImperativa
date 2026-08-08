package semestresantigos.funcoes;
import java.util.Scanner;

public class buscaMatriz {

    public static boolean busca(int[][] mat, int x){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == x)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o elemento ["+i+"]["+j+"]:");
                mat[i][j] = s.nextInt();
            }
        }

        System.out.println("Digite o numero que quer buscar:");
        int x = s.nextInt();

        System.out.println(busca(mat, x));

    }
}
