package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        f(n);
    }

    private static void printStar(int n) {
        if(n == 0){
            System.out.println();
            return;
        }
        System.out.print("*");
        printStar(n - 1);
    }
    private static void f(int n) {
        if(n == 0) return;
        f(n - 1);
        printStar(n);
    }
}
