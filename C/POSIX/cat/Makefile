SHELL:=/bin/bash

.PHONY: all
all: test

.PHONY: test
test: cat
	echo -e "Fizz\nBuzz" | cat > actualStdout.txt
	echo -e "Fizz\nBuzz" | ./cat > expectedStdout.txt
	diff actualStdout.txt expectedStdout.txt
	diff <(cat fileDoNotExist.txt) <(./cat fileDoNotExist.txt)
	diff <(cat fileToPrint.txt) <(./cat fileToPrint.txt)
	diff <(cat fileToPrint.txt fileDoNotExist.txt) <(./cat fileToPrint.txt fileDoNotExist.txt)
	diff <(cat fileToPrint.txt hello.txt) <(./cat fileToPrint.txt hello.txt)
	diff <(cat cat) <(./cat cat)

.PHONY: clean
clean::
	$(RM) cat *[adios]
