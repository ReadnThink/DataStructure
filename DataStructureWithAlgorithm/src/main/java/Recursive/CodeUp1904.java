package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp1904 {
    /*
    * 두 수 사이의 홀수 출력하기 ex) 2, 7 = 3, 5 ,7
    * */
    static int b;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        b = sc.nextInt();

        f(a);
    }

    private static void f(int a) {
        if(a > b) return;
        if (a % 2 != 0) {
            System.out.printf("%d ", a);
        }
        f(a + 1);
    }
}
