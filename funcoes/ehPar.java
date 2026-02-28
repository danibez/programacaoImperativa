package funcoes;

import java.util.Scanner;

public class ehPar {

    public static boolean ehPar(int n){
        if(n % 2 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(ehPar(n))
            System.out.println("O numero é par");
        else
            System.out.println("O numero é impar");
    }
}
