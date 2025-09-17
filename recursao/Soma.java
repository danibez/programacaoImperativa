package recursao;

import java.util.Scanner;

public class Soma {

    public static int soma(int n){
        if(n == 1)
            return 1;
        else
            return n + soma(n-1);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println(soma(n));
    }
}
