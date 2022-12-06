package Algorithm.순열조합;

public class Permutation {

/*
    서로다른 n개에서 r개를 뽑아 정렬하는 경우의 수
    순서가 있다. ex) [1, 2] [2, 1]은 순서가 달라 출력해야한다.
*/
    private static int[] makeArr;
    private static boolean[] isUsed;
    public static void permutation(int[] arr, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) System.out.printf("%d ",makeArr[i]);
            System.out.println();
        }
        else{
            for (int i = 1; i <= arr.length; i++) {
                if(isUsed[i] != true){
                    makeArr[depth] = i;
                    isUsed[i] = true;
                    permutation(arr,depth + 1, r);
                    isUsed[i] = false;
                }
            }
        }
        // 순차적인 숫자로 출력
//        else {
//            for (int i = 1; i <= arr.length; i++) {
//                makeArr[depth] = i;
//                permutation(arr,depth + 1, r);
//
//            }
//        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        isUsed = new boolean[arr.length + 2];
        makeArr = new int[arr.length + 2];
        permutation(arr, 0, 2);
    }
}