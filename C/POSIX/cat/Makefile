SHELL:=/bin/bash

.PHONY: all
all: test

.PHONY: test
test: cat
	echo -e "Fizz\nBuzz" | cat > actualStdout.txt
	echo -e "Fizz\nBuzz" | ./cat > expectedStdout.txt
	diff actualStdout.txt expectedStdout.txt

.PHONY: clean
clean::
	$(RM) cat *[adios]
