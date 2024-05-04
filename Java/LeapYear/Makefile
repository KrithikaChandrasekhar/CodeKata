SHELL:= /bin/bash

.PHONY: all
all: test

.PHONY: test
test: LeapYearTest.class
	java -ea LeapYearTest

LeapYearTest.class: LeapYearTest.java
	javac LeapYearTest.java LeapYear.java

.PHONY: clean
clean::
	$(RM) *.class
