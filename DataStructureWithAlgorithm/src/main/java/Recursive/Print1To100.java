package Recursive;

public class Print1To100 {

    public static void main(String[] args) {
        f(0);
    }

    private static int f(int k) {
        if(k == 100) return 0;
        else {
            System.out.println(k + 1);
            f(k + 1);
        }
        return 0;
    }
}
