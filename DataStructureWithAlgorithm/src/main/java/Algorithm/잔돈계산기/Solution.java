package Algorithm.잔돈계산기;

import java.util.Scanner;

public class Solution {

    public void solution(int money) {

        int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        for (int i = 0; i < coin.length; i++) {
            System.out.println(coin[i] + "원" + money/coin[i] + "개");
            money = money % coin[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Solution s = new Solution();
        s.solution(money);
    }

}
