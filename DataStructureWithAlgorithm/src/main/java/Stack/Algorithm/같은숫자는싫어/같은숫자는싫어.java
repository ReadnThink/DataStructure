package Stack.Algorithm.같은숫자는싫어;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
    public static int[] solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        int num = arr[0];

        list.add(num);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != num){
                list.add(arr[i]);
                num = arr[i];
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        solution(arr);
    }
}
