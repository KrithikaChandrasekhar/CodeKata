SHELL := /bin/bash

.PHONY: all
all: test

.PHONY: test
test: HelloWorld.class
	diff <(java HelloWorld) <(echo "Hello, world!")

HelloWorld.class: HelloWorld.java
	javac HelloWorld.java

.PHONY: clean
clean::
	$(RM) *.class
