package Algorithm.명예의전당;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Mine {
    private static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        //낮은 숫자가 우선인 우선순위 큐 (명예의 전당를 담당)
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        //매일 한명이 노래부르는 로직
        for (int i = 0; i < score.length; i++) {
            if (queue.size() < k) queue.add(score[i]);
            else { //queue의 크기가 찼다면
                if (queue.peek() < score[i]) { // 기존 명예의 전당의 제일 낮은 점수와 새로들어온 가수의 점수를 비교
                    queue.poll(); //명예의 전당 제일 낮은점수를 뺴고
                    queue.add(score[i]); // 새로운 가수를 넣는다.
                }
            }
            //queue에 데이터를 보기 위함
//            System.out.println("queue = " + queue);
            answer[i] = queue.peek(); //명예의 전당에 제일 낮은점수를 구하는게 목표이다.
        }
        return answer;
    }
    public static void main(String[] args) {
        int t = 3;
        int[] test = {10, 100, 20, 150, 1, 100, 200};
        int result[] = solution(t, test);
        System.out.println(Arrays.toString(result));
    }
}
