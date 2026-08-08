package semestresantigos.funcoes;
public class maiorElemVetor {

    public static int busca(double[] vetor){
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetor[maior]) {
                maior = i;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        double[] v = {1.5,8.4,4.0,9.3,9.2};
        // int[] v2 = new int[5];
        int resultado = busca(v);
        System.out.println(resultado);
    }
}
