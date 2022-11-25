package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp2623 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(f(a, b));
    }

    private static int f(int a, int b) {
        if(a == b) return a;

        return a > b ? f(a - b, b) : f(a, b - a);
    }
}
