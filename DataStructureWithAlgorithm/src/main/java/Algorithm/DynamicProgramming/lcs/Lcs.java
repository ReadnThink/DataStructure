package Algorithm.DynamicProgramming.lcs;

import java.util.Arrays;

public class Lcs {

    public static void main(String[] args) {
        String str1 = "ABCDCBA";//열
        String str2 = "DCABDC";//행
        int[][] arr = new int[str2.length()][str1.length()];

        int[][] dp = new int[str2.length() + 1][str1.length() + 1];
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                System.out.printf("i : %s j : %s \n",str2.charAt(i),str1.charAt(j));
                if (i == 0 && str2.charAt(i) == str1.charAt(j)) {
                    dp[i][j]++;
                } else if (i > 0 && j != 0 && str2.charAt(i) == str1.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else if (i > 0 && j == 0 && str2.charAt(i) == str1.charAt(j)) {
                    dp[i][j] = dp[i][j] + 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
