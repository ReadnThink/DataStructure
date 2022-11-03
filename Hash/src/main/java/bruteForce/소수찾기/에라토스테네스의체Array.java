package bruteForce.소수찾기;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class 에라토스테네스의체Array {
    // 소수를 구할 때 2부터 N의 제곱근까지만 확인을 하면 된다는 이론

    // N ex N = 50 미만의 모든 소수 구하는 에라토스테네스 체 알고리즘 짜는 순서
    // 1. 2부터 50까지 숫자가 들어있는 49칸짜리 list만들기
    // 2. 만든 list에서 2를 제외한 모든 50제곱근의 소수의 배수 지우기


    // 시간초과 why??
    // remove를 할 때 list.get(i)를 하게되는데 list의 get(i)만큼 index위치를 찾아간다는 소리이기 때문에
    // list에서 remove를 할 때 현재 배열보다 -1개 작은배열을 만들고 그 배열에 지울 번쨰의
    public void solution(int n){
        int[] nums = new int[n + 1];
        boolean[] check = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            nums[i] = i;
        }

        for (int j = 2; j * j <= n ; j++) { // 에라토스테네스의체 2 ~ n의 제곱근까지 반복.
            for (int i = 2; i < nums.length; i++) {
                if(nums[i] % j == 0 && nums[i] > j) check[i] = true;  //list.remove(i); // j를 제외한 j의 배수 제거
                else check[i] = false;
            }
        }
        for (int i = 2; i < nums.length; i++) {
            if(check[i] == false){
                System.out.println(nums[i]);
            }

        }

//        list.removeIf(lis -> lis % 2 == 0 && lis > 2);

//        System.out.println(list);
//        System.out.println(list.size());
    }

    public static void main(String[] args) {
        에라토스테네스의체Array s = new 에라토스테네스의체Array();
        System.out.println(LocalDateTime.now());
        s.solution(100);
        System.out.println(LocalDateTime.now());
    }
}
