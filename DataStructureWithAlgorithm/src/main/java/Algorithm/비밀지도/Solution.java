package Algorithm.비밀지도;

import java.util.Arrays;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        Arrays.fill(answer,"");
        String[] binaryArr1 = new String[arr1.length];
        String[] binaryArr2 = new String[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            //2진수로 변환
            binaryArr1[i] = Integer.toBinaryString(arr1[i]);
            binaryArr2[i] = Integer.toBinaryString(arr2[i]);
            //자리수 맞추기
            if(binaryArr1[i].length() < n){
                for (int j = binaryArr1[i].length(); j < n; j++) {
                    binaryArr1[i] = "0" + binaryArr1[i];
                }
            }
            if(binaryArr2[i].length() < n) {
                for (int j = binaryArr2[i].length(); j < n; j++) {
                    binaryArr2[i] = "0" + binaryArr2[i];
                }
            }
        }

        //합치기
        
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//            if(binaryArr1[i].charAt(j) == '0' && binaryArr2[i].charAt(j) == '0')
//                answer[i] = answer[i] + " ";
//            else
//                answer[i] = answer[i] + "#";
//            }
//        }
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = binaryArr1[i].replaceAll("1","#");
            answer[i] = binaryArr2[i].replaceAll("0"," ");
        }
        System.out.println(Arrays.toString(binaryArr1));
        System.out.println(Arrays.toString(binaryArr2));
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        Solution s = new Solution();
        String[] result = s.solution(n, arr1, arr2);
    }
}
