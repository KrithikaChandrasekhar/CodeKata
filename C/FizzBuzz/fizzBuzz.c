#include <stdio.h>

void fizzBuzz(int num, char* output) {
    if (num == 0) {
        sprintf(output, "%d", num);
        return;
    }
    if (num % 3 == 0 && num % 5 == 0)
        sprintf(output, "FizzBuzz");
    else if (num % 3 == 0)
        sprintf(output, "Fizz");
    else if (num % 5 == 0)
        sprintf(output, "Buzz");
    else
        sprintf(output, "%d", num);
}
