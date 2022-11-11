package Stack.Algorithm.같은숫자는싫어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 같은숫자는싫어Stack {
    // SET에 넣는다 = 모든 중복이 사라진다, 순서보장 x
    // List에 비해 효율적이다. 객체를 생성하지 않기 때문.
    public static int[] solution(int[] nums) {
//        1, 1, 3, 3, 0, 1, 1
        Stack<Integer> s = new Stack<>();
        s.push(nums[0]);
        for(int i = 0; i < nums.length; i++){
            if(s.peek() != nums[i]) s.push(nums[i]);
        }

        int[] answer = new int[s.size()];
        for(int i = answer.length - 1; i >= 0; i--) {
            answer[i] = s.pop();
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 3, 3, 0, 1, 1};
        solution(nums);

    }
}
