package Algorithm.DynamicProgramming.lcs;

import java.util.Arrays;

public class Lcs {

    public static void main(String[] args) {
        String str1 = "ABCDCBA";//열
        String str2 = "DCABDC";//행

        int[][] dp = new int[str2.length() + 1][str1.length() + 1];
        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
//                System.out.printf("i : %s j : %s \n", str2.charAt(i -1), str1.charAt(j - 1));
                //위에가 0이 아니면 아래는 위에 숫자
//                if (str2.charAt(i) != str1.charAt(j)) {
//                    dp[i][j] = dp[i - 1][j - 1];
//                }
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                //문자가 같다면 왼쪽 대각선에서 가져온다
                else if (str2.charAt(i - 1) == str1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    int up = dp[i - 1][j];
                    int left = dp[i][j - 1];
                    dp[i][j] = Math.max(up, left);
                }
            }
        }
        int answer = dp[str2.length()][str1.length()];
        System.out.println(answer);
//        System.out.println(Arrays.deepToString(dp));
    }
}
