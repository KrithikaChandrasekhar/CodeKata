SHELL:=/bin/bash

.PHONY: all
all: test

.PHONY: test
test: LeapYearTest.jar
	java -ea -jar LeapYearTest.jar

LeapYearTest.jar: LeapYearTest.kt LeapYear.kt
	kotlinc LeapYearTest.kt LeapYear.kt -include-runtime -d LeapYearTest.jar

.PHONY: clean
clean::
	$(RM) *.jar
