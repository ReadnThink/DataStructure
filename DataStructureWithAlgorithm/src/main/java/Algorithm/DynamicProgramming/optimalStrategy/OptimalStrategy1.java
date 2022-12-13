package Algorithm.DynamicProgramming.optimalStrategy;

class Pair1{
    int left;
    int right;

    public Pair1(int left, int right) {
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


public class OptimalStrategy1 {
    public static void main(String[] args) {
        int[] coin = {2, 7, 40, 19};

        // 4 * 4배열
        Pair[][] dp = new Pair[coin.length][coin.length];

        //숫자가 써있는 동전이 2개만 있는 경우
        for (int i = 0; i < coin.length - 1; i++) {
            System.out.printf("%d %d %d %d \n", i, i + 1, coin[i], coin[i + 1]);
            int left = Math.max(coin[i], coin[i + 1]);
            int right = Math.min(coin[i], coin[i + 1]);
            dp[i][i + 1] = new Pair(left, right);
        }

        for (int i = 0; i < coin.length - 1; i++) {
            System.out.println(dp[i][i + 1].toString());
        }
    }
}
