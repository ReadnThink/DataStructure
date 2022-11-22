package Recursive;

import java.util.Scanner;

public class printSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        f(n, 0);
    }

    private static void f(int n, int sum) {
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        else{
            sum += n;
            f(n - 1, sum);
        }
    }
}
