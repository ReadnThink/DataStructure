package bruteForce;

import java.util.Arrays;

public class 모의고사 {
    public static int[] solution(int[] answers) {

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cnt = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if(student1[i % student1.length] == answers[i]) cnt[0]++;
            if(student2[i % student2.length] == answers[i]) cnt[1]++;
            if(student3[i % student3.length] == answers[i]) cnt[2]++;
        }

        //많이 맞춘 점수찾기
        int max = cnt[0]; //최댓값 구하기
        for (int i = 0; i < cnt.length; i++) {
            if(max < cnt[i])
                max = cnt[i];
        }
        //max와 학생들 점수 비교
        StringBuilder sb = new StringBuilder(); // return 정답값
        if(cnt[0] == max) sb.append(1);
        if(cnt[1] == max) sb.append(2);
        if(cnt[2] == max) sb.append(3);

        int[] result = new int[sb.length()]; // sb의 길이만큼 = max가 같은 수만틈 배열생성
        for (int i = 0; i < sb.length(); i++) {
            result[i] = sb.charAt(i) - '0'; //Atoi 로직으로 Character를 int배열에 옮기기 해결!
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
//        int[] answers = {1,3,2,4,2}; // 1,2,3
        int[] answers1 = {1,2,3,4,5}; // 1
//        solution(answers);
        solution(answers1);
    }
}
