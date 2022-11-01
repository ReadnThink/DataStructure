package bruteForce;

import javax.sound.sampled.EnumControl;
import java.util.Enumeration;

public class TemplateCallBackPrime {
    // i < num
    // i < num / 2
    // i * i < num

    boolean someOperation(int a, int b){
        return a < b;
    }

    boolean someOperation1(int a, int b){
        return a < b / 2;
    }

    boolean someOperation2(int a, int b){
        return a * a < b;
    }

    boolean isPrime(int n){
        for (int i = 2; someOperation(i, n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        TemplateCallBackPrime templateCallBackPrime = new TemplateCallBackPrime();
        boolean result = templateCallBackPrime.isPrime(12);
        System.out.println(result);
    }
}
