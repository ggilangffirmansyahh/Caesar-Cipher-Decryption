

import java.util.Scanner;

public class CaesarEncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plain text: ");
        String text = sc.nextLine();
        System.out.print("Enter shift value (0-25): ");
        int shift = sc.nextInt();
        sc.close();

        String encrypted = encrypt(text, shift);
        System.out.println("\n🔒 Encrypted Text: " + encrypted);
    }

    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            result.append(ch);
        }
        return result.toString();
    }
}
// Enter plain text: Hello World
// Enter shift value (0-25): 3
// 🔒 Encrypted Text: Khoor Zruog