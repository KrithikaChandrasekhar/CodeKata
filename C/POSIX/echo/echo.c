#include <stdio.h>

int main(int argc, char *argv[]) {
    if (argc == 1)
        printf("\n");
    else {
        for (int argIndex = 1; argIndex < argc; argIndex++) {
            printf("%s", argv[argIndex]);
            if (argIndex < argc - 1)
                printf (" ");
        }
        printf("\n");
    }
    return 0;
}
