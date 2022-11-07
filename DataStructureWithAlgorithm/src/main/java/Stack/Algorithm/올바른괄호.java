package Stack.Algorithm;

import java.util.Stack;

public class 올바른괄호 {
    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.charAt(0) == ')')
            return false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if(stack.empty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(solution("))))(())"));
    }
}
