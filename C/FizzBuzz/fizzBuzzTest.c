#include <string.h>
#include<assert.h>

void fizzBuzz(int num, char* output);

int main(void) {
    char output[10];
    fizzBuzz(0, output);
    assert(strcmp(output, "0") == 0);
    fizzBuzz(1, output);
    assert(strcmp(output, "1") == 0);
    fizzBuzz(3, output);
    assert(strcmp(output, "Fizz") == 0);
    fizzBuzz(5, output);
    assert(strcmp(output, "Buzz") == 0);
    fizzBuzz(15, output);
    assert(strcmp(output, "FizzBuzz") == 0);
    return 0;
}

