package Stack.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
    // SET에 넣는다 = 모든 중복이 사라진다, 순서보장 x
    public static int[] solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int num = -1;
//        1, 1, 3, 3, 0, 1, 1
        for (int i = 0; i < nums.length; i++) {
            if (num != nums[i]) {
                list.add(nums[i]);
                num = nums[i];
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 3, 3, 0, 1, 1};
        solution(nums);

    }
}
