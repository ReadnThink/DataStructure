package Recursive;

public class PrintArrays {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 9};
        System.out.println(sum(arr, 0, 0));
    }

    private static int sum(int[] arr, int answer, int idx) {
        if(arr.length == idx) return answer;
        answer += arr[idx];
        return sum(arr, answer, idx+1);
    }
}
