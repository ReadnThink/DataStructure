package bruteForce.소수찾기;

import java.time.LocalDateTime;
import java.util.Arrays;

public class 에라토스테네스의체ArrayInClass {
    // 소수를 구할 때 2부터 N의 제곱근까지만 확인을 하면 된다는 이론

    //에네토스테네스 체 속도개선의 핵심
    //1. 리스트를 안쓰기 때문에 add, remove를 하지 않아도 된다.
    //2. %연산을 하지 않는것. : 남아있는 소수를 지우기 떄문.
    public int printNums(int[] nums, boolean[] check){
        int cnt = 0;
        for (int i = 0; i < check.length; i++) {
            if(check[i] == true){
                cnt++;
                System.out.printf("%d | ",nums[i]);
            }
        }
        System.out.println();
        System.out.println(cnt);
        return cnt;
    }

    public int solution(int n){
        if(n == 2){
            return 1;
        }
        int[] nums = new int[n - 1]; // 2부터 값을 넣을 것이기 때문에 n보다 1큰숫자 까지 넣는다. n -1까지만 한다.
        boolean[] check = new boolean[nums.length];
        Arrays.fill(check,true); // check를 true로 초기화

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }

        int result = 0;
        for (int j = 0; j * j <= n; j++) {

            int multipleOf = nums[j];

            for (int i = nums[j] + j; i < nums.length; i+=multipleOf){
                check[i] = false;
            }
            result = printNums(nums, check);
        }

        return result;

//        // 2의 배수 지우기
//        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
//        // 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 ...50
//        int multipleOf = 2;
//        for (int i = 2; i < nums.length; i+=multipleOf) {
//            check[i] = false;
//        }
//        printNums(nums,check);
//
//        multipleOf = 3;
//        for (int i = 4; i < nums.length; i+=multipleOf) {
//            check[i] = false;
//        }
//        printNums(nums,check);
//
//        multipleOf = 4;
//        for (int i = 6; i < nums.length; i+=multipleOf) {
//            check[i] = false;
//        }
//        printNums(nums,check);
//
//        multipleOf = 5;
//        for (int i = 8; i < nums.length; i+=multipleOf) {
//            check[i] = false;
//        }
//        printNums(nums,check);
//
//        multipleOf = 6;
//        for (int i = 10; i < nums.length; i+=multipleOf) {
//            check[i] = false;
//        }
//        printNums(nums,check);
//
//        multipleOf = 7;
//        for (int i = 14; i < nums.length; i+=multipleOf) {
//            check[i] = false;
//        }
//        printNums(nums,check);
    }

    public static void main(String[] args) {
        에라토스테네스의체ArrayInClass s = new 에라토스테네스의체ArrayInClass();
        System.out.println(LocalDateTime.now());
        int result = s.solution(100);
        System.out.println("result ="+result);
        System.out.println(LocalDateTime.now());
    }
}
