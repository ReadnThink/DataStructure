package Algorithm.tree;

import java.util.Scanner;

public class BinaryTree {

    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(tree(a, b));
    }

    private static int tree(int a, int b) {
        if(a / 2 == b / 2){
            return cnt++;
        } else {
            if(a != 1) cnt++;
            if(b != 1) cnt++;
            tree(a / 2, b / 2);
        }
        return cnt;
    }
}
