package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1860 {
    /*
     * 숫자 삼각형 찍기
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

//        f(n);
        printNums(n);
        getNums(n);
    }

    private static void printStar(int n) {
        if (n == 0) {
            return;
        }
        printStar(n - 1);
        System.out.printf("%d ", n);
    }

    private static void f(int n) {
        if (n == 0) return;
        f(n - 1);
        printStar(n);
        System.out.println();
    }

    //강사님 코드
    public static void printNums(int n) {
        if (n == 0) return;
        printNums(n - 1); // 먼저 작은 숫자를 호출해서 스택에 넣어줍니다.
        System.out.println(getNums(n));
    }
    //강사님 코드
    public static String getNums(int n) {
        // n까지의 숫자를 만든다
        if(n == 0) return "";
        return getNums(n - 1) + " " + n; // 더 작은 숫자가 먼저 나오게 처리함
    }
}
