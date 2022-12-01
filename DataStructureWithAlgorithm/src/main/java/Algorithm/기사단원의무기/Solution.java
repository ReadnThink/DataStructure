package Algorithm.기사단원의무기;

public class Solution {
    public static int checkDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)cnt++;
        }
        return cnt;
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;

        //기사단의 소수를 저장할 배열
        int[] canBuy = new int[number + 1];


        //약수를 구하는 로직
        for (int i = 1; i <= number; i++) {
//            System.out.println(checkDivisor(i));
            canBuy[i] = checkDivisor(i);
        }

        //소수를 철의 무게로 바꾸는 로직
        for (int i = 1; i < canBuy.length; i++) {
            //limit에 걸리면 power개를 더함
            if(canBuy[i] > limit) {
//                System.out.println("power : "+power);
                answer += power;
            }
            else{ //limit에 걸리지 않는다면 소수를 바로 더함
//                System.out.println("canBuy: "+canBuy[i]);
//                System.out.println("answer" + answer);
                answer += canBuy[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
//        System.out.println(solution(5, 3, 2));
        System.out.println(solution(10, 3, 2));
    }
}
