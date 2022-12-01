package Algorithm.명예의전당;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SolutionList {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int k = Integer.parseInt(String.valueOf(br.read()));
//        String s = br.readLine();
//        int score = Integer.parseInt(String.valueOf((s.split(" "))));

        int t = 3;
        int[] test = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution(t, test)));
    }

    private static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        int minValue = score[0];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            //최솟값
            if (minValue > score[i]) {
                minValue = score[i];
            } if (list.size() < k) { //k개까지는 그냥 넣는다.
                list.add(score[i]);
            } else if (minValue < score[i]) {
                Collections.sort(list);
                //최솟값
                if (list.get(0) < score[i]) {
                    list.remove(0);
                    //다시넣고
                    list.add(score[i]);

                }
            }
            //정렬
            Collections.sort(list);
            answer[i] = list.get(0);

        }
        return answer;
    }
}
