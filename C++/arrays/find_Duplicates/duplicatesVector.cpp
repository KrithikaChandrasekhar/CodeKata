#include <iostream>
#include <unordered_set>
#include <vector>

using namespace std;


void findDuplicates(const vector<int> &arr) {
    unordered_set<int> seen;
    cout << "Duplicate elements: ";
    for(int element : arr) {
        if(seen.find(element) != seen.end())
            cout << element << " ";
        else
            seen.insert(element);
    }
    cout << endl;
}

int main() {
    vector<int> arr{1, 2, 3, 4, 1, 2, 3};
    findDuplicates(arr);
    return 0;
}
