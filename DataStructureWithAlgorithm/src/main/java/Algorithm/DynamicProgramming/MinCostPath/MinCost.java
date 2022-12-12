package Algorithm.DynamicProgramming.MinCostPath;

import Algorithm.소수찾기.에라토스테네스의체Array;

public class MinCost {

    public int getMinCost(int[][] arr) {
        int cnt = 0;
        int[][] dp = new int[arr.length][arr[0].length];

        dp[0][0] = arr[0][0];


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
