public class Task5 {
    // Возвращает строку с правильной формой слова "запись"
    public static String pluralizeRecords(int n) {
        String word;

        if (n % 10 == 1 && n % 100 != 11) {
            word = "запись";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 12 || n % 100 > 14)) {
            word = "записи";
        } else {
            word = "записей";
        }

        return "В результате выполнения запроса было найдено " + n + " " + word;
    }

    public static void main(String[] args) {
        System.out.println(pluralizeRecords(1));    // 1 запись
        System.out.println(pluralizeRecords(2));    // 2 записи
        System.out.println(pluralizeRecords(5));    // 5 записей
        System.out.println(pluralizeRecords(11));   // 11 записей
        System.out.println(pluralizeRecords(21));   // 21 запись
        System.out.println(pluralizeRecords(102));  // 102 записи
    }
}