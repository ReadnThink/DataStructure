package Algorithm.DynamicProgramming.블럭채우기;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp3709Loop {

    static int DIV = 100000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int[] dp = new int[n + 1];
        if(n == 1) return 1;
        if(n == 2) return 2;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % DIV;
        }
        return dp[n];
    }
}
