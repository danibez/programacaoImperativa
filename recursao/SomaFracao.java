package recursao;

import java.util.Scanner;

public class SomaFracao {

    public static double soma(double n){
        if(n == 1)
            return 1;
        else
            return (1/n) + soma(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        System.out.println(soma(n));
    }
}
