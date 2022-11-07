package bruteForce;

import java.util.Arrays;

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

    public static void main(String[] args) {
        나누어떨어지는숫자배열 m = new 나누어떨어지는숫자배열();
        m.solution(new int[]{5, 9, 7, 10}, 5);
    }
}
