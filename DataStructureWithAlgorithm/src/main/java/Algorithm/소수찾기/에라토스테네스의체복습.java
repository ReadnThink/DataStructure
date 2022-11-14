package Algorithm.소수찾기;

public class 에라토스테네스의체복습 {
    //221114복습

    public int solution(int n) {
        int cnt = 0;
        int[] check = new int[51];
        for(int i = 2; i <= 50; i++)check[i] = i;

        for (int i = 2; i*i <= n; i++) {
            for ( int j = i + i; j < check.length; j+= i) {
                System.out.println("j = " + j);
                check[j] = 0;
            }
        }
        for (int i : check) {
            System.out.printf("%d ,",i);
        }
        return cnt;
    }

    public static void main(String[] args) {
        에라토스테네스의체복습 a = new 에라토스테네스의체복습();
        a.solution(10);
    }

}
