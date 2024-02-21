#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

void rotateArray(vector<int> & arr, int k) {
    reverse(arr.begin(), arr.end());
    reverse(arr.begin(), arr.begin() + k);
    reverse(arr.begin() + k, arr.end());
}

int main() {
    vector<int> arr{1, 2, 3, 4, 5};
    int k = 3;
    rotateArray(arr, k);
    cout <<"Rotated array: " << endl;
    for (int element : arr)
        cout << element << " " << endl;
    return 0;
}
