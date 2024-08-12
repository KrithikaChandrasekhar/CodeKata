SHELL:= /bin/bash

.PHONY: all
all: test

.PHONY: test
test: head
	diff <(<inputs.txt head) <(<inputs.txt ./head)

.PHONY: clean
clean::
	$(RM) head *.[adios]
