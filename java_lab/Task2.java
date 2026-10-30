public class Task2 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(12, 18));   // 6
        System.out.println(gcd(100, 75));  // 25
        System.out.println(gcd(7, 13));    // 1
    }
}
