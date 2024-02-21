#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    string original = "Hello, world!";
        reverse(original.begin(), original.end());
    cout << "Reversed string is: " << original << endl;
}
