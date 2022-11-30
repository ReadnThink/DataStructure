package Algorithm.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BinaryTree {
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split(" ");

        System.out.println(tree(Integer.parseInt(n[0]), Integer.parseInt(n[1])));
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
