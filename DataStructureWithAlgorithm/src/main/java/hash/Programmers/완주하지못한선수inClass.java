package hash.Programmers;

import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수inClass {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p,0) + 1);
        }
        for (String c : completion) {
            map.put(c,map.get(c)-1);
        }
        for (String s : map.keySet()) {
            if(map.get(s) == 1) {
                answer = s;
                break;
            }
        }
        System.out.println(answer);
        return answer;
    }

    //시간이 남아 배열로도 문제를 풀어보았다.
    public static String solutionArray(String[] participant, String[] completion){
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);


        int i;
        for (i = 0; i < completion.length; i++)
            //equals를 써야하는걸 알지만 궁금해서 ==연산자를 사용해봤는데 왜 되지!?
            if (participant[i] != completion[i])
                break;

        System.out.println(participant[i]);
        return participant[i];
    }

    public static void main(String[] args) {
        String[] p = {"asd","leo", "kim", "sol"};
        String[] c = {"asd", "leo", "sol"};
        solution(p,c);
        solutionArray(p,c);
    }
}
