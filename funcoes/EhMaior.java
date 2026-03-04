import java.util.Scanner;

public class EhMaior {

    public static int maior(int num1, int num2){
        if(num1 >= num2)
            return num1;
        return num2;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        int ret = maior(a, b);
        System.out.println(ret);

        System.out.println(maior(a, b));
        s.close();
    }
}
