public class Task8 {

    static class Calculator {
        public int add(int a, int b) { return a + b; }
        public int sub(int a, int b) { return a - b; }
        public int mul(int a, int b) { return a * b; }
        public double div(int a, int b) {
            if (b == 0) throw new ArithmeticException("Деление на ноль");
            return (double) a / b;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int testsPassed = 0;
    static int testsFailed = 0;

    static void check(String name, boolean condition) {
        if (condition) {
            System.out.println("[OK]   " + name);
            testsPassed++;
        } else {
            System.out.println("[FAIL] " + name);
            testsFailed++;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        check("add(2,3) == 5", calc.add(2, 3) == 5);
        check("sub(5,3) == 2", calc.sub(5, 3) == 2);
        check("mul(3,4) == 12", calc.mul(3, 4) == 12);
        check("div(10,2) == 5", calc.div(10, 2) == 5.0);

        boolean exceptionThrown = false;
        try {
            calc.div(5, 0);
        } catch (ArithmeticException e) {
            exceptionThrown = true;
        }
        check("div(5,0) throws", exceptionThrown);


        int[] primes = {2, 3, 5, 7, 11, 13, 97, 101};
        for (int p : primes) {
            check(p + " is prime", isPrime(p));
        }

        int[] composites = {4, 6, 8, 9, 100, 1000};
        for (int c : composites) {
            check(c + " is not prime", !isPrime(c));
        }

        int[] edges = {-5, -1, 0, 1};
        for (int e : edges) {
            check(e + " is not prime (edge)", !isPrime(e));
        }

        System.out.println("\nПройдено: " + testsPassed + ", Провалено: " + testsFailed);
    }
}
