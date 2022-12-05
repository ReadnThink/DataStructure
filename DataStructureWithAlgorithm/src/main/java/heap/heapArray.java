package heap;

import java.util.Arrays;

public class heapArray {

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        System.out.println("Arrays = "+ Arrays.toString(arr));
        heap(arr);
    }

    private static void heap(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            int leftIdx = i * 2 + 1;
            int rightIdx = i * 2 + 2;
            if(arr.length <= rightIdx) break;
            if (arr[i] < arr[leftIdx]) {
                tmp = arr[i];
                arr[i] = arr[leftIdx];
                arr[leftIdx] = tmp;
            }
            if (arr[i] < arr[rightIdx]) {
                tmp = arr[i];
                arr[i] = arr[rightIdx];
                arr[rightIdx] = tmp;
            }
        }
        System.out.println("Heap   = " + Arrays.toString(arr));
    }

}
