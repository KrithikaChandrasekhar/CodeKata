#include <iostream>
#include <vector>

using namespace std;

bool isSubstring(const string &str1, const string &str2) {
    return (str1.find(str2) != string::npos);
}

int main() {
    string str1 {"Hello, world!"};
    string str2 {"hello"};

    string lowerCaseStr1, lowerCaseStr2;
    for(char c : str1) lowerCaseStr1 += tolower(c);
    for(char c : str2) lowerCaseStr2 += tolower(c);
    if(isSubstring(lowerCaseStr1,lowerCaseStr2))
        cout << str2 << " is a substring of " << str1 << endl;
    else
        cout << str2 << " is not a substring of " << str1 << endl;
    return 0;
}

