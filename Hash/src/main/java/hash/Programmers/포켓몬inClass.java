package hash.Programmers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class 포켓몬inClass {
    public int solutionMine(int[] nums){
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

    //강사님 풀이
    public int solution(int[] nums){
        //중복을 없애기 위해
        // [3,2,1,2] -> [3,2,1]
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int N = nums.length / 2;

        //set개수와 N중에서 하나를 return합니다.

        if(set.size() < N){
            return set.size();
        } else {
            return N;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        int[] nums1 = {3, 3, 3, 2, 2, 4};
        int[] nums2 = {3, 3, 3, 2, 2, 2};
        포켓몬inClass pk = new 포켓몬inClass();
        int result = pk.solution(nums);
        int result1 = pk.solution(nums1);
        int result2 = pk.solution(nums2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
