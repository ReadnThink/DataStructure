package bruteForce;

import javax.sound.sampled.EnumControl;
import java.util.Enumeration;

interface StatementStrategy{
    boolean compare(int a, int b);
};
public class TemplateCallBackPrime {
    // i < num
    // i < num / 2
    // i * i < num

    boolean isPrime(int n, StatementStrategy stmt){
        for (int i = 2; stmt.compare(i, n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        TemplateCallBackPrime templateCallBackPrime = new TemplateCallBackPrime();
        boolean result = templateCallBackPrime.isPrime(13, (a,b)-> a < b);
        boolean result1 = templateCallBackPrime.isPrime(17, (a,b)-> a < b / 2);
        boolean result2 = templateCallBackPrime.isPrime(15, (a,b)-> a * a < b);
        boolean result3 = templateCallBackPrime.isPrime(12, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a * a <= b;
            }
        });

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
