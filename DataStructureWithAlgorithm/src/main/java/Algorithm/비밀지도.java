package Algorithm;

import java.util.Scanner;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < arr1.length;i++){
            answer[i] = Integer.toBinaryString(arr1[i]);
        }
        for (String s : answer) {
            System.out.println(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[]{9, 20, 28, 18, 11};
        int arr2[] = new int[]{30, 1, 21, 17, 28};
        int n = sc.nextInt();

        비밀지도 map = new 비밀지도();

        map.solution(n,arr1,arr2);
    }
}
