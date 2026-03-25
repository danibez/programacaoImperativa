package matriz;

public class matrizDiagonal {

    public static void main(String[] args) {
        // int[][] mat = new int[3][3];
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        for (int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                // if(i < j) acima da diagonal principal
                if(i == j) // abaixo da diagonal principal
                    System.out.print(mat[i][j] + "\t");
                else
                    System.out.print(" "  + "\t");
            }
            System.out.println();
        }
    }
}
