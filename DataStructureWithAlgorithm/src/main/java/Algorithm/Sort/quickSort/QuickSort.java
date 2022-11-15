package Algorithm.Sort.quickSort;


import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public void solution(int[] arr, int start, int end){
        int pivot = arr.length / 2;

        List<Integer> leftList = new ArrayList<>();
        for (int i = 0; i < pivot; i++) leftList.add(arr[i]);
        List<Integer> rightList = new ArrayList<>();
        for (int i = pivot; i < arr.length; i++) rightList.add(arr[i]);

        for (Integer integer : leftList) {
            System.out.printf("%d ,", integer);
        }
        System.out.println();
        for (Integer integer : rightList) {
            System.out.printf("%d ,", integer);
        }
    }





    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        QuickSort q = new QuickSort();
        q.solution(arr, 0 , arr.length - 1);
    }
}
