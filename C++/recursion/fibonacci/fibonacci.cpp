#include <iostream>

using namespace std;

int fibonacci(int number) {
    if(number <= 1) return number;
    else return fibonacci(number - 1) + fibonacci(number - 2);
}

int main() {
    int number{0};
    cout << "Enter a number: ";
    cin >> number;
    cout << "The  " << number << "th Fibonacci number is: " << fibonacci(number) << endl;
}
