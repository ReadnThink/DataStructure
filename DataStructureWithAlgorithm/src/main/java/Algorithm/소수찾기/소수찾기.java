package Algorithm.소수찾기;

public class 소수찾기 {


    public boolean isPrime (int n) {
        // 2, 3, 5, 7, 9, 11, 13, 15, 17

        //Template callback
        for (int i = 2; i <= n; i++) {
            System.out.printf("%d mod %d = %d\n",i,n,n%i);
            if(n % i == 0){
                System.out.println(n+"는소수가 아닙니다.");
                return false;
            }
        }
        System.out.println(n+"은소수 입니다.");
        return true;
    }


    public static void main(String[] args) {
        소수찾기 FindPrime = new 소수찾기();
        int n = 12;
        System.out.println(FindPrime.isPrime(n));
    }
}
