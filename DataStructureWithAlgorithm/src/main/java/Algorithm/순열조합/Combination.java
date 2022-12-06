package Algorithm.순열조합;

public class Combination {
    /*
    * 서로다른 n개에서 순서없이 r개를 뽑는 경우의 수
    * 순서가 없다 ex) [1,2] [2,1]은 같은것이다.
    * */

    private static boolean[] isUsed;
    public static void combination(int[] arr, int start, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                if(isUsed[i]) System.out.printf("%d ", arr[i]);
            }
            System.out.println();
        }
        else {
            for (int i = start; i < arr.length; i++) {
                if(!isUsed[i]){
                    isUsed[i] = true;
                    combination(arr, i + 1, depth + 1, r);
                    isUsed[i] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        isUsed = new boolean[arr.length + 1];
        combination(arr,0, 0,2);
    }
}
