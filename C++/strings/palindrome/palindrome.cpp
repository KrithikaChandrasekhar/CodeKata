#include <iostream>
#include <vector>

using namespace std;

bool isPalindrome(const string &str) {
    return equal(str.begin(), str.begin() + str.size() / 2, str.rbegin());
}

int main() {
    string str {"level"};
    if(isPalindrome(str))
        cout << "The given string " << str << " is a palindrome" << endl;
    else
        cout << "The given string " << str << " is not a palindrome" << endl;
    return 0;
}
