package bruteForce.소수찾기;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 에라토스테네스의체Array {
    // 소수를 구할 때 2부터 N의 제곱근까지만 확인을 하면 된다는 이론

    //에네토스테네스 체 속도개선의 핵심
    //1. 리스트를 안쓰기 때문에 add, remove를 하지 않아도 된다.
    //2. %연산을 하지 않는것. : 남아있는 소수를 지우기 떄문.
    public void solution(int n){
        int[] nums = new int[n]; // 2부터 값을 넣을 것이기 때문에 n보다 1큰숫자 까지 넣는다. n -1까지만 한다.
        boolean[] check = new boolean[n];
//        Arrays.fill(check,true); // check를 true로 초기화

        for (int i = 0; i < n; i++) {
            nums[i] = i + 2;
        }

        for (int j = 2; j * j <= n ; j++) { // 에라토스테네스의체 2 ~ n의 제곱근까지 반복.
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] % j == 0 && nums[i] > j) check[i] = false;
//                else check[i] = true; //else에 걸리면 이상해진다...?
            }
        }
        for (int i = 0; i < check.length; i++) {
            if(check[i] == true){
                System.out.println(nums[i]);
            }

        }
    }

    public static void main(String[] args) {
        에라토스테네스의체Array s = new 에라토스테네스의체Array();
        System.out.println(LocalDateTime.now());
        s.solution(100);
        System.out.println(LocalDateTime.now());
    }
}
