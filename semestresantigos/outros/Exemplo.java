package semestresantigos.outros;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota, soma = 0;
        
        for(int i = 0; i < 10; i++){
            nota = s.nextDouble();
            soma = soma + nota;
        }

        double media = soma/10;
        System.out.println(media);
        

    }
}
