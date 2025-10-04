package Prova1;

import java.util.Scanner;

public class q1 {
    public static int fib(int n){
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    public static int Countfib(int n){
        if(n == 0)
            return 1;
        else if (n == 1)
            return 1;
        else
            return 1 + Countfib(n-1) + Countfib(n-2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int runs = s.nextInt();
        for (int i = 0; i < runs; i++) {
            int n = s.nextInt();
            System.out.println("fib("+n+") = " + (Countfib(n)-1) + " calls = " + fib(n));
        }
        // fib(5) = 14 calls = 5
    }
}
