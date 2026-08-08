package semestresantigos.matriz;

public class MatrixStatic {

    public static int verifica(int[][] m, int[] v){
        int k = 0, n = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(m[i][j] == v[k]){
                    k++;
                    if (k == v.length) {
                        n++;
                        k = 0;
                    }
                }
                else 
                    k = 0;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[][] mat = {
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}
                    };


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
      

