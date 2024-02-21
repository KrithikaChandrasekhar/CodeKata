#include <iostream>
#include <algorithm>

using namespace std;

void rotateArray(int arr[], int size, int k) {
    reverse (arr, arr + size);
    reverse (arr, arr + k);
    reverse (arr + k, arr + size);
}

int main() {
    int arr[] {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    int k = 3;
    rotateArray(arr, size, k);
    for (int i = 0; i < size; ++i)
        cout << arr[i] << " " << endl;
    return 0;
}
