package Algorithm.DynamicProgramming;

public class Fibonacci {

    static int[] dp;
    public static int fibo(int n) {
        if(n <= 1) return 1;
        if(dp[n] != 0) return dp[n];
        return dp[n] = fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 15;
        dp = new int[n + 1];
        System.out.println(fibo(n));
    }
}
