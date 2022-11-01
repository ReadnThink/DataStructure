package bruteForce;

public class 소수찾기 {
    public static int solution (int n) {
        int num = n;
        int answer = 0;
        // 2, 3, 5, 7, 9, 11, 13, 15, 17
        for (int i = 2; i <= num / 2; i++) {
            if(i / 2 != 0){
                answer++;
                System.out.println("소수입니다.");
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int n = 13;
        System.out.println(solution(n));
    }
}
