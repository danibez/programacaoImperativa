import java.util.Scanner;

public class Saldo {

    public static double reajuste(double salario){
        return salario + (salario / 100);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = reajuste(s.nextDouble());
        System.out.println("O novo salario é " + r);
    }
}
