package bruteForce.소수찾기;

public class 소수찾기연습 {
    // 1. n이 소수인지 확인 = 성공
    // 2. ~n까지 소수가 몇개인지 확인 = 로직 통과 / 시간복잡도 O(n^2)으로 실패
    // 3. 시간복잡도 개선 / 해결
    // 4. Template 적용 = 바뀌는 부분 = 2번쨰 for문 조건
    //    interface로 바꿔야하는데 j와 i를 동시에 리턴??? boolean으로 조건이 맞는지 리턴
    // 5. Template 적용 = lamda로 바꾸기
    // 6. 에라토스테네스의체로 만들기

    interface Templat{
        public boolean func(int i, int j);
    }

    public static int findPrime(int n, Templat templat){
        int[] isused = new int[n];

        int cnt = 0;
        for (int j = 2; j <= n; j++) { //2 ~ n까지 반복
            boolean check = true;
            for (int i = 2; templat.func(i,j); i++) { // j가 소수인지 판별 / j의 제곱근 까지만 돌면 해결 할 수 있다.
                if(j % i == 0) {
                    check = false; // 소수가 아니라면 = 0으로 나누어 떨어진다면 false
                    break;
                }
            }
            if(check == true) {
                System.out.println(j);
                cnt++; //소수라면 cnt++
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int result = findPrime(15, (a,b) -> a < b);
        int result1 = findPrime(15, (a,b) -> a * a <= b);
        int result2 = findPrime(15, (a,b) -> a <= b/2);
//        System.out.println("소수의 총 개수는 "+findPrime(10,templat));
//        System.out.println("소수의 총 개수는 "+findPrime(15,templat1));
//        System.out.println("소수의 총 개수는 "+findPrime(50,templat2));
        System.out.println("result = "+result);
        System.out.println("result1 = "+result1);
        System.out.println("result2 = "+result2);
    }
}
