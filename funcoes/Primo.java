package funcoes;

import java.util.Scanner;

public class Primo {

    public static boolean ehPrimo(int num){
        int divisivel = 0;
        for(int i = 1; i <= num; i++){
            if(num%i == 0)
                divisivel++;
        }
        if(divisivel == 2)
            return true;
        return false;
    }

    public static void descobrePrimos(){
        for (int i = 0; i < 1000; i++) {
            if(ehPrimo(i))
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        descobrePrimos();
    }
}
