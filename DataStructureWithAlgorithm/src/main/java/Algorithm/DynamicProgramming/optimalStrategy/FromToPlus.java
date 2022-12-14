package Algorithm.DynamicProgramming.optimalStrategy;


import java.util.Arrays;

public class FromToPlus {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 40, 19};
        int[][] dp = new int[arr.length][arr.length];


        for (int i = 0; i < arr.length; i++) {
            dp[i][i] = arr[i];
            for (int j = i; j < arr.length; j++) {
                if(dp[i][j] != 0) continue;
                dp[i][j] = dp[i][j - 1] + arr[j];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j <dp.length; j++) {
                System.out.printf("%d ",dp[i][j]);
            }
            System.out.println();
        }
    }
}
