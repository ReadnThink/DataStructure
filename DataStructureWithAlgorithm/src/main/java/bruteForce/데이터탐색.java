package bruteForce;

import java.util.Scanner;

public class 데이터탐색 {
    public static void solution(int[] nums, int n){
        int idx = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == n){
                break;
            }
            idx++;
        }
        System.out.println(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] nums = new int[T];
        for(int i = 0; i < T; i++){
            nums[i] = sc.nextInt();
        }
        int N = sc.nextInt();
        solution(nums,N);
    }
}
