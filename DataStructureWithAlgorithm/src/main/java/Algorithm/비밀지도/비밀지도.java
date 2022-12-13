package Algorithm.비밀지도;

import java.util.Arrays;
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
        String[] binaryArr1 = new String[n]; //진수를 String으로 변환해 주어야 하기 때문에 string배열 선언
        String[] binaryArr2 = new String[n];
        for(int i = 0; i < arr1.length;i++){ //arr1, arr2 모두 같은값으로 들어온다.
            for (int j = 0; j < n; j++) {
                //진수를 담을 빈 배열 선언
                String binStr1 = Integer.toBinaryString(arr1[i]);
                String binStr2 = Integer.toBinaryString(arr2[i]);

                //자리수에 맞게 0을 넣어준다.
                if(binStr1.length() < n){
                    binStr1 = "0" + binStr1;
                    binaryArr1[i] = binStr1;
                } else {
                    binaryArr1[i] = binStr1;
                }

                if(binStr2.length() < n){
                    binStr2 = "0" + binStr2;
                    binaryArr2[i] = binStr2;
                } else {
                    binaryArr2[i] = binStr2;
                }
            }
        }
        System.out.println(Arrays.toString(binaryArr1));
        System.out.println(Arrays.toString(binaryArr2));

        return answer;
    }

    String[] solution1(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i])
                    .replace("1","#").replace("0", " ");
            // 자릿수 맞춰주는 연산
            //jdk 11부터 repeat 사용가능...ㅎㄷㄷ
//            answer[i] = " ".repeat(n - answer[i].length()) + answer[i];
            if(answer[i].length() < n){
                answer[i] = " " + answer[i];
            }
        }
        for (String s : answer) {
            System.out.println(s);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[]{9, 20, 28, 18, 11};
        int arr2[] = new int[]{30, 1, 21, 17, 28};
        int n = sc.nextInt();

        비밀지도 map = new 비밀지도();

//        map.solution(n,arr1,arr2);
        map.solution1(n,arr1,arr2);
        map.solution1(	6, new int[] {46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10});
    }
}
