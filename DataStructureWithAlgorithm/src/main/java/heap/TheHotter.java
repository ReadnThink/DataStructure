package heap;

import java.util.PriorityQueue;

public class TheHotter {

    public static int solution(int[] arr, int k) {
        int cnt = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) queue.add(arr[i]);

        while (true) {
            int small = queue.poll();
            if(small >= k) return cnt;
            else {
                cnt++;
                int sec = queue.poll();
                small = small + (sec * 2);
                queue.add(small);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 9, 10};
        System.out.println(solution(arr, 7));
    }

}
