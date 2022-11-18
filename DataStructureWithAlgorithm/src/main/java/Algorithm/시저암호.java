package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class 시저암호 {
    public static String solution(String words, int n) {
        String[] splited = words.split("");
        boolean spaceCheck = false;

        if(words.indexOf(" ") == -1) splited = words.split("");
        else {
            spaceCheck = true;
            splited = words.split(" ");
        }


        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < splited.length; i++) {
            if(splited[i].charAt(0) != 'z')
                characters.add((char)(splited[i].charAt(0) + n));
            else
                characters.add((char)(splited[i].charAt(0) - 26 + n));
        }
        StringBuilder sb = new StringBuilder();
        if(spaceCheck == false){
            for (Character character : characters) {
                sb.append(character);
            }
        } else {
            for (Character character : characters) {
                sb.append(character).append(" ");
            }
            sb.deleteCharAt(sb.length() - 1);
        }

        return String.valueOf(sb);
    }

    public static String solve(String words, int n){
        char[] arr = words.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 'z') arr[i] + n;
        }

        return words;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(solution(words, n));
    }
}
