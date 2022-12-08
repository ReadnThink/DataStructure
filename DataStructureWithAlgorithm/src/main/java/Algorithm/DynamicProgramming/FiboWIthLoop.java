package Algorithm.DynamicProgramming;

public class FiboWIthLoop {
    static int[] dp;
    public static int fibo(int n) {

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        dp = new int[n + 1];
        System.out.println(fibo(n));
    }
}
