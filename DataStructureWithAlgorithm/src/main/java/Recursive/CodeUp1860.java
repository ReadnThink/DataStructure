package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1860 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        f(n);
    }
    private static void printStar(int n) {
        if(n == 0){
            return;
        }
        printStar(n - 1);
        System.out.printf("%d ",n);
    }
    private static void f(int n) {
        if(n == 0) return;
        f(n - 1);
        printStar(n);
        System.out.println();
    }
}
