#include <iostream>
#include <string>

using namespace std;

bool isVowel(char c);

int patternMatcher(const string &pattern, const string &source) {
    int patternLength = pattern.length();
    int sourceLength = source.length();
    int count = 0;

    for(int i = 0; i <= sourceLength - patternLength; ++i) {
        bool match = true;
        for(int j = 0; j <= patternLength; ++j) {
            if(pattern[j] == '0' && !isVowel(source[i + j])) {
                match = false;
                break;
            } else if(pattern[j] == '1' && isVowel(source[i + j])) {
                match = false;
                break;
            }
        }
        if(match == true) ++count;
    }
    return count;
}

bool isVowel(char c) {
    return (c == 'a' || c =='e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c =='E' || c == 'I' || c == 'O' || c == 'U');
}

int main() {
    string pattern1 {"010"};
    string source1 {"amazing"};
    cout << patternMatcher(pattern1, source1) << endl;

    string pattern2 {"100"};
    string source2 {"codesignal"};
    cout << patternMatcher(pattern2, source2) << endl;

    return 0;
}
