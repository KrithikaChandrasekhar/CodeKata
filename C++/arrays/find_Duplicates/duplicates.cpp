#include <iostream>
#include <unordered_set>

using namespace std;

void findDuplicates(int arr[], int size) {
    unordered_set<int> seen;
    cout <<"Duplicate elements: ";
    for(int i = 0; i < size; ++i) {
        if (seen.find(arr[i]) != seen.end())
            cout << arr[i] << " ";
        else
            seen.insert(arr[i]);
    }
    cout << endl;
}

int main() {
    int arr[] {1, 2, 3, 5, 1, 2, 3};
    int size = sizeof(arr) / sizeof(arr[0]);
    findDuplicates(arr, size);
    return 0;
}
