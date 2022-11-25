package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1859 {
    /*
    *  삼각형 별찍기
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        f(n); // 내가 만들 코드
        getStars(n); // 강사님 코드
    }

    private static void printStar(int n) {
        if(n == 0){
            System.out.println();
            return;
        }
        System.out.print("*");
        printStar(n - 1);
    }
    private static void f(int n) {
        if(n == 0) return;
        f(n - 1);
        printStar(n);
    }

    //강사님 코드
    private static String getStars(int n){
        if(n == 0) return "";
        return "*" + getStars(n - 1);
    }

    public static void TeachersPrintStar(int n) {
        if(n == 0) return;
        //n은 점점 작아지지만 출력은 1부터 n까지
        printStar(n - 1);
        System.out.println();
    }

}
