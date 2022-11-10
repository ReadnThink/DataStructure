package Algorithm.Sort;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

interface SortStategy{
    boolean compare(int a, int b);
}

public class 선택정렬inClassWithTemplat {
    public int[] selectionSort(int[] arr, SortStategy stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.compare(arr[minIdx], arr[j])) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public int[] selectionSortBiFunction(int[] arr, BiFunction<Integer, Integer, Boolean> stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.apply(arr[minIdx], arr[j])) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public int[] selectionSortBiPredicate(int[] arr, BiPredicate<Integer, Integer> stmt) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (stmt.test(arr[minIdx], arr[j])) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};
        선택정렬inClassWithTemplat ss = new 선택정렬inClassWithTemplat();
//        ss.selectionSort(arr, (a, b) -> a < b);
//        ss.selectionSort(arr, (a, b) -> a > b);


        //Function<T,R> 인터페이스 사용법
        //T는 입력받는 타입, R은 리턴타입
        //Function<Integer[], Boolean> fn = Integer배열을 받아서 True 또는 False(Boolean)를 리턴
//        Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
//        System.out.println(fn.apply(new Integer[]{10,20}));


        //BiFunction = 앞에 2개타입(Integer, Integer)를  a,b로 받아서 true or false로 리턴
        BiFunction<Integer, Integer, Boolean> biFunction = (a, b) -> a > b;
        ss.selectionSortBiFunction(arr,biFunction);

        BiPredicate<Integer, Integer> bp = (a,b) -> a < b;
        ss.selectionSortBiPredicate(arr,bp);
    }

}
