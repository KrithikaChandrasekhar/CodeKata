SHELL:=/bin/bash

.PHONY: all
all: test

.PHONY: test
test: echo
	diff <(echo) <(./echo)

.PHONY: clean
clean::
	$(RM) echo *.[adios]
