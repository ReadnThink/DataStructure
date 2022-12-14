package Algorithm.DynamicProgramming.optimalStrategy;

class Pair2{
    int left;
    int right;

   public Pair2(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

//왼쪽과 오른쪽 저장하는 로직연습

public class OptimalStrategy2 {
    public static void main(String[] args) {
        int[] coin = {2, 7, 40, 19};

        // 4 * 4배열
        Pair[][] dp = new Pair[coin.length][coin.length];

        //숫자가 써있는 동전이 2개만 있는 경우
        //왼쪽과 오른쪽 저장하는 로직연습
        for (int i = 1; i < coin.length; i++) {
            for (int j = 0; j < coin.length - i; j++) {
                int left = coin[j];
                int right = coin[j + i];
                dp[i][j] = new Pair(left, right);
                System.out.printf("%d %d \n", left,right);
            }
        }
    }
}
