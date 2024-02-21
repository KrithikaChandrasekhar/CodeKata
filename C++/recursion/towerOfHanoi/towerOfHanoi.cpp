#include <iostream>

using namespace std;

void towerOfHanoi(int numDisk, char source, char auxiliary, char destination) {
    if(numDisk == 1) {
        cout << "Move disk 1 from " << source << " to " << destination << endl;
    return;
    }
    towerOfHanoi(numDisk - 1, source, destination, auxiliary);
    cout << "Move disk " << numDisk << " from " << source << " to " << destination << endl;
    towerOfHanoi(numDisk - 1, auxiliary, source, destination);
}

int main() {
    int numDisks{3};
    towerOfHanoi(numDisks, 'A', 'B', 'C');
    return 0;
}
