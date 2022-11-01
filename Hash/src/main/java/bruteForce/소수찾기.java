package bruteForce;

public class 소수찾기 {
    public static boolean isPrime (int n) {
        int num = n;
        // 2, 3, 5, 7, 9, 11, 13, 15, 17
        for (int i = 2; i <= num / 2; i++) {
            if(i % n == 0){
                System.out.println("소수가 아닙니다.");
                return true;
            }
        }
        System.out.println("소수 입니다.");
        return false;
    }


    public static void main(String[] args) {
        int n = 13;
        System.out.println(isPrime(n));
    }
}
