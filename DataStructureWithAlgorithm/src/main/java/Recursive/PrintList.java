package Recursive;

import java.util.ArrayList;
import java.util.List;

public class PrintList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        System.out.println(sum(nums));
    }

    private static int sum(List<Integer> nums) {
        if(nums.isEmpty()) return 0; // 비어있을경우 9 + 0이된다.
        /*
         * return  sum(nums) + nums.remove(nums.size() - 1);
         * 이렇게 재귀를 호출하게되면 sum(nums)를 먼저 재귀를 타고들어가기 때문에 무한반복이 돈다.
         * 재귀는 어떠한 식이 값이 되는것이 포인트이다.
        * */
        return  nums.remove(nums.size() - 1) + sum(nums) ;
    }

}
