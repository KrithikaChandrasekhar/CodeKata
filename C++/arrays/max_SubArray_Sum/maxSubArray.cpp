#include <iostream>

using namespace std;

int maxSumArray(int arr[], int size) {
    int maxSum = arr[0], currentSum = arr[0];
    for(int i = 0; i < size; ++i) {
        currentSum = max(arr[i] , currentSum + arr[i]);
        maxSum = max(maxSum, currentSum);
    }
    return maxSum;
}

int main () {
    int arr[] {1, 2, 3, 0, -1, 5, -4, -6};
    int size = sizeof(arr) / sizeof(arr[0]);
    cout << "Max sum array is: " << maxSumArray(arr, size) << endl;
    return 0;
}
