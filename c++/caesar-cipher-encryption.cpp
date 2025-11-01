

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

int main() {
    string text;
    int shift;
    cout << "Enter plain text: ";
    getline(cin, text);
    cout << "Enter shift value (0-25): ";
    cin >> shift;

    cout << "\n🔒 Encrypted Text: " << encrypt(text, shift) << endl;
    return 0;
}
// Enter plain text: Caesar Cipher
// Enter shift value (0-25): 5
// 🔒 Encrypted Text: Hfjxfw Hnumjw