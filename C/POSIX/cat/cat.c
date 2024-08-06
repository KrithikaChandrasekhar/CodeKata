#include <stdio.h>
#include <errno.h>
#include <string.h>

void fileCopy(FILE *file);

int main(int argc, char *argv[]) {
   const char *programName = argv[0];
    if (argc == 1)
        fileCopy(stdin);
    else {
        for (int i = 1; i < argc; i++) {
            char *filename = argv[i];
            FILE *file = fopen(filename, "r");
            if (file == NULL) {
                fprintf(stderr, "%s: %s: %s\n", programName, filename, strerror(errno));
                continue;
            }
            fileCopy(file);
            fclose(file);
        }
    }
        return 0;
}

void fileCopy(FILE *file) {
    int c;
    while ((c = fgetc(file)) != EOF) {
        putchar(c);
    }
}
