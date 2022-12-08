package heap.더맵게;

import java.util.PriorityQueue;

public class TheHotter2 {
    public int solution(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++) queue.add(scoville[i]);

        while (k > queue.peek() && queue.size() >= 2) {
            int min = queue.poll();
            int nextMin = queue.poll() * 2;
            queue.add(min + nextMin);
            answer++;
        }

//        if(queue.peek() < k) return -1;
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        TheHotter2 hotter2 = new TheHotter2();
        System.out.println(hotter2.solution(arr, 7));
    }
}
