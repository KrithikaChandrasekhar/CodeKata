#include <stdio.h>
#include <stdlib.h>

#define MAX_LINE_LENGTH 1024
#define DEFAULT_NUM_LINES 10

int main (void) {
    char buffer[MAX_LINE_LENGTH];
    int line_count = 0;
 while (line_count < DEFAULT_NUM_LINES && fgets(buffer, MAX_LINE_LENGTH, stdin) != NULL) {
        printf("%s", buffer);
        line_count++;
    }
    return 0;
}
