package matriz;

public class MatrizSoma {
    public static void main(String[] args) {
        int[][] A = {
            {1,2,3},
            {4,5,6}
        };

        int[][] B = {
            {2,2,0},
            {2,3,6}
        };

        int[][] C = new int[2][3];

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C[0].length; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}
