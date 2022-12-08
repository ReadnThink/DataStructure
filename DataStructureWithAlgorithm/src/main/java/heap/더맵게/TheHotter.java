package heap.더맵게;

import java.util.PriorityQueue;

public class TheHotter {

    public static int solution(int[] arr, long k) {
        PriorityQueue<Long> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) queue.add((long) arr[i]);

        int cnt = 0;
        while (queue.peek() < k) {
            if(cnt >= 1 && queue.peek() == 0) return -1;
            if(queue.size() <= 1) return -1;
            cnt++;
            long small = queue.poll();
            long sec = queue.poll();
            if(small < 0 && sec < 0) return -1;
            small = small + (sec * 2);
            queue.add(small);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2};
        System.out.println(arr.length);
        System.out.println(solution(arr, 7));
    }

}
