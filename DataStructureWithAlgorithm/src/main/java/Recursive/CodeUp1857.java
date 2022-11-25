package Recursive;

import java.util.Scanner;

public class CodeUp1857 {
    /*
    * 서로 다른 n개 중에서 r개 순서없이 고르기
    * */

    static int a;
    static int b;
    static int cnt = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        f(1);
        System.out.println(cnt);
    }

    private static void f(int k) {
        if(k == b || k == a) {
           cnt++;
           return;
        }
        f(k + 1);
    }
}
