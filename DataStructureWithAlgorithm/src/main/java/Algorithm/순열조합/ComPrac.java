package Algorithm.순열조합;

public class ComPrac {

    static boolean[] isUsed;
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        isUsed = new boolean[arr.length + 1];
        combination(arr,0, 0, 2);
    }

    private static void combination(int[] arr,int start, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < arr.length; i++) {
                if(isUsed[i] == true) System.out.printf("%d ", arr[i]);
            }
            System.out.println();
        } else {
            for (int i = start; i < arr.length; i++) {
                if (!isUsed[i]) {
                    isUsed[i] = true;
                    combination(arr,i + 1, depth + 1, r);
                    isUsed[i] = false;
                }
            }
        }
    }
}
