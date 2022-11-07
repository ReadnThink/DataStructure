package bruteForce;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return x % sum == 0;
    }

    public static void main(String[] args) {
        하샤드수 h = new 하샤드수();
        System.out.println(h.solution(11));
    }
}
