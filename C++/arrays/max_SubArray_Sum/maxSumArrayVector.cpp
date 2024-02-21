#include <iostream>
#include <vector>

using namespace std;
int maxSumArray(vector<int> &arr) {
    int currentSum = arr[0], maxSum = arr[0];
    for (int i = 1; i < arr.size(); ++i) {
        currentSum = max(arr[i], currentSum + arr[i]);
        maxSum = max(maxSum, currentSum);
    }
    return maxSum;
}

int main() {
    vector<int> arr {1, 2, 3, 4, -1, -2, -5, 10};
    maxSumArray(arr);
    cout << "Max Sum array: " << maxSumArray(arr) << endl;
    return 0;
}
