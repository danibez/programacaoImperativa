
import java.util.Scanner;

public class Baskara {

    public static double calculaDelta(int a, int b, int c){
        // return b*b - 4*a*c;
        return Math.pow(b, 2) - 4*a*c;
    }

    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        double delta = calculaDelta(a,b,c);

        if(delta > 0){
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("As raizes sao " + x1 +
                                " e " + x2);
        } else if(delta == 0){
            double x = -b/(2*a);
            System.out.println("A raiz é " + x);
        } else {
            System.out.println("Não é possível!");
        }
            
    }
}
