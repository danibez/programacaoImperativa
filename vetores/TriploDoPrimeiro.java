package vetores;

import java.util.Scanner;

public class TriploDoPrimeiro {
    public static void main(String[] args) {
        int []A = {1,2,3,4,5,6,7,8};
        int []B = new int[8];

        for(int i = 0; i < 8; i++){
            B[i] = A[i]*3;
        }

        for(int i = 0; i < 8; i++){
            System.out.println(A[i] + "*3 = " + B[i]);
        }

    }
}
