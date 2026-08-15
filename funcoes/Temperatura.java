package funcoes;

import java.util.Scanner;

public class Temperatura {

    public static double converte(double temp){
        return temp * (9.0/5) + 32.0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double celsius = s.nextDouble();
        System.out.println(converte(celsius));
    }
}
