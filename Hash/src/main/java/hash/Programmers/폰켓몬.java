package hash.Programmers;

import java.util.HashMap;

public class 폰켓몬 {
    public static int solution(int[] nums){
        int answer = 0;
        // 1. 중복값을 제거하고 해시 맵을 만든다.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }

        int limit = nums.length / 2;
        // 1. 사용안된 키값에만 +한다. cnt가 제한 수 까지
        for (Integer key : map.keySet()) {
            if(map.get(key) == 1){
                map.put(key, 0);
                if(answer < limit){
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        int[] nums1 = {3, 3, 3, 2, 2, 4};
        int[] nums2 = {3, 3, 3, 2, 2, 2};
        int result = solution(nums);
        int result1 = solution(nums1);
        int result2 = solution(nums2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}
