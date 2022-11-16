package Algorithm.Sort.quickSort;

import java.util.Arrays;

public class QuickSortWithArray {
    public static void sort(int[] arr, int start, int end) {
        int pivot = arr.length / 2;
        int i = start;
        int j = end;
        int tmp;
        while (i < j) {
            while (arr[i] < arr[pivot]) i++;
            while (arr[j] > arr[pivot] && j > start) j--;
            System.out.println("i = "+i);
            System.out.println("j = "+j);
            if(i < j){
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

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
