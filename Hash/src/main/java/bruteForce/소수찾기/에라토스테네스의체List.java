package bruteForce.소수찾기;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class 에라토스테네스의체List {
    // N ex N = 50 미만의 모든 소수 구하는 에라토스테네스 체 알고리즘 짜는 순서
    // 1. 2부터 50까지 숫자가 들어있는 49칸짜리 list만들기
    // 2. 만든 list에서 2를 제외한 모든 50제곱근의 소수의 배수 지우기


    // 시간초과 why??
    // remove를 할 때 list.get(i)를 하게되는데 list의 get(i)만큼 index위치를 찾아간다는 소리이기 때문에
    // list에서 remove를 할 때 현재 배열보다 -1개 작은배열을 만들고 그 배열에 지울 번쨰의
    public int solution(int n){
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            list.add(i);
        }

        for (int j = 2; j * j <= n ; j++) {
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i) % j == 0 && list.get(i) > j) list.remove(i);
            }
        }
        return list.size();

//        list.removeIf(lis -> lis % 2 == 0 && lis > 2);

//        System.out.println(list);
//        System.out.println(list.size());



    }

    public static void main(String[] args) {
        에라토스테네스의체List s = new 에라토스테네스의체List();
        System.out.println(LocalDateTime.now());
        System.out.println(s.solution(50));
        System.out.println(LocalDateTime.now());
    }
}
