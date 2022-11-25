package Recursive;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp2623 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //재귀
        System.out.println(f(a, b));

        // 재귀없이
        System.out.println(solution(a, b));
    }

    private static int f(int a, int b) {
        if(a == b) return a;

        return a > b ? f(a - b, b) : f(a, b - a);
    }

    //재귀 없이 풀이
    private static int solution(int a, int b) {
        int max = a > b ? a : b;
        int min = a > b ? b : a;

        int tmp;
        while (max > min) {
            max -= min;
            if (max < min) {
                tmp = max;
                max = min;
                min = tmp;
            }
        }

        if(max == min) return max;
        else return 1;
    }
}
