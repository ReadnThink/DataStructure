package bruteForce;

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
        StringBuilder result = new StringBuilder();
        if(cnt[0] == max) result.append(1);
        if(cnt[1] == max) result.append(2);
        if(cnt[2] == max) result.append(3);

        //중복일 경우 [,] 넣기...
        System.out.println(result.toString());
        return cnt;
    }

    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        solution(answers);
    }
}
