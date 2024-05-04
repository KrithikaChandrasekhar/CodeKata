SHELL:= /bin/bash

.PHONY: all
all: test

.PHONY: test
test: helloWorld
	diff <(./helloWorld) <(echo "Hello, world!")

helloWorld: helloWorld.o

.PHONY: clean
clean::
	$(RM) *.[adios] helloWorld
