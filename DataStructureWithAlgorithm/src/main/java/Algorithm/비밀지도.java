package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 비밀지도 {
//    String getBinaryString(int decNum){
//        String answer = "";
//        while(decNum > 0){
//            answer += decNum % 2; //answer는 String 이지만 n%2는 int이다 String + int = String이된다.
//            decNum /= 2;
//        }
//
//        while(decNum > 0){
//
//        }
//        return answer;
//    }

    public String solution(int n, int[] arr1, int[] arr2) {
        String answer = "";
        String[] sArr1 = new String[n];
        String[] sArr2 = new String[n];
        for(int i = 0; i < arr1.length;i++){
            for (int j = 0; j < n; j++) {
                String binStr1 = Integer.toBinaryString(arr1[i]);
                String binStr2 = Integer.toBinaryString(arr2[i]);
                if(binStr1.length() < n){
                    binStr1 = "0" + binStr1;
                    sArr1[i] = binStr1;
                } else {
                    sArr1[i] = binStr1;
                }
                if(binStr2.length() < n){
                    binStr2 = "0" + binStr2;
                    sArr2[i] = binStr2;
                } else {
                    sArr2[i] = binStr2;
                }
            }
        }
        System.out.println(Arrays.toString(sArr1));
        System.out.println(Arrays.toString(sArr2));

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[]{9, 20, 28, 18, 11};
        int arr2[] = new int[]{30, 1, 21, 17, 28};
        int n = sc.nextInt();

        비밀지도 map = new 비밀지도();

        map.solution(n,arr1,arr2);
    }
}
