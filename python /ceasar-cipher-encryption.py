

def caesar_encrypt(plain_text, shift):
    encrypted_text = ""
    for char in plain_text:
        if char.isalpha():
            # Determine ASCII base (A=65 for uppercase, a=97 for lowercase)
            base = 65 if char.isupper() else 97
            # Shift forward by 'shift' and wrap around using modulo 26
            encrypted_char = chr((ord(char) - base + shift) % 26 + base)
            encrypted_text += encrypted_char
        else:
            # Leave non-letters unchanged
            encrypted_text += char
    return encrypted_text


# --- Example Usage ---
text = input("Enter plain text: ")
shift = int(input("Enter shift value (0-25): "))

encrypted = caesar_encrypt(text, shift)
print("\n🔒 Encrypted Text:", encrypted)


# Input:
# Enter plain text: Hello World
# Enter shift value (0-25): 3

# Output:
# 🔒 Encrypted Text: Khoor Zruog