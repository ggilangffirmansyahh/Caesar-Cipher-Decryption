

import java.util.Scanner;

public class CaesarDecryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter encrypted text: ");
        String text = sc.nextLine();
        System.out.print("Enter shift value (0-25): ");
        int shift = sc.nextInt();
        sc.close();

        String decrypted = decrypt(text, shift);
        System.out.println("\n🔓 Decrypted Text: " + decrypted);
    }

    public static String decrypt(String text, int shift) {
        // Decryption is just reverse shifting
        return encrypt(text, 26 - (shift % 26));
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
// Enter encrypted text: Khoor Zruog
// Enter shift value (0-25): 3
// 🔓 Decrypted Text: Hello World