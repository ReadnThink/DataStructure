package Recursive;

import java.util.Scanner;

public class PrintSumRefactoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(f(n));
    }

    private static long f(long n) {
        if(n == 0) return 0;
        return n % 10 + f(n / 10);
    }
}
