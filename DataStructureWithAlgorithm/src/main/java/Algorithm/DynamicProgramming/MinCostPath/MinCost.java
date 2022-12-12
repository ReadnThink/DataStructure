package Algorithm.DynamicProgramming.MinCostPath;

import Algorithm.소수찾기.에라토스테네스의체Array;

import java.util.Arrays;

public class MinCost {

    public int getMinCost(int[][] arr) {
        int cnt = 0;
        int[][] dp = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i == 0 && j == 0)
                    dp[0][0] = arr[0][0];
                else if (i == 0)
                    dp[i][j] = dp[i][j - 1] + arr[i][j];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return cnt;
    }
    public static void main(String[] args) {
        MinCost m = new MinCost();
        int[][] arr = new int[][]{
                {1, 3, 2},
                {4, 6, 2},
                {1, 2, 4}
                };
        m.getMinCost(arr);
    }

}
