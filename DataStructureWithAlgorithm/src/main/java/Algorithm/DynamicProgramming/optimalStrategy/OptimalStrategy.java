package Algorithm.DynamicProgramming.optimalStrategy;

class Pair{
    int left;
    int right;

    public Pair(int left, int right) {
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


public class OptimalStrategy {
    public static void main(String[] args) {
        int[] coin = {2, 7, 40, 19};

        // 4 * 4배열
        Pair[][] dp = new Pair[coin.length][coin.length];

        //숫자가 써있는 동전이 1개만 있는 경우
        // 2 or 7 or 40 or 19
        for (int i = 0; i < coin.length; i++) {
            //왼쪽을 고른다.
            dp[i][i] = new Pair(coin[i], 0);
        }

        for (int i = 0; i < coin.length; i++) {
            System.out.println(dp[i][i].toString());
        }
    }
}
