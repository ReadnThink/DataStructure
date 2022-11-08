package Algorithm.Search.BinarySearch;

import java.util.Scanner;

public class BinarySearch {

    public static int myBinarySearch(int[] nums, int targetNum){

        int startIdx = 0;
        int endIdx = nums.length - 1;
        int targetIdx = -1;

        while(startIdx <= endIdx) {
            int midIdx = (startIdx + endIdx) / 2;
            int midValue = nums[midIdx];

            //인덱스 (시작점, 끝점) 옮기기
            if (midValue > targetNum) {
                endIdx = midIdx - 1;
            } else if (midValue < targetNum) {
                startIdx = midIdx + 1;
            } else {
                // 같은지 비교
                targetIdx = midIdx;
                break;
            }
        }
        return targetIdx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] nums = new int[T];
        for (int i = 0; i < T; i++) {
            nums[i] = sc.nextInt();
        }
        int targetNum = sc.nextInt();
        System.out.println(myBinarySearch(nums,targetNum));
    }
}
