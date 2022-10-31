package bruteForce;

public class 모의고사 {
    public static int[] solution(int[] answers) {

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] cnt = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if(student1[i % answers.length] == answers[i]){
                cnt[0]++;
            }
        }
        System.out.println(cnt[0]);
        return cnt;
    }

    public static void main(String[] args) {
        int[] answers = {1, 2, 1, 4, 5};
        solution(answers);
    }
}
