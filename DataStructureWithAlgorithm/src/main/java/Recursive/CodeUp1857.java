package Recursive;

import java.util.Scanner;

public class CodeUp1857 {
    /*
     * 서로 다른 n개 중에서 r개 순서없이 고르기
     * */
    static int a;
    static int b;
    static int[] arr;
    static boolean[] isUsed;

    static void func(int k) {
        if (k == b) {
            for (int i = 0; i < b; i++)
                System.out.printf("%d ", arr[i]);
            System.out.println();
        }
        else {
            for (int i = 1; i <= a; i++) {
//                if (!isUsed[i]) {
                    arr[k] = i;
//                    isUsed[i] = true;
                    func(k + 1);
//                    isUsed[i] = false;
//                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        arr = new int[a + 2];
        isUsed = new boolean[a + 2];
        func(0);
    }
}
