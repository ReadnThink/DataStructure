package Queue.Algorithm;

public class 기능개발 {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int cnt = 0;
        while(cnt != progresses.length) {
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] += speeds[i];
                if(progresses[i] >= 100){
                    cnt++;
                }
            }
            return answer;
        }
        return progresses;
    }

    public static void main(String[] args) {

        int[] progresses = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        System.out.println(solution(progresses,speeds));


        int[] progresses1 = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds1 = new int[]{1, 1, 1, 1, 1, 1};
        System.out.println(solution(progresses1,speeds1));
    }
}
