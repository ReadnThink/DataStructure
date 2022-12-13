package Algorithm.DynamicProgramming.블럭채우기;

import java.util.Scanner;

public class CodeUp3709 {

    static long[] dp = new long[10001];
    static int DIV = 100000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        CodeUp3709 s = new CodeUp3709();
        long r = s.solution(n);
        System.out.println(r);
    }

    private long solution(long n) {
        if(n == 1) return 1;
        else if(n == 2) return 2;
        else if(dp[(int) n] != 0) return dp[(int) n];
        return dp[(int) n] = (solution(n - 1) + solution(n - 2)) % DIV;
    }
}
