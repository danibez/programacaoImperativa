package funcoes;

import java.util.Scanner;

public class EhMaior {

    public static int ehMaior(int x, int y){
        if(x > y)
            return x;
        return y;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(ehMaior(a, b));
    }
}
