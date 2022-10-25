package hash.Programmers;

import java.util.HashMap;
import java.util.Scanner;

public class 완주하지못한선수 {
    public static void solution(String[] participant, String[] completion){
        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";
        for (String p : participant) {
            map.put(p,map.getOrDefault(p,0) + 1);
        }
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        for (String key : map.keySet()) {
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }
        System.out.println("\""+answer+"\"");

    }

    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        solution(part, comp);
    }
}
