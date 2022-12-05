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
            if(arr.length <= i * 2 + 2) break;
            if (arr[i] < arr[i * 2 + 1]) {
                tmp = arr[i];
                arr[i] = arr[i * 2 + 1];
                arr[i * 2 + 1] = tmp;
            }
            if (arr[i] < arr[i * 2 + 2]) {
                tmp = arr[i];
                arr[i] = arr[i * 2 + 2];
                arr[i * 2 + 2] = tmp;
            }
        }
        System.out.println("Heap   = " + Arrays.toString(arr));
    }

}
