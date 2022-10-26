public class 계산기 {

    public static int solution1(int num){
        int cnt = 0;

        while(num > 0){
            if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9)
                cnt++;
            num /= 10;
        }
        return cnt;
    }

    public static int makeAnswer(int num){

        int answer = 0;
        for (int i = 1; i <= num; i++) {
            answer += solution1(i);
        }
        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        int num = 133;
        makeAnswer(num);
    }
}
