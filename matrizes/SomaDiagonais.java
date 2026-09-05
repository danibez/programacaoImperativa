import java.util.Scanner;

public class SomaDiagonais {

    public static int somaDiagonal(int[][] m, String opcao){
        int soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if(opcao == "principal"){
                    if(i == j)
                        soma += m[i][j];
                } else {
                    if(i+j == m.length - 1)
                        soma += m[i][j];
                }
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Qual o tamanho da matriz? ");
        int n = s.nextInt();

        int[][] matriz = new int[n][n];
        System.out.println("Preencha a matriz");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = s.nextInt();
            }
        }

        System.out.println(somaDiagonal(matriz, "secundaria"));

    }    
}