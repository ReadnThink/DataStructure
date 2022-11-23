package Recursive;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        f(n, 0);
    }

    private static void f(long n, long sum) {
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        else{
            sum += n % 10;
            f(n/10, sum);
        }
    }
}
