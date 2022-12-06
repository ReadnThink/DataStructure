package heap;

import java.util.Arrays;

public class HeapArraySort {

    public static void main(String[] args) {
//        int[] arr = new int[]{6, 5, 7, 8};
        int[] arr = new int[]{10, 9, 5, 8, 3, 2, 4, 6, 7, 1};
        System.out.println("Arrays = " + Arrays.toString(arr));
        for (int j = (arr.length - 2) / 2; j >= 0; j--) {
            int[] result = makeHeap(arr, j, arr.length);
            System.out.println(Arrays.toString(arr));
        }

        //정렬
        System.out.println("======================정렬====================");
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            arr = makeHeap(arr, 0, i);
            System.out.println(Arrays.toString(arr));
        }
//        int temp = arr[0];
//        arr[0] = arr[arr.length - 1];
//        arr[arr.length - 1] = temp;
//        System.out.println("before makeHeap "+Arrays.toString(arr));
//        arr = makeHeap(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
//
//
//        temp = arr[0];
//        arr[0] = arr[arr.length - 2];
//        arr[arr.length - 2] = temp;
//        System.out.println("before makeHeap "+Arrays.toString(arr));
//        arr = makeHeap(arr, 0, arr.length - 2);
//        System.out.println(Arrays.toString(arr));
//
//        temp = arr[0];
//        arr[0] = arr[arr.length - 3];
//        arr[arr.length - 3] = temp;
//        System.out.println("before makeHeap "+Arrays.toString(arr));
//        arr = makeHeap(arr, 0, arr.length - 3);
//        System.out.println(Arrays.toString(arr));
    }

    private static int[] makeHeap(int[] arr, int parentIdx, int arrSize) {
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greaterIdx = parentIdx;

        //왼쪽이 parent보다 크면 greaterIdx = leftIdx 6 7 5 --> 7 6 5
        if (leftIdx < arrSize && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        //오른쪽 자식이 greater 보다 크면
        if (rightIdx < arrSize && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        //swap
        if (parentIdx != greaterIdx) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = temp;
            makeHeap(arr, greaterIdx, arrSize);
        }
        return arr;
    }

}
