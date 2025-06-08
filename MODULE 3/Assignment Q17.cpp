#include <iostream>
using namespace std;

int main() 
{
    string str;
    cout << "Enter a string: ";
    cin >> str;

    bool isPalindrome = true;
    int len = str.length();

    for(int i = 0; i < len / 2; i++) {
        if(str[i] != str[len - i - 1]) {
            isPalindrome = false;
            break;
        }
    }

    if(isPalindrome)
        cout << "The string is a palindrome." << endl;
    else
        cout << "The string is not a palindrome." << endl;

    return 0;
}

