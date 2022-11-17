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
            System.out.println("i = "+i);
            System.out.println("j = "+j);

            if(i <= j){ //같은경우 i++, j--를 해줘서 무한루프를 벗어나야한다.
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
            if(i > j){
                tmp = arr[j];
                arr[j] = arr[pivot];
                arr[pivot] = tmp;
            }
        }
        if(start < pivot) sort(arr,start,pivot);
        if(start < pivot) sort(arr,pivot+1,end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25}; //배열
        System.out.println(Arrays.toString(arr));

        sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
