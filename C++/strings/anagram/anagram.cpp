#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool isAnagram(const string &str1, const string &str2) {
    string temp1 = str1;
    string temp2 = str2;
    sort(temp1.begin(), temp1.end());
    sort(temp2.begin(), temp2.end());
    return (temp1 == temp2);
}

int main() {
    string str1 {"listen"};
    string str2 {"silent"};
    if(isAnagram(str1, str2))
        cout << str1 << " and " << str2  << " are anagrams" << endl;
    else
        cout << str1 << " and " << str2  << " are not anagrams" << endl;
    return 0;
}
