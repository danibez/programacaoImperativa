package funcoes;

import java.util.Scanner;

public class Potencia {

    public static int pot(int a, int b){
        int mult = 1;
        for(int i = 0; i < b; i++){
            mult = mult * a;
        }
        return mult;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;

        a = s.nextInt();
        b = s.nextInt();

        System.out.println(pot(a,b));

    }
}
