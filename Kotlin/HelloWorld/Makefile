SHELL:= /bin/bash

.PHONY: all
all: test

.PHONY: test
test: HelloWorld.jar
	diff <(java -jar HelloWorld.jar) <(echo "Hello, world!")

HelloWorld.jar:
	kotlinc HelloWorld.kt -include-runtime -d HelloWorld.jar

.PHONY: clean
clean::
	$(RM) *.jar
