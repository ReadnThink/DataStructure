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
        if(a == b){
            return cnt;
        } else {
            cnt++;
            //큰 노드를 한칸 이동시킨다.
            //나누기 2를하면 부모를 찾을 수 있다.
            if(a > b) tree(a / 2, b);
            else if (a < b) tree(a, b / 2);
        }
        return cnt;
    }
}
