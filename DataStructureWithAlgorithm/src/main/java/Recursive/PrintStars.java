package Recursive;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(n);
    }

    private static void f(int n) {
        if(n <= 0) return;
        f(n - 1);
        System.out.print("*");
    }
}

