#include<iostream>

using namespace std;

int factorial(int number) {
    if (number == 0 || number == 1) return 1;
    else return number * factorial(number - 1);
}

int main() {
    int number = 0;
    cout << "Enter a number to find the factorial: ";
    cin >> number;
    cout << "Factorial of the number " << number << " is " << factorial(number) << endl;
    return 0;
}
