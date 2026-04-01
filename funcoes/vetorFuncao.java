public class vetorFuncao {

    public static void imprime(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] v = {1,2,3};
        imprime(v);
    }
}