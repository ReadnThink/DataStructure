package Algorithm.소수찾기;

public class Toss {

    public static void main(String[] args) {
        int n = 120;
        solution(n);
    }

    private static void solution(int n) {

        int[] arr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) arr[i] = i;
        arr[0] = 0;
        arr[1] = 0;
        for (int i = 2; i < arr.length; i++) {
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}
