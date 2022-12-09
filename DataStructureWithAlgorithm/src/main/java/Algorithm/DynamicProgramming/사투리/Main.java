package Algorithm.DynamicProgramming.사투리;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        dp(str1, str2);
    }

    private static void dp(String str1, String str2) {
        int[][] dp = new int[str2.length() + 1][str1.length() + 1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
//                if(i == 0 || j == 0) dp[i][j] = dp[i][j];
                if (str2.charAt(i - 1) == str1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    int up = dp[i - 1][j];
                    int left = dp[i][j - 1];
                    dp[i][j] = Math.max(up, left);
                }
            }
        }

//        for (int i = 0; i <= str2.length(); i++) {
//            for (int j = 0; j <= str1.length(); j++) {
//                System.out.printf("%d ", dp[i][j]);
//            }
//            System.out.println();
//
//        }

        int answer = dp[str2.length()][str1.length()];
        System.out.println(answer);
    }
}
