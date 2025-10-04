public class BuscaBinaria {

    public static int busca(int[] lista, int obj){
        int ini, meio, fim;
        ini = 0;
        fim = lista.length - 1;
        while (ini <= fim) {
            meio = (ini + fim)/2;
            if (lista[meio] == obj) {
                return(meio);
            }
            else if (lista[meio] > obj) {
                fim = meio - 1;
            }else if (lista[meio] < obj){
                ini = meio + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] lista = {1,3,5,6,8,9,10,13,16,20,33,34,36,47,48,59,60};
        int obj = 47;
        int resposta = busca(lista, obj);
        if(resposta == -1)
            System.out.println("Número não encontrado");
        else
            System.out.println("Número " + obj + " encontrado na posicao " + resposta);
    }
}
