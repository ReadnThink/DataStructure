package bruteForce;

public class 하샤드수 {
    // Int를 String 객체로 만들고, 다시 Int로 만들기 때문에 solution보다는 비효율적이다.
    public boolean solution1(int x){
        String s = String.valueOf(x);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        System.out.println(sum);

        return false;
    }

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
//        System.out.println(h.solution(11));
        System.out.println(h.solution1(10));
    }
}
