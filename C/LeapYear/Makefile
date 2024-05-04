.PHONY: all
all: test

.PHONY: test
test: leapYearTest
	./leapYearTest

leapYearTest: leapYearTest.o leapYear.o

.PHONY: clean
clean::
	$(RM) *.[adios] leapYearTest
