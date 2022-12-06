package Algorithm.순열조합;

public class PerPrac {

    static boolean[] isUsed;
    static int[] result;

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        isUsed = new boolean[arr.length + 1];
        result = new int[arr.length + 1];
        per(arr, 0, 2);
    }

    private static void per(int[] arr, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < r; i++) System.out.printf("%d ", result[i]);
            System.out.println();
        }
        else {
            for (int i = 1; i <= arr.length; i++) {
                if(isUsed[i] != true){
                    isUsed[i] = true;
                    result[depth] = i;
                    per(arr,depth+1,r);
                    isUsed[i] = false;
                }
            }
        }

    }
}
