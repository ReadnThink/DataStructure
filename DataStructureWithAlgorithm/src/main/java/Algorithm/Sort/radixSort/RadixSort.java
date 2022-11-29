package Algorithm.Sort.radixSort;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        //정렬해야할 배열
        int[] nums = {7, 4, 5, 9, 1, 0};
        //정렬해야할 기수의 범위에 맞게 배열 설정 (nums가 9까지있으니 10진수이다.)
        int[] arr = new int[10];
        Arrays.fill(arr, -1); // -1로 초기화
        // arr에 nums숫자와 동일한 인덱스에 값을 넣는다.
        // 인덱스와 숫자를 일치하게 넣으면 출력할때 인덱스 오름차순으로 확인하면 전부 정렬이 되기 때문이다.
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = nums[i];
        }
        // -1이 아니라면 (값이 들어갔다면) 출력하기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.printf("%d ",arr[i]);
            }
        }
    }
}
