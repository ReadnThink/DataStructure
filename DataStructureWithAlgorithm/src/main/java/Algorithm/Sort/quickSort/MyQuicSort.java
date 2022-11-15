package Algorithm.Sort.quickSort;

public class MyQuicSort {

    public static void sort(int[] arr, int start, int end){
        if(start >= end) return;
        //20, 18, 5, 19, 5, 25, 40, 50
        //5 18 5 19 20 25 40 50
        //5 5 18 19 20 25 40 50
        int pivot = start;
        int i = start + 1;
        int j = end;
        int tmp;
        while(i <= j){
            while(arr[i] <= arr[pivot]) i++;
            while(arr[j] >= arr[pivot] && j > start) j--;

            if(i > j){
                tmp = arr[j];
                arr[j] = arr[pivot];
                arr[pivot] = tmp;
            } else {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        sort(arr, start, j - 1);
        sort(arr, j + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50}; //배열
        sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }
}
