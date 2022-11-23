package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StepUpStairs {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(f(n));
    }

    private static int f(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(n == 3) return 4;

        return f(n - 1) + f(n - 2) + f(n - 3);
    }
}
