import java.util.Scanner;

public class Temp {

    public static boolean ehPrimo(int n){
        int cont = 0;
        for(int i = 1; i <= n; i++){
            if(n%i == 0)
                cont++;
        }
        if(cont == 2)
            return true;
        return false;
    }

    public static void buscaPrimo(){
        boolean resposta;
        for(int i = 1; i <= 1000; i++){
            resposta = ehPrimo(i);
            if(resposta)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        buscaPrimo();
    }
}
