#include <iostream>
#include <vector>

using namespace std;

vector<int> transposeArray(const vector<int> &arrA) {
    int n = arrA.size();
    vector<int> arrB(n, 0);
    for(int i = 0;  i < n; ++i) {
        int previous = (i - 1 >= 0) ? arrA[i - 1] : 0;
        int current = arrA[i];
        int next = (i + 1 < n) ? arrA[i + 1] : 0;
        arrB[i] = previous + current + next;
    }
    return arrB;
}

int main() {
    vector<int> arrA {4, 0, 1, -2, 3};
    vector<int> arrB = transposeArray(arrA);
    for(int i = 0; i < arrB.size(); ++i) {
        cout << arrB[i] << " ";
    }
    cout << endl;
    return 0;
}
