package bruteForce.소수찾기;

import java.util.ArrayList;
import java.util.List;

public class 에라토스테네스의체 {
    // N ex N = 50 미만의 모든 소수 구하는 에라토스테네스 체 알고리즘 짜는 순서
    // 1. 2부터 50까지 숫자가 들어있는 49칸짜리 list만들기
    // 2. 만든 list에서 2를 제외한 모든 50제곱근의 소수의 배수 지우기
    public void solution(int n){
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= 50; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("List size = " + list.size());
    }

    public static void main(String[] args) {
        에라토스테네스의체 s = new 에라토스테네스의체();

        s.solution(50);
    }
}
