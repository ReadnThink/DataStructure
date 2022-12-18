package Algorithm;

import java.util.*;

public class PCCP {
    static boolean[] isUsed = new boolean[11];
    static int[] sum = new int[11];
    static int result = 0;
    public void makeAnswer(int[][] ability, int depth){
        if(depth == ability[0].length){
            int isResult = 0;
            for(int i = 0; i < ability[0].length; i++){
                isResult += sum[i];
            }
            if(result < isResult) result = isResult;
        } else {
            for(int i = 0; i < ability.length; i++){
                if(isUsed[i] != true){
                    isUsed[i] = true;
                    sum[depth] = ability[i][depth];
                    makeAnswer(ability, depth + 1);
                    isUsed[i] = false;
                }
            }
        }
    }


    public int solution(int[][] ability) {
        makeAnswer(ability, 0);
        return result;
    }

    public static void main(String[] args) {
        String input = "edeaaabbccd";
        int[][] arr = {{40, 10, 10}, {20, 5, 0}, {30, 30, 30}, {70, 0, 70}, {100, 100, 100}};

        PCCP sol = new PCCP();
        System.out.println(sol.solution(arr));
    }
}
