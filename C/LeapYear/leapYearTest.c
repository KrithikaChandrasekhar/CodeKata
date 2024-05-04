#include <assert.h>
#include <stdbool.h>

bool isLeapYear(int year);

int main(void) {
    assert(!isLeapYear(2001));
    assert(isLeapYear(2004));
    assert(!isLeapYear(2100));
    assert(isLeapYear(2400));
}
