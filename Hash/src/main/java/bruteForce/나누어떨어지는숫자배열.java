package bruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int lengthCnt = 0; //정답 배열의 크기

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) lengthCnt++;
        }

        int[] answer = new int[lengthCnt]; //정답배열 생성
        if(answer.length == 0) return new int[] {-1}; // 배열이비어있을 경우 -1반환

        int j = 0; //정답배열의 인덱스
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) answer[j++] = arr[i]; //divisor와 나누어 떨어진다면, answer배열에 추가
        }
        Arrays.sort(answer); // 배열 정렬
        return answer;
    }

    public int[] solutionWithList(int[] arr, int divisor){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) list.add(arr[i]);
        }

        if(list.size() == 0) return new int[]{-1};

        //list를 Array로 바꾼다.
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        //sort한 것을 리턴
        Arrays.sort(answer);

        return answer;
    }
    
    public int[] solutionWithPriorityQueue(int[] arr, int divisor){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) pq.add(arr[i]);
        }
        if(pq.size() == 0) return new int[]{-1};

        //pq를 Array로 바꾼다.
        int[] answer = new int[pq.size()];
        int index = 0;
        while(!pq.isEmpty()) answer[index++] = pq.poll();

        return answer;
    }

    public static void main(String[] args) {
        나누어떨어지는숫자배열 m = new 나누어떨어지는숫자배열();
        m.solution(new int[]{5, 9, 7, 10}, 5);
    }
}
