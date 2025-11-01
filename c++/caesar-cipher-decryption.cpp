// 🔓 Caesar Cipher Decryption in C++
// Author: gp

#include <iostream>
#include <string>
using namespace std;

string encrypt(string text, int shift) {
    string result = "";
    for (char ch : text) {
        if (isalpha(ch)) {
            char base = isupper(ch) ? 'A' : 'a';
            ch = (ch - base + shift) % 26 + base;
        }
        result += ch;
    }
    return result;
}

string decrypt(string text, int shift) {
    // Reverse the shift for decryption
    return encrypt(text, 26 - (shift % 26));
}

int main() {
    string text;
    int shift;
    cout << "Enter encrypted text: ";
    getline(cin, text);
    cout << "Enter shift value (0-25): ";
    cin >> shift;

    cout << "\n🔓 Decrypted Text: " << decrypt(text, shift) << endl;
    return 0;
}
// Enter encrypted text: Hfjxfw Hnumjw
// Enter shift value (0-25): 5
// 🔓 Decrypted Text: Caesar Cipher