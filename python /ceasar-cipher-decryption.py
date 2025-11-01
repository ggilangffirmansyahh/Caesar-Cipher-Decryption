

def caesar_decrypt(cipher_text, shift):
    decrypted_text = ""
    for char in cipher_text:
        if char.isalpha():
            # Determine ASCII base (A=65 or a=97)
            base = 65 if char.isupper() else 97
            # Shift back by 'shift' and wrap around using modulo 26
            decrypted_char = chr((ord(char) - base - shift) % 26 + base)
            decrypted_text += decrypted_char
        else:
            # Non-alphabetic characters stay the same
            decrypted_text += char
    return decrypted_text


# --- Example Usage ---
cipher = input("Enter encrypted text: ")
shift = int(input("Enter shift value (0-25): "))

decrypted = caesar_decrypt(cipher, shift)
print("\n🔓 Decrypted Text:", decrypted)

# Input:
# Enter encrypted text: Khoor Zruog
# Enter shift value (0-25): 3

# Output:
# 🔓 Decrypted Text: Hello World