#include <iostream>
#include <unordered_set>

using namespace std;
int* twoSum(int arr[], int size, int target) {
    unordered_set<int, int> numMap;
    for(int i = 0; i < size; ++i) {
        int difference = target - arr[i];
        if (numMap.count(difference)) {
            int* result = new int[2]{numMap[difference], i};
            return result;
        }
        numMap[arr[i]] = i;
    }
    return nullptr;
}

int main() {
    int arr [] {1, 2, 5, 4};
    int size = sizeof(arr)/sizeof(arr[0]);
    int target = 7;
    int* result = twoSum(arr, size, target);

    if (result != nullptr)
        cout << "Indices of two sum: " << result [0] << " " << result[1] << endl;
    else
        cout << " No solution found. " << endl;
    return 0;
}
