SHELL:=/bin/bash

.PHONY: all
all: test

.PHONY: test
test: fizzBuzzTest
	./fizzBuzzTest

fizzBuzzTest: fizzBuzz.o fizzBuzzTest.o

.PHONY: clean
clean::
	$(RM) *.[adios] fizzBuzzTest
