package Algorithm.잔돈계산기;

import java.util.Scanner;

public class SolutionInClass {


    public static void main(String[] args) {
        int[] moneyArray = new int[]{50000,10000,5000,1000,500,100,50,10};

        Scanner scan = new Scanner(System.in);
        int refund = scan.nextInt();

        for (int money:
                moneyArray) {
            System.out.print(money + "원: ");
            int num = refund / money;
            System.out.print(num + "개");
            System.out.println();
            refund = refund % money;}
    }
}