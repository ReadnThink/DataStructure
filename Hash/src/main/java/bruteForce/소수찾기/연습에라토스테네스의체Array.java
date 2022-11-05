package bruteForce.소수찾기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 연습에라토스테네스의체Array {
     // 소수를 구할 때 2부터 N의 제곱근까지만 확인을 하면 된다는 이론

    //에네토스테네스 체 속도개선의 핵심
    //1. 리스트를 안쓰기 때문에 add, remove를 하지 않아도 된다.
    //2. %연산을 하지 않는것. : 남아있는 소수를 지우기 떄문.

    public static int solutionWithCheck(int N) {
        if (N == 2) return 1;
        int[] nums = new int[N-1]; // N-1개만큼 2~50까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~49까지 nums에 채우기

        for (int j = 0; j * j <= N; j++) {// N == 49
            int multipleOf = nums[j]; // j=0 nums[0] = 2
            // 초항이 2 2n인 2 4 6 8 10
            for (int i = nums[j] + j; i < nums.length; i+=multipleOf) {
                checks[i] = false;
            }
//            printNums(nums, checks);
        }
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) cnt++;
        }
        return cnt;

    }

    public static void solutionOnly(int n){
        int[] nums = new int[n+1];
        for (int i = 2; i <= n; i++) nums[i] = i;

        for(int i = 2; i <= n; i++){
            if(nums[i] == 0) continue;
            for(int j = i + i; j <= n; j += i){
                nums[j] = 0;
            }
        }
        for(int i = 2; i <= n; i++){
            if(nums[i] != 0) System.out.printf("%d ",nums[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(solutionWithCheck(15));
//        solutionOnly(15);
    }
}
