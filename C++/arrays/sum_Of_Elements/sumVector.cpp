#include <iostream>
#include <vector>

using namespace std;

int sumOfArray(const vector<int> &arr) {
    int sum = 0;
    for(int element : arr)
        sum += element;
    return sum;
}

int main() {
    vector<int> arr{1, 2, 3, 4, 5};
    cout << "Sum of elements: " <<sumOfArray(arr) << endl;
    return 0;
}
