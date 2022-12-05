package Algorithm.소인수분해;

import java.util.Scanner;

public class CodeUp4037 {
/*
    소인수분해
    35 = 5 × 7
    72 = 2 × 2 × 2 × 3 × 3
    99,380 = 2 × 2 × 5 × 4,969
*/

    //재귀로 풀이
    public static void findPrimeFactor(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d ",i);
                findPrimeFactor(n / i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findPrimeFactor(n);
//        findPrimeFactor(72);
    }
}
