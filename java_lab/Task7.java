public class Task7 {
    private static final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static String cesar(String str, int shift, String action) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char lower = Character.toLowerCase(ch);

            int index = ALPHABET.indexOf(lower);

            if (index == -1) {
                result.append(ch);
            } else {
                int newIndex;
                if (action.equals("encode")) {
                    newIndex = (index + shift) % 33;
                } else {
                    newIndex = (index - shift + 33) % 33;
                }

                char newChar = ALPHABET.charAt(newIndex);

                if (Character.isUpperCase(ch)) {
                    result.append(Character.toUpperCase(newChar));
                } else {
                    result.append(newChar);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(cesar("привет", 3, "encode"));  // толуех
        System.out.println(cesar("толуех", 3, "decode"));  // привет

        // Расшифровка сообщения "эзтыхз фзъзъз"
        String encrypted = "эзтыхз фзъзъз";
        System.out.println("\nПодбор сдвига:");
        for (int shift = 1; shift <= 33; shift++) {
            System.out.println("Сдвиг " + shift + ": " + cesar(encrypted, shift, "decode"));
        }
    }
}
