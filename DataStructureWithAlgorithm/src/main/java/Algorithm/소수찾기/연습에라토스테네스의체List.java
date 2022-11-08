package Algorithm.소수찾기;

import java.util.ArrayList;
import java.util.List;

public class 연습에라토스테네스의체List {
    // N ex N = 50 미만의 모든 소수 구하는 에라토스테네스 체 알고리즘 짜는 순서
    // 1. 2부터 50까지 숫자가 들어있는 49칸짜리 list만들기
    // 2. 만든 list에서 2를 제외한 모든 50제곱근의 소수의 배수 지우기


    // 시간초과 why??
    // list에서 remove를 할 때 현재 배열보다 -1개 작은배열을 만들고 복사한다. (add도 마찬가지)
    public static void solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) list.add(i); //숫자 셋팅

        for (int j = 2; j < n; j++) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % j == 0 && list.get(i) > j) list.remove(i);
            }
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }


    public static void main(String[] args) {
        solution(15);
    }
}
