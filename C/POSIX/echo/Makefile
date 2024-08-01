SHELL:=/bin/bash

.PHONY: all
all: test

.PHONY: test
test: echo
	diff <(echo) <(./echo)
	diff <(echo foo) <(./echo foo)
	diff <(echo "foo bar") <(./echo "foo bar")

.PHONY: clean
clean::
	$(RM) echo *.[adios]
