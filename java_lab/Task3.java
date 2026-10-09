public class Task3 {
    // Возвращает наименьшую цифру числа x
    public static int minDigit(int x) {
        if (x == 0) return 0;

        int min = 9;
        while (x > 0) {
            int digit = x % 10;
            if (digit < min) {
                min = digit;
            }
            x = x / 10;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(minDigit(12345));  // 1
        System.out.println(minDigit(90807));  // 0
        System.out.println(minDigit(555));    // 5
    }
}