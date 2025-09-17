package recursao;

import java.util.Scanner;

public class Inverte {

    public static int inverte(int n, int invertido) {
        if(n == 0)
            return invertido;
        int resto = n % 10;
        invertido = invertido * 10 + resto;
        return inverte(n / 10, invertido);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        inverte(n, 0);
    }
}
