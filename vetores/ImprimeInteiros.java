package vetores;

import java.util.Scanner;

public class ImprimeInteiros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int []v = new int[10];

        for(int i = 0; i < 10; i++){
            v[i] = s.nextInt();
        }
        System.out.println("\n====== conteudo par ========");
        for(int i = 0; i < 10; i++){
            if(v[i] % 2 == 0)
                System.out.print(v[i] + " ");
        }
        System.out.println("\n======= posicao par ========");
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0)
                System.out.print(v[i] + " ");
        }
        System.out.println("\n======= posicao par ========");
        for(int i = 0; i < 10; i=i+2){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}
