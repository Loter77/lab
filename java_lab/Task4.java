import java.math.BigInteger;

public class Task4 {
    public static BigInteger fibb(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibb(0));   // 0
        System.out.println(fibb(1));   // 1
        System.out.println(fibb(10));  // 55
        System.out.println(fibb(20));  // 6765
        System.out.println(fibb(100)); // большое число
    }
}
