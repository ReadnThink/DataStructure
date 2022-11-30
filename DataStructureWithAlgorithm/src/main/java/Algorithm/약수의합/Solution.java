package Algorithm.약수의합;

import java.util.Scanner;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if(Math.floorMod(n,i) == 0)
                answer += i;
        }
        return answer + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }
}
