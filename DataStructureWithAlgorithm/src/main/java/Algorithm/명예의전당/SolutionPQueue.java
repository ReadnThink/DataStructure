package Algorithm.명예의전당;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class SolutionPQueue {

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

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);
        for (int i = 0; i < score.length; i++) {
            //i까지의 최대
            if (pq.size() < k) {
                pq.add(score[i]);
            } else if (pq.peek() < score[i]) {
                pq.poll();
                pq.add(score[i]);
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}
