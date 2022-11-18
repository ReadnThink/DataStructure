package Algorithm.Sort.quickSort;

import java.util.Arrays;

public class QuickSortWithArray {
    public static void sort(int[] arr, int start, int end) {
        int pivot = (start + end) / 2;
        int i = start;
        int j = end;
        int tmp;
        while (i <= j) {//원소가 1개있을경우 ??
            while (arr[i] < arr[pivot]) i++;
            while (arr[j] > arr[pivot]) j--;
//            System.out.printf("i = %d     j = %d\n",arr[i], arr[j]);

            if(i <= j){ //같은경우 i++, j--를 해줘서 무한루프를 벗어나야한다.
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
            if(i > j){ //정확한 로직이 아니다. 재귀를 타기 전에 왼쪽, 오른쪽으로 작은값, 큰값이
                tmp = arr[j];
                arr[j] = arr[pivot];
                arr[pivot] = tmp;
            }
        }
        for (int k : arr) {
            System.out.printf("%d ", k);
        }
        System.out.println();
        if(start < pivot) sort(arr,start,pivot);
        if(start < pivot) sort(arr,pivot+1,end);
    }

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25}; //배열
        System.out.println(Arrays.toString(arr));

        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

        System.out.println();
        long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
        long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
