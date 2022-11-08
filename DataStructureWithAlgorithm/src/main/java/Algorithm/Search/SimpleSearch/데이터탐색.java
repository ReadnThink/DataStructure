package Algorithm.Search.SimpleSearch;

import java.util.Scanner;

public class 데이터탐색 {
    public static int solution(int[] nums, int n){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] nums = new int[T];
        for(int i = 0; i < T; i++){
            nums[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        System.out.println(solution(nums,N));
    }
}
