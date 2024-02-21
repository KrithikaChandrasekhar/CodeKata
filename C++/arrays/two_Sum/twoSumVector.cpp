#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> twoSum(vector<int> &arr, int target) {
    unordered_map<int, int> numMap;
    for(int i = 0; i < arr.size(); ++i) {
        int difference = target - arr[i];
        if (numMap.count(difference)) 
            return {numMap[difference], i};
        numMap[arr[i]] = i;
    }
    return {};
}

int main() {
    vector<int> arr { 1, 2, 3, 4, -1, 9, 1};
    int target = 7;
    vector<int> result = twoSum(arr, target);
    cout << "Indices of two sum: "<< result[0] << " and " << result[1] << " is " << target << endl;
    return 0;
}
