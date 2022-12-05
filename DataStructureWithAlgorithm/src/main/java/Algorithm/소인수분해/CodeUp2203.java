package Algorithm.소인수분해;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeUp2203 {

    static List<Long> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        solution(n);
        System.out.println(list.get(list.size() -1));
    }

    private static void solution(Long n) {
        for (int i = 2; i <= n; i++) {
            if(n % i == 0){
                list.add((long) i);
                solution(n / i);
                break;
            }
        }
    }
}
