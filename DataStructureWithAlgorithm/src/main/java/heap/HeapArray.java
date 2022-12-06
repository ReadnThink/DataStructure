package heap;

import java.util.Arrays;

public class HeapArray {

    public static void main(String[] args) {
//        int[] arr = new int[]{6, 5, 7, 8};
        int[] arr = new int[]{10,9,5,8,3,2,4,6,7,1};
        System.out.println("Arrays = "+ Arrays.toString(arr));
        for (int j = (arr.length - 2) / 2; j >= 0; j--) {
            int[] result = makeHeap(arr, j);
            System.out.println(Arrays.toString(arr));
        }

        //정렬
        System.out.println("======================정렬====================");
        for (int i = 0; i <arr.length - i- 1; i++) {
            int temp = arr[0];
            arr[0] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    private static int[] makeHeap(int[] arr, int parentIdx) {
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greaterIdx = parentIdx;

        //왼쪽이 parent보다 크면 greaterIdx = leftIdx 6 7 5 --> 7 6 5
        if (leftIdx < arr.length && arr[leftIdx] > arr[greaterIdx]) {
            greaterIdx = leftIdx;
        }

        //오른쪽 자식이 greater 보다 크면
        if (rightIdx < arr.length && arr[rightIdx] > arr[greaterIdx]) {
            greaterIdx = rightIdx;
        }

        //swap
        if (parentIdx != greaterIdx) {
            int temp = arr[parentIdx];
            arr[parentIdx] = arr[greaterIdx];
            arr[greaterIdx] = temp;
            makeHeap(arr, greaterIdx);
        }
        return arr;
    }

}
