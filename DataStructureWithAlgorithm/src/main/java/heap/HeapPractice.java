package heap;

import java.util.Arrays;

public class HeapPractice {

    private static void makeHeap(int[] arr, int root, int arrSize) {
        //root의 자식은 root * 2 + 1, root * 2 + 2
        int leftIdx = root * 2 + 1;
        int rightIdx = root * 2 + 2;
        int bigIdx = root;

        if(leftIdx < arrSize && arr[leftIdx] > arr[bigIdx]) bigIdx = leftIdx;
        if (rightIdx < arrSize && arr[rightIdx] > arr[bigIdx]) bigIdx = rightIdx;

        if (root != bigIdx) {
            int tmp = arr[root];
            arr[root] = arr[bigIdx];
            arr[bigIdx] = tmp;
            makeHeap(arr,bigIdx, arrSize);
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 5, 7, 2, 9, 6, 8, 3};
        System.out.println(Arrays.toString(arr));
        //heap 구조 만들기
        for (int i = (arr.length - 2) / 2; i >= 0 ; i--) {
            makeHeap(arr, i, arr.length);
        }
        System.out.println(Arrays.toString(arr));
        //정렬
        for (int i = arr.length - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            makeHeap(arr, 0, i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
