package matriz;
import java.util.Scanner;

public class matrizDiagonais {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        char[][] m = new char[N][N];

        int soma = 0;

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(i == N/2 && j == N/2 && N%2 == 1)
                    m[i][j] = 'X';
                else if(i == j)
                    m[i][j] = '1';
                else if(i+j == N -1)
                    m[i][j] = '2';
                else if (i < j && i+j < N-1)
                    m[i][j] = '0';
                else if(i>j && i+j < N-1)
                    m[i][j] = '4';
                else if(i>j && i+j > N-1)
                    m[i][j] = '3';
                else
                    m[i][j] = '5';
            }
        }

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}
