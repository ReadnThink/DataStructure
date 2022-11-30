package Algorithm.p와y의개수;

import java.util.Scanner;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cntP = 0;
        int cntY = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') cntP++;
            if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') cntY++;
        }
        if(cntP != cntY) answer = false;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution s = new Solution();
        System.out.println(s.solution(str));
    }
}
