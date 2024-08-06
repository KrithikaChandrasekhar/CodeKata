# Implement POSIX command 'cat' in C

`cat` is a unix program that reads data from a file and give their contents as output. It helps to create, view and concatenate files.

# Test strategy
- We are re-implementing an exisitng program. Our main strategy will be to ensure that given same input, our program produces same output as reference original.
- Use diff to golden master test 'cat' with its original implemnetation.
- `cat` for both text as well as binary handling.

# Test cases
- When calling `cat` without arguments, then it reads standard input. Also it reacts to F)F on STDIN.
- When calling `cat fileToPrint.txt`, then it prints the content of the files on standard output.
- When calling `cat fileDoNotExist.txt`, then it prints "cat: fileDoNotExist.txt: No such file or directory" on the console.
