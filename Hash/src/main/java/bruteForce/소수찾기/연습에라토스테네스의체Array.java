package bruteForce.소수찾기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 연습에라토스테네스의체Array {
     // 소수를 구할 때 2부터 N의 제곱근까지만 확인을 하면 된다는 이론

    //에네토스테네스 체 속도개선의 핵심
    //1. 리스트를 안쓰기 때문에 add, remove를 하지 않아도 된다.
    //2. %연산을 하지 않는것. : 남아있는 소수를 지우기 떄문.

    public static void solutionWithCheck(int n) {
        boolean[] checks = new boolean[n + 1];
        int[] nums = new int[n + 1];
        for (int i = 0; i < nums.length; i++) nums[i] = i;
        checks[0] = true;
        checks[1] = true;

        //2부터 체크
        for(int i = 2; i * i <= n; i++){
            if(checks[i] == true) continue;
            for (int j = i + i; j <= n; j += i) {
                checks[j] = true;
            }
        }
        for (int i = 0; i <= n; i++) {
            if(!checks[i]) System.out.printf("%d ",nums[i]);
        }
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
        int n = 50;
        solutionWithCheck(n);
        System.out.println();
        solutionOnly(n);
    }
}
