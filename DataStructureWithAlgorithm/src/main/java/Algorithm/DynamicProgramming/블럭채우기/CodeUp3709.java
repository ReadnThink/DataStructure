package Algorithm.DynamicProgramming.블럭채우기;

import java.util.Scanner;

public class CodeUp3709 {

    static int[] dp = new int[10001];
    static int DIV = 100000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CodeUp3709 s = new CodeUp3709();
        int r = s.solution(n);
        System.out.println(r);
    }

    private int solution(int n) {
        if(n == 1) return 1;
        else if(n == 2) return 2;
        else if(dp[n] != 0) return dp[n];
        return dp[n] = (solution(n - 1) + solution(n - 2)) % DIV;
    }
}
