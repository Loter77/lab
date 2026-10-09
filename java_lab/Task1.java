public class Task1 {
    // Возвращает x в степени n (n — натуральное)
    public static int pow(int x, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));   // 8
        System.out.println(pow(5, 2));   // 25
        System.out.println(pow(3, 4));   // 81
    }
}